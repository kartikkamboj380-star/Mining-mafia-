package N8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0825b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3693a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0825b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3694b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0825b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0825b(AbstractC0825b abstractC0825b) {
        this._prev$volatile = abstractC0825b;
    }

    private final AbstractC0825b d() {
        AbstractC0825b abstractC0825bH = h();
        while (abstractC0825bH != null && abstractC0825bH.k()) {
            abstractC0825bH = (AbstractC0825b) f3694b.get(abstractC0825bH);
        }
        return abstractC0825bH;
    }

    private final AbstractC0825b e() {
        AbstractC0825b abstractC0825bF;
        AbstractC0825b abstractC0825bF2 = f();
        Intrinsics.c(abstractC0825bF2);
        while (abstractC0825bF2.k() && (abstractC0825bF = abstractC0825bF2.f()) != null) {
            abstractC0825bF2 = abstractC0825bF;
        }
        return abstractC0825bF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f3693a.get(this);
    }

    public final void c() {
        f3694b.set(this, null);
    }

    public final AbstractC0825b f() {
        Object objG = g();
        if (objG == AbstractC0824a.f3692a) {
            return null;
        }
        return (AbstractC0825b) objG;
    }

    public final AbstractC0825b h() {
        return (AbstractC0825b) f3694b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f3693a, this, null, AbstractC0824a.f3692a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC0825b abstractC0825bD = d();
            AbstractC0825b abstractC0825bE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3694b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC0825bE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC0825bE, obj, ((AbstractC0825b) obj) == null ? null : abstractC0825bD));
            if (abstractC0825bD != null) {
                f3693a.set(abstractC0825bD, abstractC0825bE);
            }
            if (!abstractC0825bE.k() || abstractC0825bE.l()) {
                if (abstractC0825bD == null || !abstractC0825bD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC0825b abstractC0825b) {
        return androidx.concurrent.futures.b.a(f3693a, this, null, abstractC0825b);
    }
}
