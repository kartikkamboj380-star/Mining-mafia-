package com.miningmafia.app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.miningmafia.app.data.STATUS_FAILED
import com.miningmafia.app.data.TYPE_REWARD
import com.miningmafia.app.data.TransactionEntity
import com.miningmafia.app.data.Units
import com.miningmafia.app.ui.AppViewModel
import com.miningmafia.app.ui.BigNumber
import com.miningmafia.app.ui.Panel
import com.miningmafia.app.ui.ScreenTitle
import com.miningmafia.app.ui.StatRow
import com.miningmafia.app.ui.coinText
import com.miningmafia.app.ui.theme.Crimson
import com.miningmafia.app.ui.theme.Mint
import java.text.DateFormat
import java.util.Date

@Composable
fun WalletScreen(vm: AppViewModel, onWithdraw: () -> Unit, onHistory: () -> Unit) {
    val accounts by vm.accounts.collectAsStateWithLifecycle()
    val busy by vm.busy.collectAsStateWithLifecycle()
    val list = accounts.orEmpty()
    val preferred = vm.prefs.preferredPayoutAddress

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle("Wallet", "Unified view of every account's pool balance on this device.")

        Panel {
            Text("Combined balance", style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            BigNumber(
                Units.format(list.sumOf { it.confirmedUnits }) ,
                "confirmed · pending ${Units.format(list.sumOf { it.pendingUnits })}",
            )
        }

        Panel {
            Text("Individual balances", style = MaterialTheme.typography.titleMedium)
            if (list.isEmpty()) Text("No accounts yet.", color = MaterialTheme.colorScheme.onSurfaceVariant)
            list.forEach { acct ->
                StatRow(acct.displayName, coinText(acct.confirmedUnits), Mint)
                StatRow("  pending", coinText(acct.pendingUnits))
            }
        }

        Panel {
            Text("Preferred payout wallet", style = MaterialTheme.typography.titleMedium)
            Text(
                if (preferred.isBlank()) "Not set — add one in Settings." else preferred,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
            Button(onClick = onWithdraw, modifier = Modifier.weight(1f)) { Text("Withdraw") }
            OutlinedButton(onClick = onHistory, modifier = Modifier.weight(1f)) { Text("History") }
        }
        OutlinedButton(onClick = { vm.syncBalances() }, enabled = !busy, modifier = Modifier.fillMaxWidth()) {
            Text("Sync balances from pool")
        }
    }
}

@Composable
fun WithdrawScreen(vm: AppViewModel, onDone: () -> Unit, onBack: () -> Unit) {
    val active by vm.activeAccount.collectAsStateWithLifecycle()
    val busy by vm.busy.collectAsStateWithLifecycle()
    var amount by remember { mutableStateOf("") }
    var address by remember { mutableStateOf(vm.prefs.preferredPayoutAddress) }

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle("Withdraw", "The pool processes withdrawals. This app only submits your request.")
        Panel {
            StatRow("From account", active?.displayName ?: "—")
            StatRow("Available", active?.let { coinText(it.confirmedUnits) } ?: "—", Mint)
        }
        Panel {
            OutlinedTextField(
                value = amount, onValueChange = { amount = it }, label = { Text("Amount (coin)") },
                singleLine = true, modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            )
            OutlinedTextField(
                value = address, onValueChange = { address = it }, label = { Text("Payout wallet address") },
                singleLine = true, modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
            )
            Button(
                onClick = { vm.withdraw(address, amount, onDone) },
                enabled = !busy && amount.isNotBlank() && address.isNotBlank(),
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            ) { Text("Request withdrawal") }
        }
        OutlinedButton(onClick = onBack, modifier = Modifier.fillMaxWidth()) { Text("Back") }
    }
}

@Composable
fun HistoryScreen(vm: AppViewModel, onBack: () -> Unit) {
    val transactions by vm.transactions.collectAsStateWithLifecycle()
    val accounts by vm.accounts.collectAsStateWithLifecycle()
    val names = accounts.orEmpty().associate { it.id to it.displayName }
    val formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT)

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle("Transaction history", "Rewards credited by pool syncs and withdrawal requests.")
        if (transactions.isEmpty()) {
            Panel { Text("No transactions yet.", color = MaterialTheme.colorScheme.onSurfaceVariant) }
        }
        transactions.forEach { tx -> TransactionRow(tx, names[tx.accountId] ?: "Account ${tx.accountId}", formatter.format(Date(tx.createdAt))) }
        OutlinedButton(onClick = onBack, modifier = Modifier.fillMaxWidth()) { Text("Back") }
    }
}

@Composable
private fun TransactionRow(tx: TransactionEntity, account: String, date: String) {
    Panel {
        val sign = if (tx.type == TYPE_REWARD) "+" else "−"
        StatRow(
            "${tx.type.lowercase().replaceFirstChar { it.uppercase() }} · $account",
            "$sign${Units.format(tx.amountUnits)}",
            if (tx.status == STATUS_FAILED) Crimson else Mint,
        )
        StatRow("Status", tx.status.lowercase())
        StatRow("Date", date)
        tx.reference?.let { StatRow("Reference", it) }
    }
}
