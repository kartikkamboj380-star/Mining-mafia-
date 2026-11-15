package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.miningmafia.app.data.remote.model.WalletSummary;
import com.miningmafia.app.data.remote.model.MiningStatus;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.data.repo.WalletRepository;
import com.miningmafia.app.data.repo.AccountRepository;
import com.miningmafia.app.app.MiningMafiaApplication;
import com.miningmafia.app.util.BatteryTempMonitor;
import com.miningmafia.app.util.NetworkMonitor;
import java.util.List;

/**
 * ViewModel for the Home dashboard: combined balance, mining status, accounts,
 * today's rewards, temperature, battery.
 */
public class HomeViewModel extends BaseViewModel {

    private final WalletRepository walletRepository;
    private final AccountRepository accountRepository;
    private final BatteryTempMonitor batteryTempMonitor;
    private final NetworkMonitor networkMonitor;

    public final MutableLiveData<WalletSummary> wallet = new MutableLiveData<>(null);
    public final MutableLiveData<MiningStatus> mining = new MutableLiveData<>(null);
    public final MutableLiveData<List<AccountBalance>> accounts = new MutableLiveData<>(null);
    public final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());
    public final MutableLiveData<Float> temperature = new MutableLiveData<>(0f);
    public final MutableLiveData<Integer> battery = new MutableLiveData<>(0);
    public final MutableLiveData<Boolean> charging = new MutableLiveData<>(false);

    public HomeViewModel() {
        MiningMafiaApplication app = MiningMafiaApplication.getContainer();
        this.walletRepository = app.getWalletRepository();
        this.accountRepository = app.getAccountRepository();
        this.batteryTempMonitor = app.getBatteryTempMonitor();
        this.networkMonitor = app.getNetworkMonitor();

        batteryTempMonitor.setCallback((level, scale, tempC, ch) -> {
            temperature.postValue(tempC);
            battery.postValue((int)(scale==0?0:level*100f/scale));
            charging.postValue(ch);
        });
    }

    public void load() {
        uiState.setValue(new UiState(true, null, null));
        walletRepository.loadWalletSummary(MiningMafiaApplication.getContainer().getAuthRepository(),
                new WalletRepository.Callback() {
            @Override
            public void onWalletSummary(WalletSummary summary) {
                wallet.postValue(summary);
                accounts.postValue(summary.accounts);
                uiState.postValue(new UiState(false, null, null));
            }
            @Override
            public void onTransactions(java.util.List<com.miningmafia.app.data.remote.model.Transaction> transactions) {}
            @Override
            public void onError(String message) {
                uiState.postValue(new UiState(false, message, null));
            }
        });

        accountRepository.loadAccounts(MiningMafiaApplication.getContainer().getAuthRepository(),
                new AccountRepository.Callback() {
            @Override
            public void onAccounts(List<AccountBalance> accts) {
                if (accounts.getValue() == null) accounts.postValue(accts);
                uiState.postValue(new UiState(false, null, null));
            }
            @Override
            public void onError(String message) {}
        });

        batteryTempMonitor.refresh();
        networkMonitor.refresh();
    }
}
