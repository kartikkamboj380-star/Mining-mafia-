package r9;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7103f extends d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f48437i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f48438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f48439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f48440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f48441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C7103f f48442n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C7103f f48444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f48445h;

    /* JADX INFO: renamed from: r9.f$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C7103f c7103f, long j10, boolean z9) {
            if (C7103f.f48442n == null) {
                C7103f.f48442n = new C7103f();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z9) {
                c7103f.f48445h = Math.min(j10, c7103f.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                c7103f.f48445h = j10 + jNanoTime;
            } else {
                if (!z9) {
                    throw new AssertionError();
                }
                c7103f.f48445h = c7103f.c();
            }
            long jY = c7103f.y(jNanoTime);
            C7103f c7103f2 = C7103f.f48442n;
            Intrinsics.c(c7103f2);
            while (c7103f2.f48444g != null) {
                C7103f c7103f3 = c7103f2.f48444g;
                Intrinsics.c(c7103f3);
                if (jY < c7103f3.y(jNanoTime)) {
                    break;
                }
                c7103f2 = c7103f2.f48444g;
                Intrinsics.c(c7103f2);
            }
            c7103f.f48444g = c7103f2.f48444g;
            c7103f2.f48444g = c7103f;
            if (c7103f2 == C7103f.f48442n) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C7103f c7103f) {
            for (C7103f c7103f2 = C7103f.f48442n; c7103f2 != null; c7103f2 = c7103f2.f48444g) {
                if (c7103f2.f48444g == c7103f) {
                    c7103f2.f48444g = c7103f.f48444g;
                    c7103f.f48444g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C7103f c() throws InterruptedException {
            C7103f c7103f = C7103f.f48442n;
            Intrinsics.c(c7103f);
            C7103f c7103f2 = c7103f.f48444g;
            if (c7103f2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C7103f.f48440l, TimeUnit.MILLISECONDS);
                C7103f c7103f3 = C7103f.f48442n;
                Intrinsics.c(c7103f3);
                if (c7103f3.f48444g != null || System.nanoTime() - jNanoTime < C7103f.f48441m) {
                    return null;
                }
                return C7103f.f48442n;
            }
            long jY = c7103f2.y(System.nanoTime());
            if (jY > 0) {
                d().await(jY, TimeUnit.NANOSECONDS);
                return null;
            }
            C7103f c7103f4 = C7103f.f48442n;
            Intrinsics.c(c7103f4);
            c7103f4.f48444g = c7103f2.f48444g;
            c7103f2.f48444g = null;
            c7103f2.f48443f = 2;
            return c7103f2;
        }

        public final Condition d() {
            return C7103f.f48439k;
        }

        public final ReentrantLock e() {
            return C7103f.f48438j;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: r9.f$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockE = C7103f.f48437i.e();
                    reentrantLockE.lock();
                    try {
                        C7103f c7103fC = C7103f.f48437i.c();
                        if (c7103fC == C7103f.f48442n) {
                            a unused = C7103f.f48437i;
                            C7103f.f48442n = null;
                            reentrantLockE.unlock();
                            return;
                        } else {
                            Unit unit = Unit.f45918a;
                            reentrantLockE.unlock();
                            if (c7103fC != null) {
                                c7103fC.B();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockE.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r9.f$c */
    public static final class c implements a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f48447b;

        c(a0 a0Var) {
            this.f48447b = a0Var;
        }

        @Override // r9.a0
        public void W0(C7105h source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            AbstractC7102e.b(source.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                X x10 = source.f48456a;
                Intrinsics.c(x10);
                while (j11 < 65536) {
                    j11 += (long) (x10.f48411c - x10.f48410b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        x10 = x10.f48414f;
                        Intrinsics.c(x10);
                    }
                }
                C7103f c7103f = C7103f.this;
                a0 a0Var = this.f48447b;
                c7103f.v();
                try {
                    try {
                        a0Var.W0(source, j11);
                        Unit unit = Unit.f45918a;
                        if (c7103f.w()) {
                            throw c7103f.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!c7103f.w()) {
                            throw e10;
                        }
                        throw c7103f.p(e10);
                    }
                } catch (Throwable th) {
                    c7103f.w();
                    throw th;
                }
            }
        }

        @Override // r9.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7103f i() {
            return C7103f.this;
        }

        @Override // r9.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7103f c7103f = C7103f.this;
            a0 a0Var = this.f48447b;
            c7103f.v();
            try {
                try {
                    a0Var.close();
                    Unit unit = Unit.f45918a;
                    if (c7103f.w()) {
                        throw c7103f.p(null);
                    }
                } catch (IOException e10) {
                    if (!c7103f.w()) {
                        throw e10;
                    }
                    throw c7103f.p(e10);
                }
            } catch (Throwable th) {
                c7103f.w();
                throw th;
            }
        }

        @Override // r9.a0, java.io.Flushable
        public void flush() throws IOException {
            C7103f c7103f = C7103f.this;
            a0 a0Var = this.f48447b;
            c7103f.v();
            try {
                try {
                    a0Var.flush();
                    Unit unit = Unit.f45918a;
                    if (c7103f.w()) {
                        throw c7103f.p(null);
                    }
                } catch (IOException e10) {
                    if (!c7103f.w()) {
                        throw e10;
                    }
                    throw c7103f.p(e10);
                }
            } catch (Throwable th) {
                c7103f.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f48447b + ')';
        }
    }

    /* JADX INFO: renamed from: r9.f$d */
    public static final class d implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f48449b;

        d(c0 c0Var) {
            this.f48449b = c0Var;
        }

        @Override // r9.c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C7103f i() {
            return C7103f.this;
        }

        @Override // r9.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C7103f c7103f = C7103f.this;
            c0 c0Var = this.f48449b;
            c7103f.v();
            try {
                try {
                    c0Var.close();
                    Unit unit = Unit.f45918a;
                    if (c7103f.w()) {
                        throw c7103f.p(null);
                    }
                } catch (IOException e10) {
                    if (!c7103f.w()) {
                        throw e10;
                    }
                    throw c7103f.p(e10);
                }
            } catch (Throwable th) {
                c7103f.w();
                throw th;
            }
        }

        @Override // r9.c0
        public long s(C7105h sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C7103f c7103f = C7103f.this;
            c0 c0Var = this.f48449b;
            c7103f.v();
            try {
                try {
                    long jS = c0Var.s(sink, j10);
                    if (c7103f.w()) {
                        throw c7103f.p(null);
                    }
                    return jS;
                } catch (IOException e10) {
                    if (c7103f.w()) {
                        throw c7103f.p(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th) {
                c7103f.w();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f48449b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f48438j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f48439k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f48440l = millis;
        f48441m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(long j10) {
        return this.f48445h - j10;
    }

    public final c0 A(c0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f48438j;
            reentrantLock.lock();
            try {
                if (this.f48443f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f48443f = 1;
                f48437i.f(this, jH, zE);
                Unit unit = Unit.f45918a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f48438j;
        reentrantLock.lock();
        try {
            int i10 = this.f48443f;
            this.f48443f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f48437i.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final a0 z(a0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }

    protected void B() {
    }
}
