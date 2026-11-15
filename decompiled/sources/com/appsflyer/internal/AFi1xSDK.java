package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1xSDK {

    @NotNull
    public final Context getCurrencyIso4217Code;

    @Nullable
    public AFi1pSDK getRevenue;

    public AFi1xSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.getCurrencyIso4217Code = context;
    }
}
