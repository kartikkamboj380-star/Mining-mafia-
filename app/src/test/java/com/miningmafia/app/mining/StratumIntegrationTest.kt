package com.miningmafia.app.mining

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger
import java.net.InetAddress
import java.net.ServerSocket
import java.security.MessageDigest
import java.util.concurrent.CopyOnWriteArrayList

/**
 * Runs the real StratumClient + MinerSession hashing path against a local Stratum v1 server.
 * The server re-derives each submitted share's header and hash independently and checks it
 * against the difficulty target, so an accepted result means the miner produced a valid share.
 * This does not replace testing against a real pool.
 */
class StratumIntegrationTest {

    private val en1Hex = "abcdef01"
    private val en2Size = 4
    private val coinb1 = "01000000010000000000000000000000000000000000000000000000000000000000000000ffffffff"
    private val coinb2 = "ffffffff0100f2052a010000001976a914"
    private val prevHash = "11223344556677889900aabbccddeeff00112233445566778899aabbccddeeff"
    private val version = "20000000"
    private val nbits = "1d00ffff"
    private val ntime = "5f5e1000"
    private val difficulty = 0.00001 // easy enough to find shares within seconds
    private val user = "testaddr.worker1"

    private class MockPool : AutoCloseable {
        private val server = ServerSocket(0, 10, InetAddress.getLoopbackAddress())
        val port: Int = server.localPort
        val submits = CopyOnWriteArrayList<JSONArray>()
        val authorized = java.util.concurrent.atomic.AtomicBoolean(false)
        @Volatile var failure: Throwable? = null
        @Volatile var sawSubscribe = false
        private val thread = Thread({ serve() }, "mock-stratum").apply { isDaemon = true }

        fun start() = thread.start()

        // Set by the test before start.
        lateinit var job: JSONArray

        private fun serve() {
            try {
                server.accept().use { socket ->
                    socket.soTimeout = 60_000
                    val reader = BufferedReader(InputStreamReader(socket.getInputStream(), Charsets.UTF_8))
                    val writer = BufferedWriter(OutputStreamWriter(socket.getOutputStream(), Charsets.UTF_8))
                    fun send(o: JSONObject) {
                        writer.write(o.toString()); writer.write("\n"); writer.flush()
                    }
                    while (true) {
                        val line = reader.readLine() ?: break
                        val msg = JSONObject(line)
                        when (msg.optString("method")) {
                            "mining.subscribe" -> {
                                sawSubscribe = true
                                send(
                                    JSONObject().put("id", msg.get("id")).put("error", JSONObject.NULL).put(
                                        "result",
                                        JSONArray()
                                            .put(JSONArray().put(JSONArray().put("mining.notify").put("sub1")))
                                            .put(en1Hex)
                                            .put(en2Size)
                                    )
                                )
                            }
                            "mining.authorize" -> {
                                authorized.set(msg.getJSONArray("params").getString(0) == user)
                                send(JSONObject().put("id", msg.get("id")).put("result", authorized.get()).put("error", JSONObject.NULL))
                                send(JSONObject().put("id", JSONObject.NULL).put("method", "mining.set_difficulty").put("params", JSONArray().put(difficulty)))
                                send(JSONObject().put("id", JSONObject.NULL).put("method", "mining.notify").put("params", job))
                            }
                            "mining.submit" -> {
                                val p = msg.getJSONArray("params")
                                submits += p
                                val ok = verifyShare(p)
                                send(
                                    JSONObject().put("id", msg.get("id")).put("result", ok)
                                        .put("error", if (ok) JSONObject.NULL else JSONArray().put(23).put("low difficulty share").put(JSONObject.NULL))
                                )
                            }
                        }
                    }
                }
            } catch (t: Throwable) {
                failure = t
            }
        }
    }

    @Test
    fun minerConnectsAuthorizesHashesAndSubmitsValidShares() {
        val pool = MockPool()
        pool.job = JSONArray()
            .put("job1").put(prevHash).put(coinb1).put(coinb2)
            .put(JSONArray()) // no merkle branches
            .put(version).put(nbits).put(ntime).put(true)
        pool.start()

        val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
        val session = MinerSession(
            accountId = 1L,
            config = PoolConfig(host = "127.0.0.1", port = pool.port, useTls = false, user = user, password = "x"),
            threadCount = 2,
            scope = scope,
            throttled = { false },
        )
        try {
            session.start()
            val deadline = System.currentTimeMillis() + 90_000
            while (System.currentTimeMillis() < deadline && session.stats.value.accepted < 3) {
                Thread.sleep(200)
            }
            pool.failure?.let { throw AssertionError("mock pool failed", it) }
            val stats = session.stats.value
            assertTrue("pool should see subscribe", pool.sawSubscribe)
            assertTrue("pool should authorize the worker", pool.authorized.get())
            assertTrue("miner should submit shares", pool.submits.isNotEmpty())
            assertTrue("pool should accept >= 3 shares, got ${stats.accepted}", stats.accepted >= 3)
            assertEquals("no shares should be rejected", 0L, stats.rejected)
            assertEquals(difficulty, stats.difficulty, 0.0)
            assertTrue("hashrate should be measured", stats.hashrate >= 0.0)
        } finally {
            session.stop()
            scope.coroutineContext[kotlinx.coroutines.Job]?.cancel()
            pool.close()
        }
    }

    /** Independent share check: rebuild coinbase, merkle root, header, and hash, then compare to target. */
    private fun verifyShare(p: JSONArray): Boolean {
        val en2 = p.getString(2)
        val shareNtime = p.getString(3)
        val nonceHex = p.getString(4)
        if (p.getString(1) != "job1" || shareNtime != ntime) return false
        val coinbase = hex(coinb1) + hex(en1Hex) + hex(en2) + hex(coinb2)
        val root = sha256d(coinbase)
        val header = le32(version) + swapWords(hex(prevHash)) + root + le32(ntime) + le32(nbits) + hex(nonceHex)
        val hash = sha256d(header)
        val hashBE = BigInteger(1, hash.reversedArray())
        // difficulty 0.00001 => target = DIFF1 / d = DIFF1 * 100000
        val diff1 = BigInteger("00000000ffff0000000000000000000000000000000000000000000000000000", 16)
        val target = diff1.multiply(BigInteger.valueOf(100_000L))
        return hashBE <= target
    }

    private fun hex(s: String): ByteArray = ByteArray(s.length / 2) { s.substring(it * 2, it * 2 + 2).toInt(16).toByte() }
    private fun sha256(b: ByteArray): ByteArray = MessageDigest.getInstance("SHA-256").digest(b)
    private fun sha256d(b: ByteArray): ByteArray = sha256(sha256(b))
    private fun le32(hex: String): ByteArray = hex(hex).reversedArray()
    private fun swapWords(b: ByteArray): ByteArray = ByteArray(b.size) { i -> b[(i and 3.inv()) + 3 - (i and 3)] }
}
