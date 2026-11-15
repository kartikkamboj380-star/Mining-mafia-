package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.miningmafia.app.data.remote.model.WalletSummary;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.data.repo.WalletRepository;
import com.miningmafia.app.app.MiningMafiaApplication;
import java.util.List;

/**
 * ViewModel for Wallet: combined + per-account balances, pending/confirmed rewards.
 */
public class WalletViewModel extends BaseViewModel {

    private final WalletRepository walletRepository;
    public final MutableLiveData<WalletSummary> summary = new MutableLiveData<>(null);
    public final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());

    public WalletViewModel() {
        this.walletRepository = MiningMafiaApplication.getContainer().getWalletRepository();
    }

    public LiveData<WalletSummary> getSummary() { return summary; }

    public void load() {
        uiState.setValue(new UiState(true, null, null));
        walletRepository.loadWalletSummary(MiningMafiaApplication.getContainer().getAuthRepository(),
                new WalletRepository.Callback() {
            @Override
            public void onWalletSummary(WalletSummary s) {
                summary.postValue(s);
                uiState.postValue(new UiState(false, null, null));
            }
            @Override
            public void onTransactions(java.util.List<com.miningmafia.app.data.remote.model.Transaction> txs) {}
            @Override
            public void onError(String message) {
                uiState.postValue(new UiState(false, message, null));
            }
        });
    }

    public double combinedBalance() {
        WalletSummary s = summary.getValue();
        return s != null ? s.totalBalance : 0;
    }
}
