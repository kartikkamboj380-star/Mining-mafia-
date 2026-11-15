package com.miningmafia.app.data

import android.content.Context
import kotlinx.coroutines.flow.Flow

/**
 * Local source of truth for accounts and transactions. Every balance change either comes from
 * a pool API response or is a withdrawal request the user explicitly submitted.
 */
class AppRepository(context: Context) {
    private val db = AppDatabase.get(context)
    private val accountDao = db.accountDao()
    private val txDao = db.transactionDao()

    val accounts: Flow<List<AccountEntity>> = accountDao.observeAccounts()
    val transactions: Flow<List<TransactionEntity>> = txDao.observeAll()

    suspend fun account(id: Long): AccountEntity? = accountDao.byId(id)

    suspend fun allAccounts(): List<AccountEntity> = accountDao.listAccounts()

    suspend fun register(email: String, password: String, displayName: String): AccountEntity {
        val normalized = normalizeEmail(email)
        require(EMAIL_REGEX.matches(normalized)) { "Enter a valid email address" }
        require(password.length >= 8) { "Password must be at least 8 characters" }
        require(displayName.isNotBlank()) { "Enter a display name" }
        require(accountDao.byEmail(normalized) == null) { "An account with this email already exists on this device" }
        val account = AccountEntity(
            email = normalized,
            displayName = displayName.trim(),
            authProvider = PROVIDER_EMAIL,
            passwordHash = PasswordHasher.hash(password),
            workerName = workerNameFor(normalized),
        )
        return account.copy(id = accountDao.insert(account))
    }

    suspend fun login(email: String, password: String): AccountEntity {
        val account = accountDao.byEmail(normalizeEmail(email))
            ?: throw IllegalArgumentException("Email or password is incorrect")
        val hash = account.passwordHash
        if (account.authProvider != PROVIDER_EMAIL || hash == null) {
            throw IllegalArgumentException("This account uses Google Sign-In")
        }
        if (!PasswordHasher.verify(password, hash)) {
            throw IllegalArgumentException("Email or password is incorrect")
        }
        return account
    }

    suspend fun signInWithGoogle(email: String, displayName: String?): AccountEntity {
        val normalized = normalizeEmail(email)
        val existing = accountDao.byEmail(normalized)
        if (existing != null) {
            require(existing.authProvider == PROVIDER_GOOGLE) {
                "This email is registered with a password. Sign in with email instead."
            }
            return existing
        }
        val account = AccountEntity(
            email = normalized,
            displayName = displayName?.takeIf { it.isNotBlank() } ?: normalized.substringBefore('@'),
            authProvider = PROVIDER_GOOGLE,
            passwordHash = null,
            workerName = workerNameFor(normalized),
        )
        return account.copy(id = accountDao.insert(account))
    }

    suspend fun updateAccount(account: AccountEntity) = accountDao.update(account)

    suspend fun removeAccount(id: Long) {
        txDao.deleteForAccount(id)
        accountDao.delete(id)
    }

    /** Pulls the pool's balance and records any increase in confirmed balance as a reward. */
    suspend fun syncBalance(account: AccountEntity, api: PoolApi): AccountEntity {
        val balance = api.balance(account.poolUser())
        val delta = balance.confirmedUnits - account.confirmedUnits
        if (delta > 0) {
            txDao.insert(
                TransactionEntity(
                    accountId = account.id,
                    type = TYPE_REWARD,
                    amountUnits = delta,
                    status = STATUS_CONFIRMED,
                    reference = null,
                )
            )
        }
        val updated = account.copy(
            confirmedUnits = balance.confirmedUnits,
            pendingUnits = balance.pendingUnits,
        )
        accountDao.update(updated)
        return updated
    }

    /** Submits a withdrawal request to the pool. The pool decides when and whether it pays out. */
    suspend fun withdraw(account: AccountEntity, api: PoolApi, address: String, units: Long): String {
        require(address.isNotBlank()) { "Enter a payout address" }
        require(units > 0) { "Amount must be greater than zero" }
        val fresh = accountDao.byId(account.id) ?: error("Account no longer exists")
        require(units <= fresh.confirmedUnits) { "Amount exceeds your confirmed balance" }

        val txId = txDao.insert(
            TransactionEntity(
                accountId = account.id,
                type = TYPE_WITHDRAWAL,
                amountUnits = units,
                status = STATUS_SUBMITTED,
                reference = address.trim(),
            )
        )
        return try {
            val reference = api.withdraw(fresh.poolUser(), address.trim(), units)
            txDao.updateStatus(txId, STATUS_SUBMITTED, reference.ifEmpty { null })
            accountDao.update(fresh.copy(confirmedUnits = fresh.confirmedUnits - units))
            reference
        } catch (e: Exception) {
            txDao.updateStatus(txId, STATUS_FAILED, e.message)
            throw e
        }
    }

    companion object {
        private val EMAIL_REGEX = Regex("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")

        fun normalizeEmail(email: String): String = email.trim().lowercase()

        fun workerNameFor(email: String): String =
            email.substringBefore('@').lowercase().replace(Regex("[^a-z0-9_-]"), "").take(20)
                .ifEmpty { "miner" }
    }
}
