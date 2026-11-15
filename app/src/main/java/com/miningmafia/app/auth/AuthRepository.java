package com.miningmafia.app.auth;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.miningmafia.app.data.remote.BackendApi;
import com.miningmafia.app.data.remote.model.AuthResponse;
import com.miningmafia.app.util.EncryptedPrefs;
import java.util.Map;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Handles email/password and Google authentication via Firebase Auth,
 * then exchanges the Firebase ID token with the authorized backend.
 *
 * Never stores passwords in plain text. Only auth tokens are kept in
 * EncryptedSharedPreferences.
 */
public class AuthRepository {

    public interface Callback {
        void onSuccess(AuthResponse response);
        void onError(String message, boolean retryable);
    }

    private final FirebaseAuth firebaseAuth;
    private final BackendApi backendApi;
    private final EncryptedPrefs encryptedPrefs;

    public static final String KEY_ID_TOKEN = "auth_id_token";
    public static final String KEY_REFRESH_TOKEN = "auth_refresh_token";
    public static final String KEY_USER_ID = "auth_user_id";
    public static final String KEY_EMAIL = "auth_email";
    public static final String KEY_EMAIL_VERIFIED = "auth_email_verified";
    public static final String KEY_PROVIDER = "auth_provider";

    public AuthRepository(Context context, EncryptedPrefs encryptedPrefs) {
        this.firebaseAuth = FirebaseAuth.getInstance();
        this.backendApi = com.miningmafia.app.app.MiningMafiaApplication.getContainer().getBackendApi();
        this.encryptedPrefs = encryptedPrefs;
    }

    public FirebaseUser getCurrentUser() {
        return firebaseAuth.getCurrentUser();
    }

    public boolean isSignedIn() {
        return firebaseAuth.getCurrentUser() != null;
    }

    public String getIdToken() {
        return encryptedPrefs.getString(KEY_ID_TOKEN, null);
    }

    /** Email/password registration. Requires email verification before full access. */
    public void register(String email, String password, Callback callback) {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = firebaseAuth.getCurrentUser();
                        sendEmailVerification(user);
                        getIdTokenAsync(token -> {
                            saveSession(token, user.getUid(), email, false, "email");
                            callback.onSuccess(buildAuthResponse(user.getUid(), email, false, "email"));
                        }, callback::onError);
                    } else {
                        callback.onError(errorMessage(task.getException()), false);
                    }
                });
    }

    /** Email/password login. Requires verified email. */
    public void login(String email, String password, Callback callback) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = firebaseAuth.getCurrentUser();
                        boolean verified = user != null && user.isEmailVerified();
                        getIdTokenAsync(token -> {
                            saveSession(token, user.getUid(), email, verified, "email");
                            callback.onSuccess(buildAuthResponse(user.getUid(), email, verified, "email"));
                        }, callback::onError);
                    } else {
                        callback.onError(errorMessage(task.getException()), false);
                    }
                });
    }

    public void sendEmailVerification(FirebaseUser user) {
        if (user != null) {
            user.sendEmailVerification();
        }
    }

    /** Forgot password - sends a reset email via Firebase Auth. */
    public void sendPasswordReset(String email, Callback callback) {
        firebaseAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        callback.onSuccess(null);
                    } else {
                        callback.onError(errorMessage(task.getException()), false);
                    }
                });
    }

    /** Confirm password reset with action code and new password. */
    public void confirmPasswordReset(String actionCode, String newPassword, Callback callback) {
        firebaseAuth.confirmPasswordReset(actionCode, newPassword)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        callback.onSuccess(null);
                    } else {
                        callback.onError(errorMessage(task.getException()), false);
                    }
                });
    }

    /** Google Sign-In: caller passes the Google ID token; we exchange it with backend + Firebase. */
    public void googleSignIn(String googleIdToken, Callback callback) {
        // Exchange Google credential with the authorized backend first.
        Map<String, String> body = new HashMap<>();
        body.put("id_token", googleIdToken);
        body.put("provider", "google");

        backendApi.googleSignIn(body).enqueue(new Callback<AuthResponse>() {
            @Override
            public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    AuthResponse res = response.body();
                    saveSession(res.token, res.userId, res.email, res.emailVerified, "google");
                    // Also sign into Firebase with the Google credential for linkage.
                    com.google.firebase.auth.AuthCredential credential =
                            com.google.firebase.auth.GoogleAuthProvider.getCredential(googleIdToken, null);
                    firebaseAuth.signInWithCredential(credential);
                    callback.onSuccess(res);
                } else {
                    callback.onError(backendError(response), !retryable(response));
                }
            }

            @Override
            public void onFailure(Call<AuthResponse> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage(), true);
            }
        });
    }

    public void logout(Callback callback) {
        String token = getIdToken();
        if (token != null) {
            backendApi.logout("Bearer " + token).enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    clearSession();
                    firebaseAuth.signOut();
                    callback.onSuccess(null);
                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                    // Even if network fails, clear local session.
                    clearSession();
                    firebaseAuth.signOut();
                    callback.onSuccess(null);
                }
            });
        } else {
            clearSession();
            firebaseAuth.signOut();
            callback.onSuccess(null);
        }
    }

    private void saveSession(String idToken, String userId, String email,
                             boolean emailVerified, String provider) {
        encryptedPrefs.putString(KEY_ID_TOKEN, idToken);
        encryptedPrefs.putString(KEY_USER_ID, userId);
        encryptedPrefs.putString(KEY_EMAIL, email);
        encryptedPrefs.putBoolean(KEY_EMAIL_VERIFIED, emailVerified);
        encryptedPrefs.putString(KEY_PROVIDER, provider);
    }

    private void clearSession() {
        encryptedPrefs.remove(KEY_ID_TOKEN);
        encryptedPrefs.remove(KEY_REFRESH_TOKEN);
        encryptedPrefs.remove(KEY_USER_ID);
        encryptedPrefs.remove(KEY_EMAIL);
        encryptedPrefs.remove(KEY_EMAIL_VERIFIED);
        encryptedPrefs.remove(KEY_PROVIDER);
    }

    private void getIdTokenAsync(AuthRepository.TokenCallback onToken, AuthRepository.Callback onError) {
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user == null) {
            onError.onError("Not signed in", false);
            return;
        }
        user.getIdToken(true)
                .addOnSuccessListener(result -> onToken.onToken(result.getToken()))
                .addOnFailureListener(e -> onError.onError(errorMessage(e), false));
    }

    private interface TokenCallback {
        void onToken(String token);
    }

    private AuthResponse buildAuthResponse(String userId, String email,
                                           boolean emailVerified, String provider) {
        AuthResponse res = new AuthResponse();
        res.userId = userId;
        res.email = email;
        res.emailVerified = emailVerified;
        res.provider = provider;
        res.token = encryptedPrefs.getString(KEY_ID_TOKEN, null);
        return res;
    }

    private String errorMessage(@Nullable Exception e) {
        if (e == null) return "Unknown error";
        String msg = e.getMessage();
        return msg != null ? msg : e.toString();
    }

    private String backendError(Response<?> response) {
        return "Backend error (" + response.code() + ")";
    }

    private boolean retryable(Response<?> response) {
        int code = response.code();
        return code == 500 || code == 502 || code == 503 || code == 504 || code == 429;
    }

    public boolean isEmailVerified() {
        return encryptedPrefs.getBoolean(KEY_EMAIL_VERIFIED, false);
    }

    public String getProvider() {
        return encryptedPrefs.getString(KEY_PROVIDER, null);
    }
}
