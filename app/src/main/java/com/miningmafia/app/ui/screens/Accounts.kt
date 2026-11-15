package com.miningmafia.app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.miningmafia.app.data.PROVIDER_GOOGLE
import com.miningmafia.app.ui.AppViewModel
import com.miningmafia.app.ui.Panel
import com.miningmafia.app.ui.ScreenTitle
import com.miningmafia.app.ui.StatRow
import com.miningmafia.app.ui.coinText
import com.miningmafia.app.ui.theme.Mint

@Composable
fun AccountsScreen(vm: AppViewModel, onAddAccount: () -> Unit) {
    val accounts by vm.accounts.collectAsStateWithLifecycle()
    val active by vm.activeAccount.collectAsStateWithLifecycle()
    val selection by vm.selection.collectAsStateWithLifecycle()
    val list = accounts.orEmpty()

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle("Accounts", "Manage several accounts on one device. Each can mine in its own session.")
        Button(onClick = onAddAccount, modifier = Modifier.fillMaxWidth()) { Text("Add account") }

        if (list.isEmpty()) Panel { Text("No accounts on this device.", color = MaterialTheme.colorScheme.onSurfaceVariant) }

        list.forEach { acct ->
            Panel {
                Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                    Text(acct.displayName, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
                    if (active?.id == acct.id) Text("ACTIVE", color = Mint, style = MaterialTheme.typography.labelMedium)
                }
                StatRow("Email", acct.email)
                StatRow("Sign-in", if (acct.authProvider == PROVIDER_GOOGLE) "Google" else "Email & password")
                StatRow("Worker", acct.workerName)
                StatRow("Balance", coinText(acct.confirmedUnits))
                StatRow("Mining", if (acct.id in selection) "selected" else "not selected")
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
                    OutlinedButton(
                        onClick = { vm.setActive(acct.id) },
                        enabled = active?.id != acct.id,
                        modifier = Modifier.weight(1f),
                    ) { Text("Make active") }
                    OutlinedButton(onClick = { vm.removeAccount(acct.id) }, modifier = Modifier.weight(1f)) {
                        Text("Remove")
                    }
                }
            }
        }
    }
}
