package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1gSDK {

    @NotNull
    public final String AFAdRevenueData;
    public final int getCurrencyIso4217Code;

    public AFb1gSDK(int i10, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i10;
        this.AFAdRevenueData = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.getCurrencyIso4217Code == aFb1gSDK.getCurrencyIso4217Code && Intrinsics.b(this.AFAdRevenueData, aFb1gSDK.AFAdRevenueData);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.getCurrencyIso4217Code) * 31) + this.AFAdRevenueData.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AppSetIdModel(scope=" + this.getCurrencyIso4217Code + ", id=" + this.AFAdRevenueData + ")";
    }
}
