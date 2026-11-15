package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2575Vt implements com.google.common.util.concurrent.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2376Rx0 f24581a = C2376Rx0.B();

    private static final boolean a(boolean z9) {
        if (!z9) {
            G4.t.l().k(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z9;
    }

    public final boolean b(Object obj) {
        boolean zK = this.f24581a.k(obj);
        a(zK);
        return zK;
    }

    public final boolean c(Throwable th) {
        boolean zL = this.f24581a.l(th);
        a(zL);
        return zL;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return this.f24581a.cancel(z9);
    }

    @Override // com.google.common.util.concurrent.p
    public final void e(Runnable runnable, Executor executor) {
        this.f24581a.e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24581a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24581a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24581a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f24581a.get(j10, timeUnit);
    }
}
