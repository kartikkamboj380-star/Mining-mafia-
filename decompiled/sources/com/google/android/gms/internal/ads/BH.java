package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class BH implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f17543a;

    @Override // java.lang.Runnable
    public final void run() {
        DH dh = (DH) this.f17543a.get();
        if (dh != null) {
            dh.g1(AH.f17278a);
        }
    }
}
