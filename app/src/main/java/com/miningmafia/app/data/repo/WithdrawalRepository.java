package com.miningmafia.app.data.repo;

import android.os.Handler;
import android.os.Looper;
import com.miningmafia.app.data.db.WithdrawalDao;
import com.miningmafia.app.data.db.WithdrawalEntity;
import com.miningmafia.app.data.db.SavedDestinationDao;
import com.miningmafia.app.data.db.SavedWithdrawalDestination;
import com.miningmafia.app.data.remote.BackendApi;
import com.miningmafia.app.data.remote.model.WithdrawalRequest;
import com.miningmafia.app.data.remote.model.WithdrawalResponse;
import com.miningmafia.app.util.EncryptedPrefs;
import com.miningmafia.app.auth.AuthRepository;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Withdrawal repository. Uses only documented, authorized withdrawal APIs.
 * Success is only claimed when the provider confirms.
 */
public class WithdrawalRepository {

    public interface Callback {
        void onWithdrawals(List<WithdrawalResponse> withdrawals);
        void onCreated(WithdrawalResponse withdrawal);
        void onSavedDestinations(List<SavedWithdrawalDestination> destinations);
        void onError(String message);
    }

    private final WithdrawalDao withdrawalDao;
    private final SavedDestinationDao destinationDao;
    private final BackendApi backendApi;
    private final EncryptedPrefs encryptedPrefs;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public WithdrawalRepository(WithdrawalDao withdrawalDao,
                                SavedDestinationDao destinationDao,
                                BackendApi backendApi,
                                EncryptedPrefs encryptedPrefs) {
        this.withdrawalDao = withdrawalDao;
        this.destinationDao = destinationDao;
        this.backendApi = backendApi;
        this.encryptedPrefs = encryptedPrefs;
    }

    public void loadWithdrawals(AuthRepository authRepository, Callback callback) {
        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onWithdrawals(java.util.Collections.emptyList());
            return;
        }
        backendApi.listWithdrawals("Bearer " + idToken).enqueue(new Callback<List<WithdrawalRequest>>() {
            @Override
            public void onResponse(Call<List<WithdrawalRequest>> call, Response<List<WithdrawalRequest>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Note: backend returns requests; we map to a simplified response list.
                    java.util.ArrayList<WithdrawalResponse> list = new java.util.ArrayList<>();
                    for (WithdrawalRequest r : response.body()) {
                        WithdrawalResponse w = new WithdrawalResponse();
                        w.destinationAddress = r.destinationAddress;
                        w.amount = r.amount;
                        w.currency = r.currency;
                        w.network = r.network;
                        w.status = "submitted";
                        list.add(w);
                    }
                    callback.onWithdrawals(list);
                } else {
                    callback.onError("Withdrawal history unavailable: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<WithdrawalRequest>> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage());
            }
        });
    }

    /**
     * Submit a withdrawal to the authorized backend.
     * Minimum amount, destination, network and currency are validated client-side,
     * then finally validated server-side. Success claimed only on provider confirmation.
     */
    public void createWithdrawal(AuthRepository authRepository, WithdrawalRequest request,
                                 double minWithdrawal, double availableBalance, Callback callback) {
        // Client-side validation (never bypasses server-side validation).
        if (request.destinationAddress == null || request.destinationAddress.isEmpty()) {
            callback.onError("Destination address is required");
            return;
        }
        if (request.amount <= 0) {
            callback.onError("Amount must be greater than zero");
            return;
        }
        if (request.amount < minWithdrawal) {
            callback.onError("Amount below minimum withdrawal of " + minWithdrawal + " " + request.currency);
            return;
        }
        if (request.amount > availableBalance) {
            callback.onError("Insufficient available balance");
            return;
        }

        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onError("Not authenticated");
            return;
        }

        backendApi.createWithdrawal("Bearer " + idToken, request).enqueue(new Callback<WithdrawalResponse>() {
            @Override
            public void onResponse(Call<WithdrawalResponse> call, Response<WithdrawalResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    WithdrawalResponse res = response.body();
                    // Only claim success if provider confirmed.
                    if ("completed".equals(res.status) || "processing".equals(res.status)
                            || "submitted".equals(res.status)) {
                        persistWithdrawal(res);
                        callback.onCreated(res);
                    } else {
                        callback.onError("Withdrawal rejected by provider: " + res.status);
                    }
                } else {
                    callback.onError("Withdrawal failed: " + response.code()
                            + " (not confirmed by provider)");
                }
            }

            @Override
            public void onFailure(Call<WithdrawalResponse> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage()
                        + " - withdrawal NOT confirmed");
            }
        });
    }

    public void loadSavedDestinations(Callback callback) {
        List<SavedWithdrawalDestination> destinations = destinationDao.getAll();
        callback.onSavedDestinations(destinations);
    }

    public void saveDestination(SavedWithdrawalDestination destination, Callback callback) {
        long id = destinationDao.insert(destination);
        callback.onSavedDestinations(destinationDao.getAll());
    }

    public void deleteDestination(SavedWithdrawalDestination destination, Callback callback) {
        destinationDao.delete(destination);
        callback.onSavedDestinations(destinationDao.getAll());
    }

    private void persistWithdrawal(WithdrawalResponse res) {
        new Thread(() -> {
            WithdrawalEntity e = new WithdrawalEntity();
            e.remoteId = res.id;
            e.destinationAddress = res.destinationAddress;
            e.currency = res.currency;
            e.amount = res.amount;
            e.status = res.status;
            e.createdAt = res.createdAt;
            e.errorMessage = res.errorMessage;
            e.network = res.network != null ? res.network : "";
            withdrawalDao.insert(e);
        }).start();
    }
}
