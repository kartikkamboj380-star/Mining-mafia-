package com.miningmafia.app.mining

import android.os.Process
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.io.IOException
import java.security.MessageDigest
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong

data class PoolConfig(
    val host: String,
    val port: Int,
    val useTls: Boolean,
    val user: String = "",
    val password: String = "x",
)

enum class MinerState { CONNECTING, MINING, PAUSED, THROTTLED, RECONNECTING, STOPPED }

data class SessionStats(
    val accountId: Long,
    val state: MinerState = MinerState.STOPPED,
    val hashrate: Double = 0.0,
    val accepted: Long = 0,
    val rejected: Long = 0,
    val difficulty: Double = 0.0,
    val threads: Int = 0,
    val reconnects: Int = 0,
    val startedAt: Long = 0,
    val lastError: String? = null,
)

/**
 * One mining session = one Stratum connection + [threadCount] hashing workers.
 * Reconnects automatically with exponential backoff, and pauses hashing while
 * [throttled] reports overheating or critical battery.
 */
class MinerSession(
    private val accountId: Long,
    private val config: PoolConfig,
    private val threadCount: Int,
    private val scope: CoroutineScope,
    private val throttled: () -> Boolean,
) {
    private class JobSnapshot(
        val job: StratumJob,
        val extranonce1: ByteArray,
        val extranonce2Size: Int,
        val branches: List<ByteArray>,
        val target: ByteArray,
    ) {
        fun withTarget(newTarget: ByteArray) = JobSnapshot(job, extranonce1, extranonce2Size, branches, newTarget)
    }

    private val _stats = MutableStateFlow(SessionStats(accountId = accountId, threads = threadCount))
    val stats: StateFlow<SessionStats> = _stats.asStateFlow()

    private val running = AtomicBoolean(false)
    private val totalHashes = AtomicLong(0)
    private val extranonceCounter = AtomicLong(0)
    private val failures = AtomicInteger(0)
    private val paused = AtomicBoolean(false)
    @Volatile private var subscription: Pair<ByteArray, Int>? = null
    @Volatile private var activeJob: JobSnapshot? = null
    @Volatile private var client: StratumClient? = null
    @Volatile private var difficulty: Double = 1.0
    private val workers = mutableListOf<Thread>()
    private val jobs = mutableListOf<Job>()

    private val listener = object : StratumListener {
        override fun onSubscribed(extranonce1: String, extranonce2Size: Int) {
            subscription = Pair(MiningMath.hexToBytes(extranonce1), extranonce2Size)
        }

        override fun onJob(job: StratumJob) {
            failures.set(0)
            val sub = subscription ?: return
            activeJob = JobSnapshot(
                job = job,
                extranonce1 = sub.first,
                extranonce2Size = sub.second,
                branches = job.merkleBranches.map { MiningMath.hexToBytes(it) },
                target = MiningMath.shareTarget(difficulty),
            )
            _stats.update { it.copy(state = MinerState.MINING, lastError = null) }
        }

        override fun onDifficulty(value: Double) {
            difficulty = value
            activeJob = activeJob?.withTarget(MiningMath.shareTarget(value))
            _stats.update { it.copy(difficulty = value) }
        }

        override fun onShareResult(accepted: Boolean, reason: String?) {
            _stats.update {
                if (accepted) it.copy(accepted = it.accepted + 1)
                else it.copy(rejected = it.rejected + 1, lastError = reason)
            }
        }
    }

    fun start() {
        if (!running.compareAndSet(false, true)) return
        _stats.update { it.copy(startedAt = System.currentTimeMillis(), state = MinerState.CONNECTING) }
        for (i in 0 until threadCount) {
            val t = Thread({ workerLoop() }, "mm-$accountId-w$i")
            t.isDaemon = true
            t.start()
            workers += t
        }
        jobs += scope.launch(Dispatchers.IO) { runConnectLoop() }
        jobs += scope.launch(Dispatchers.Default) { runTicker() }
    }

    /** User pause: workers stop hashing but the connection stays open. */
    fun setPaused(value: Boolean) {
        paused.set(value)
    }

    /** Drops the current connection so the connect loop re-establishes it immediately. */
    fun reconnectNow() {
        failures.set(0)
        client?.close()
    }

    fun stop() {
        running.set(false)
        activeJob = null
        client?.close()
        jobs.forEach { it.cancel() }
        jobs.clear()
        _stats.update { it.copy(state = MinerState.STOPPED, hashrate = 0.0) }
    }

    private suspend fun runConnectLoop() {
        while (running.get()) {
            var error: String? = null
            val c = StratumClient(config.host, config.port, config.useTls, listener)
            client = c
            try {
                _stats.update {
                    it.copy(state = if (it.reconnects == 0) MinerState.CONNECTING else MinerState.RECONNECTING)
                }
                c.connectAndRun(config.user, config.password)
                error = "Pool closed the connection"
            } catch (e: Exception) {
                error = e.message ?: e.javaClass.simpleName
            } finally {
                c.close()
                client = null
                activeJob = null
            }
            if (!running.get()) break
            val attempt = failures.incrementAndGet()
            _stats.update {
                it.copy(state = MinerState.RECONNECTING, lastError = error, reconnects = it.reconnects + 1)
            }
            delay(Backoff.delayMillis(attempt))
        }
    }

    private suspend fun runTicker() {
        var lastHashes = 0L
        var lastTime = System.nanoTime()
        while (running.get()) {
            delay(TICK_MS)
            val now = System.nanoTime()
            val hashes = totalHashes.get()
            val seconds = (now - lastTime) / 1e9
            val rate = if (seconds > 0) (hashes - lastHashes) / seconds else 0.0
            lastHashes = hashes
            lastTime = now
            val pausedNow = paused.get()
            val throttle = throttled()
            _stats.update { s ->
                val state = when {
                    s.state == MinerState.STOPPED -> s.state
                    pausedNow && s.state != MinerState.PAUSED -> MinerState.PAUSED
                    !pausedNow && s.state == MinerState.PAUSED -> MinerState.MINING
                    throttle && s.state == MinerState.MINING -> MinerState.THROTTLED
                    !throttle && s.state == MinerState.THROTTLED -> MinerState.MINING
                    else -> s.state
                }
                s.copy(hashrate = rate, state = state)
            }
        }
    }

    private fun workerLoop() {
        runCatching { Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND) }
        val md = MessageDigest.getInstance("SHA-256")
        while (running.get()) {
            if (paused.get() || throttled()) {
                Thread.sleep(500)
                continue
            }
            val snap = activeJob
            val conn = client
            if (snap == null || conn == null) {
                Thread.sleep(200)
                continue
            }
            // Each worker takes a fresh extranonce2, so workers never repeat each other's nonce space.
            val en2 = longToBytes(extranonceCounter.getAndIncrement(), snap.extranonce2Size)
            val coinbase = MiningMath.hexToBytes(snap.job.coinb1) + snap.extranonce1 + en2 +
                MiningMath.hexToBytes(snap.job.coinb2)
            val root = MiningMath.computeMerkleRoot(sha256d(md, coinbase), snap.branches)
            val header = MiningMath.buildHeader(
                snap.job.version, snap.job.prevHash, root, snap.job.ntime, snap.job.nbits,
            )
            val en2Hex = MiningMath.bytesToHex(en2)

            var nonce = 0L
            var local = 0L
            while (nonce <= 0xFFFF_FFFFL && running.get() && activeJob === snap) {
                MiningMath.writeNonce(header, nonce.toInt())
                val hash = sha256d(md, header)
                if (MiningMath.meetsTarget(hash, snap.target)) {
                    val nonceHex = MiningMath.bytesToHex(header.copyOfRange(76, 80))
                    runCatching {
                        conn.submit(config.user, snap.job.jobId, en2Hex, snap.job.ntime, nonceHex)
                    }
                }
                nonce++
                local++
                if (local == BATCH) {
                    totalHashes.addAndGet(local)
                    local = 0
                    if (paused.get() || throttled()) break
                }
            }
            totalHashes.addAndGet(local)
        }
    }

    private fun sha256d(md: MessageDigest, data: ByteArray): ByteArray {
        md.reset()
        val first = md.digest(data)
        return md.digest(first)
    }

    private fun longToBytes(value: Long, size: Int): ByteArray {
        require(size in 1..8) { "Unsupported extranonce2 size $size" }
        return ByteArray(size) { i -> (value ushr (8 * (size - 1 - i))).toByte() }
    }

    private companion object {
        const val BATCH = 16_384L
        const val TICK_MS = 2_000L
    }
}

/** Reconnect delays: 2s, 4s, 8s, ... capped at 60s. */
object Backoff {
    fun delayMillis(attempt: Int): Long {
        val n = attempt.coerceIn(1, 6)
        return minOf(60_000L, 1_000L shl n)
    }
}

/** Formatting helpers used by the UI and notification. */
fun formatHashrate(h: Double): String = when {
    h >= 1e9 -> "%.2f GH/s".format(h / 1e9)
    h >= 1e6 -> "%.2f MH/s".format(h / 1e6)
    h >= 1e3 -> "%.2f kH/s".format(h / 1e3)
    else -> "%.1f H/s".format(h)
}

fun formatDuration(ms: Long): String {
    val s = (ms / 1000).coerceAtLeast(0)
    return "%02d:%02d:%02d".format(s / 3600, (s % 3600) / 60, s % 60)
}
