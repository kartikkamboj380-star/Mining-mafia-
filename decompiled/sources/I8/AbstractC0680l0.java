package I8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: I8.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0680l0 extends AbstractC0682m0 implements Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1794e = AtomicReferenceFieldUpdater.newUpdater(AbstractC0680l0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1795f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0680l0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1796g = AtomicIntegerFieldUpdater.newUpdater(AbstractC0680l0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: I8.l0$a */
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0683n f1797c;

        public a(long j10, InterfaceC0683n interfaceC0683n) {
            super(j10);
            this.f1797c = interfaceC0683n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1797c.e(AbstractC0680l0.this, Unit.f45918a);
        }

        @Override // I8.AbstractC0680l0.c
        public String toString() {
            return super.toString() + this.f1797c;
        }
    }

    /* JADX INFO: renamed from: I8.l0$b */
    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f1799c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f1799c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1799c.run();
        }

        @Override // I8.AbstractC0680l0.c
        public String toString() {
            return super.toString() + this.f1799c;
        }
    }

    /* JADX INFO: renamed from: I8.l0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC0670g0, N8.N {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1801b = -1;

        public c(long j10) {
            this.f1800a = j10;
        }

        @Override // I8.InterfaceC0670g0
        public final void c() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC0686o0.f1805a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC0686o0.f1805a;
                    Unit unit = Unit.f45918a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // N8.N
        public N8.M e() {
            Object obj = this._heap;
            if (obj instanceof N8.M) {
                return (N8.M) obj;
            }
            return null;
        }

        @Override // N8.N
        public void f(N8.M m10) {
            if (this._heap == AbstractC0686o0.f1805a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f1800a - cVar.f1800a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // N8.N
        public int getIndex() {
            return this.f1801b;
        }

        public final int h(long j10, d dVar, AbstractC0680l0 abstractC0680l0) {
            synchronized (this) {
                if (this._heap == AbstractC0686o0.f1805a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC0680l0.a()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f1802c = j10;
                        } else {
                            long j11 = cVar.f1800a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f1802c > 0) {
                                dVar.f1802c = j10;
                            }
                        }
                        long j12 = this.f1800a;
                        long j13 = dVar.f1802c;
                        if (j12 - j13 < 0) {
                            this.f1800a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean i(long j10) {
            return j10 - this.f1800a >= 0;
        }

        @Override // N8.N
        public void setIndex(int i10) {
            this.f1801b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f1800a + ']';
        }
    }

    /* JADX INFO: renamed from: I8.l0$d */
    public static final class d extends N8.M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f1802c;

        public d(long j10) {
            this.f1802c = j10;
        }
    }

    private final void G1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1794e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f1794e, this, null, AbstractC0686o0.f1806b)) {
                    return;
                }
            } else if (obj instanceof N8.q) {
                ((N8.q) obj).d();
                return;
            } else {
                if (obj == AbstractC0686o0.f1806b) {
                    return;
                }
                N8.q qVar = new N8.q(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f1794e, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable H1() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1794e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof N8.q) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                N8.q qVar = (N8.q) obj;
                Object objM = qVar.m();
                if (objM != N8.q.f3722h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f1794e, this, obj, qVar.l());
            } else {
                if (obj == AbstractC0686o0.f1806b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f1794e, this, obj, null)) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void J1() {
        N8.N nI;
        d dVar = (d) f1795f.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC0661c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    N8.N nB = dVar.b();
                    nI = null;
                    if (nB != null) {
                        c cVar = (c) nB;
                        nI = cVar.i(jNanoTime) ? K1(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((c) nI) != null);
    }

    private final boolean K1(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1794e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (a()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f1794e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof N8.q) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                N8.q qVar = (N8.q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f1794e, this, obj, qVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC0686o0.f1806b) {
                    return false;
                }
                N8.q qVar2 = new N8.q(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f1794e, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    private final void P1() {
        c cVar;
        AbstractC0661c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f1795f.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                D1(jNanoTime, cVar);
            }
        }
    }

    private final int S1(long j10, c cVar) {
        if (a()) {
            return 1;
        }
        d dVar = (d) f1795f.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f1795f, this, null, new d(j10));
            Object obj = f1795f.get(this);
            Intrinsics.c(obj);
            dVar = (d) obj;
        }
        return cVar.h(j10, dVar, this);
    }

    private final void U1(boolean z9) {
        f1796g.set(this, z9 ? 1 : 0);
    }

    private final boolean V1(c cVar) {
        d dVar = (d) f1795f.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        return f1796g.get(this) != 0;
    }

    public void I1(Runnable runnable) {
        J1();
        if (K1(runnable)) {
            E1();
        } else {
            U.f1746h.I1(runnable);
        }
    }

    @Override // I8.Y
    public void M(long j10, InterfaceC0683n interfaceC0683n) {
        long jC = AbstractC0686o0.c(j10);
        if (jC < 4611686018427387903L) {
            AbstractC0661c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC0683n);
            R1(jNanoTime, aVar);
            r.a(interfaceC0683n, aVar);
        }
    }

    protected boolean O1() {
        if (!y1()) {
            return false;
        }
        d dVar = (d) f1795f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f1794e.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof N8.q) {
            return ((N8.q) obj).j();
        }
        return obj == AbstractC0686o0.f1806b;
    }

    protected final void Q1() {
        f1794e.set(this, null);
        f1795f.set(this, null);
    }

    public InterfaceC0670g0 R(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return Y.a.a(this, j10, runnable, coroutineContext);
    }

    public final void R1(long j10, c cVar) {
        int iS1 = S1(j10, cVar);
        if (iS1 == 0) {
            if (V1(cVar)) {
                E1();
            }
        } else if (iS1 == 1) {
            D1(j10, cVar);
        } else if (iS1 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final InterfaceC0670g0 T1(long j10, Runnable runnable) {
        long jC = AbstractC0686o0.c(j10);
        if (jC >= 4611686018427387903L) {
            return O0.f1734a;
        }
        AbstractC0661c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        R1(jNanoTime, bVar);
        return bVar;
    }

    @Override // I8.K
    public final void l1(CoroutineContext coroutineContext, Runnable runnable) {
        I1(runnable);
    }

    @Override // I8.AbstractC0678k0
    public void shutdown() {
        Y0.f1750a.c();
        U1(true);
        G1();
        while (z1() <= 0) {
        }
        P1();
    }

    @Override // I8.AbstractC0678k0
    protected long u1() {
        c cVar;
        if (super.u1() == 0) {
            return 0L;
        }
        Object obj = f1794e.get(this);
        if (obj != null) {
            if (!(obj instanceof N8.q)) {
                return obj == AbstractC0686o0.f1806b ? Long.MAX_VALUE : 0L;
            }
            if (!((N8.q) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f1795f.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f1800a;
        AbstractC0661c.a();
        return kotlin.ranges.b.d(j10 - System.nanoTime(), 0L);
    }

    @Override // I8.AbstractC0678k0
    public long z1() {
        if (A1()) {
            return 0L;
        }
        J1();
        Runnable runnableH1 = H1();
        if (runnableH1 == null) {
            return u1();
        }
        runnableH1.run();
        return 0L;
    }
}
