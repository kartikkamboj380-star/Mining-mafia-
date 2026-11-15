package H2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1153h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Class f1154i = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T1.k f1155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p013b2.i f1156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p013b2.l f1157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f1158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f1159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f1160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f1161g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(T1.k fileCache, p013b2.i pooledByteBufferFactory, p013b2.l pooledByteStreams, Executor readExecutor, Executor writeExecutor, t imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.f1155a = fileCache;
        this.f1156b = pooledByteBufferFactory;
        this.f1157c = pooledByteStreams;
        this.f1158d = readExecutor;
        this.f1159e = writeExecutor;
        this.f1160f = imageCacheStatsTracker;
        C cD = C.d();
        Intrinsics.checkNotNullExpressionValue(cD, "getInstance(...)");
        this.f1161g = cD;
    }

    private final boolean g(S1.d dVar) {
        O2.j jVarC = this.f1161g.c(dVar);
        if (jVarC != null) {
            jVarC.close();
            Z1.a.y(f1154i, "Found image for %s in staging area", dVar.a());
            this.f1160f.m(dVar);
            return true;
        }
        Z1.a.y(f1154i, "Did not find image for %s in staging area", dVar.a());
        this.f1160f.j(dVar);
        try {
            return this.f1155a.d(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object objE = P2.a.e(obj, null);
        try {
            this$0.f1161g.a();
            this$0.f1155a.a();
            P2.a.f(objE);
            return null;
        } catch (Throwable th) {
            try {
                P2.a.c(obj, th);
                throw th;
            } catch (Throwable th2) {
                P2.a.f(objE);
                throw th2;
            }
        }
    }

    private final Z0.f l(S1.d dVar, O2.j jVar) {
        Z1.a.y(f1154i, "Found image for %s in staging area", dVar.a());
        this.f1160f.m(dVar);
        Z0.f fVarH = Z0.f.h(jVar);
        Intrinsics.checkNotNullExpressionValue(fVarH, "forResult(...)");
        return fVarH;
    }

    private final Z0.f n(final S1.d dVar, final AtomicBoolean atomicBoolean) {
        try {
            final Object objD = P2.a.d("BufferedDiskCache_getAsync");
            return Z0.f.b(new Callable() { // from class: H2.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.o(objD, atomicBoolean, this, dVar);
                }
            }, this.f1158d);
        } catch (Exception e10) {
            Z1.a.H(f1154i, e10, "Failed to schedule disk-cache read for %s", dVar.a());
            return Z0.f.g(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O2.j o(Object obj, AtomicBoolean isCancelled, j this$0, S1.d key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objE = P2.a.e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            O2.j jVarC = this$0.f1161g.c(key);
            if (jVarC != null) {
                Z1.a.y(f1154i, "Found image for %s in staging area", key.a());
                this$0.f1160f.m(key);
            } else {
                Z1.a.y(f1154i, "Did not find image for %s in staging area", key.a());
                this$0.f1160f.j(key);
                try {
                    p013b2.h hVarR = this$0.r(key);
                    if (hVarR == null) {
                        P2.a.f(objE);
                        return null;
                    }
                    p023c2.a aVarW = p023c2.a.W(hVarR);
                    Intrinsics.checkNotNullExpressionValue(aVarW, "of(...)");
                    try {
                        O2.j jVar = new O2.j(aVarW);
                        p023c2.a.x(aVarW);
                        jVarC = jVar;
                    } catch (Throwable th) {
                        p023c2.a.x(aVarW);
                        throw th;
                    }
                } catch (Exception unused) {
                    P2.a.f(objE);
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                P2.a.f(objE);
                return jVarC;
            }
            Z1.a.x(f1154i, "Host thread was interrupted, decreasing reference count");
            jVarC.close();
            throw new InterruptedException();
        } catch (Throwable th2) {
            try {
                P2.a.c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                P2.a.f(objE);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j this$0, S1.d key, O2.j jVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objE = P2.a.e(obj, null);
        try {
            this$0.u(key, jVar);
            C c10 = this$0.f1161g;
            Intrinsics.c(jVar);
            c10.h(key, jVar);
            O2.j.h(jVar);
            P2.a.f(objE);
        } catch (Throwable th) {
            try {
                P2.a.c(obj, th);
                throw th;
            } catch (Throwable th2) {
                C c11 = this$0.f1161g;
                Intrinsics.c(jVar);
                c11.h(key, jVar);
                O2.j.h(jVar);
                P2.a.f(objE);
                throw th2;
            }
        }
    }

    private final p013b2.h r(S1.d dVar) throws IOException {
        try {
            Class cls = f1154i;
            Z1.a.y(cls, "Disk cache read for %s", dVar.a());
            R1.a aVarB = this.f1155a.b(dVar);
            if (aVarB == null) {
                Z1.a.y(cls, "Disk cache miss for %s", dVar.a());
                this.f1160f.i(dVar);
                return null;
            }
            Z1.a.y(cls, "Found entry in disk cache for %s", dVar.a());
            this.f1160f.f(dVar);
            InputStream inputStreamA = aVarB.a();
            try {
                p013b2.h hVarB = this.f1156b.b(inputStreamA, (int) aVarB.size());
                inputStreamA.close();
                Z1.a.y(cls, "Successful read from disk cache for %s", dVar.a());
                return hVarB;
            } catch (Throwable th) {
                inputStreamA.close();
                throw th;
            }
        } catch (IOException e10) {
            Z1.a.H(f1154i, e10, "Exception reading from cache for %s", dVar.a());
            this.f1160f.d(dVar);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j this$0, S1.d key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objE = P2.a.e(obj, null);
        try {
            this$0.f1161g.g(key);
            this$0.f1155a.e(key);
            P2.a.f(objE);
            return null;
        } catch (Throwable th) {
            try {
                P2.a.c(obj, th);
                throw th;
            } catch (Throwable th2) {
                P2.a.f(objE);
                throw th2;
            }
        }
    }

    private final void u(S1.d dVar, final O2.j jVar) {
        Class cls = f1154i;
        Z1.a.y(cls, "About to write to disk-cache for key %s", dVar.a());
        try {
            this.f1155a.g(dVar, new S1.j() { // from class: H2.i
                @Override // S1.j
                public final void a(OutputStream outputStream) {
                    j.v(jVar, this, outputStream);
                }
            });
            this.f1160f.k(dVar);
            Z1.a.y(cls, "Successful disk-cache write for key %s", dVar.a());
        } catch (IOException e10) {
            Z1.a.H(f1154i, e10, "Failed to write to disk-cache for key %s", dVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(O2.j jVar, j this$0, OutputStream os) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.c(jVar);
        InputStream inputStreamJ = jVar.J();
        if (inputStreamJ == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this$0.f1157c.a(inputStreamJ, os);
    }

    public final void f(S1.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f1155a.c(key);
    }

    public final Z0.f h() {
        this.f1161g.a();
        final Object objD = P2.a.d("BufferedDiskCache_clearAll");
        try {
            return Z0.f.b(new Callable() { // from class: H2.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.i(objD, this);
                }
            }, this.f1159e);
        } catch (Exception e10) {
            Z1.a.H(f1154i, e10, "Failed to schedule disk-cache clear", new Object[0]);
            return Z0.f.g(e10);
        }
    }

    public final boolean j(S1.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f1161g.b(key) || this.f1155a.f(key);
    }

    public final boolean k(S1.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (j(key)) {
            return true;
        }
        return g(key);
    }

    public final Z0.f m(S1.d key, AtomicBoolean isCancelled) {
        Z0.f fVarN;
        Z0.f fVarL;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        if (!V2.b.d()) {
            O2.j jVarC = this.f1161g.c(key);
            return (jVarC == null || (fVarL = l(key, jVarC)) == null) ? n(key, isCancelled) : fVarL;
        }
        V2.b.a("BufferedDiskCache#get");
        try {
            O2.j jVarC2 = this.f1161g.c(key);
            if (jVarC2 == null || (fVarN = l(key, jVarC2)) == null) {
                fVarN = n(key, isCancelled);
            }
            return fVarN;
        } finally {
            V2.b.b();
        }
    }

    public final void p(final S1.d key, O2.j encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!V2.b.d()) {
            if (!O2.j.a0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f1161g.f(key, encodedImage);
            final O2.j jVarC = O2.j.c(encodedImage);
            try {
                final Object objD = P2.a.d("BufferedDiskCache_putAsync");
                this.f1159e.execute(new Runnable() { // from class: H2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD, this, key, jVarC);
                    }
                });
                return;
            } catch (Exception e10) {
                Z1.a.H(f1154i, e10, "Failed to schedule disk-cache write for %s", key.a());
                this.f1161g.h(key, encodedImage);
                O2.j.h(jVarC);
                return;
            }
        }
        V2.b.a("BufferedDiskCache#put");
        try {
            if (!O2.j.a0(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.f1161g.f(key, encodedImage);
            final O2.j jVarC2 = O2.j.c(encodedImage);
            try {
                final Object objD2 = P2.a.d("BufferedDiskCache_putAsync");
                this.f1159e.execute(new Runnable() { // from class: H2.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD2, this, key, jVarC2);
                    }
                });
            } catch (Exception e11) {
                Z1.a.H(f1154i, e11, "Failed to schedule disk-cache write for %s", key.a());
                this.f1161g.h(key, encodedImage);
                O2.j.h(jVarC2);
            }
            Unit unit = Unit.f45918a;
            V2.b.b();
        } catch (Throwable th) {
            V2.b.b();
            throw th;
        }
    }

    public final Z0.f s(final S1.d key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f1161g.g(key);
        try {
            final Object objD = P2.a.d("BufferedDiskCache_remove");
            return Z0.f.b(new Callable() { // from class: H2.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.t(objD, this, key);
                }
            }, this.f1159e);
        } catch (Exception e10) {
            Z1.a.H(f1154i, e10, "Failed to schedule disk-cache remove for %s", key.a());
            return Z0.f.g(e10);
        }
    }
}
