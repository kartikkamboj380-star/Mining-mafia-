package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.data.repo.AccountRepository;
import com.miningmafia.app.app.MiningMafiaApplication;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * ViewModel for Accounts: list, link, unlink connected accounts.
 */
public class AccountsViewModel extends BaseViewModel {

    private final AccountRepository accountRepository;
    public final MutableLiveData<List<AccountBalance>> accounts = new MutableLiveData<>(null);
    public final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());

    public AccountsViewModel() {
        this.accountRepository = MiningMafiaApplication.getContainer().getAccountRepository();
    }

    public LiveData<List<AccountBalance>> getAccounts() { return accounts; }

    public void load() {
        uiState.setValue(new UiState(true, null, null));
        accountRepository.loadAccounts(MiningMafiaApplication.getContainer().getAuthRepository(),
                new AccountRepository.Callback() {
            @Override
            public void onAccounts(List<AccountBalance> accts) {
                accounts.postValue(accts);
                uiState.postValue(new UiState(false, null, null));
            }
            @Override
            public void onError(String message) {
                uiState.postValue(new UiState(false, message, null));
            }
        });
    }

    public void linkGoogle(String providerAccountId, String email, String displayName) {
        Map<String, String> body = new HashMap<>();
        body.put("provider", "google");
        body.put("provider_account_id", providerAccountId);
        body.put("email", email);
        body.put("display_name", displayName);
        link(body);
    }

    public void linkEmail(String email, String password) {
        Map<String, String> body = new HashMap<>();
        body.put("provider", "email");
        body.put("email", email);
        body.put("password", password); // sent over HTTPS only; never stored locally
        link(body);
    }

    private void link(Map<String, String> body) {
        uiState.setValue(new UiState(true, null, null));
        accountRepository.linkAccount(MiningMafiaApplication.getContainer().getAuthRepository(),
                body, new AccountRepository.Callback() {
            @Override
            public void onAccounts(List<AccountBalance> accts) {
                accounts.postValue(accts);
                uiState.setValue(new UiState(false, null, "Account linked."));
            }
            @Override
            public void onError(String message) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }

    public void unlink(String accountId) {
        uiState.setValue(new UiState(true, null, null));
        accountRepository.unlinkAccount(MiningMafiaApplication.getContainer().getAuthRepository(),
                accountId, new AccountRepository.Callback() {
            @Override
            public void onAccounts(List<AccountBalance> accts) {
                accounts.postValue(accts);
                uiState.setValue(new UiState(false, null, "Account disconnected."));
            }
            @Override
            public void onError(String message) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }
}
