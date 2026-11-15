package com.miningmafia.app.ui

import android.app.Activity
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.miningmafia.app.BuildConfig
import com.miningmafia.app.auth.GoogleAuth
import com.miningmafia.app.data.AccountEntity
import com.miningmafia.app.data.AppPrefs
import com.miningmafia.app.data.AppRepository
import com.miningmafia.app.data.TransactionEntity
import com.miningmafia.app.data.Units
import com.miningmafia.app.mining.DeviceMonitor
import com.miningmafia.app.mining.DeviceState
import com.miningmafia.app.mining.MiningRegistry
import com.miningmafia.app.mining.MiningService
import com.miningmafia.app.mining.SessionStats
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class AppViewModel(app: Application) : AndroidViewModel(app) {
    private val repo = AppRepository(app)
    val prefs = AppPrefs(app)

    /** null while the database is still loading (used by the splash screen). */
    val accounts: StateFlow<List<AccountEntity>?> =
        repo.accounts.stateIn<List<AccountEntity>?>(viewModelScope, SharingStarted.Eagerly, null)

    private val activeId = MutableStateFlow(prefs.activeAccountId)

    val activeAccount: StateFlow<AccountEntity?> = combine(accounts, activeId) { list, id ->
        list?.let { l -> l.firstOrNull { it.id == id } ?: l.firstOrNull() }
    }.stateIn(viewModelScope, SharingStarted.Eagerly, null)

    val transactions: StateFlow<List<TransactionEntity>> =
        repo.transactions.stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    val sessions: StateFlow<Map<Long, SessionStats>> = MiningRegistry.allStats
    val device: StateFlow<DeviceState> = DeviceMonitor.state

    private val _selection = MutableStateFlow(prefs.mineAccountIds)
    val selection: StateFlow<Set<Long>> = _selection.asStateFlow()

    private val _busy = MutableStateFlow(false)
    val busy: StateFlow<Boolean> = _busy.asStateFlow()

    private val _messages = MutableSharedFlow<String>(extraBufferCapacity = 16)
    val messages = _messages.asSharedFlow()

    private fun launchTask(block: suspend () -> Unit) {
        viewModelScope.launch {
            _busy.value = true
            try {
                block()
            } catch (e: Exception) {
                _messages.tryEmit(e.message ?: "Something went wrong")
            } finally {
                _busy.value = false
            }
        }
    }

    private fun select(id: Long) {
        prefs.activeAccountId = id
        activeId.value = id
    }

    // ---- Authentication -------------------------------------------------------------

    fun login(email: String, password: String, onDone: () -> Unit) = launchTask {
        select(repo.login(email, password).id)
        onDone()
    }

    fun register(email: String, password: String, displayName: String, onDone: () -> Unit) = launchTask {
        select(repo.register(email, password, displayName).id)
        onDone()
    }

    fun googleSignIn(activity: Activity, onDone: () -> Unit) = launchTask {
        val user = GoogleAuth.signIn(activity, BuildConfig.GOOGLE_WEB_CLIENT_ID).getOrThrow()
        select(repo.signInWithGoogle(user.email, user.displayName).id)
        onDone()
    }

    fun setActive(id: Long) = select(id)

    fun updateDisplayName(name: String) = launchTask {
        val acct = activeAccount.value ?: error("No active account")
        require(name.isNotBlank()) { "Display name cannot be empty" }
        repo.updateAccount(acct.copy(displayName = name.trim()))
        _messages.tryEmit("Profile updated")
    }

    fun removeAccount(id: Long) = launchTask {
        MiningRegistry.stop(id)
        prefs.mineAccountIds = prefs.mineAccountIds - id
        _selection.value = _selection.value - id
        if (prefs.activeAccountId == id) select(-1L)
        repo.removeAccount(id)
        if (prefs.mineAccountIds.isEmpty()) {
            prefs.wantMining = false
            MiningService.stop(getApplication())
        }
    }

    fun signOutEverything() = launchTask {
        MiningService.stop(getApplication())
        prefs.wantMining = false
        prefs.mineAccountIds = emptySet()
        _selection.value = emptySet()
        select(-1L)
        repo.allAccounts().forEach { repo.removeAccount(it.id) }
    }

    // ---- Mining ---------------------------------------------------------------------

    fun toggleSelected(id: Long) {
        val next = _selection.value.let { if (id in it) it - id else it + id }
        _selection.value = next
        prefs.mineAccountIds = next
    }

    fun startMining() = launchTask {
        val ids = _selection.value
        require(ids.isNotEmpty()) { "Select at least one account to mine with" }
        require(prefs.poolConfig() != null) { "Set the pool host in Settings first" }
        prefs.mineAccountIds = ids
        prefs.wantMining = true
        MiningService.start(getApplication(), ids)
    }

    fun stopMining() {
        prefs.wantMining = false
        MiningService.stop(getApplication())
    }

    // ---- Wallet ---------------------------------------------------------------------

    fun syncBalances() = launchTask {
        val api = prefs.poolApi() ?: error("Set the pool API URL in Settings to sync balances")
        val list = repo.allAccounts()
        var ok = 0
        for (acct in list) {
            runCatching { repo.syncBalance(acct, api) }.onSuccess { ok++ }
        }
        _messages.tryEmit("Synced $ok of ${list.size} account balances")
    }

    fun withdraw(address: String, amountText: String, onDone: () -> Unit) = launchTask {
        val acct = activeAccount.value ?: error("No active account")
        val units = Units.parse(amountText) ?: error("Enter a valid amount, e.g. 0.05")
        val api = prefs.poolApi() ?: error("Set the pool API URL in Settings first")
        val reference = repo.withdraw(acct, api, address, units)
        _messages.tryEmit(if (reference.isBlank()) "Withdrawal requested" else "Withdrawal submitted: $reference")
        onDone()
    }

    // ---- Profile & settings ---------------------------------------------------------

    fun saveSettings(
        host: String,
        port: Int,
        tls: Boolean,
        poolPassword: String,
        apiBase: String,
        apiKey: String,
        payoutAddress: String,
        threads: Int,
    ) {
        prefs.poolHost = host
        prefs.poolPort = port.coerceIn(1, 65535)
        prefs.poolTls = tls
        prefs.poolPassword = poolPassword.ifBlank { "x" }
        prefs.poolApiBase = apiBase
        prefs.poolApiKey = apiKey
        prefs.preferredPayoutAddress = payoutAddress
        prefs.threadsPerSession = threads
        _messages.tryEmit("Settings saved")
    }
}
