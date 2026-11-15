package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1aSDK {
    @NotNull
    List<AFc1bSDK> AFAdRevenueData();

    void AFAdRevenueData(int i10, int i11);

    @Nullable
    String getCurrencyIso4217Code(@NotNull Throwable th, @NotNull String str);

    boolean getMediationNetwork();

    int getRevenue();

    boolean getRevenue(@NotNull String... strArr);
}
