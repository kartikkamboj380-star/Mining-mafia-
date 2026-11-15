package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.miningmafia.app.data.remote.model.MiningStatus;
import com.miningmafia.app.mining.MiningManager;
import com.miningmafia.app.app.MiningMafiaApplication;

/**
 * ViewModel for the Mining screen. Metrics come from the authorized backend only.
 */
public class MiningViewModel extends BaseViewModel implements MiningManager.Listener {

    private final MiningManager miningManager;
    public final MutableLiveData<MiningStatus> status = new MutableLiveData<>(null);
    public final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());

    public MiningViewModel() {
        this.miningManager = MiningMafiaApplication.getContainer().getMiningManager();
        this.miningManager.setListener(this);
    }

    public LiveData<MiningStatus> getStatus() { return status; }
    public boolean isMining() { return miningManager.isMining(); }

    public void startMining(String workerId) {
        uiState.setValue(new UiState(true, null, null));
        miningManager.startMining(workerId);
    }

    public void stopMining() {
        uiState.setValue(new UiState(true, null, null));
        miningManager.stopMining();
    }

    public void refresh() {
        miningManager.refreshStatus();
    }

    @Override
    public void onStatus(MiningStatus miningStatus) {
        status.postValue(miningStatus);
        uiState.postValue(new UiState(false, null, null));
    }

    @Override
    public void onError(String message) {
        uiState.postValue(new UiState(false, message, null));
    }
}
