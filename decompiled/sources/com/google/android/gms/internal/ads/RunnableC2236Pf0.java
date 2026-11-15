package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2236Pf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f22141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC0582a1 f22142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f22143c;

    RunnableC2236Pf0(AbstractC2704Yf0 abstractC2704Yf0, long j10, InterfaceC0582a1 interfaceC0582a1) {
        this.f22141a = j10;
        this.f22142b = interfaceC0582a1;
        Objects.requireNonNull(abstractC2704Yf0);
        this.f22143c = abstractC2704Yf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2704Yf0 abstractC2704Yf0 = this.f22143c;
        if (abstractC2704Yf0.i() != null) {
            C1561Cf0 c1561Cf0I = abstractC2704Yf0.i();
            long j10 = this.f22141a;
            InterfaceC0582a1 interfaceC0582a1 = this.f22142b;
            c1561Cf0I.i(j10, AbstractC2704Yf0.x(interfaceC0582a1), abstractC2704Yf0.k(), abstractC2704Yf0.f25665e.f1245d, abstractC2704Yf0.N(), abstractC2704Yf0.h());
        }
    }
}
