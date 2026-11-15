package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f14005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f14006b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14009e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f14007c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f14008d = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    O2.j f14010f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f14011g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    f f14012h = f.IDLE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f14013i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f14014j = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.d();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.j();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14017a;

        static {
            int[] iArr = new int[f.values().length];
            f14017a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14017a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14017a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14017a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(O2.j jVar, int i10);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static ScheduledExecutorService f14018a;

        static ScheduledExecutorService a() {
            if (f14018a == null) {
                f14018a = Executors.newSingleThreadScheduledExecutor();
            }
            return f14018a;
        }
    }

    enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public G(Executor executor, d dVar, int i10) {
        this.f14005a = executor;
        this.f14006b = dVar;
        this.f14009e = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        O2.j jVar;
        int i10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            jVar = this.f14010f;
            i10 = this.f14011g;
            this.f14010f = null;
            this.f14011g = 0;
            this.f14012h = f.RUNNING;
            this.f14014j = jUptimeMillis;
        }
        try {
            if (i(jVar, i10)) {
                this.f14006b.a(jVar, i10);
            }
        } finally {
            O2.j.h(jVar);
            g();
        }
    }

    private void e(long j10) {
        Runnable runnableA = P2.a.a(this.f14008d, "JobScheduler_enqueueJob");
        if (j10 > 0) {
            e.a().schedule(runnableA, j10, TimeUnit.MILLISECONDS);
        } else {
            runnableA.run();
        }
    }

    private void g() {
        long jMax;
        boolean z9;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f14012h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f14014j + ((long) this.f14009e), jUptimeMillis);
                    this.f14013i = jUptimeMillis;
                    this.f14012h = f.QUEUED;
                    z9 = true;
                } else {
                    this.f14012h = f.IDLE;
                    jMax = 0;
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            e(jMax - jUptimeMillis);
        }
    }

    private static boolean i(O2.j jVar, int i10) {
        return AbstractC1249c.d(i10) || AbstractC1249c.m(i10, 4) || O2.j.a0(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f14005a.execute(P2.a.a(this.f14007c, "JobScheduler_submitJob"));
    }

    public void c() {
        O2.j jVar;
        synchronized (this) {
            jVar = this.f14010f;
            this.f14010f = null;
            this.f14011g = 0;
        }
        O2.j.h(jVar);
    }

    public synchronized long f() {
        return this.f14014j - this.f14013i;
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z9 = false;
                if (!i(this.f14010f, this.f14011g)) {
                    return false;
                }
                int i10 = c.f14017a[this.f14012h.ordinal()];
                if (i10 != 1) {
                    if (i10 == 3) {
                        this.f14012h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f14014j + ((long) this.f14009e), jUptimeMillis);
                    this.f14013i = jUptimeMillis;
                    this.f14012h = f.QUEUED;
                    z9 = true;
                }
                if (z9) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k(O2.j jVar, int i10) {
        O2.j jVar2;
        if (!i(jVar, i10)) {
            return false;
        }
        synchronized (this) {
            jVar2 = this.f14010f;
            this.f14010f = O2.j.c(jVar);
            this.f14011g = i10;
        }
        O2.j.h(jVar2);
        return true;
    }
}
