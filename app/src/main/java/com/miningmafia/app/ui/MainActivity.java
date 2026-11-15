package com.miningmafia.app.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.ActivityMainBinding;
import com.miningmafia.app.app.MiningMafiaApplication;
import com.miningmafia.app.auth.AuthRepository;

/**
 * Main activity with bottom-navigation shell.
 * Auth screen is the start destination when not signed in; the six-tab
 * shell (Home, Mining, Accounts, Wallet, Transactions, Settings) appears after sign-in.
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        // Only show bottom nav on the app screens, not on auth.
        navController.addOnDestinationChangedListener((controller, currentDestination, arguments) -> {
            boolean showBottomNav = currentDestination.getId() != R.id.authScreen;
            binding.bottomNav.setVisibility(showBottomNav ? android.view.View.VISIBLE : android.view.View.GONE);
        });

        binding.bottomNav.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_home) navController.navigate(R.id.homeScreen);
            else if (id == R.id.nav_mining) navController.navigate(R.id.miningScreen);
            else if (id == R.id.nav_accounts) navController.navigate(R.id.accountsScreen);
            else if (id == R.id.nav_wallet) navController.navigate(R.id.walletScreen);
            else if (id == R.id.nav_transactions) navController.navigate(R.id.transactionsScreen);
            else if (id == R.id.nav_settings) navController.navigate(R.id.settingsScreen);
            return true;
        });

        // If signed in already, go to home; otherwise stay on auth.
        AuthRepository auth = MiningMafiaApplication.getContainer().getAuthRepository();
        if (auth.isSignedIn()) {
            navController.navigate(R.id.homeScreen);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
