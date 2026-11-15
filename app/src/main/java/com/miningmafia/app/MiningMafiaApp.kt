package com.miningmafia.app

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.NetworkType
import androidx.work.Constraints
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.miningmafia.app.mining.DeviceMonitor
import com.miningmafia.app.worker.BalanceSyncWorker
import com.miningmafia.app.worker.WatchdogWorker
import java.util.concurrent.TimeUnit

class MiningMafiaApp : Application() {
    override fun onCreate() {
        super.onCreate()
        getSystemService(NotificationManager::class.java).createNotificationChannel(
            NotificationChannel(MINING_CHANNEL, getString(R.string.channel_mining), NotificationManager.IMPORTANCE_LOW)
        )
        DeviceMonitor.start(this)

        val work = WorkManager.getInstance(this)
        work.enqueueUniquePeriodicWork(
            "mining-watchdog",
            ExistingPeriodicWorkPolicy.KEEP,
            PeriodicWorkRequestBuilder<WatchdogWorker>(15, TimeUnit.MINUTES).build(),
        )
        work.enqueueUniquePeriodicWork(
            "balance-sync",
            ExistingPeriodicWorkPolicy.KEEP,
            PeriodicWorkRequestBuilder<BalanceSyncWorker>(30, TimeUnit.MINUTES)
                .setConstraints(Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build())
                .build(),
        )
    }

    companion object {
        const val MINING_CHANNEL = "mining"
    }
}
