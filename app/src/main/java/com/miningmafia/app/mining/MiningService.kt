package com.miningmafia.app.mining

import android.app.Notification
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.ServiceInfo
import android.os.Build
import android.os.IBinder
import android.os.PowerManager
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.miningmafia.app.MainActivity
import com.miningmafia.app.MiningMafiaApp
import com.miningmafia.app.R
import com.miningmafia.app.data.AppPrefs
import com.miningmafia.app.data.AppRepository
import com.miningmafia.app.data.poolUser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Foreground service that keeps mining sessions alive while the app is in the background.
 * A visible, ongoing notification is always shown while mining runs.
 */
class MiningService : Service() {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    private var wakeLock: PowerManager.WakeLock? = null
    private var notifier: Job? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action == ACTION_STOP) {
            MiningRegistry.stopAll()
            AppPrefs(this).wantMining = false
            stopSelf()
            return START_NOT_STICKY
        }

        // Must promote to foreground immediately after a startForegroundService() call.
        startForegroundCompat(buildNotification("Starting mining…"))

        val prefs = AppPrefs(this)
        val requested = intent?.getLongArrayExtra(EXTRA_ACCOUNT_IDS)?.toSet()
        val ids = requested ?: prefs.mineAccountIds
        if (requested != null) prefs.mineAccountIds = requested

        scope.launch { startSessions(ids) }
        return START_STICKY
    }

    private suspend fun startSessions(ids: Set<Long>) {
        val prefs = AppPrefs(this)
        val repo = AppRepository(this)
        val base = prefs.poolConfig()
        if (base == null) {
            updateNotification("Set a pool host in Settings to start mining")
            MiningRegistry.stopAll()
            prefs.wantMining = false
            stopSelf()
            return
        }
        acquireWakeLock()
        for (id in ids) {
            val account = repo.account(id) ?: continue
            MiningRegistry.start(id, base.copy(user = account.poolUser()), prefs.threadsPerSession)
                .onFailure { updateNotification(it.message ?: "Cannot start mining") }
        }
        if (!MiningRegistry.hasSessions()) {
            prefs.wantMining = false
            stopSelf()
            return
        }
        startNotifier()
    }

    private fun startNotifier() {
        notifier?.cancel()
        notifier = scope.launch {
            while (true) {
                val map = MiningRegistry.allStats.value
                val total = map.values.sumOf { it.hashrate }
                val accepted = map.values.sumOf { it.accepted }
                val rejected = map.values.sumOf { it.rejected }
                updateNotification(
                    "${map.size} session(s) · ${formatHashrate(total)} · shares $accepted ✓ / $rejected ✗"
                )
                if (!MiningRegistry.hasSessions()) {
                    AppPrefs(this@MiningService).wantMining = false
                    stopSelf()
                    break
                }
                delay(NOTIFY_INTERVAL_MS)
            }
        }
    }

    private fun startForegroundCompat(notification: Notification) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            startForeground(NOTIFICATION_ID, notification, ServiceInfo.FOREGROUND_SERVICE_TYPE_DATA_SYNC)
        } else {
            startForeground(NOTIFICATION_ID, notification)
        }
    }

    private fun updateNotification(text: String) {
        getSystemService(android.app.NotificationManager::class.java)
            .notify(NOTIFICATION_ID, buildNotification(text))
    }

    private fun buildNotification(text: String): Notification {
        val openApp = PendingIntent.getActivity(
            this, 0, Intent(this, MainActivity::class.java),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT,
        )
        val stop = PendingIntent.getService(
            this, 1, Intent(this, MiningService::class.java).setAction(ACTION_STOP),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT,
        )
        return NotificationCompat.Builder(this, MiningMafiaApp.MINING_CHANNEL)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle(getString(R.string.app_name) + " · mining")
            .setContentText(text)
            .setContentIntent(openApp)
            .setOngoing(true)
            .setOnlyAlertOnce(true)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .addAction(0, "Stop", stop)
            .build()
    }

    private fun acquireWakeLock() {
        if (wakeLock?.isHeld == true) return
        val pm = getSystemService(Context.POWER_SERVICE) as PowerManager
        wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "MiningMafia:mining").apply {
            setReferenceCounted(false)
            acquire()
        }
    }

    override fun onDestroy() {
        notifier?.cancel()
        scope.coroutineContext[Job]?.cancel()
        runCatching { wakeLock?.takeIf { it.isHeld }?.release() }
        super.onDestroy()
    }

    companion object {
        const val ACTION_STOP = "com.miningmafia.app.action.STOP_MINING"
        const val EXTRA_ACCOUNT_IDS = "account_ids"
        private const val NOTIFICATION_ID = 4201
        private const val NOTIFY_INTERVAL_MS = 3_000L

        fun start(context: Context, accountIds: Set<Long>) {
            val intent = Intent(context, MiningService::class.java)
                .putExtra(EXTRA_ACCOUNT_IDS, accountIds.toLongArray())
            ContextCompat.startForegroundService(context, intent)
        }

        fun stop(context: Context) {
            context.startService(Intent(context, MiningService::class.java).setAction(ACTION_STOP))
        }
    }
}
