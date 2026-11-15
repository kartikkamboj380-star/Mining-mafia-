package I8;

import N8.C0831h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: I8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0687p extends AbstractC0660b0 implements InterfaceC0683n, kotlin.coroutines.jvm.internal.e, g1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1807f = AtomicIntegerFieldUpdater.newUpdater(C0687p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1808g = AtomicReferenceFieldUpdater.newUpdater(C0687p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1809h = AtomicReferenceFieldUpdater.newUpdater(C0687p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p169q8.b f1810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CoroutineContext f1811e;

    public C0687p(p169q8.b bVar, int i10) {
        super(i10);
        this.f1810d = bVar;
        this.f1811e = bVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0663d.f1765a;
    }

    private final String C() {
        Object objB = B();
        if (objB instanceof P0) {
            return "Active";
        }
        return objB instanceof C0692s ? "Cancelled" : "Completed";
    }

    private final InterfaceC0670g0 H() {
        B0 b10 = (B0) getContext().get(B0.f1699o);
        if (b10 == null) {
            return null;
        }
        InterfaceC0670g0 interfaceC0670g0J = F0.j(b10, false, new C0694t(this), 1, null);
        androidx.concurrent.futures.b.a(f1809h, this, null, interfaceC0670g0J);
        return interfaceC0670g0J;
    }

    private final void I(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0663d) {
                if (androidx.concurrent.futures.b.a(f1808g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC0681m) || (obj2 instanceof N8.A)) {
                L(obj, obj2);
            } else {
                if (obj2 instanceof C) {
                    C c10 = (C) obj2;
                    if (!c10.c()) {
                        L(obj, obj2);
                    }
                    if (obj2 instanceof C0692s) {
                        if (obj2 == null) {
                            c10 = null;
                        }
                        Throwable th = c10 != null ? c10.f1702a : null;
                        if (obj instanceof InterfaceC0681m) {
                            p((InterfaceC0681m) obj, th);
                            return;
                        } else {
                            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            t((N8.A) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof B) {
                    B b10 = (B) obj2;
                    if (b10.f1695b != null) {
                        L(obj, obj2);
                    }
                    if (obj instanceof N8.A) {
                        return;
                    }
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC0681m interfaceC0681m = (InterfaceC0681m) obj;
                    if (b10.c()) {
                        p(interfaceC0681m, b10.f1698e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f1808g, this, obj2, B.b(b10, null, interfaceC0681m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof N8.A) {
                        return;
                    }
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f1808g, this, obj2, new B(obj2, (InterfaceC0681m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean K() {
        if (!AbstractC0662c0.c(this.f1758c)) {
            return false;
        }
        p169q8.b bVar = this.f1810d;
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0831h) bVar).u();
    }

    private final void L(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(Function1 function1, Throwable th, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th);
        return Unit.f45918a;
    }

    public static /* synthetic */ void T(C0687p c0687p, Object obj, int i10, p259z8.n nVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            nVar = null;
        }
        c0687p.S(obj, i10, nVar);
    }

    private final Object U(P0 p10, Object obj, int i10, p259z8.n nVar, Object obj2) {
        if (obj instanceof C) {
            return obj;
        }
        if ((AbstractC0662c0.b(i10) || obj2 != null) && !(nVar == null && !(p10 instanceof InterfaceC0681m) && obj2 == null)) {
            return new B(obj, p10 instanceof InterfaceC0681m ? (InterfaceC0681m) p10 : null, nVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean V() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1807f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f1807f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final N8.D W(Object obj, Object obj2, p259z8.n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof P0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof B) && obj4 != null && ((B) obj3).f1697d == obj4) {
                    return AbstractC0689q.f1812a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            p259z8.n nVar2 = nVar;
            if (androidx.concurrent.futures.b.a(f1808g, this, obj3, U((P0) obj3, obj5, this.f1758c, nVar2, obj6))) {
                w();
                return AbstractC0689q.f1812a;
            }
            obj = obj5;
            nVar = nVar2;
            obj2 = obj6;
        }
    }

    private final boolean X() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1807f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f1807f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void t(N8.A a10, Throwable th) {
        int i10 = f1807f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            a10.s(i10, th, getContext());
        } catch (Throwable th2) {
            M.a(getContext(), new D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean u(Throwable th) {
        if (!K()) {
            return false;
        }
        p169q8.b bVar = this.f1810d;
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0831h) bVar).v(th);
    }

    private final void w() {
        if (K()) {
            return;
        }
        v();
    }

    private final void x(int i10) {
        if (V()) {
            return;
        }
        AbstractC0662c0.a(this, i10);
    }

    private final InterfaceC0670g0 z() {
        return (InterfaceC0670g0) f1809h.get(this);
    }

    public final Object A() {
        B0 b10;
        boolean zK = K();
        if (X()) {
            if (z() == null) {
                H();
            }
            if (zK) {
                O();
            }
            return p179r8.b.e();
        }
        if (zK) {
            O();
        }
        Object objB = B();
        if (objB instanceof C) {
            throw ((C) objB).f1702a;
        }
        if (!AbstractC0662c0.b(this.f1758c) || (b10 = (B0) getContext().get(B0.f1699o)) == null || b10.isActive()) {
            return k(objB);
        }
        CancellationException cancellationExceptionX = b10.x();
        d(objB, cancellationExceptionX);
        throw cancellationExceptionX;
    }

    public final Object B() {
        return f1808g.get(this);
    }

    public void G() {
        InterfaceC0670g0 interfaceC0670g0H = H();
        if (interfaceC0670g0H != null && a()) {
            interfaceC0670g0H.c();
            f1809h.set(this, O0.f1734a);
        }
    }

    public final void J(InterfaceC0681m interfaceC0681m) {
        I(interfaceC0681m);
    }

    protected String M() {
        return "CancellableContinuation";
    }

    public final void N(Throwable th) {
        if (u(th)) {
            return;
        }
        j(th);
        w();
    }

    public final void O() {
        Throwable thX;
        p169q8.b bVar = this.f1810d;
        C0831h c0831h = bVar instanceof C0831h ? (C0831h) bVar : null;
        if (c0831h == null || (thX = c0831h.x(this)) == null) {
            return;
        }
        v();
        j(thX);
    }

    public final boolean P() {
        Object obj = f1808g.get(this);
        if ((obj instanceof B) && ((B) obj).f1697d != null) {
            v();
            return false;
        }
        f1807f.set(this, 536870911);
        f1808g.set(this, C0663d.f1765a);
        return true;
    }

    public void Q(Object obj, final Function1 function1) {
        S(obj, this.f1758c, function1 != null ? new p259z8.n() { // from class: I8.o
            @Override // p259z8.n
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return C0687p.R(function1, (Throwable) obj2, obj3, (CoroutineContext) obj4);
            }
        } : null);
    }

    public final void S(Object obj, int i10, p259z8.n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof P0)) {
                Object obj3 = obj;
                p259z8.n nVar2 = nVar;
                if (obj2 instanceof C0692s) {
                    C0692s c0692s = (C0692s) obj2;
                    if (c0692s.e()) {
                        if (nVar2 != null) {
                            q(nVar2, c0692s.f1702a, obj3);
                            return;
                        }
                        return;
                    }
                }
                o(obj3);
                throw new p129m8.d();
            }
            Object obj4 = obj;
            int i11 = i10;
            p259z8.n nVar3 = nVar;
            if (androidx.concurrent.futures.b.a(f1808g, this, obj2, U((P0) obj2, obj4, i11, nVar3, null))) {
                w();
                x(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                nVar = nVar3;
            }
        }
    }

    @Override // I8.InterfaceC0683n
    public boolean a() {
        return !(B() instanceof P0);
    }

    @Override // I8.InterfaceC0683n
    public Object b(Object obj, Object obj2, p259z8.n nVar) {
        return W(obj, obj2, nVar);
    }

    @Override // I8.g1
    public void c(N8.A a10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1807f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        I(a10);
    }

    @Override // I8.AbstractC0660b0
    public void d(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof P0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C) {
                return;
            }
            if (obj2 instanceof B) {
                B b10 = (B) obj2;
                if (b10.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (androidx.concurrent.futures.b.a(f1808g, this, obj2, B.b(b10, null, null, null, null, th3, 15, null))) {
                    b10.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (androidx.concurrent.futures.b.a(f1808g, this, obj2, new B(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // I8.InterfaceC0683n
    public void e(K k10, Object obj) {
        p169q8.b bVar = this.f1810d;
        C0831h c0831h = bVar instanceof C0831h ? (C0831h) bVar : null;
        T(this, obj, (c0831h != null ? c0831h.f3699d : null) == k10 ? 4 : this.f1758c, null, 4, null);
    }

    @Override // I8.InterfaceC0683n
    public void f(Function1 function1) {
        r.c(this, new InterfaceC0681m.a(function1));
    }

    @Override // I8.AbstractC0660b0
    public final p169q8.b g() {
        return this.f1810d;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p169q8.b bVar = this.f1810d;
        if (bVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) bVar;
        }
        return null;
    }

    @Override // p169q8.b
    public CoroutineContext getContext() {
        return this.f1811e;
    }

    @Override // I8.AbstractC0660b0
    public Throwable h(Object obj) {
        Throwable thH = super.h(obj);
        if (thH != null) {
            return thH;
        }
        return null;
    }

    @Override // I8.InterfaceC0683n
    public Object i(Throwable th) {
        return W(new C(th, false, 2, null), null, null);
    }

    @Override // I8.InterfaceC0683n
    public boolean isActive() {
        return B() instanceof P0;
    }

    @Override // I8.InterfaceC0683n
    public boolean j(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof P0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f1808g, this, obj, new C0692s(this, th, (obj instanceof InterfaceC0681m) || (obj instanceof N8.A))));
        P0 p10 = (P0) obj;
        if (p10 instanceof InterfaceC0681m) {
            p((InterfaceC0681m) obj, th);
        } else if (p10 instanceof N8.A) {
            t((N8.A) obj, th);
        }
        w();
        x(this.f1758c);
        return true;
    }

    @Override // I8.AbstractC0660b0
    public Object k(Object obj) {
        return obj instanceof B ? ((B) obj).f1694a : obj;
    }

    @Override // I8.AbstractC0660b0
    public Object m() {
        return B();
    }

    public final void p(InterfaceC0681m interfaceC0681m, Throwable th) {
        try {
            interfaceC0681m.a(th);
        } catch (Throwable th2) {
            M.a(getContext(), new D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q(p259z8.n nVar, Throwable th, Object obj) {
        try {
            nVar.invoke(th, obj, getContext());
        } catch (Throwable th2) {
            M.a(getContext(), new D("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // I8.InterfaceC0683n
    public void r(Object obj, p259z8.n nVar) {
        S(obj, this.f1758c, nVar);
    }

    @Override // p169q8.b
    public void resumeWith(Object obj) {
        T(this, E.c(obj, this), this.f1758c, null, 4, null);
    }

    @Override // I8.InterfaceC0683n
    public void s(Object obj) {
        x(this.f1758c);
    }

    public String toString() {
        return M() + '(' + T.c(this.f1810d) + "){" + C() + "}@" + T.b(this);
    }

    public final void v() {
        InterfaceC0670g0 interfaceC0670g0Z = z();
        if (interfaceC0670g0Z == null) {
            return;
        }
        interfaceC0670g0Z.c();
        f1809h.set(this, O0.f1734a);
    }

    public Throwable y(B0 b10) {
        return b10.x();
    }
}
