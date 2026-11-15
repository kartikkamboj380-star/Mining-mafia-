package com.miningmafia.app.mining

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.util.concurrent.ConcurrentHashMap

/** Process-wide registry of simultaneous mining sessions, one per account. */
object MiningRegistry {
    const val MAX_SESSIONS = 4

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private val sessions = ConcurrentHashMap<Long, MinerSession>()
    private val collectors = ConcurrentHashMap<Long, Job>()
    private val _allStats = MutableStateFlow<Map<Long, SessionStats>>(emptyMap())
    val allStats: StateFlow<Map<Long, SessionStats>> = _allStats.asStateFlow()

    @Synchronized
    fun start(accountId: Long, config: PoolConfig, threads: Int): Result<Unit> {
        if (sessions.containsKey(accountId)) return Result.success(Unit)
        if (sessions.size >= MAX_SESSIONS) {
            return Result.failure(IllegalStateException("At most $MAX_SESSIONS mining sessions run at once on this device"))
        }
        val session = MinerSession(accountId, config, threads, scope) { DeviceMonitor.shouldThrottle() }
        sessions[accountId] = session
        collectors[accountId] = scope.launch {
            session.stats.collect { st -> _allStats.update { it + (accountId to st) } }
        }
        session.setPaused(paused)
        session.start()
        return Result.success(Unit)
    }

    @Synchronized
    fun stop(accountId: Long) {
        sessions.remove(accountId)?.stop()
        collectors.remove(accountId)?.cancel()
        _allStats.update { it - accountId }
    }

    @Synchronized
    fun stopAll() {
        sessions.keys.toList().forEach { stop(it) }
    }

    @Volatile var paused: Boolean = false
        private set

    @Synchronized
    fun setPausedAll(value: Boolean) {
        paused = value
        sessions.values.forEach { it.setPaused(value) }
    }

    /** Re-establishes every connection, e.g. after the device network changed. */
    fun reconnectAll() {
        sessions.values.forEach { it.reconnectNow() }
    }

    fun isRunning(accountId: Long): Boolean = sessions.containsKey(accountId)

    fun hasSessions(): Boolean = sessions.isNotEmpty()
}
