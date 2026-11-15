package N8;

import I8.T;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: N8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0838o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3715a = AtomicReferenceFieldUpdater.newUpdater(C0838o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3716b = AtomicReferenceFieldUpdater.newUpdater(C0838o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3717c = AtomicReferenceFieldUpdater.newUpdater(C0838o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final C0838o h() {
        C0838o c0838o;
        Object obj;
        while (true) {
            C0838o c0838o2 = (C0838o) f3716b.get(this);
            c0838o = c0838o2;
            while (true) {
                C0838o c0838o3 = null;
                while (true) {
                    obj = f3715a.get(c0838o);
                    if (obj == this) {
                        if (c0838o2 != c0838o && !androidx.concurrent.futures.b.a(f3716b, this, c0838o2, c0838o)) {
                            break;
                        }
                        break;
                    }
                    if (q()) {
                        return null;
                    }
                    if (!(obj instanceof x)) {
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c0838o3 = c0838o;
                        c0838o = (C0838o) obj;
                    } else {
                        if (c0838o3 != null) {
                            break;
                        }
                        c0838o = (C0838o) f3716b.get(c0838o);
                    }
                }
                if (!androidx.concurrent.futures.b.a(f3715a, c0838o3, c0838o, ((x) obj).f3733a)) {
                    break;
                }
                c0838o = c0838o3;
            }
        }
        return c0838o;
    }

    private final C0838o i(C0838o c0838o) {
        while (c0838o.q()) {
            c0838o = (C0838o) f3716b.get(c0838o);
        }
        return c0838o;
    }

    private final void j(C0838o c0838o) {
        C0838o c0838o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3716b;
        do {
            c0838o2 = (C0838o) atomicReferenceFieldUpdater.get(c0838o);
            if (k() != c0838o) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f3716b, c0838o, c0838o2, this));
        if (q()) {
            c0838o.h();
        }
    }

    private final x t() {
        x xVar = (x) f3717c.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f3717c.set(this, xVar2);
        return xVar2;
    }

    public final boolean b(C0838o c0838o, int i10) {
        C0838o c0838oM;
        do {
            c0838oM = m();
            if (c0838oM instanceof C0836m) {
                return (((C0836m) c0838oM).f3714d & i10) == 0 && c0838oM.b(c0838o, i10);
            }
        } while (!c0838oM.e(c0838o, this));
        return true;
    }

    public final boolean e(C0838o c0838o, C0838o c0838o2) {
        f3716b.set(c0838o, this);
        f3715a.set(c0838o, c0838o2);
        if (!androidx.concurrent.futures.b.a(f3715a, this, c0838o2, c0838o)) {
            return false;
        }
        c0838o.j(c0838o2);
        return true;
    }

    public final boolean f(C0838o c0838o) {
        f3716b.set(c0838o, this);
        f3715a.set(c0838o, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f3715a, this, this, c0838o)) {
                c0838o.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        b(new C0836m(i10), i10);
    }

    public final Object k() {
        return f3715a.get(this);
    }

    public final C0838o l() {
        C0838o c0838o;
        Object objK = k();
        x xVar = objK instanceof x ? (x) objK : null;
        if (xVar != null && (c0838o = xVar.f3733a) != null) {
            return c0838o;
        }
        Intrinsics.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C0838o) objK;
    }

    public final C0838o m() {
        C0838o c0838oH = h();
        return c0838oH == null ? i((C0838o) f3716b.get(this)) : c0838oH;
    }

    public boolean q() {
        return k() instanceof x;
    }

    public boolean r() {
        return s() == null;
    }

    public final C0838o s() {
        Object objK;
        C0838o c0838o;
        do {
            objK = k();
            if (objK instanceof x) {
                return ((x) objK).f3733a;
            }
            if (objK == this) {
                return (C0838o) objK;
            }
            Intrinsics.d(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c0838o = (C0838o) objK;
        } while (!androidx.concurrent.futures.b.a(f3715a, this, objK, c0838o.t()));
        c0838o.h();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.u(this) { // from class: N8.o.a
            @Override // F8.j
            public Object get() {
                return T.a(this.receiver);
            }
        } + '@' + T.b(this);
    }
}
