package com.miningmafia.app.ui.viewmodel;

import androidx.lifecycle.ViewModel;

/**
 * Base ViewModel with a simple UI state holder pattern.
 */
public abstract class BaseViewModel extends ViewModel {
    public static class UiState {
        public boolean loading = false;
        public String error = null;
        public String message = null;

        public UiState() {}
        public UiState(boolean loading, String error, String message) {
            this.loading = loading;
            this.error = error;
            this.message = message;
        }
    }
}
