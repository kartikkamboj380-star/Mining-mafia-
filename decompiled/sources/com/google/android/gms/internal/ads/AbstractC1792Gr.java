package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1792Gr extends ContextWrapper {
    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
