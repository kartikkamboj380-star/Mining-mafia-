package com.miningmafia.app.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentSettingsBinding;
import com.miningmafia.app.ui.viewmodel.SettingsViewModel;
import com.miningmafia.app.ui.MainActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * Settings screen: backend URL config, battery/temp info, logout.
 */
public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;
    private SettingsViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(SettingsViewModel.class);

        binding.etBackendUrl.setText(viewModel.getBackendUrl());
        viewModel.backendConfigured.observe(getViewLifecycleOwner(), configured ->
                binding.txtBackendStatus.setText(configured ?
                        R.string.settings_backend_configured : R.string.settings_backend_not_configured));

        binding.btnSaveBackend.setOnClickListener(v -> {
            String url = binding.etBackendUrl.getText().toString();
            if (url.isEmpty()) {
                Toast.makeText(requireContext(), "Enter a backend URL", Toast.LENGTH_SHORT).show();
                return;
            }
            viewModel.saveBackendUrl(url);
        });

        viewModel.uiState.observe(getViewLifecycleOwner(), state -> {
            if (state.message != null) Toast.makeText(requireContext(), state.message, Toast.LENGTH_SHORT).show();
        });

        binding.btnLogout.setOnClickListener(v -> {
            viewModel.logout();
            NavController nav = Navigation.findNavController(view);
            nav.navigate(R.id.authScreen);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
