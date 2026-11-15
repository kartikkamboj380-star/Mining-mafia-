package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class H70 implements InterfaceC3471fM {
    protected H70() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3471fM
    public final InterfaceC4739pR a(Looper looper, Handler.Callback callback) {
        return new J80(new Handler(looper, callback));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3471fM
    public final long zza() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3471fM
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3471fM
    public final long zzc() {
        return System.nanoTime();
    }
}
