package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC6058zv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1540Bv f35878a;

    RunnableC6058zv(C1540Bv c1540Bv) {
        Objects.requireNonNull(c1540Bv);
        this.f35878a = c1540Bv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G4.t.b().e(this.f35878a);
    }
}
