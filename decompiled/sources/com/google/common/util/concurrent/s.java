package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f39948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.a f39949b;

        a(Executor executor, com.google.common.util.concurrent.a aVar) {
            this.f39948a = executor;
            this.f39949b = aVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f39948a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f39949b.D(e10);
            }
        }
    }

    private static class b extends com.google.common.util.concurrent.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ExecutorService f39950a;

        b(ExecutorService executorService) {
            this.f39950a = (ExecutorService) X5.j.h(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f39950a.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f39950a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f39950a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f39950a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f39950a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.f39950a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f39950a + "]";
        }
    }

    private static final class c extends b implements ScheduledExecutorService, r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f39951b;

        private static final class a extends h.a implements q {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ScheduledFuture f39952b;

            public a(p pVar, ScheduledFuture scheduledFuture) {
                super(pVar);
                this.f39952b = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.g, java.util.concurrent.Future
            public boolean cancel(boolean z9) {
                boolean zCancel = super.cancel(z9);
                if (zCancel) {
                    this.f39952b.cancel(z9);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f39952b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f39952b.getDelay(timeUnit);
            }
        }

        private static final class b extends com.google.common.util.concurrent.a.j implements Runnable {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final Runnable f39953h;

            public b(Runnable runnable) {
                this.f39953h = (Runnable) X5.j.h(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f39953h.run();
                } catch (Throwable th) {
                    D(th);
                    throw th;
                }
            }

            @Override // com.google.common.util.concurrent.a
            protected String z() {
                return "task=[" + this.f39953h + "]";
            }
        }

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f39951b = (ScheduledExecutorService) X5.j.h(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public q schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            x xVarG = x.G(runnable, null);
            return new a(xVarG, this.f39951b.schedule(xVarG, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public q schedule(Callable callable, long j10, TimeUnit timeUnit) {
            x xVarH = x.H(callable);
            return new a(xVarH, this.f39951b.schedule(xVarH, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public q scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f39951b.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public q scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f39951b.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }
    }

    public static Executor a() {
        return e.INSTANCE;
    }

    public static r b(ExecutorService executorService) {
        if (executorService instanceof r) {
            return (r) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new c((ScheduledExecutorService) executorService) : new b(executorService);
    }

    static Executor c(Executor executor, com.google.common.util.concurrent.a aVar) {
        X5.j.h(executor);
        X5.j.h(aVar);
        return executor == a() ? executor : new a(executor, aVar);
    }
}
