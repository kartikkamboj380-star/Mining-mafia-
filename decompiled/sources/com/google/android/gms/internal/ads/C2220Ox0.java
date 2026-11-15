package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ox0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2220Ox0 extends C2013Kx0 implements InterfaceScheduledExecutorServiceC1857Hx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ScheduledExecutorService f21738b;

    C2220Ox0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.f21738b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final InterfaceScheduledFutureC1753Fx0 schedule(Callable callable, long j10, TimeUnit timeUnit) {
        RunnableFutureC2688Xx0 runnableFutureC2688Xx0 = new RunnableFutureC2688Xx0(callable);
        return new C2116Mx0(runnableFutureC2688Xx0, this.f21738b.schedule(runnableFutureC2688Xx0, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceScheduledFutureC1753Fx0 schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.f21738b;
        RunnableFutureC2688Xx0 runnableFutureC2688Xx0C = RunnableFutureC2688Xx0.C(runnable, null);
        return new C2116Mx0(runnableFutureC2688Xx0C, scheduledExecutorService.schedule(runnableFutureC2688Xx0C, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceScheduledFutureC1753Fx0 scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC2168Nx0 runnableC2168Nx0 = new RunnableC2168Nx0(runnable);
        return new C2116Mx0(runnableC2168Nx0, this.f21738b.scheduleAtFixedRate(runnableC2168Nx0, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceScheduledFutureC1753Fx0 scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        RunnableC2168Nx0 runnableC2168Nx0 = new RunnableC2168Nx0(runnable);
        return new C2116Mx0(runnableC2168Nx0, this.f21738b.scheduleWithFixedDelay(runnableC2168Nx0, j10, j11, timeUnit));
    }
}
