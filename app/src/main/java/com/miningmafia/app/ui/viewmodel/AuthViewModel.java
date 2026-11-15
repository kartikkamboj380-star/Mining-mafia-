package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.miningmafia.app.auth.AuthRepository;
import com.miningmafia.app.app.MiningMafiaApplication;
import com.miningmafia.app.data.remote.model.AuthResponse;

/**
 * ViewModel for authentication (register, login, google, email verification, reset).
 */
public class AuthViewModel extends BaseViewModel {

    private final AuthRepository authRepository;
    private final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());
    private final MutableLiveData<AuthResponse> authResult = new MutableLiveData<>();

    public AuthViewModel() {
        this.authRepository = MiningMafiaApplication.getContainer().getAuthRepository();
    }

    public LiveData<UiState> getUiState() { return uiState; }
    public LiveData<AuthResponse> getAuthResult() { return authResult; }
    public boolean isSignedIn() { return authRepository.isSignedIn(); }
    public boolean isEmailVerified() { return authRepository.isEmailVerified(); }

    public void register(String email, String password) {
        uiState.setValue(new UiState(true, null, null));
        authRepository.register(email, password, new AuthRepository.Callback() {
            @Override
            public void onSuccess(AuthResponse response) {
                uiState.setValue(new UiState(false, null, "Registered. Please verify your email."));
                authResult.setValue(response);
            }
            @Override
            public void onError(String message, boolean retryable) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }

    public void login(String email, String password) {
        uiState.setValue(new UiState(true, null, null));
        authRepository.login(email, password, new AuthRepository.Callback() {
            @Override
            public void onSuccess(AuthResponse response) {
                if (!response.emailVerified) {
                    uiState.setValue(new UiState(false, null, "Login succeeded. Please verify your email before mining."));
                } else {
                    uiState.setValue(new UiState(false, null, "Welcome back!"));
                }
                authResult.setValue(response);
            }
            @Override
            public void onError(String message, boolean retryable) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }

    public void signInWithGoogle(String googleIdToken) {
        uiState.setValue(new UiState(true, null, null));
        authRepository.googleSignIn(googleIdToken, new AuthRepository.Callback() {
            @Override
            public void onSuccess(AuthResponse response) {
                uiState.setValue(new UiState(false, null, "Signed in with Google."));
                authResult.setValue(response);
            }
            @Override
            public void onError(String message, boolean retryable) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }

    public void sendPasswordReset(String email) {
        uiState.setValue(new UiState(true, null, null));
        authRepository.sendPasswordReset(email, new AuthRepository.Callback() {
            @Override
            public void onSuccess(AuthResponse response) {
                uiState.setValue(new UiState(false, null, "Reset email sent."));
            }
            @Override
            public void onError(String message, boolean retryable) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }

    public void logout() {
        uiState.setValue(new UiState(true, null, null));
        authRepository.logout(new AuthRepository.Callback() {
            @Override
            public void onSuccess(AuthResponse response) {
                uiState.setValue(new UiState(false, null, "Logged out."));
            }
            @Override
            public void onError(String message, boolean retryable) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }
}
