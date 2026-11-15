package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Px0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2272Px0 {
    public static Executor a() {
        return EnumC4300lx0.INSTANCE;
    }

    public static InterfaceExecutorServiceC1805Gx0 b(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC1805Gx0) {
            return (InterfaceExecutorServiceC1805Gx0) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new C2220Ox0((ScheduledExecutorService) executorService) : new C2013Kx0(executorService);
    }

    public static InterfaceScheduledExecutorServiceC1857Hx0 c(ScheduledExecutorService scheduledExecutorService) {
        return new C2220Ox0(scheduledExecutorService);
    }

    static Executor d(final Executor executor, final AbstractC1907Iw0 abstractC1907Iw0) {
        executor.getClass();
        return executor == EnumC4300lx0.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.Lx0
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                AbstractC2272Px0.f(executor, abstractC1907Iw0, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Executor executor, AbstractC1907Iw0 abstractC1907Iw0, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e10) {
            abstractC1907Iw0.l(e10);
        }
    }
}
