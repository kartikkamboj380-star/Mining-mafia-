package N8;

import I8.InterfaceC0670g0;
import I8.InterfaceC0683n;
import I8.V;
import I8.Y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: N8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0834k extends I8.K implements Y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3705h = AtomicIntegerFieldUpdater.newUpdater(C0834k.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Y f3706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final I8.K f3707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0839p f3710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f3711g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: N8.k$a */
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Runnable f3712a;

        public a(Runnable runnable) {
            this.f3712a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f3712a.run();
                } catch (Throwable th) {
                    I8.M.a(kotlin.coroutines.e.f45956a, th);
                }
                Runnable runnableT1 = C0834k.this.t1();
                if (runnableT1 == null) {
                    return;
                }
                this.f3712a = runnableT1;
                i10++;
                if (i10 >= 16 && C0834k.this.f3707c.n1(C0834k.this)) {
                    C0834k.this.f3707c.l1(C0834k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0834k(I8.K k10, int i10, String str) {
        Y y9 = k10 instanceof Y ? (Y) k10 : null;
        this.f3706b = y9 == null ? V.a() : y9;
        this.f3707c = k10;
        this.f3708d = i10;
        this.f3709e = str;
        this.f3710f = new C0839p(false);
        this.f3711g = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable t1() {
        while (true) {
            Runnable runnable = (Runnable) this.f3710f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3711g) {
                f3705h.decrementAndGet(this);
                if (this.f3710f.c() == 0) {
                    return null;
                }
                f3705h.incrementAndGet(this);
            }
        }
    }

    private final boolean u1() {
        synchronized (this.f3711g) {
            if (f3705h.get(this) >= this.f3708d) {
                return false;
            }
            f3705h.incrementAndGet(this);
            return true;
        }
    }

    @Override // I8.Y
    public void M(long j10, InterfaceC0683n interfaceC0683n) {
        this.f3706b.M(j10, interfaceC0683n);
    }

    @Override // I8.Y
    public InterfaceC0670g0 R(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f3706b.R(j10, runnable, coroutineContext);
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableT1;
        this.f3710f.a(runnable);
        if (f3705h.get(this) >= this.f3708d || !u1() || (runnableT1 = t1()) == null) {
            return;
        }
        this.f3707c.l1(this, new a(runnableT1));
    }

    @Override // I8.K
    public void m1(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableT1;
        this.f3710f.a(runnable);
        if (f3705h.get(this) >= this.f3708d || !u1() || (runnableT1 = t1()) == null) {
            return;
        }
        this.f3707c.m1(this, new a(runnableT1));
    }

    @Override // I8.K
    public I8.K o1(int i10, String str) {
        AbstractC0835l.a(i10);
        return i10 >= this.f3708d ? AbstractC0835l.b(this, str) : super.o1(i10, str);
    }

    @Override // I8.K
    public String toString() {
        String str = this.f3709e;
        if (str != null) {
            return str;
        }
        return this.f3707c + ".limitedParallelism(" + this.f3708d + ')';
    }
}
