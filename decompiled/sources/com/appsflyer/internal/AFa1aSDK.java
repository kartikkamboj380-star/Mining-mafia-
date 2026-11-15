package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFa1aSDK {
    void getCurrencyIso4217Code();

    void getMonetizationNetwork(boolean z9);

    boolean getMonetizationNetwork();

    @Nullable
    Map<String, Object> getRevenue();
}
