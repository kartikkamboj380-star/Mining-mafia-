package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1mSDK {

    @Nullable
    public final String AFAdRevenueData;
    public final long getCurrencyIso4217Code;

    @Nullable
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;

    public AFi1mSDK(long j10, long j11, @Nullable String str, @Nullable String str2) {
        this.getMonetizationNetwork = j10;
        this.getCurrencyIso4217Code = j11;
        this.AFAdRevenueData = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1mSDK)) {
            return false;
        }
        AFi1mSDK aFi1mSDK = (AFi1mSDK) obj;
        return this.getMonetizationNetwork == aFi1mSDK.getMonetizationNetwork && this.getCurrencyIso4217Code == aFi1mSDK.getCurrencyIso4217Code && Intrinsics.b(this.AFAdRevenueData, aFi1mSDK.AFAdRevenueData) && Intrinsics.b(this.getMediationNetwork, aFi1mSDK.getMediationNetwork);
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.getMonetizationNetwork) * 31) + Long.hashCode(this.getCurrencyIso4217Code)) * 31;
        String str = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.getMonetizationNetwork + ", ttrMillis=" + this.getCurrencyIso4217Code + ", piaToken=" + this.AFAdRevenueData + ", errorCode=" + this.getMediationNetwork + ")";
    }
}
