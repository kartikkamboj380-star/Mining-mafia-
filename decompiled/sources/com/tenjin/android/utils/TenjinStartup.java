package com.tenjin.android.utils;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.tenjin.android.params.AttributionParams;
import com.tenjin.android.params.platform.PlatformParams;
import com.tenjin.android.store.DataStore;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class TenjinStartup {
    private final AttributionParams attribution;
    public StartupCallback callback;
    private final Context context;
    private final AtomicBoolean startupComplete = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    class PlatformParameterWrapper {
        private PlatformParams params;

        public PlatformParams getParams() {
            return this.params;
        }

        public void setParams(PlatformParams platformParams) {
            this.params = platformParams;
        }

        private PlatformParameterWrapper() {
        }
    }

    public interface StartupCallback {
        void onStartupComplete(AttributionParams attributionParams, PlatformParams platformParams);
    }

    public TenjinStartup(Context context, DataStore dataStore) {
        this.context = context;
        this.attribution = new AttributionParams(context, dataStore);
    }

    public static /* synthetic */ void a(TenjinStartup tenjinStartup, CountDownLatch countDownLatch) {
        tenjinStartup.getClass();
        try {
            Log.d("TenjinStartup", "Starting attribution retrieval");
            tenjinStartup.attribution.getAttribution();
            Log.d("TenjinStartup", "Completed attribution retrieval");
        } finally {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ void b(TenjinStartup tenjinStartup, PlatformParameterWrapper platformParameterWrapper, CountDownLatch countDownLatch) {
        tenjinStartup.getClass();
        try {
            Log.d("TenjinStartup", "Starting advertising id retrieval");
            platformParameterWrapper.setParams(PlatformParams.getParamsForPlatform(tenjinStartup.context));
            Log.d("TenjinStartup", "Completed advertising id retrieval");
        } catch (IllegalStateException e10) {
            Log.e("TenjinStartup", "IllegalStateException in getParamsForPlatform: " + e10.getMessage(), e10);
        } catch (Exception e11) {
            Log.e("TenjinStartup", "Exception in getParamsForPlatform: " + e11.getMessage(), e11);
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartupInternal() {
        final PlatformParameterWrapper platformParameterWrapper = new PlatformParameterWrapper();
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        Runnable runnable = new Runnable() { // from class: com.tenjin.android.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                TenjinStartup.a(this.f42667a, countDownLatch);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: com.tenjin.android.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                TenjinStartup.b(this.f42669a, platformParameterWrapper, countDownLatch);
            }
        };
        new Thread(runnable).start();
        new Thread(runnable2).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Log.e("TenjinStartup", "Startup process was interrupted", e10);
        }
        Log.d("TenjinStartup", "Set complete");
        this.startupComplete.set(true);
        StartupCallback startupCallback = this.callback;
        if (startupCallback != null) {
            startupCallback.onStartupComplete(this.attribution, platformParameterWrapper.getParams());
        }
    }

    public AtomicBoolean completed() {
        return this.startupComplete;
    }

    public void doStartup() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            doStartupInternal();
        } else {
            Log.w("TenjinStartup", "Warning: doStartup() called on the main thread. Offloading to a background thread.");
            new Thread(new Runnable() { // from class: com.tenjin.android.utils.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42672a.doStartupInternal();
                }
            }).start();
        }
    }
}
