package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1vSDK {
    public final String AFAdRevenueData;
    public final AFi1ySDK component1;
    public final Throwable component3;
    public final String component4;
    public final long getCurrencyIso4217Code;
    public final long getMediationNetwork;

    @NonNull
    public final String getMonetizationNetwork;
    public final int getRevenue;

    public AFi1vSDK(String str, @NonNull String str2, long j10, long j11, int i10, AFi1ySDK aFi1ySDK, String str3, Throwable th) {
        this.AFAdRevenueData = str;
        this.getMonetizationNetwork = str2;
        this.getCurrencyIso4217Code = j10;
        this.getMediationNetwork = j11;
        this.getRevenue = i10;
        this.component1 = aFi1ySDK;
        this.component4 = str3;
        this.component3 = th;
    }
}
