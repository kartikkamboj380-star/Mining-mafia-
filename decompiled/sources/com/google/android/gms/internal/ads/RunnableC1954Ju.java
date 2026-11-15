package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ju, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1954Ju implements Runnable {
    RunnableC1954Ju(C2109Mu c2109Mu) {
        Objects.requireNonNull(c2109Mu);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
