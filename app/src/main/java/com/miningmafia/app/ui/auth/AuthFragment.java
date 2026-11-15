package com.miningmafia.app.ui.auth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentAuthBinding;
import com.miningmafia.app.ui.viewmodel.AuthViewModel;
import com.miningmafia.app.ui.MainActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

/**
 * Auth screen: Google sign-in, email/password register/login, reset password.
 */
public class AuthFragment extends Fragment {

    private static final int RC_GOOGLE = 1001;
    private FragmentAuthBinding binding;
    private AuthViewModel viewModel;
    private GoogleSignInClient googleSignInClient;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAuthBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AuthViewModel.class);

        // Configure Google Sign-In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        googleSignInClient = GoogleSignIn.getClient(requireActivity(), gso);

        binding.btnGoogle.setOnClickListener(v -> {
            Intent intent = googleSignInClient.getSignInIntent();
            startActivityForResult(intent, RC_GOOGLE);
        });

        binding.btnRegister.setOnClickListener(v -> {
            String email = getText(binding.emailField);
            String pass = getText(binding.passField);
            viewModel.register(email, pass);
        });

        binding.btnLogin.setOnClickListener(v -> {
            String email = getText(binding.emailField);
            String pass = getText(binding.passField);
            viewModel.login(email, pass);
        });

        binding.forgot.setOnClickListener(v -> {
            String email = getText(binding.emailField);
            viewModel.sendPasswordReset(email);
        });

        viewModel.getUiState().observe(getViewLifecycleOwner(), state -> {
            if (state.error != null) {
                binding.statusText.setText(state.error);
                binding.statusText.setTextColor(getResources().getColor(R.color.error));
                Toast.makeText(requireContext(), state.error, Toast.LENGTH_LONG).show();
            } else if (state.message != null) {
                binding.statusText.setText(state.message);
                binding.statusText.setTextColor(getResources().getColor(R.color.success));
                if (state.message.contains("Welcome") || state.message.contains("Signed in")) {
                    NavController nav = Navigation.findNavController(view);
                    nav.navigate(R.id.homeScreen);
                }
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_GOOGLE) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);
                if (account != null && account.getIdToken() != null) {
                    viewModel.signInWithGoogle(account.getIdToken());
                }
            } catch (ApiException e) {
                Toast.makeText(requireContext(), "Google sign-in failed: " + e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
    }

    private String getText(com.google.android.material.textfield.TextInputLayout layout) {
        android.widget.EditText edit = layout.getEditText();
        return edit != null ? edit.getText().toString().trim() : "";
    }

    // Needed import for Intent
    private void ensureIntentImport() {
        android.content.Intent i = null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
