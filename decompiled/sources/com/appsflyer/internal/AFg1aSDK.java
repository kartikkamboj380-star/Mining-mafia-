package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1aSDK extends AFg1hSDK {
    private final boolean AFAdRevenueData;

    @NotNull
    private final AFd1zSDK getMediationNetwork;

    public AFg1aSDK(@NotNull AFd1zSDK aFd1zSDK) {
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        this.getMediationNetwork = aFd1zSDK;
        this.AFAdRevenueData = true;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z9) {
            this.getMediationNetwork.copy().getMediationNetwork("D", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z12) {
            this.getMediationNetwork.copy().getMediationNetwork("E", getMonetizationNetwork(str, aFg1cSDK));
        }
        if (z12) {
            this.getMediationNetwork.copy().getCurrencyIso4217Code(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getMediationNetwork.copy().getMediationNetwork("F", getMonetizationNetwork(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final boolean getShouldExtendMsg() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z9) {
            this.getMediationNetwork.copy().getMediationNetwork("I", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z9) {
            this.getMediationNetwork.copy().getMediationNetwork("V", getMonetizationNetwork(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z9) {
            this.getMediationNetwork.copy().getMediationNetwork("W", getMonetizationNetwork(str, aFg1cSDK));
        }
    }
}
