package com.miningmafia.app.data.repo;

import android.os.Handler;
import android.os.Looper;
import com.miningmafia.app.data.db.TransactionDao;
import com.miningmafia.app.data.db.TransactionEntity;
import com.miningmafia.app.data.remote.BackendApi;
import com.miningmafia.app.data.remote.model.Transaction;
import com.miningmafia.app.data.remote.model.WalletSummary;
import com.miningmafia.app.util.EncryptedPrefs;
import com.miningmafia.app.auth.AuthRepository;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Wallet repository. Aggregates verified balances from the authorized backend.
 * If a provider lacks an authorized balance API, the limitation is surfaced clearly.
 */
public class WalletRepository {

    public interface Callback {
        void onWalletSummary(WalletSummary summary);
        void onTransactions(List<Transaction> transactions);
        void onError(String message);
    }

    private final TransactionDao transactionDao;
    private final BackendApi backendApi;
    private final EncryptedPrefs encryptedPrefs;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public WalletRepository(TransactionDao transactionDao, BackendApi backendApi, EncryptedPrefs encryptedPrefs) {
        this.transactionDao = transactionDao;
        this.backendApi = backendApi;
        this.encryptedPrefs = encryptedPrefs;
    }

    public void loadWalletSummary(AuthRepository authRepository, Callback callback) {
        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onError("Not authenticated");
            return;
        }
        backendApi.getWalletSummary("Bearer " + idToken).enqueue(new Callback<WalletSummary>() {
            @Override
            public void onResponse(Call<WalletSummary> call, Response<WalletSummary> response) {
                if (response.isSuccessful() && response.body() != null) {
                    WalletSummary summary = response.body();
                    callback.onWalletSummary(summary);
                } else if (response.code() == 501 || response.code() == 403) {
                    // Provider lacks an authorized balance API - surface limitation clearly.
                    callback.onError("Balance aggregation not supported by this provider");
                } else {
                    callback.onError("Wallet error: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<WalletSummary> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage());
            }
        });
    }

    public void loadTransactions(AuthRepository authRepository, int limit, int offset, Callback callback) {
        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onTransactions(java.util.Collections.emptyList());
            return;
        }
        backendApi.listTransactions("Bearer " + idToken, limit, offset).enqueue(new Callback<List<Transaction>>() {
            @Override
            public void onResponse(Call<List<Transaction>> call, Response<List<Transaction>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Transaction> transactions = response.body();
                    persistTransactions(transactions);
                    callback.onTransactions(transactions);
                } else {
                    List<TransactionEntity> cached = transactionDao.getAll();
                    callback.onTransactions(toModelList(cached));
                }
            }

            @Override
            public void onFailure(Call<List<Transaction>> call, Throwable t) {
                List<TransactionEntity> cached = transactionDao.getAll();
                callback.onTransactions(toModelList(cached));
            }
        });
    }

    private void persistTransactions(List<Transaction> transactions) {
        new Thread(() -> {
            java.util.ArrayList<TransactionEntity> entities = new java.util.ArrayList<>();
            for (Transaction t : transactions) {
                TransactionEntity e = new TransactionEntity();
                e.remoteId = t.id;
                e.accountId = t.accountId;
                e.type = t.type;
                e.amount = t.amount;
                e.currency = t.currency;
                e.status = t.status;
                e.timestamp = t.timestamp;
                e.description = t.description;
                entities.add(e);
            }
            transactionDao.insertAll(entities);
        }).start();
    }

    private List<Transaction> toModelList(List<TransactionEntity> entities) {
        java.util.ArrayList<Transaction> list = new java.util.ArrayList<>();
        for (TransactionEntity e : entities) {
            Transaction t = new Transaction();
            t.id = e.remoteId != null ? e.remoteId : String.valueOf(e.id);
            t.accountId = e.accountId;
            t.type = e.type;
            t.amount = e.amount;
            t.currency = e.currency;
            t.status = e.status;
            t.timestamp = e.timestamp;
            t.description = e.description;
            list.add(t);
        }
        return list;
    }
}
