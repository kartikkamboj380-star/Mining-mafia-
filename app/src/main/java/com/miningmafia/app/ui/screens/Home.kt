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
import com.miningmafia.app.data.AccountEntity
import com.miningmafia.app.mining.MinerState
import com.miningmafia.app.mining.formatHashrate
import com.miningmafia.app.ui.AppViewModel
import com.miningmafia.app.ui.BigNumber
import com.miningmafia.app.ui.Panel
import com.miningmafia.app.ui.ScreenTitle
import com.miningmafia.app.ui.StatRow
import com.miningmafia.app.ui.coinText
import com.miningmafia.app.ui.theme.Crimson
import com.miningmafia.app.ui.theme.Mint

@Composable
fun HomeScreen(vm: AppViewModel, onOpenMining: () -> Unit, onOpenWallet: () -> Unit) {
    val accounts by vm.accounts.collectAsStateWithLifecycle()
    val sessions by vm.sessions.collectAsStateWithLifecycle()
    val device by vm.device.collectAsStateWithLifecycle()
    val active by vm.activeAccount.collectAsStateWithLifecycle()

    val list: List<AccountEntity> = accounts.orEmpty()
    val combined = list.sumOf { it.confirmedUnits }
    val pending = list.sumOf { it.pendingUnits }
    val running = sessions.values.count { it.state != MinerState.STOPPED }
    val totalRate = sessions.values.sumOf { it.hashrate }
    val accepted = sessions.values.sumOf { it.accepted }
    val rejected = sessions.values.sumOf { it.rejected }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle(
            title = "Dashboard",
            subtitle = active?.let { "Signed in as ${it.displayName} (${it.email})" } ?: "No active account",
        )

        Panel {
            Text("Combined balance", style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            BigNumber(coinText(combined).removeSuffix(" coin"), "confirmed across ${list.size} account(s)")
            StatRow("Pending", coinText(pending))
        }

        Panel {
            Text("Mining", style = MaterialTheme.typography.titleMedium)
            StatRow("Active sessions", "$running / ${list.size}")
            StatRow("Live hashrate", formatHashrate(totalRate), Mint)
            StatRow("Accepted shares", accepted.toString(), Mint)
            StatRow("Rejected shares", rejected.toString(), Crimson)
        }

        Panel {
            Text("Device", style = MaterialTheme.typography.titleMedium)
            StatRow("Battery", if (device.batteryPercent >= 0) "${device.batteryPercent}%${if (device.charging) " · charging" else ""}" else "—")
            StatRow("Temperature", if (device.temperatureC.isNaN()) "—" else "%.1f °C".format(device.temperatureC))
        }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
            Button(onClick = onOpenMining, modifier = Modifier.weight(1f)) { Text("Mining") }
            OutlinedButton(onClick = onOpenWallet, modifier = Modifier.weight(1f)) { Text("Wallet") }
        }
    }
}
