package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1oSDK {

    @Nullable
    public final String AFAdRevenueData;

    @NotNull
    public final String getCurrencyIso4217Code;

    @Nullable
    public final Intent getMonetizationNetwork;

    public AFh1oSDK(@NotNull Activity activity, @NotNull AFi1rSDK aFi1rSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        this.getMonetizationNetwork = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1rSDK.getMediationNetwork(activity);
        this.AFAdRevenueData = aFi1rSDK.getMonetizationNetwork(activity);
    }
}
