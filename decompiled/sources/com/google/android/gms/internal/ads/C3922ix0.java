package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ix0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3922ix0 extends AbstractC4048jx0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Callable f30124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4174kx0 f30125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3922ix0(C4174kx0 c4174kx0, Callable callable, Executor executor) {
        super(c4174kx0, executor);
        Objects.requireNonNull(c4174kx0);
        this.f30125f = c4174kx0;
        this.f30124e = callable;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final Object a() {
        return this.f30124e.call();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final String c() {
        return this.f30124e.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4048jx0
    final void h(Object obj) {
        this.f30125f.k(obj);
    }
}
