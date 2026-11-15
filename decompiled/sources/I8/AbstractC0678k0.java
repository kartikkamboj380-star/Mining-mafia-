package I8;

import N8.AbstractC0835l;
import kotlin.collections.C7023i;

/* JADX INFO: renamed from: I8.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0678k0 extends K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C7023i f1792d;

    public static /* synthetic */ void r1(AbstractC0678k0 abstractC0678k0, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        abstractC0678k0.q1(z9);
    }

    private final long s1(boolean z9) {
        return z9 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void w1(AbstractC0678k0 abstractC0678k0, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        abstractC0678k0.v1(z9);
    }

    public final boolean A1() {
        AbstractC0660b0 abstractC0660b0;
        C7023i c7023i = this.f1792d;
        if (c7023i == null || (abstractC0660b0 = (AbstractC0660b0) c7023i.q()) == null) {
            return false;
        }
        abstractC0660b0.run();
        return true;
    }

    public boolean B1() {
        return false;
    }

    @Override // I8.K
    public final K o1(int i10, String str) {
        AbstractC0835l.a(i10);
        return AbstractC0835l.b(this, str);
    }

    public final void q1(boolean z9) {
        long jS1 = this.f1790b - s1(z9);
        this.f1790b = jS1;
        if (jS1 <= 0 && this.f1791c) {
            shutdown();
        }
    }

    public abstract void shutdown();

    public final void t1(AbstractC0660b0 abstractC0660b0) {
        C7023i c7023i = this.f1792d;
        if (c7023i == null) {
            c7023i = new C7023i();
            this.f1792d = c7023i;
        }
        c7023i.addLast(abstractC0660b0);
    }

    protected long u1() {
        C7023i c7023i = this.f1792d;
        return (c7023i == null || c7023i.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void v1(boolean z9) {
        this.f1790b += s1(z9);
        if (z9) {
            return;
        }
        this.f1791c = true;
    }

    public final boolean x1() {
        return this.f1790b >= s1(true);
    }

    public final boolean y1() {
        C7023i c7023i = this.f1792d;
        if (c7023i != null) {
            return c7023i.isEmpty();
        }
        return true;
    }

    public abstract long z1();
}
