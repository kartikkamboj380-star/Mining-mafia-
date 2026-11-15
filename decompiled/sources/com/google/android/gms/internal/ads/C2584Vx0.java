package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2584Vx0 extends AbstractRunnableC1649Dx0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3169cx0 f24610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RunnableFutureC2688Xx0 f24611d;

    C2584Vx0(RunnableFutureC2688Xx0 runnableFutureC2688Xx0, InterfaceC3169cx0 interfaceC3169cx0) {
        Objects.requireNonNull(runnableFutureC2688Xx0);
        this.f24611d = runnableFutureC2688Xx0;
        this.f24610c = interfaceC3169cx0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final /* bridge */ /* synthetic */ Object a() {
        InterfaceC3169cx0 interfaceC3169cx0 = this.f24610c;
        com.google.common.util.concurrent.p pVarZza = interfaceC3169cx0.zza();
        AbstractC2418Ss0.l(pVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC3169cx0);
        return pVarZza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final String c() {
        return this.f24610c.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final boolean d() {
        return this.f24611d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final /* synthetic */ void e(Object obj) {
        this.f24611d.u((com.google.common.util.concurrent.p) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final void f(Throwable th) {
        this.f24611d.l(th);
    }
}
