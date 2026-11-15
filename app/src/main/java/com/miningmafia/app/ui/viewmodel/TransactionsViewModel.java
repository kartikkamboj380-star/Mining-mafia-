package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.miningmafia.app.data.remote.model.Transaction;
import com.miningmafia.app.data.repo.WalletRepository;
import com.miningmafia.app.app.MiningMafiaApplication;
import java.util.List;

/**
 * ViewModel for transaction history.
 */
public class TransactionsViewModel extends BaseViewModel {

    private final WalletRepository walletRepository;
    public final MutableLiveData<List<Transaction>> transactions = new MutableLiveData<>(null);
    public final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());

    public TransactionsViewModel() {
        this.walletRepository = MiningMafiaApplication.getContainer().getWalletRepository();
    }

    public void load(int limit, int offset) {
        uiState.setValue(new UiState(true, null, null));
        walletRepository.loadTransactions(MiningMafiaApplication.getContainer().getAuthRepository(),
                limit, offset, new WalletRepository.Callback() {
            @Override
            public void onWalletSummary(com.miningmafia.app.data.remote.model.WalletSummary summary) {}
            @Override
            public void onTransactions(List<Transaction> txs) {
                transactions.postValue(txs);
                uiState.postValue(new UiState(false, null, null));
            }
            @Override
            public void onError(String message) {
                uiState.postValue(new UiState(false, message, null));
            }
        });
    }
}
