package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1rSDK {
    public static boolean getRevenue(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int iAFAdRevenueData = AFj1aSDK.AFAdRevenueData(str);
        int iAFAdRevenueData2 = AFj1aSDK.AFAdRevenueData(str2);
        Pair<Integer, Integer> mediationNetwork = AFd1pSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str2);
        if (iAFAdRevenueData2 != -1 && mediationNetwork == null) {
            return iAFAdRevenueData2 == iAFAdRevenueData;
        }
        if (currencyIso4217Code != null) {
            return ((Number) currencyIso4217Code.c()).intValue() <= iAFAdRevenueData && iAFAdRevenueData <= ((Number) currencyIso4217Code.d()).intValue();
        }
        return mediationNetwork != null && ((Number) mediationNetwork.c()).intValue() <= iAFAdRevenueData && iAFAdRevenueData <= ((Number) mediationNetwork.d()).intValue();
    }
}
