package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ag0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC1459Ag0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1511Bg0 f17386a;

    RunnableC1459Ag0(C1511Bg0 c1511Bg0) {
        Objects.requireNonNull(c1511Bg0);
        this.f17386a = c1511Bg0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1511Bg0 c1511Bg0 = this.f17386a;
        AtomicBoolean atomicBooleanF = c1511Bg0.f();
        float fC = c1511Bg0.c();
        atomicBooleanF.set(false);
        if (((Float) c1511Bg0.e().getAndSet(Float.valueOf(fC))).floatValue() != fC) {
            c1511Bg0.d().post(new RunnableC6029zg0(this, fC));
        }
    }
}
