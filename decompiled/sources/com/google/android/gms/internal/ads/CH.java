package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class CH implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f17847a;

    @Override // java.lang.Runnable
    public final void run() {
        DH dh = (DH) this.f17847a.get();
        if (dh != null) {
            dh.g1(C5978zH.f35685a);
        }
    }
}
