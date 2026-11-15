package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2636Wx0 extends AbstractRunnableC1649Dx0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Callable f24897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RunnableFutureC2688Xx0 f24898d;

    C2636Wx0(RunnableFutureC2688Xx0 runnableFutureC2688Xx0, Callable callable) {
        Objects.requireNonNull(runnableFutureC2688Xx0);
        this.f24898d = runnableFutureC2688Xx0;
        callable.getClass();
        this.f24897c = callable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final Object a() {
        return this.f24897c.call();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final String c() {
        return this.f24897c.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final boolean d() {
        return this.f24898d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final void e(Object obj) {
        this.f24898d.k(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final void f(Throwable th) {
        this.f24898d.l(th);
    }
}
