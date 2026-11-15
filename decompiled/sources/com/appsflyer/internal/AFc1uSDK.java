package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1uSDK {

    @NotNull
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;

    @NotNull
    final List<AFe1lSDK> getMonetizationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1uSDK(@NotNull String str, @NotNull List<? extends AFe1lSDK> list, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = list;
        this.getMediationNetwork = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1uSDK)) {
            return false;
        }
        AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
        return Intrinsics.b(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Intrinsics.b(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.getMediationNetwork == aFc1uSDK.getMediationNetwork;
    }

    public final int hashCode() {
        return (((this.getCurrencyIso4217Code.hashCode() * 31) + this.getMonetizationNetwork.hashCode()) * 31) + Integer.hashCode(this.getMediationNetwork);
    }

    @NotNull
    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.getCurrencyIso4217Code + ", eventTypes=" + this.getMonetizationNetwork + ", maxCapacity=" + this.getMediationNetwork + ")";
    }
}
