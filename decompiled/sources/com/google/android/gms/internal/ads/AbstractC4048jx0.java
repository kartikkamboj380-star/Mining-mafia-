package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4048jx0 extends AbstractRunnableC1649Dx0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f30646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4174kx0 f30647d;

    AbstractC4048jx0(C4174kx0 c4174kx0, Executor executor) {
        Objects.requireNonNull(c4174kx0);
        this.f30647d = c4174kx0;
        executor.getClass();
        this.f30646c = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final boolean d() {
        return this.f30647d.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final void e(Object obj) {
        this.f30647d.Q(null);
        h(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1649Dx0
    final void f(Throwable th) {
        C4174kx0 c4174kx0 = this.f30647d;
        c4174kx0.Q(null);
        if (th instanceof ExecutionException) {
            c4174kx0.l(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c4174kx0.cancel(false);
        } else {
            c4174kx0.l(th);
        }
    }

    abstract void h(Object obj);

    final void i() {
        try {
            this.f30646c.execute(this);
        } catch (RejectedExecutionException e10) {
            this.f30647d.l(e10);
        }
    }
}
