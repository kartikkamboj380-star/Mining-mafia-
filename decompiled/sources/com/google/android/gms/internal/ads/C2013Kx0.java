package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2013Kx0 extends AbstractC2374Rw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f20304a;

    C2013Kx0(ExecutorService executorService) {
        executorService.getClass();
        this.f20304a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f20304a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20304a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f20304a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f20304a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f20304a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f20304a.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.f20304a;
        String string = super.toString();
        String strValueOf = String.valueOf(executorService);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length() + 1);
        sb.append(string);
        sb.append("[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
