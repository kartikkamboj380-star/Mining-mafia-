package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1647Dw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AbstractC1907Iw0 f18315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.common.util.concurrent.p f18316b;

    RunnableC1647Dw0(AbstractC1907Iw0 abstractC1907Iw0, com.google.common.util.concurrent.p pVar) {
        this.f18315a = abstractC1907Iw0;
        this.f18316b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18315a.f22231a != this) {
            return;
        }
        if (AbstractC2270Pw0.f(this.f18315a, this, AbstractC1907Iw0.o(this.f18316b))) {
            AbstractC1907Iw0.y(this.f18315a, false);
        }
    }
}
