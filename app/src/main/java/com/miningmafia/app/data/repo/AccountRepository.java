package com.miningmafia.app.data.repo;

import android.os.Handler;
import android.os.Looper;
import com.miningmafia.app.data.db.AccountDao;
import com.miningmafia.app.data.db.AccountEntity;
import com.miningmafia.app.data.remote.BackendApi;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.util.EncryptedPrefs;
import com.miningmafia.app.auth.AuthRepository;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Manages connected accounts. Links/unlinks via the authorized backend only.
 * Balances are fetched from the backend - never fabricated locally.
 */
public class AccountRepository {

    public interface Callback {
        void onAccounts(List<AccountBalance> accounts);
        void onError(String message);
    }

    private final AccountDao accountDao;
    private final BackendApi backendApi;
    private final EncryptedPrefs encryptedPrefs;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    public AccountRepository(AccountDao accountDao, BackendApi backendApi, EncryptedPrefs encryptedPrefs) {
        this.accountDao = accountDao;
        this.backendApi = backendApi;
        this.encryptedPrefs = encryptedPrefs;
    }

    public void loadAccounts(AuthRepository authRepository, Callback callback) {
        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onAccounts(java.util.Collections.emptyList());
            return;
        }
        backendApi.listAccounts("Bearer " + idToken).enqueue(new Callback<List<AccountBalance>>() {
            @Override
            public void onResponse(Call<List<AccountBalance>> call, Response<List<AccountBalance>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<AccountBalance> accounts = response.body();
                    persistAccounts(accounts);
                    callback.onAccounts(accounts);
                } else {
                    // Fall back to cached local accounts if backend unavailable.
                    List<AccountEntity> cached = accountDao.getAll();
                    List<AccountBalance> fallback = toBalanceList(cached);
                    callback.onAccounts(fallback);
                }
            }

            @Override
            public void onFailure(Call<List<AccountBalance>> call, Throwable t) {
                List<AccountEntity> cached = accountDao.getAll();
                callback.onAccounts(toBalanceList(cached));
            }
        });
    }

    public void linkAccount(AuthRepository authRepository, Map<String, String> body, Callback callback) {
        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onError("Not authenticated");
            return;
        }
        backendApi.linkAccount("Bearer " + idToken, body).enqueue(new Callback<AccountBalance>() {
            @Override
            public void onResponse(Call<AccountBalance> call, Response<AccountBalance> response) {
                if (response.isSuccessful() && response.body() != null) {
                    AccountBalance ab = response.body();
                    persistAccount(ab);
                    callback.onAccounts(java.util.Collections.singletonList(ab));
                } else {
                    callback.onError("Link failed: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<AccountBalance> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage());
            }
        });
    }

    public void unlinkAccount(AuthRepository authRepository, String accountId, Callback callback) {
        String idToken = authRepository.getIdToken();
        if (idToken == null) {
            callback.onError("Not authenticated");
            return;
        }
        backendApi.unlinkAccount("Bearer " + idToken, accountId).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    AccountEntity entity = accountDao.findById(Long.parseLong(accountId));
                    if (entity != null) accountDao.delete(entity);
                    callback.onAccounts(java.util.Collections.emptyList());
                } else {
                    callback.onError("Unlink failed: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                callback.onError("Network error: " + t.getMessage());
            }
        });
    }

    private void persistAccounts(List<AccountBalance> accounts) {
        new Thread(() -> {
            for (AccountBalance ab : accounts) {
                AccountEntity e = new AccountEntity();
                e.provider = ab.provider;
                e.providerAccountId = ab.providerAccountId;
                e.displayName = ab.displayName;
                e.email = ab.email;
                e.balance = ab.balance;
                e.currency = ab.currency;
                e.connected = ab.connected;
                e.sessionExpired = ab.sessionExpired;
                e.updatedAt = ab.updatedAt;
                accountDao.insert(e);
            }
        }).start();
    }

    private void persistAccount(AccountBalance ab) {
        new Thread(() -> {
            AccountEntity e = new AccountEntity();
            e.provider = ab.provider;
            e.providerAccountId = ab.providerAccountId;
            e.displayName = ab.displayName;
            e.email = ab.email;
            e.balance = ab.balance;
            e.currency = ab.currency;
            e.connected = ab.connected;
            e.sessionExpired = ab.sessionExpired;
            e.updatedAt = ab.updatedAt;
            accountDao.insert(e);
        }).start();
    }

    private List<AccountBalance> toBalanceList(List<AccountEntity> entities) {
        java.util.ArrayList<AccountBalance> list = new java.util.ArrayList<>();
        for (AccountEntity e : entities) {
            AccountBalance ab = new AccountBalance();
            ab.id = String.valueOf(e.id);
            ab.provider = e.provider;
            ab.providerAccountId = e.providerAccountId;
            ab.displayName = e.displayName;
            ab.email = e.email;
            ab.balance = e.balance;
            ab.currency = e.currency;
            ab.connected = e.connected;
            ab.sessionExpired = e.sessionExpired;
            ab.updatedAt = e.updatedAt;
            list.add(ab);
        }
        return list;
    }
}
