package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final R6.a f40475g = R6.a.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f40476h = TimeUnit.SECONDS.toMicros(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledFuture f40481e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f40482f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f40477a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f40478b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f40479c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f40480d = e();

    c() {
    }

    public static /* synthetic */ void a(c cVar, X6.l lVar) {
        Y6.e eVarK = cVar.k(lVar);
        if (eVarK != null) {
            cVar.f40477a.add(eVarK);
        }
    }

    public static /* synthetic */ void b(c cVar, X6.l lVar) {
        Y6.e eVarK = cVar.k(lVar);
        if (eVarK != null) {
            cVar.f40477a.add(eVarK);
        }
    }

    private long d(long j10) {
        return Math.round((j10 / this.f40480d) * f40476h);
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long j10) {
        return j10 <= 0;
    }

    private synchronized void g(final X6.l lVar) {
        try {
            this.f40478b.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.b(this.f40473a, lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f40475g.j("Unable to collect Cpu Metric: " + e10.getMessage());
        }
    }

    private synchronized void h(long j10, final X6.l lVar) {
        this.f40482f = j10;
        try {
            this.f40481e = this.f40478b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.a
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(this.f40471a, lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f40475g.j("Unable to start collecting Cpu Metrics: " + e10.getMessage());
        }
    }

    private Y6.e k(X6.l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f40479c));
            try {
                long jB = lVar.b();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                Y6.e eVar = (Y6.e) Y6.e.k().h(jB).i(d(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).k(d(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return eVar;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            f40475g.j("Unable to read 'proc/[pid]/stat' file: " + e10.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e11) {
            e = e11;
            f40475g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            f40475g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e13) {
            e = e13;
            f40475g.j("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    public void c(X6.l lVar) {
        g(lVar);
    }

    public void i(long j10, X6.l lVar) {
        long j11 = this.f40480d;
        if (j11 == -1 || j11 == 0 || f(j10)) {
            return;
        }
        if (this.f40481e == null) {
            h(j10, lVar);
        } else if (this.f40482f != j10) {
            j();
            h(j10, lVar);
        }
    }

    public void j() {
        ScheduledFuture scheduledFuture = this.f40481e;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f40481e = null;
        this.f40482f = -1L;
    }
}
