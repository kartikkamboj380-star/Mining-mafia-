package com.miningmafia.app.data

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

const val PROVIDER_EMAIL = "EMAIL"
const val PROVIDER_GOOGLE = "GOOGLE"

const val TYPE_REWARD = "REWARD"
const val TYPE_WITHDRAWAL = "WITHDRAWAL"

const val STATUS_CONFIRMED = "CONFIRMED"
const val STATUS_SUBMITTED = "SUBMITTED"
const val STATUS_FAILED = "FAILED"

/** One signed-in account on this device. Balances mirror what the pool reports for [workerName]. */
@Entity(tableName = "accounts", indices = [Index(value = ["email"], unique = true)])
data class AccountEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val email: String,
    val displayName: String,
    val authProvider: String,
    val passwordHash: String?,
    val workerName: String,
    val payoutAddress: String = "",
    val confirmedUnits: Long = 0,
    val pendingUnits: Long = 0,
    val createdAt: Long = System.currentTimeMillis(),
)

/** Reward credits (from pool balance syncs) and withdrawal requests. Amounts are in units (1e-8 coin). */
@Entity(tableName = "transactions", indices = [Index(value = ["accountId"])])
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val accountId: Long,
    val type: String,
    val amountUnits: Long,
    val status: String,
    val reference: String?,
    val createdAt: Long = System.currentTimeMillis(),
)

/** Pool worker identity used for Stratum authorization and balance lookups. */
fun AccountEntity.poolUser(): String =
    if (payoutAddress.isNotBlank()) "${payoutAddress.trim()}.$workerName" else workerName
