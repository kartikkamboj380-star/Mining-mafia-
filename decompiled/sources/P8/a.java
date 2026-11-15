package P8;

import I8.AbstractC0661c;
import I8.T;
import N8.D;
import N8.y;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0075a f4728h = new C0075a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4729i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f4730j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f4731k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final D f4732l = new D("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4735c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P8.d f4737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P8.d f4738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f4739g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: P8.a$a, reason: collision with other inner class name */
    public static final class C0075a {
        public /* synthetic */ C0075a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0075a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4740a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f4740a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f4756g = p189s8.a.a(c());
    }

    public a(int i10, int i11, long j10, String str) {
        this.f4733a = i10;
        this.f4734b = i11;
        this.f4735c = j10;
        this.f4736d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f4737e = new P8.d();
        this.f4738f = new P8.d();
        this.f4739g = new y((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater G() {
        return f4730j;
    }

    private final int Q(c cVar) {
        Object objG = cVar.g();
        while (objG != f4732l) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    private final c R() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4729i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f4739g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iQ = Q(cVar);
            if (iQ >= 0 && f4729i.compareAndSet(this, j10, ((long) iQ) | j11)) {
                cVar.o(f4732l);
                return cVar;
            }
        }
    }

    private final h V0(c cVar, h hVar, boolean z9) {
        d dVar;
        if (cVar == null || (dVar = cVar.f4744c) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.f4767b && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.f4748g = true;
        return cVar.f4742a.a(hVar, z9);
    }

    private final void a0(long j10, boolean z9) {
        if (z9 || m1() || g1(j10)) {
            return;
        }
        m1();
    }

    private final boolean c(h hVar) {
        return hVar.f4767b ? this.f4738f.a(hVar) : this.f4737e.a(hVar);
    }

    private final boolean g1(long j10) {
        if (kotlin.ranges.b.c(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f4733a) {
            int iH = h();
            if (iH == 1 && this.f4733a > 1) {
                h();
            }
            if (iH > 0) {
                return true;
            }
        }
        return false;
    }

    private final int h() {
        synchronized (this.f4739g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f4730j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iC = kotlin.ranges.b.c(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iC >= this.f4733a) {
                    return 0;
                }
                if (i10 >= this.f4734b) {
                    return 0;
                }
                int i11 = ((int) (G().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f4739g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f4739g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f4730j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iC + 1;
                cVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ boolean l1(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f4730j.get(aVar);
        }
        return aVar.g1(j10);
    }

    private final boolean m1() {
        c cVarR;
        do {
            cVarR = R();
            if (cVarR == null) {
                return false;
            }
        } while (!c.f4741i.compareAndSet(cVarR, -1, 0));
        LockSupport.unpark(cVarR);
        return true;
    }

    private final c v() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.b(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void x(a aVar, Runnable runnable, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.w(runnable, z9, z10);
    }

    public final void R0() {
        if (m1() || l1(this, 0L, 1, null)) {
            return;
        }
        m1();
    }

    public final boolean S(c cVar) {
        long j10;
        int iF;
        if (cVar.g() != f4732l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4729i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f4739g.b((int) (2097151 & j10)));
        } while (!f4729i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iF)));
        return true;
    }

    public final void V(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4729i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iQ = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iQ == i10) {
                iQ = i11 == 0 ? Q(cVar) : i11;
            }
            if (iQ >= 0) {
                if (f4729i.compareAndSet(this, j10, j11 | ((long) iQ))) {
                    return;
                }
            }
        }
    }

    public final void W(h hVar) {
        try {
            hVar.run();
            AbstractC0661c.a();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC0661c.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void X(long j10) throws InterruptedException {
        int i10;
        h hVarE;
        if (f4731k.compareAndSet(this, 0, 1)) {
            c cVarV = v();
            synchronized (this.f4739g) {
                i10 = (int) (G().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.f4739g.b(i11);
                    Intrinsics.c(objB);
                    c cVar = (c) objB;
                    if (cVar != cVarV) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f4742a.j(this.f4738f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f4738f.b();
            this.f4737e.b();
            while (true) {
                if (cVarV == null) {
                    hVarE = (h) this.f4737e.e();
                    if (hVarE == null && (hVarE = (h) this.f4738f.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarV.e(true);
                    if (hVarE == null) {
                        hVarE = (h) this.f4737e.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                W(hVarE);
            }
            if (cVarV != null) {
                cVarV.r(d.TERMINATED);
            }
            f4729i.set(this, 0L);
            f4730j.set(this, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        X(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f4731k.get(this) != 0;
    }

    public final h n(Runnable runnable, boolean z9) {
        long jA = j.f4774f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z9);
        }
        h hVar = (h) runnable;
        hVar.f4766a = jA;
        hVar.f4767b = z9;
        return hVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f4739g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f4739g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f4742a.i();
                int i17 = b.f4740a[cVar.f4744c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new p129m8.k();
                    }
                    i14++;
                }
            }
        }
        long j10 = f4730j.get(this);
        return this.f4736d + '@' + T.b(this) + "[Pool Size {core = " + this.f4733a + ", max = " + this.f4734b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4737e.c() + ", global blocking queue size = " + this.f4738f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f4733a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void w(Runnable runnable, boolean z9, boolean z10) {
        AbstractC0661c.a();
        h hVarN = n(runnable, z9);
        boolean z11 = hVarN.f4767b;
        long jAddAndGet = z11 ? f4730j.addAndGet(this, 2097152L) : 0L;
        c cVarV = v();
        h hVarV0 = V0(cVarV, hVarN, z10);
        if (hVarV0 != null && !c(hVarV0)) {
            throw new RejectedExecutionException(this.f4736d + " was terminated");
        }
        boolean z12 = z10 && cVarV != null;
        if (z11) {
            a0(jAddAndGet, z12);
        } else {
            if (z12) {
                return;
            }
            R0();
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f4741i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f4742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final E f4743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f4744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f4747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4748g;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f4742a = new l();
            this.f4743b = new E();
            this.f4744c = d.DORMANT;
            this.nextParkedWorker = a.f4732l;
            int iNanoTime = (int) System.nanoTime();
            this.f4747f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f4745d = 0L;
            if (this.f4744c == d.PARKING) {
                this.f4744c = d.BLOCKING;
            }
            if (!hVar.f4767b) {
                a.this.W(hVar);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.R0();
            }
            a.this.W(hVar);
            a.G().addAndGet(a.this, -2097152L);
            if (this.f4744c != d.TERMINATED) {
                this.f4744c = d.DORMANT;
            }
        }

        private final h c(boolean z9) {
            h hVarL;
            h hVarL2;
            if (z9) {
                boolean z10 = j(a.this.f4733a * 2) == 0;
                if (z10 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f4742a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z10 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f4742a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f4738f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f4732l;
        }

        private final void k() {
            if (this.f4745d == 0) {
                this.f4745d = System.nanoTime() + a.this.f4735c;
            }
            LockSupport.parkNanos(a.this.f4735c);
            if (System.nanoTime() - this.f4745d >= 0) {
                this.f4745d = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f4737e.e();
                return hVar != null ? hVar : (h) a.this.f4738f.e();
            }
            h hVar2 = (h) a.this.f4738f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f4737e.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z9 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f4744c == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarE = e(this.f4748g);
                    if (hVarE != null) {
                        this.f4746e = 0L;
                        b(hVarE);
                        break;
                    }
                    this.f4748g = false;
                    if (this.f4746e == 0) {
                        q();
                    } else {
                        if (z9) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4746e);
                            this.f4746e = 0L;
                            break;
                        }
                        z9 = true;
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            long j10;
            if (this.f4744c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterG = a.G();
            do {
                j10 = atomicLongFieldUpdaterG.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.G().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f4744c = d.CPU_ACQUIRED;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.S(this);
                return;
            }
            f4741i.set(this, -1);
            while (i() && f4741i.get(this) == -1 && !a.this.isTerminated() && this.f4744c != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.G().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f4739g.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f4742a.r(i10, this.f4743b);
                    if (jR == -1) {
                        E e10 = this.f4743b;
                        h hVar = (h) e10.f45973a;
                        e10.f45973a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f4746e = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f4739g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.G().get(aVar) & 2097151)) <= aVar.f4733a) {
                        return;
                    }
                    if (f4741i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.V(this, i10, 0);
                        int andDecrement = (int) (a.G().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object objB = aVar.f4739g.b(andDecrement);
                            Intrinsics.c(objB);
                            c cVar = (c) objB;
                            aVar.f4739g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.V(cVar, andDecrement, i10);
                        }
                        aVar.f4739g.c(andDecrement, null);
                        Unit unit = Unit.f45918a;
                        this.f4744c = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h e(boolean z9) {
            return p() ? c(z9) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f4747f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f4747f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f4736d);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f4744c;
            boolean z9 = dVar2 == d.CPU_ACQUIRED;
            if (z9) {
                a.G().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f4744c = dVar;
            }
            return z9;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
