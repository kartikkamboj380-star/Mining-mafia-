package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1xSDK {

    public interface AFa1tSDK {
        void onConfigurationChanged(boolean z9);
    }

    void getCurrencyIso4217Code();

    void getMediationNetwork(@NonNull Throwable th, @NonNull String str);

    void getMonetizationNetwork(AFa1tSDK aFa1tSDK);

    void getRevenue();
}
