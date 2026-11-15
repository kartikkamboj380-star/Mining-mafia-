package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1522Bm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1678Em f17688a;

    RunnableC1522Bm(C1678Em c1678Em) {
        Objects.requireNonNull(c1678Em);
        this.f17688a = c1678Em;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17688a.b();
    }
}
