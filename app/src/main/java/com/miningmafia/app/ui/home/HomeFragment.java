package com.miningmafia.app.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentHomeBinding;
import com.miningmafia.app.ui.viewmodel.HomeViewModel;

/**
 * Home dashboard: combined verified balance, mining status, hashrate,
 * connected accounts, today's rewards, temperature, battery.
 */
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        NavController nav = Navigation.findNavController(view);

        binding.btnConnect.setOnClickListener(v -> nav.navigate(R.id.accountsScreen));

        // Combined balance
        viewModel.wallet.observe(getViewLifecycleOwner(), summary -> {
            if (summary != null) {
                binding.txtCombinedBalance.setText(String.format("%s %s",
                        String.format("%.8f", summary.totalBalance), summary.currency));
            }
        });

        // Mining status
        viewModel.mining.observe(getViewLifecycleOwner(), status -> {
            if (status != null) {
                boolean active = status.mining;
                binding.txtMiningStatus.setText(active ? R.string.mining_status_mining : R.string.mining_status_idle);
                binding.txtMiningStatus.setTextColor(
                        getResources().getColor(active ? R.color.mining_active : R.color.mining_inactive));
                binding.txtHashrate.setText(String.format("%.2f H/s", status.hashrate));
            }
        });

        // Accounts
        viewModel.accounts.observe(getViewLifecycleOwner(), accounts -> {
            int count = accounts == null ? 0 : accounts.size();
            binding.txtAccounts.setText(String.valueOf(count));
            binding.txtEmpty.setVisibility(count == 0 ? View.VISIBLE : View.GONE);
        });

        // Rewards
        viewModel.wallet.observe(getViewLifecycleOwner(), summary -> {
            if (summary != null) {
                binding.txtRewards.setText(String.format("%.8f %s", summary.confirmedRewards, summary.currency));
            }
        });

        // Temperature
        viewModel.temperature.observe(getViewLifecycleOwner(), temp ->
                binding.txtTemp.setText(String.format("%.1f °C", temp)));

        // Battery
        viewModel.battery.observe(getViewLifecycleOwner(), level ->
                binding.txtBattery.setText(level + "%"));

        viewModel.load();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
