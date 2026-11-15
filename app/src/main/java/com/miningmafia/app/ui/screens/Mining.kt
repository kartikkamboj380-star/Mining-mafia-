package com.miningmafia.app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.miningmafia.app.mining.DeviceMonitor
import com.miningmafia.app.mining.MinerState
import com.miningmafia.app.mining.formatDuration
import com.miningmafia.app.mining.formatHashrate
import com.miningmafia.app.ui.AppViewModel
import com.miningmafia.app.ui.Panel
import com.miningmafia.app.ui.ScreenTitle
import com.miningmafia.app.ui.SectionLabel
import com.miningmafia.app.ui.StatRow
import com.miningmafia.app.ui.theme.Crimson
import com.miningmafia.app.ui.theme.Gold
import com.miningmafia.app.ui.theme.Mint

@Composable
fun MiningScreen(vm: AppViewModel) {
    val accounts by vm.accounts.collectAsStateWithLifecycle()
    val selection by vm.selection.collectAsStateWithLifecycle()
    val sessions by vm.sessions.collectAsStateWithLifecycle()
    val device by vm.device.collectAsStateWithLifecycle()
    val busy by vm.busy.collectAsStateWithLifecycle()
    val list = accounts.orEmpty()
    val throttled = DeviceMonitor.shouldThrottle(device)

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle(
            "Mining",
            "Each selected account runs its own Stratum session with parallel hashing threads (max 4 sessions).",
        )

        Panel {
            Text("Accounts to mine", style = MaterialTheme.typography.titleMedium)
            if (list.isEmpty()) Text("Add an account first.", color = MaterialTheme.colorScheme.onSurfaceVariant)
            list.forEach { acct ->
                Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    Checkbox(checked = acct.id in selection, onCheckedChange = { vm.toggleSelected(acct.id) })
                    Column(modifier = Modifier.weight(1f)) {
                        Text(acct.displayName, style = MaterialTheme.typography.bodyLarge)
                        Text(acct.email, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                    val s = sessions[acct.id]
                    Text(
                        s?.state?.name?.lowercase()?.replace('_', ' ') ?: "idle",
                        color = if (s?.state == MinerState.MINING) Mint else MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
                Button(onClick = { vm.startMining() }, enabled = !busy && selection.isNotEmpty(), modifier = Modifier.weight(1f)) {
                    Text("Start mining")
                }
                OutlinedButton(onClick = { vm.stopMining() }, modifier = Modifier.weight(1f)) { Text("Stop all") }
            }
            if (sessions.isNotEmpty()) {
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
                    OutlinedButton(onClick = { vm.pauseMining() }, modifier = Modifier.weight(1f)) { Text("Pause") }
                    OutlinedButton(onClick = { vm.resumeMining() }, modifier = Modifier.weight(1f)) { Text("Resume") }
                }
            }
        }

        SectionLabel("Live statistics")
        if (sessions.isEmpty()) {
            Panel { Text("No active sessions.", color = MaterialTheme.colorScheme.onSurfaceVariant) }
        }
        sessions.values.sortedBy { it.accountId }.forEach { s ->
            val name = list.firstOrNull { it.id == s.accountId }?.displayName ?: "Account ${s.accountId}"
            Panel {
                Text(name, style = MaterialTheme.typography.titleMedium, color = Gold)
                StatRow("State", s.state.name.lowercase().replace('_', ' '))
                StatRow("Hashrate", formatHashrate(s.hashrate), Mint)
                StatRow("Accepted / rejected", "${s.accepted} / ${s.rejected}")
                StatRow("Difficulty", if (s.difficulty > 0) "%.3f".format(s.difficulty) else "—")
                StatRow("Threads", s.threads.toString())
                StatRow("Reconnects", s.reconnects.toString())
                StatRow(
                    "Uptime",
                    if (s.startedAt > 0) formatDuration(System.currentTimeMillis() - s.startedAt) else "—",
                )
                s.lastError?.let { StatRow("Last error", it, Crimson) }
            }
        }

        SectionLabel("Device safety")
        Panel {
            StatRow("Battery", if (device.batteryPercent >= 0) "${device.batteryPercent}%" else "—")
            StatRow("Charging", if (device.charging) "yes" else "no")
            StatRow("Temperature", if (device.temperatureC.isNaN()) "—" else "%.1f °C".format(device.temperatureC))
            StatRow("Thermal status", thermalLabel(device.thermalStatus))
            StatRow(
                "Hashing",
                if (throttled) "paused (overheating, critical thermal state or battery ≤ 10%)" else "running",
                if (throttled) Gold else Mint,
            )
        }
    }
}

private fun thermalLabel(status: Int): String = when (status) {
    0 -> "none"
    1 -> "light"
    2 -> "moderate"
    3 -> "severe"
    4 -> "critical"
    5 -> "emergency"
    6 -> "shutdown"
    else -> "unknown"
}
