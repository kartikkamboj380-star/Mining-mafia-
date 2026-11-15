package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Of0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2184Of0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC0582a1 f21627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f21628b;

    RunnableC2184Of0(AbstractC2704Yf0 abstractC2704Yf0, InterfaceC0582a1 interfaceC0582a1) {
        this.f21627a = interfaceC0582a1;
        Objects.requireNonNull(abstractC2704Yf0);
        this.f21628b = abstractC2704Yf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21628b.f(this.f21627a);
    }
}
