package com.miningmafia.app.mining

import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.IOException
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.InetSocketAddress
import java.net.Socket
import java.util.concurrent.atomic.AtomicLong
import javax.net.ssl.SSLSocket
import javax.net.ssl.SSLSocketFactory

data class StratumJob(
    val jobId: String,
    val prevHash: String,
    val coinb1: String,
    val coinb2: String,
    val merkleBranches: List<String>,
    val version: String,
    val nbits: String,
    val ntime: String,
    val cleanJobs: Boolean,
)

interface StratumListener {
    fun onSubscribed(extranonce1: String, extranonce2Size: Int)
    fun onJob(job: StratumJob)
    fun onDifficulty(value: Double)
    fun onShareResult(accepted: Boolean, reason: String?)
}

/**
 * Minimal Stratum v1 client: subscribe, authorize, receive jobs and difficulty, submit shares.
 * [connectAndRun] blocks until the connection ends; the caller owns reconnection.
 */
class StratumClient(
    private val host: String,
    private val port: Int,
    private val useTls: Boolean,
    private val listener: StratumListener,
) {
    @Volatile private var socket: Socket? = null
    @Volatile private var writer: BufferedWriter? = null
    @Volatile private var closed = false
    private val submitIds = AtomicLong(100)

    fun connectAndRun(user: String, password: String) {
        val plain = Socket()
        plain.connect(InetSocketAddress(host, port), CONNECT_TIMEOUT_MS)
        val s: Socket = if (useTls) {
            val ssl = (SSLSocketFactory.getDefault() as SSLSocketFactory)
                .createSocket(plain, host, port, true) as SSLSocket
            ssl.startHandshake()
            ssl
        } else {
            plain
        }
        s.soTimeout = READ_TIMEOUT_MS
        s.tcpNoDelay = true
        socket = s

        val reader = BufferedReader(InputStreamReader(s.getInputStream(), Charsets.UTF_8))
        writer = BufferedWriter(OutputStreamWriter(s.getOutputStream(), Charsets.UTF_8))

        send(
            JSONObject()
                .put("id", 1)
                .put("method", "mining.subscribe")
                .put("params", JSONArray().put("MiningMafia/1.0"))
        )
        send(
            JSONObject()
                .put("id", 2)
                .put("method", "mining.authorize")
                .put("params", JSONArray().put(user).put(password))
        )

        while (!closed) {
            val line = reader.readLine() ?: throw IOException("Pool closed the connection")
            if (line.isBlank()) continue
            handle(JSONObject(line))
        }
    }

    fun submit(user: String, jobId: String, extranonce2Hex: String, ntime: String, nonceHex: String) {
        send(
            JSONObject()
                .put("id", submitIds.getAndIncrement())
                .put("method", "mining.submit")
                .put("params", JSONArray().put(user).put(jobId).put(extranonce2Hex).put(ntime).put(nonceHex))
        )
    }

    fun close() {
        closed = true
        runCatching { socket?.close() }
    }

    private fun handle(msg: JSONObject) {
        if (msg.has("method") && !msg.isNull("method")) {
            val params = msg.optJSONArray("params") ?: JSONArray()
            when (msg.optString("method")) {
                "mining.notify" -> {
                    val branches = params.getJSONArray(4)
                    listener.onJob(
                        StratumJob(
                            jobId = params.getString(0),
                            prevHash = params.getString(1),
                            coinb1 = params.getString(2),
                            coinb2 = params.getString(3),
                            merkleBranches = (0 until branches.length()).map { branches.getString(it) },
                            version = params.getString(5),
                            nbits = params.getString(6),
                            ntime = params.getString(7),
                            cleanJobs = params.optBoolean(8, false),
                        )
                    )
                }
                "mining.set_difficulty" -> listener.onDifficulty(params.getDouble(0))
                else -> Unit // ping, reconnect hints and messages are ignored
            }
            return
        }

        val id = msg.optLong("id", -1L)
        val error = msg.opt("error")
        val hasError = error != null && error != JSONObject.NULL
        when {
            id == 1L -> {
                if (hasError) throw IOException("Subscribe failed: $error")
                val result = msg.getJSONArray("result")
                listener.onSubscribed(result.getString(1), result.getInt(2))
            }
            id == 2L -> {
                if (!msg.optBoolean("result", false)) throw IOException("Authorization rejected by pool")
            }
            id >= 100L -> {
                listener.onShareResult(
                    accepted = msg.optBoolean("result", false),
                    reason = if (hasError) error.toString() else null,
                )
            }
        }
    }

    @Synchronized
    private fun send(obj: JSONObject) {
        val w = writer ?: throw IOException("Not connected")
        w.write(obj.toString())
        w.write("\n")
        w.flush()
    }

    private companion object {
        const val CONNECT_TIMEOUT_MS = 15_000
        const val READ_TIMEOUT_MS = 180_000
    }
}
