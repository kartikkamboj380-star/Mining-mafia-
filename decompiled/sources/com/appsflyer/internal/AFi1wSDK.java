package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1wSDK {

    @NotNull
    public final String AFAdRevenueData;

    @Nullable
    public final String getCurrencyIso4217Code;
    private final boolean getMediationNetwork;

    @Nullable
    public final String getMonetizationNetwork;

    public AFi1wSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMediationNetwork = z9;
    }

    public final boolean getRevenue() {
        return this.getMediationNetwork;
    }
}
