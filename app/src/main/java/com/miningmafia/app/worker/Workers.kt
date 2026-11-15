package com.miningmafia.app.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.miningmafia.app.data.AppPrefs
import com.miningmafia.app.data.AppRepository
import com.miningmafia.app.mining.MiningRegistry
import com.miningmafia.app.mining.MiningService
import androidx.work.ListenableWorker.Result as WorkResult

/**
 * Periodic watchdog: if the user wants mining but the service is gone (process killed,
 * device rebooted, crash), restart it with the last selected accounts.
 * Android may refuse background foreground-service starts; failures are retried next cycle.
 */
class WatchdogWorker(appContext: Context, params: WorkerParameters) : CoroutineWorker(appContext, params) {
    override suspend fun doWork(): WorkResult {
        val prefs = AppPrefs(applicationContext)
        val ids = prefs.mineAccountIds
        if (prefs.wantMining && ids.isNotEmpty() && !MiningRegistry.hasSessions()) {
            runCatching { MiningService.start(applicationContext, ids) }
        }
        return WorkResult.success()
    }
}

/** Periodically pulls pool balances for every account on this device. */
class BalanceSyncWorker(appContext: Context, params: WorkerParameters) : CoroutineWorker(appContext, params) {
    override suspend fun doWork(): WorkResult {
        val api = AppPrefs(applicationContext).poolApi() ?: return WorkResult.success()
        val repo = AppRepository(applicationContext)
        var failed = false
        for (account in repo.allAccounts()) {
            runCatching { repo.syncBalance(account, api) }.onFailure { failed = true }
        }
        return if (failed) WorkResult.retry() else WorkResult.success()
    }
}
