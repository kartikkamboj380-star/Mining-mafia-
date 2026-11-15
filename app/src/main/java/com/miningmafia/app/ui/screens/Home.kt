package com.miningmafia.app.ui.screens

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.miningmafia.app.data.AccountEntity
import com.miningmafia.app.data.Units
import com.miningmafia.app.mining.MinerState
import com.miningmafia.app.mining.SessionStats
import com.miningmafia.app.mining.formatDuration
import com.miningmafia.app.mining.formatHashrate
import com.miningmafia.app.ui.AppViewModel
import com.miningmafia.app.ui.BigNumber
import com.miningmafia.app.ui.Panel
import com.miningmafia.app.ui.ScreenTitle
import com.miningmafia.app.ui.StatRow
import com.miningmafia.app.ui.coinText
import com.miningmafia.app.ui.theme.Crimson
import com.miningmafia.app.ui.theme.Gold
import com.miningmafia.app.ui.theme.Mint

@Composable
fun HomeScreen(vm: AppViewModel, onOpenMining: () -> Unit, onOpenWallet: () -> Unit) {
    val accounts by vm.accounts.collectAsStateWithLifecycle()
    val sessions by vm.sessions.collectAsStateWithLifecycle()
    val device by vm.device.collectAsStateWithLifecycle()
    val active by vm.activeAccount.collectAsStateWithLifecycle()

    val list: List<AccountEntity> = accounts.orEmpty()
    val running = sessions.values.filter { it.state != MinerState.STOPPED }
    val anyRunning = running.isNotEmpty()
    val paused = running.isNotEmpty() && running.all { it.state == MinerState.PAUSED }
    val totalRate = running.sumOf { it.hashrate }
    val accepted = sessions.values.sumOf { it.accepted }
    val rejected = sessions.values.sumOf { it.rejected }
    val now = System.currentTimeMillis()
    val combinedUptime = running.filter { it.startedAt > 0 }.sumOf { now - it.startedAt }

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle(
            title = "Dashboard",
            subtitle = active?.let { "Signed in as ${it.displayName} (${it.email})" } ?: "No active account",
        )

        Panel {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                MiningPulse(active = anyRunning && !paused)
                Text(
                    when {
                        paused -> "Paused"
                        anyRunning -> "Mining in background"
                        else -> "Mining stopped"
                    },
                    style = MaterialTheme.typography.titleMedium,
                    color = if (anyRunning && !paused) Mint else MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            BigNumber(formatHashrate(totalRate), "combined hashrate · ${running.size} session(s)")
            StatRow("Accepted shares", accepted.toString(), Mint)
            StatRow("Rejected shares", rejected.toString(), Crimson)
            StatRow("Combined uptime", if (combinedUptime > 0) formatDuration(combinedUptime) else "—")
        }

        Panel {
            Text("Combined balance", style = MaterialTheme.typography.labelMedium, color = MaterialTheme.colorScheme.onSurfaceVariant)
            BigNumber(Units.format(list.sumOf { it.confirmedUnits }), "confirmed earnings across ${list.size} account(s)")
            StatRow("Pending rewards", coinText(list.sumOf { it.pendingUnits }), Gold)
        }

        Text("Accounts", style = MaterialTheme.typography.titleMedium)
        if (list.isEmpty()) {
            Panel { Text("No accounts yet. Add one in the Accounts tab.", color = MaterialTheme.colorScheme.onSurfaceVariant) }
        }
        list.forEach { acct ->
            AccountCard(acct, sessions[acct.id], isActive = active?.id == acct.id, now = now)
        }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.fillMaxWidth()) {
            Button(onClick = onOpenMining, modifier = Modifier.weight(1f)) { Text("Mining") }
            OutlinedButton(onClick = onOpenWallet, modifier = Modifier.weight(1f)) { Text("Wallet") }
        }

        Panel {
            Text("Device", style = MaterialTheme.typography.titleMedium)
            StatRow("Battery", if (device.batteryPercent >= 0) "${device.batteryPercent}%${if (device.charging) " · charging" else ""}" else "—")
            StatRow("Temperature", if (device.temperatureC.isNaN()) "—" else "%.1f °C".format(device.temperatureC))
        }
    }
}

@Composable
private fun MiningPulse(active: Boolean) {
    val transition = rememberInfiniteTransition(label = "mining-pulse")
    val pulse by transition.animateFloat(
        initialValue = 0.7f,
        targetValue = 1.3f,
        animationSpec = infiniteRepeatable(animation = tween(durationMillis = 900), repeatMode = RepeatMode.Reverse),
        label = "pulse-scale",
    )
    Box(modifier = Modifier.size(20.dp), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(12.dp)
                .scale(if (active) pulse else 1f)
                .background(if (active) Mint else Crimson.copy(alpha = 0.6f), CircleShape),
        )
    }
}

@Composable
private fun AccountCard(acct: AccountEntity, s: SessionStats?, isActive: Boolean, now: Long) {
    Panel {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(acct.displayName, style = MaterialTheme.typography.titleMedium, modifier = Modifier.weight(1f))
            if (isActive) Text("ACTIVE", color = Gold, style = MaterialTheme.typography.labelMedium)
        }
        val state = s?.state?.name?.lowercase()?.replace('_', ' ') ?: "idle"
        StatRow("Status", state, if (s?.state == MinerState.MINING) Mint else MaterialTheme.colorScheme.onSurfaceVariant)
        StatRow("Speed", formatHashrate(s?.hashrate ?: 0.0))
        StatRow("Accepted / rejected", "${s?.accepted ?: 0} / ${s?.rejected ?: 0}")
        StatRow("Uptime", if (s != null && s.startedAt > 0 && s.state != MinerState.STOPPED) formatDuration(now - s.startedAt) else "—")
        StatRow("Confirmed earnings", coinText(acct.confirmedUnits))
    }
}
