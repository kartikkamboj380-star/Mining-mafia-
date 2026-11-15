package com.miningmafia.app.ui.mining;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentMiningBinding;
import com.miningmafia.app.data.remote.model.MiningStatus;
import com.miningmafia.app.ui.viewmodel.MiningViewModel;

/**
 * Mining screen: start/stop controls and real metrics from the authorized backend.
 */
public class MiningFragment extends Fragment {

    private FragmentMiningBinding binding;
    private MiningViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMiningBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(MiningViewModel.class);

        binding.btnStart.setOnClickListener(v -> {
            // Worker id placeholder; in production the user configures/confirms their worker.
            viewModel.startMining("worker-android");
        });

        binding.btnStop.setOnClickListener(v -> viewModel.stopMining());

        viewModel.getStatus().observe(getViewLifecycleOwner(), status -> {
            if (status == null) return;
            boolean active = status.mining;
            binding.btnStart.setEnabled(!active);
            binding.btnStop.setEnabled(active);

            binding.txtMiningStatus.setText(active ? R.string.mining_status_mining : R.string.mining_status_idle);
            binding.txtMiningStatus.setTextColor(
                    getResources().getColor(active ? R.color.mining_active : R.color.mining_inactive));

            binding.txtHashrate.setText(String.format("Hashrate: %.2f H/s", status.hashrate));
            binding.txtAccepted.setText("Accepted Shares: " + status.acceptedShares);
            binding.txtRejected.setText("Rejected Shares: " + status.rejectedShares);
            binding.txtWorker.setText("Worker: " + (status.workerId != null ? status.workerId : "--"));
            binding.txtUptime.setText("Uptime: " + status.uptimeSeconds + "s");
            binding.txtRewards.setText("Verified Rewards: " + status.verifiedRewards);
            binding.txtPoolStatus.setText("Pool: " + (status.poolConnectionStatus != null ? status.poolConnectionStatus : "--"));
        });

        viewModel.uiState.observe(getViewLifecycleOwner(), state -> {
            if (state.error != null) {
                binding.txtError.setText(state.error);
                binding.txtError.setVisibility(View.VISIBLE);
                Toast.makeText(requireContext(), state.error, Toast.LENGTH_LONG).show();
            } else {
                binding.txtError.setVisibility(View.GONE);
            }
            if (state.message != null) {
                Toast.makeText(requireContext(), state.message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
