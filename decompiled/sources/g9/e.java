package g9;

import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f44446h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f44447i = new e(new c(d9.e.N(d9.e.f43194i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f44448j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f44453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f44454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f44455g;

    public interface a {
        void a(e eVar, long j10);

        void b(e eVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return e.f44448j;
        }

        private b() {
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f44456a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f44456a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // g9.e.a
        public void a(e taskRunner, long j10) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // g9.e.a
        public void b(e taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // g9.e.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f44456a.execute(runnable);
        }

        @Override // g9.e.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g9.a aVarD;
            long jNanoTime;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    aVarD = eVar.d();
                }
                if (aVarD == null) {
                    return;
                }
                g9.d dVarD = aVarD.d();
                Intrinsics.c(dVarD);
                e eVar2 = e.this;
                boolean zIsLoggable = e.f44446h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = dVarD.h().g().nanoTime();
                    g9.b.c(aVarD, dVarD, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    eVar2.j(aVarD);
                    try {
                        Unit unit = Unit.f45918a;
                        if (zIsLoggable) {
                            g9.b.c(aVarD, dVarD, "finished run in " + g9.b.b(dVarD.h().g().nanoTime() - jNanoTime));
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            g9.b.c(aVarD, dVarD, "failed a run in " + g9.b.b(dVarD.h().g().nanoTime() - jNanoTime));
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar2.g().execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f44448j = logger;
    }

    public e(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f44449a = backend;
        this.f44450b = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        this.f44453e = new ArrayList();
        this.f44454f = new ArrayList();
        this.f44455g = new d();
    }

    private final void c(g9.a aVar, long j10) {
        if (d9.e.f43193h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        g9.d dVarD = aVar.d();
        Intrinsics.c(dVarD);
        if (dVarD.c() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zD = dVarD.d();
        dVarD.m(false);
        dVarD.l(null);
        this.f44453e.remove(dVarD);
        if (j10 != -1 && !zD && !dVarD.g()) {
            dVarD.k(aVar, j10, true);
        }
        if (dVarD.e().isEmpty()) {
            return;
        }
        this.f44454f.add(dVarD);
    }

    private final void e(g9.a aVar) {
        if (d9.e.f43193h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        g9.d dVarD = aVar.d();
        Intrinsics.c(dVarD);
        dVarD.e().remove(aVar);
        this.f44454f.remove(dVarD);
        dVarD.l(aVar);
        this.f44453e.add(dVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(g9.a aVar) {
        if (d9.e.f43193h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                c(aVar, jF);
                Unit unit = Unit.f45918a;
            }
        } finally {
            synchronized (this) {
                c(aVar, -1L);
                Unit unit2 = Unit.f45918a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final g9.a d() {
        boolean z9;
        if (d9.e.f43193h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f44454f.isEmpty()) {
            long jNanoTime = this.f44449a.nanoTime();
            Iterator it = this.f44454f.iterator();
            long jMin = Long.MAX_VALUE;
            g9.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z9 = false;
                    break;
                }
                g9.a aVar2 = (g9.a) ((g9.d) it.next()).e().get(0);
                long jMax = Math.max(0L, aVar2.c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z9 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z9 || (!this.f44451c && !this.f44454f.isEmpty())) {
                    this.f44449a.execute(this.f44455g);
                }
                return aVar;
            }
            if (this.f44451c) {
                if (jMin < this.f44452d - jNanoTime) {
                    this.f44449a.b(this);
                }
                return null;
            }
            this.f44451c = true;
            this.f44452d = jNanoTime + jMin;
            try {
                try {
                    this.f44449a.a(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
                this.f44451c = false;
            } catch (Throwable th) {
                this.f44451c = false;
                throw th;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f44453e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((g9.d) this.f44453e.get(size)).b();
            }
        }
        for (int size2 = this.f44454f.size() - 1; -1 < size2; size2--) {
            g9.d dVar = (g9.d) this.f44454f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f44454f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f44449a;
    }

    public final void h(g9.d taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (d9.e.f43193h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (taskQueue.e().isEmpty()) {
                this.f44454f.remove(taskQueue);
            } else {
                d9.e.c(this.f44454f, taskQueue);
            }
        }
        if (this.f44451c) {
            this.f44449a.b(this);
        } else {
            this.f44449a.execute(this.f44455g);
        }
    }

    public final g9.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f44450b;
            this.f44450b = i10 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i10);
        return new g9.d(this, sb.toString());
    }
}
