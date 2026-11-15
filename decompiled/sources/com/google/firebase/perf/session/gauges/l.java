package com.google.firebase.perf.session.gauges;

import X6.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final R6.a f40498f = R6.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f40499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f40500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runtime f40501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture f40502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f40503e;

    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static /* synthetic */ void a(l lVar, X6.l lVar2) {
        Y6.b bVarJ = lVar.j(lVar2);
        if (bVarJ != null) {
            lVar.f40500b.add(bVarJ);
        }
    }

    public static /* synthetic */ void b(l lVar, X6.l lVar2) {
        Y6.b bVarJ = lVar.j(lVar2);
        if (bVarJ != null) {
            lVar.f40500b.add(bVarJ);
        }
    }

    private int d() {
        return o.c(X6.k.f6766f.d(this.f40501c.totalMemory() - this.f40501c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    private synchronized void f(final X6.l lVar) {
        try {
            this.f40499a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.b(this.f40496a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f40498f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void g(long j10, final X6.l lVar) {
        this.f40503e = j10;
        try {
            this.f40502d = this.f40499a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.a(this.f40494a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f40498f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private Y6.b j(X6.l lVar) {
        if (lVar == null) {
            return null;
        }
        return (Y6.b) Y6.b.j().h(lVar.b()).i(d()).build();
    }

    public void c(X6.l lVar) {
        f(lVar);
    }

    public void h(long j10, X6.l lVar) {
        if (e(j10)) {
            return;
        }
        if (this.f40502d == null) {
            g(j10, lVar);
        } else if (this.f40503e != j10) {
            i();
            g(j10, lVar);
        }
    }

    public void i() {
        ScheduledFuture scheduledFuture = this.f40502d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f40502d = null;
        this.f40503e = -1L;
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f40502d = null;
        this.f40503e = -1L;
        this.f40499a = scheduledExecutorService;
        this.f40500b = new ConcurrentLinkedQueue();
        this.f40501c = runtime;
    }
}
