package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2593Wc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2645Xc f24830a;

    RunnableC2593Wc(C2645Xc c2645Xc) {
        Objects.requireNonNull(c2645Xc);
        this.f24830a = c2645Xc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC3892ii.a(this.f24830a.f25323a);
    }
}
