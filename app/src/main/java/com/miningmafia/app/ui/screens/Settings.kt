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
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.miningmafia.app.BuildConfig
import com.miningmafia.app.data.AppPrefs
import com.miningmafia.app.ui.AppViewModel
import com.miningmafia.app.ui.Panel
import com.miningmafia.app.ui.ScreenTitle
import com.miningmafia.app.ui.SectionLabel
import com.miningmafia.app.ui.StatRow

@Composable
fun SettingsScreen(vm: AppViewModel) {
    val prefs: AppPrefs = vm.prefs
    val active by vm.activeAccount.collectAsStateWithLifecycle()
    val busy by vm.busy.collectAsStateWithLifecycle()

    var name by remember(active?.id) { mutableStateOf(active?.displayName.orEmpty()) }
    var host by remember { mutableStateOf(prefs.poolHost) }
    var port by remember { mutableStateOf(prefs.poolPort.toString()) }
    var tls by remember { mutableStateOf(prefs.poolTls) }
    var poolPassword by remember { mutableStateOf(prefs.poolPassword) }
    var apiBase by remember { mutableStateOf(prefs.poolApiBase) }
    var apiKey by remember { mutableStateOf(prefs.poolApiKey) }
    var payout by remember { mutableStateOf(prefs.preferredPayoutAddress) }
    var threads by remember { mutableFloatStateOf(prefs.threadsPerSession.toFloat()) }

    Column(
        modifier = Modifier.fillMaxWidth().verticalScroll(rememberScrollState()).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ScreenTitle("Settings & profile")

        SectionLabel("Profile")
        Panel {
            StatRow("Email", active?.email ?: "—")
            OutlinedTextField(
                value = name, onValueChange = { name = it }, label = { Text("Display name") },
                singleLine = true, modifier = Modifier.fillMaxWidth(),
            )
            OutlinedButton(
                onClick = { vm.updateDisplayName(name) },
                enabled = !busy && active != null,
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
            ) { Text("Save profile") }
        }

        SectionLabel("Mining pool (Stratum v1)")
        Panel {
            OutlinedTextField(
                value = host, onValueChange = { host = it }, label = { Text("Pool host") },
                singleLine = true, modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = port, onValueChange = { port = it.filter(Char::isDigit) }, label = { Text("Port") },
                singleLine = true, modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
                Text("Use TLS", modifier = Modifier.weight(1f))
                Switch(checked = tls, onCheckedChange = { tls = it })
            }
            OutlinedTextField(
                value = poolPassword, onValueChange = { poolPassword = it }, label = { Text("Worker password") },
                singleLine = true, modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                visualTransformation = PasswordVisualTransformation(),
            )
            Text(
                "Threads per session: ${threads.toInt()} (of ${AppPrefs.maxThreads()} cores)",
                modifier = Modifier.padding(top = 12.dp),
            )
            Slider(
                value = threads,
                onValueChange = { threads = it },
                valueRange = 1f..maxOf(2f, AppPrefs.maxThreads().toFloat()),
                steps = (AppPrefs.maxThreads() - 2).coerceAtLeast(0),
            )
        }

        SectionLabel("Pool account API")
        Panel {
            OutlinedTextField(
                value = apiBase, onValueChange = { apiBase = it }, label = { Text("API base URL (https)") },
                singleLine = true, modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = apiKey, onValueChange = { apiKey = it }, label = { Text("API key (optional)") },
                singleLine = true, modifier = Modifier.fillMaxWidth().padding(top = 8.dp),
                visualTransformation = PasswordVisualTransformation(),
            )
            Text(
                if (BuildConfig.GOOGLE_WEB_CLIENT_ID.isBlank()) "Google Sign-In: not configured in this build."
                else "Google Sign-In: configured.",
                modifier = Modifier.padding(top = 8.dp),
                style = MaterialTheme.typography.bodySmall,
            )
        }

        SectionLabel("Payouts")
        Panel {
            OutlinedTextField(
                value = payout, onValueChange = { payout = it }, label = { Text("Preferred payout wallet") },
                singleLine = true, modifier = Modifier.fillMaxWidth(),
            )
        }

        Button(
            onClick = {
                vm.saveSettings(
                    host = host,
                    port = port.toIntOrNull() ?: 3333,
                    tls = tls,
                    poolPassword = poolPassword,
                    apiBase = apiBase,
                    apiKey = apiKey,
                    payoutAddress = payout,
                    threads = threads.toInt(),
                )
            },
            modifier = Modifier.fillMaxWidth(),
        ) { Text("Save settings") }

        SectionLabel("Danger zone")
        OutlinedButton(onClick = { vm.signOutEverything() }, modifier = Modifier.fillMaxWidth()) {
            Text("Remove all accounts from this device")
        }

        SectionLabel("About")
        Panel {
            Text(
                "Mining Mafia mines SHA-256d shares against a Stratum pool you choose. " +
                    "Phone hashrate is small compared with dedicated hardware, and balances come only from your pool's reported figures. " +
                    "Mining runs in a visible foreground service and pauses when the device overheats or the battery is critical.",
                style = MaterialTheme.typography.bodySmall,
            )
        }
    }
}
