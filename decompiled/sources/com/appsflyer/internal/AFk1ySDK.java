package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1ySDK {
    public String getMonetizationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFk1ySDK(@NonNull Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
