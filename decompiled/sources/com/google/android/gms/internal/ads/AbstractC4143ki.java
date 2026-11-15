package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4143ki {
    public static Object a(InterfaceC4166kt0 interfaceC4166kt0) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return interfaceC4166kt0.zza();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
