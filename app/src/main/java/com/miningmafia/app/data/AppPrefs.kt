package com.miningmafia.app.data

import android.content.Context
import com.miningmafia.app.BuildConfig
import com.miningmafia.app.mining.PoolConfig

/** Device-local settings. Secrets such as the pool password stay in app-private storage. */
class AppPrefs(context: Context) {
    private val sp = context.applicationContext
        .getSharedPreferences("mining_mafia_prefs", Context.MODE_PRIVATE)

    var activeAccountId: Long
        get() = sp.getLong("active_account", -1L)
        set(value) = sp.edit().putLong("active_account", value).apply()

    var mineAccountIds: Set<Long>
        get() = sp.getString("mine_accounts", "").orEmpty()
            .split(",").mapNotNull { it.toLongOrNull() }.toSet()
        set(value) = sp.edit().putString("mine_accounts", value.joinToString(",")).apply()

    /** True while the user wants mining running; the watchdog restarts the service when this is set. */
    var wantMining: Boolean
        get() = sp.getBoolean("want_mining", false)
        set(value) = sp.edit().putBoolean("want_mining", value).apply()

    var poolHost: String
        get() = sp.getString("pool_host", "").orEmpty()
        set(value) = sp.edit().putString("pool_host", value.trim()).apply()

    var poolPort: Int
        get() = sp.getInt("pool_port", 3333)
        set(value) = sp.edit().putInt("pool_port", value).apply()

    var poolTls: Boolean
        get() = sp.getBoolean("pool_tls", true)
        set(value) = sp.edit().putBoolean("pool_tls", value).apply()

    var poolPassword: String
        get() = sp.getString("pool_password", "x").orEmpty()
        set(value) = sp.edit().putString("pool_password", value).apply()

    var poolApiBase: String
        get() = sp.getString("pool_api_base", BuildConfig.DEFAULT_POOL_API_BASE).orEmpty()
        set(value) = sp.edit().putString("pool_api_base", value.trim()).apply()

    var poolApiKey: String
        get() = sp.getString("pool_api_key", "").orEmpty()
        set(value) = sp.edit().putString("pool_api_key", value.trim()).apply()

    var preferredPayoutAddress: String
        get() = sp.getString("preferred_payout", "").orEmpty()
        set(value) = sp.edit().putString("preferred_payout", value.trim()).apply()

    /** Default 2 threads per session on 3 GB devices; never more than the CPU core count. */
    var threadsPerSession: Int
        get() = sp.getInt("threads", defaultThreads()).coerceIn(1, maxThreads())
        set(value) = sp.edit().putInt("threads", value.coerceIn(1, maxThreads())).apply()

    fun poolConfig(): PoolConfig? =
        if (poolHost.isBlank()) null
        else PoolConfig(host = poolHost, port = poolPort, useTls = poolTls, password = poolPassword)

    fun poolApi(): PoolApi? =
        if (poolApiBase.isBlank()) null else PoolApi(poolApiBase, poolApiKey)

    companion object {
        fun maxThreads(): Int = Runtime.getRuntime().availableProcessors().coerceAtLeast(1)
        fun defaultThreads(): Int = minOf(2, maxThreads())
    }
}
