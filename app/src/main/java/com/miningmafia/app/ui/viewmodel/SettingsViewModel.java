package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.miningmafia.app.app.MiningMafiaApplication;
import com.miningmafia.app.data.remote.BackendConfig;

/**
 * ViewModel for Settings: backend URL config, battery/temp toggles.
 */
public class SettingsViewModel extends BaseViewModel {

    private final BackendConfig backendConfig;
    public final MutableLiveData<UiState> uiState = new MutableLiveData<>(new UiState());
    public final MutableLiveData<Boolean> backendConfigured = new MutableLiveData<>(false);

    public SettingsViewModel() {
        this.backendConfig = MiningMafiaApplication.getContainer().getBackendConfig();
        backendConfigured.postValue(backendConfig.isConfigured());
    }

    public String getBackendUrl() { return backendConfig.getBaseUrl(); }

    public void saveBackendUrl(String url) {
        uiState.setValue(new UiState(true, null, null));
        backendConfig.setBaseUrl(url);
        backendConfigured.postValue(backendConfig.isConfigured());
        uiState.setValue(new UiState(false, null, "Backend URL saved."));
    }

    public void logout() {
        MiningMafiaApplication.getContainer().getAuthRepository().logout(
                new com.miningmafia.app.auth.AuthRepository.Callback() {
            @Override
            public void onSuccess(com.miningmafia.app.data.remote.model.AuthResponse response) {
                uiState.setValue(new UiState(false, null, "Logged out."));
            }
            @Override
            public void onError(String message, boolean retryable) {
                uiState.setValue(new UiState(false, message, null));
            }
        });
    }
}
