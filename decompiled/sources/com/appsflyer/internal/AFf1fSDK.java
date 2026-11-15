package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1fSDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;
    final int getMediationNetwork;
    final int getMonetizationNetwork;

    @NotNull
    final String getRevenue;

    public AFf1fSDK(int i10, int i11, int i12, int i13, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i10;
        this.getMediationNetwork = i11;
        this.getMonetizationNetwork = i12;
        this.AFAdRevenueData = i13;
        this.getRevenue = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1fSDK)) {
            return false;
        }
        AFf1fSDK aFf1fSDK = (AFf1fSDK) obj;
        return this.getCurrencyIso4217Code == aFf1fSDK.getCurrencyIso4217Code && this.getMediationNetwork == aFf1fSDK.getMediationNetwork && this.getMonetizationNetwork == aFf1fSDK.getMonetizationNetwork && this.AFAdRevenueData == aFf1fSDK.AFAdRevenueData && Intrinsics.b(this.getRevenue, aFf1fSDK.getRevenue);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.getCurrencyIso4217Code) * 31) + Integer.hashCode(this.getMediationNetwork)) * 31) + Integer.hashCode(this.getMonetizationNetwork)) * 31) + Integer.hashCode(this.AFAdRevenueData)) * 31) + this.getRevenue.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.getCurrencyIso4217Code + ", gdprApplies=" + this.getMediationNetwork + ", cmpSdkId=" + this.getMonetizationNetwork + ", cmpSdkVersion=" + this.AFAdRevenueData + ", tcString=" + this.getRevenue + ")";
    }
}
