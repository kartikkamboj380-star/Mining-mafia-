package L3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements p174r3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3083g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Executor f3084h = c.f3064c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Executor f3085i = c.f3063b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final n f3086j = new n((Object) null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final n f3087k = new n(Boolean.TRUE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final n f3088l = new n(Boolean.FALSE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final n f3089m = new n(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f3093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f3094e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3090a = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f3095f = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(Callable callable, final o oVar) {
            L3.a aVar = new L3.a() { // from class: L3.j
                @Override // L3.a
                public final Object a(n nVar) {
                    return n.a.j(oVar, nVar);
                }
            };
            try {
                n nVar = (n) callable.call();
                synchronized (nVar.f3090a) {
                    try {
                        if (nVar.u()) {
                            Intrinsics.c(nVar);
                            aVar.a(nVar);
                        } else {
                            nVar.f3095f.add(aVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(o oVar, n task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.t()) {
                oVar.b();
            } else if (task.v()) {
                oVar.c(task.r());
            } else {
                oVar.d(task.s());
            }
            return Unit.f45918a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l(final o oVar, final L3.a aVar, final n nVar, Executor executor) {
            try {
                executor.execute(new Runnable() { // from class: L3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.m(aVar, nVar, oVar);
                    }
                });
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(L3.a aVar, n nVar, final o oVar) {
            try {
                n nVar2 = (n) aVar.a(nVar);
                if (nVar2 == null) {
                    oVar.d(null);
                } else {
                    n.m(nVar2, new L3.a() { // from class: L3.m
                        @Override // L3.a
                        public final Object a(n nVar3) {
                            return n.a.n(oVar, nVar3);
                        }
                    }, null, 2, null);
                }
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(o oVar, n task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (task.t()) {
                oVar.b();
            } else if (task.v()) {
                oVar.c(task.r());
            } else {
                oVar.d(task.s());
            }
            return Unit.f45918a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o(final o oVar, final L3.a aVar, final n nVar, Executor executor) {
            try {
                executor.execute(new Runnable() { // from class: L3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.p(aVar, nVar, oVar);
                    }
                });
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(L3.a aVar, n nVar, o oVar) {
            try {
                oVar.d(aVar.a(nVar));
            } catch (CancellationException unused) {
                oVar.b();
            } catch (Exception e10) {
                oVar.c(e10);
            }
        }

        public final n h(final Callable callable, Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            final o oVar = new o();
            try {
                executor.execute(new Runnable() { // from class: L3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        n.a.i(callable, oVar);
                    }
                });
            } catch (Exception e10) {
                oVar.c(new b(e10));
            }
            return oVar.a();
        }

        public final n k() {
            n nVar = n.f3089m;
            Intrinsics.d(nVar, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.cancelled>");
            return nVar;
        }

        public final n q(Exception exc) {
            o oVar = new o();
            oVar.c(exc);
            return oVar.a();
        }

        public final n r(Object obj) {
            if (obj == null) {
                n nVar = n.f3086j;
                Intrinsics.d(nVar, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return nVar;
            }
            if (obj instanceof Boolean) {
                n nVar2 = ((Boolean) obj).booleanValue() ? n.f3087k : n.f3088l;
                Intrinsics.d(nVar2, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<TResult of com.facebook.react.runtime.internal.bolts.Task.Companion.forResult>");
                return nVar2;
            }
            o oVar = new o();
            oVar.d(obj);
            return oVar.a();
        }

        private a() {
        }
    }

    public n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n A(L3.a aVar, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.t()) {
            return f3083g.k();
        }
        return task.v() ? f3083g.q(task.r()) : m(task, aVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n C(L3.a aVar, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.t()) {
            return f3083g.k();
        }
        return task.v() ? f3083g.q(task.r()) : p(task, aVar, null, 2, null);
    }

    private final void D() {
        synchronized (this.f3090a) {
            Iterator it = this.f3095f.iterator();
            while (it.hasNext()) {
                try {
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f3095f.clear();
            Unit unit = Unit.f45918a;
        }
    }

    public static /* synthetic */ n m(n nVar, L3.a aVar, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f3084h;
        }
        return nVar.l(aVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(o oVar, L3.a aVar, Executor executor, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f3083g.o(oVar, aVar, task, executor);
        return Unit.f45918a;
    }

    public static /* synthetic */ n p(n nVar, L3.a aVar, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f3084h;
        }
        return nVar.o(aVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(o oVar, L3.a aVar, Executor executor, n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f3083g.l(oVar, aVar, task, executor);
        return Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n x(n task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.t()) {
            return f3083g.k();
        }
        return task.v() ? f3083g.q(task.r()) : f3086j;
    }

    public static /* synthetic */ n z(n nVar, L3.a aVar, Executor executor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = f3084h;
        }
        return nVar.y(aVar, executor);
    }

    public final n B(final L3.a continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return o(new L3.a() { // from class: L3.h
            @Override // L3.a
            public final Object a(n nVar) {
                return n.C(continuation, nVar);
            }
        }, executor);
    }

    public final boolean E() {
        synchronized (this.f3090a) {
            if (this.f3091b) {
                return false;
            }
            this.f3091b = true;
            this.f3092c = true;
            this.f3090a.notifyAll();
            D();
            return true;
        }
    }

    public final boolean F(Exception exc) {
        synchronized (this.f3090a) {
            if (this.f3091b) {
                return false;
            }
            this.f3091b = true;
            this.f3094e = exc;
            this.f3090a.notifyAll();
            D();
            return true;
        }
    }

    public final boolean G(Object obj) {
        synchronized (this.f3090a) {
            if (this.f3091b) {
                return false;
            }
            this.f3091b = true;
            this.f3093d = obj;
            this.f3090a.notifyAll();
            D();
            return true;
        }
    }

    public final n l(final L3.a continuation, final Executor executor) {
        boolean zU;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final o oVar = new o();
        synchronized (this.f3090a) {
            try {
                zU = u();
                if (!zU) {
                    this.f3095f.add(new L3.a() { // from class: L3.g
                        @Override // L3.a
                        public final Object a(n nVar) {
                            return n.n(oVar, continuation, executor, nVar);
                        }
                    });
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            f3083g.o(oVar, continuation, this, executor);
        }
        return oVar.a();
    }

    public final n o(final L3.a continuation, final Executor executor) {
        boolean zU;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final o oVar = new o();
        synchronized (this.f3090a) {
            try {
                zU = u();
                if (!zU) {
                    this.f3095f.add(new L3.a() { // from class: L3.e
                        @Override // L3.a
                        public final Object a(n nVar) {
                            return n.q(oVar, continuation, executor, nVar);
                        }
                    });
                }
                Unit unit = Unit.f45918a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            f3083g.l(oVar, continuation, this, executor);
        }
        return oVar.a();
    }

    public Exception r() {
        Exception exc;
        synchronized (this.f3090a) {
            exc = this.f3094e;
        }
        return exc;
    }

    public Object s() {
        Object obj;
        synchronized (this.f3090a) {
            obj = this.f3093d;
        }
        return obj;
    }

    public boolean t() {
        boolean z9;
        synchronized (this.f3090a) {
            z9 = this.f3092c;
        }
        return z9;
    }

    public boolean u() {
        boolean z9;
        synchronized (this.f3090a) {
            z9 = this.f3091b;
        }
        return z9;
    }

    public boolean v() {
        boolean z9;
        synchronized (this.f3090a) {
            z9 = r() != null;
        }
        return z9;
    }

    public final n w() {
        return p(this, new L3.a() { // from class: L3.d
            @Override // L3.a
            public final Object a(n nVar) {
                return n.x(nVar);
            }
        }, null, 2, null);
    }

    public final n y(final L3.a continuation, Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return o(new L3.a() { // from class: L3.f
            @Override // L3.a
            public final Object a(n nVar) {
                return n.A(continuation, nVar);
            }
        }, executor);
    }

    private n(Object obj) {
        G(obj);
    }

    private n(boolean z9) {
        if (z9) {
            E();
        } else {
            G(null);
        }
    }
}
