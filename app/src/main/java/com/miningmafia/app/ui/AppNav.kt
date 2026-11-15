package com.miningmafia.app.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.findStartDestination
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import android.app.Activity
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import com.miningmafia.app.ui.screens.AccountsScreen
import com.miningmafia.app.ui.screens.AuthScreen
import com.miningmafia.app.ui.screens.HistoryScreen
import com.miningmafia.app.ui.screens.HomeScreen
import com.miningmafia.app.ui.screens.MiningScreen
import com.miningmafia.app.ui.screens.SettingsScreen
import com.miningmafia.app.ui.screens.SplashScreen
import com.miningmafia.app.ui.screens.WalletScreen
import com.miningmafia.app.ui.screens.WithdrawScreen

@Composable
fun MiningMafiaRoot(vm: AppViewModel) {
    val nav = rememberNavController()
    val accounts by vm.accounts.collectAsStateWithLifecycle()

    NavHost(navController = nav, startDestination = "splash") {
        composable("splash") {
            SplashScreen(
                loaded = accounts != null,
                onFinished = {
                    val hasAccount = accounts?.isNotEmpty() == true
                    nav.navigate(if (hasAccount) "main" else "auth") {
                        popUpTo("splash") { inclusive = true }
                    }
                },
            )
        }
        composable("auth") {
            AuthScreen(
                vm = vm,
                onAuthenticated = {
                    if (nav.previousBackStackEntry != null) {
                        nav.popBackStack()
                    } else {
                        nav.navigate("main") { popUpTo(0) { inclusive = true } }
                    }
                },
            )
        }
        composable("main") {
            MainScaffold(vm = vm, onAddAccount = { nav.navigate("auth") })
        }
    }
}

private data class Tab(val route: String, val label: String, val icon: ImageVector)

private val tabs = listOf(
    Tab("home", "Home", Icons.Filled.Home),
    Tab("mining", "Mining", Icons.Filled.Build),
    Tab("wallet", "Wallet", Icons.Filled.Star),
    Tab("accounts", "Accounts", Icons.Filled.Person),
    Tab("settings", "Settings", Icons.Filled.Settings),
)

@Composable
fun MainScaffold(vm: AppViewModel, onAddAccount: () -> Unit) {
    val nav = rememberNavController()
    val entry by nav.currentBackStackEntryAsState()
    val route = entry?.destination?.route
    val snackbar = remember { SnackbarHostState() }

    LaunchedEffect(Unit) {
        vm.messages.collectLatest { snackbar.showSnackbar(it) }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(snackbar) },
        bottomBar = {
            if (tabs.any { it.route == route }) {
                NavigationBar {
                    tabs.forEach { tab ->
                        NavigationBarItem(
                            selected = route == tab.route,
                            onClick = { navigateTab(nav, tab.route) },
                            icon = { Icon(tab.icon, contentDescription = tab.label) },
                            label = { Text(tab.label) },
                        )
                    }
                }
            }
        },
    ) { padding ->
        NavHost(navController = nav, startDestination = "home", modifier = Modifier.padding(padding)) {
            composable("home") {
                HomeScreen(vm, onOpenMining = { navigateTab(nav, "mining") }, onOpenWallet = { navigateTab(nav, "wallet") })
            }
            composable("mining") { MiningScreen(vm) }
            composable("wallet") {
                WalletScreen(vm, onWithdraw = { nav.navigate("withdraw") }, onHistory = { nav.navigate("history") })
            }
            composable("withdraw") { WithdrawScreen(vm, onDone = { nav.popBackStack() }, onBack = { nav.popBackStack() }) }
            composable("history") { HistoryScreen(vm, onBack = { nav.popBackStack() }) }
            composable("accounts") { AccountsScreen(vm, onAddAccount = onAddAccount) }
            composable("settings") { SettingsScreen(vm) }
        }
    }
}

private fun navigateTab(nav: NavHostController, route: String) {
    nav.navigate(route) {
        popUpTo(nav.graph.findStartDestination().id) { saveState = true }
        launchSingleTop = true
        restoreState = true
    }
}
