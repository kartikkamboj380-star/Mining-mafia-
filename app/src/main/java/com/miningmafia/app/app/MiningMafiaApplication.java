package com.miningmafia.app.app;

import android.app.Application;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.miningmafia.app.di.AppContainer;
import com.google.firebase.FirebaseApp;

/**
 * Application entry point.
 *
 * The mining/wallet backend (CT Pool or any authorized provider) is NOT embedded here.
 * The app connects to a configurable backend base URL supplied at runtime/build time.
 * No API secrets or signing keys are stored in this repository.
 */
public class MiningMafiaApplication extends Application {

    private static AppContainer container;

    public static AppContainer getContainer() {
        if (container == null) {
            throw new IllegalStateException("Application container not initialized");
        }
        return container;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        container = new AppContainer(this);

        // Track foreground/background state for battery-aware operation.
        ProcessLifecycleOwner.get().getLifecycle().addObserver(
                new DefaultLifecycleObserver() {
                    @Override
                    public void onStop() {
                        container.getMiningManager().onAppBackgrounded();
                    }

                    @Override
                    public void onStart() {
                        container.getMiningManager().onAppForegrounded();
                    }
                });
    }
}
