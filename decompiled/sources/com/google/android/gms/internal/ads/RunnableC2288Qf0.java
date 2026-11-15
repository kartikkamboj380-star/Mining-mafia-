package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Qf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2288Qf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ H4.Z0 f22421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f22422b;

    RunnableC2288Qf0(AbstractC2704Yf0 abstractC2704Yf0, H4.Z0 z9) {
        this.f22421a = z9;
        Objects.requireNonNull(abstractC2704Yf0);
        this.f22422b = abstractC2704Yf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22422b.e(this.f22421a);
    }
}
