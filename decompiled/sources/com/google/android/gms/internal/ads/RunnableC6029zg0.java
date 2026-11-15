package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC6029zg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f35829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ RunnableC1459Ag0 f35830b;

    RunnableC6029zg0(RunnableC1459Ag0 runnableC1459Ag0, float f10) {
        this.f35829a = f10;
        Objects.requireNonNull(runnableC1459Ag0);
        this.f35830b = runnableC1459Ag0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35830b.f17386a.g().e(this.f35829a);
    }
}
