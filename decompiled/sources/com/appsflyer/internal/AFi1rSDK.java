package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFi1rSDK {
    void getCurrencyIso4217Code(@NotNull Activity activity);

    @NotNull
    String getMediationNetwork(@Nullable Activity activity);

    @Nullable
    String getMonetizationNetwork(@Nullable Activity activity);
}
