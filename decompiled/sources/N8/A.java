package N8;

import I8.P0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A extends AbstractC0825b implements P0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3675d = AtomicIntegerFieldUpdater.newUpdater(A.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3676c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public A(long j10, A a10, int i10) {
        super(a10);
        this.f3676c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // N8.AbstractC0825b
    public boolean k() {
        return f3675d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f3675d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th, CoroutineContext coroutineContext);

    public final void t() {
        if (f3675d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3675d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
