package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1vSDK {
    @NotNull
    List<AFc1rSDK> AFAdRevenueData();

    void getCurrencyIso4217Code();

    void getMonetizationNetwork();

    boolean getMonetizationNetwork(@Nullable String str);

    @Nullable
    String getRevenue(@NotNull AFc1rSDK aFc1rSDK);
}
