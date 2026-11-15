package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableFutureC2688Xx0 extends AbstractC4552nx0 implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile AbstractRunnableC1649Dx0 f25410h;

    RunnableFutureC2688Xx0(InterfaceC3169cx0 interfaceC3169cx0) {
        this.f25410h = new C2584Vx0(this, interfaceC3169cx0);
    }

    static RunnableFutureC2688Xx0 C(Runnable runnable, Object obj) {
        return new RunnableFutureC2688Xx0(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final void m() {
        AbstractRunnableC1649Dx0 abstractRunnableC1649Dx0;
        if (t() && (abstractRunnableC1649Dx0 = this.f25410h) != null) {
            abstractRunnableC1649Dx0.g();
        }
        this.f25410h = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1907Iw0
    protected final String n() {
        AbstractRunnableC1649Dx0 abstractRunnableC1649Dx0 = this.f25410h;
        if (abstractRunnableC1649Dx0 == null) {
            return super.n();
        }
        String string = abstractRunnableC1649Dx0.toString();
        StringBuilder sb = new StringBuilder(string.length() + 7);
        sb.append("task=[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC1649Dx0 abstractRunnableC1649Dx0 = this.f25410h;
        if (abstractRunnableC1649Dx0 != null) {
            abstractRunnableC1649Dx0.run();
        }
        this.f25410h = null;
    }

    RunnableFutureC2688Xx0(Callable callable) {
        this.f25410h = new C2636Wx0(this, callable);
    }
}
