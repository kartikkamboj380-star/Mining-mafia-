package I8;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: I8.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0693s0 extends AbstractC0691r0 implements Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f1815c;

    public C0693s0(Executor executor) {
        this.f1815c = executor;
        if (q1() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) q1()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void r1(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        E0.c(coroutineContext, AbstractC0688p0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture s1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            r1(coroutineContext, e10);
            return null;
        }
    }

    @Override // I8.Y
    public void M(long j10, InterfaceC0683n interfaceC0683n) {
        long j11;
        Executor executorQ1 = q1();
        ScheduledFuture scheduledFutureS1 = null;
        ScheduledExecutorService scheduledExecutorService = executorQ1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorQ1 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureS1 = s1(scheduledExecutorService, new T0(this, interfaceC0683n), interfaceC0683n.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureS1 != null) {
            r.c(interfaceC0683n, new C0679l(scheduledFutureS1));
        } else {
            U.f1746h.M(j11, interfaceC0683n);
        }
    }

    @Override // I8.Y
    public InterfaceC0670g0 R(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        long j11;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor executorQ1 = q1();
        ScheduledFuture scheduledFutureS1 = null;
        ScheduledExecutorService scheduledExecutorService = executorQ1 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorQ1 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFutureS1 = s1(scheduledExecutorService, runnable2, coroutineContext2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        return scheduledFutureS1 != null ? new C0668f0(scheduledFutureS1) : U.f1746h.R(j11, runnable2, coroutineContext2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorQ1 = q1();
        ExecutorService executorService = executorQ1 instanceof ExecutorService ? (ExecutorService) executorQ1 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0693s0) && ((C0693s0) obj).q1() == q1();
    }

    public int hashCode() {
        return System.identityHashCode(q1());
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executorQ1 = q1();
            AbstractC0661c.a();
            executorQ1.execute(runnable);
        } catch (RejectedExecutionException e10) {
            AbstractC0661c.a();
            r1(coroutineContext, e10);
            C0666e0.b().l1(coroutineContext, runnable);
        }
    }

    @Override // I8.AbstractC0691r0
    public Executor q1() {
        return this.f1815c;
    }

    @Override // I8.K
    public String toString() {
        return q1().toString();
    }
}
