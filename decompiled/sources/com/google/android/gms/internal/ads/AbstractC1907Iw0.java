package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1907Iw0 extends AbstractC2270Pw0 {
    protected AbstractC1907Iw0() {
    }

    private static void A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger loggerA = AbstractC2270Pw0.f22228e.a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object o(com.google.common.util.concurrent.p pVar) {
        Throwable thA;
        if (pVar instanceof InterfaceC1803Gw0) {
            Object c1595Cw0 = ((AbstractC1907Iw0) pVar).f22231a;
            if (c1595Cw0 instanceof C1595Cw0) {
                C1595Cw0 c1595Cw1 = (C1595Cw0) c1595Cw0;
                if (c1595Cw1.f18017a) {
                    Throwable th = c1595Cw1.f18018b;
                    c1595Cw0 = th != null ? new C1595Cw0(false, th) : C1595Cw0.f18016d;
                }
            }
            Objects.requireNonNull(c1595Cw0);
            return c1595Cw0;
        }
        if ((pVar instanceof AbstractC2920ay0) && (thA = ((AbstractC2920ay0) pVar).a()) != null) {
            return new C1699Ew0(thA);
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!AbstractC2270Pw0.f22229f) && zIsCancelled) {
            C1595Cw0 c1595Cw2 = C1595Cw0.f18016d;
            Objects.requireNonNull(c1595Cw2);
            return c1595Cw2;
        }
        try {
            Object objP = p(pVar);
            if (!zIsCancelled) {
                return objP == null ? AbstractC2270Pw0.f22227d : objP;
            }
            String strValueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new C1595Cw0(false, new IllegalArgumentException(sb.toString()));
        } catch (Error | Exception e10) {
            return new C1699Ew0(e10);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new C1699Ew0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(pVar)), e11)) : new C1595Cw0(false, e11);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new C1595Cw0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(pVar)), e12)) : new C1699Ew0(e12.getCause());
        }
    }

    private static Object p(Future future) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static Object q(Object obj) throws ExecutionException {
        if (obj instanceof C1595Cw0) {
            Throwable th = ((C1595Cw0) obj).f18018b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1699Ew0) {
            throw new ExecutionException(((C1699Ew0) obj).f18610a);
        }
        if (obj == AbstractC2270Pw0.f22227d) {
            return null;
        }
        return obj;
    }

    static boolean r(Object obj) {
        return !(obj instanceof RunnableC1647Dw0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(AbstractC1907Iw0 abstractC1907Iw0, boolean z9) {
        C1751Fw0 c1751Fw0 = null;
        while (true) {
            abstractC1907Iw0.g();
            if (z9) {
                abstractC1907Iw0.s();
            }
            abstractC1907Iw0.m();
            C1751Fw0 c1751Fw1 = c1751Fw0;
            C1751Fw0 c1751Fw0D = abstractC1907Iw0.d(C1751Fw0.f18876d);
            C1751Fw0 c1751Fw2 = c1751Fw1;
            while (c1751Fw0D != null) {
                C1751Fw0 c1751Fw3 = c1751Fw0D.f18879c;
                c1751Fw0D.f18879c = c1751Fw2;
                c1751Fw2 = c1751Fw0D;
                c1751Fw0D = c1751Fw3;
            }
            while (c1751Fw2 != null) {
                Runnable runnable = c1751Fw2.f18877a;
                c1751Fw0 = c1751Fw2.f18879c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC1647Dw0) {
                    RunnableC1647Dw0 runnableC1647Dw0 = (RunnableC1647Dw0) runnable2;
                    abstractC1907Iw0 = runnableC1647Dw0.f18315a;
                    if (abstractC1907Iw0.f22231a == runnableC1647Dw0 && AbstractC2270Pw0.f(abstractC1907Iw0, runnableC1647Dw0, o(runnableC1647Dw0.f18316b))) {
                        z9 = false;
                    }
                } else {
                    Executor executor = c1751Fw2.f18878b;
                    Objects.requireNonNull(executor);
                    A(runnable2, executor);
                }
                c1751Fw2 = c1751Fw0;
            }
            return;
        }
    }

    private final void z(StringBuilder sb) {
        try {
            Object objP = p(this);
            sb.append("SUCCESS, result=[");
            if (objP == null) {
                sb.append("null");
            } else if (objP == this) {
                sb.append("this future");
            } else {
                sb.append(objP.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objP)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        } catch (Exception e11) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e11.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2920ay0
    protected final Throwable a() {
        if (!(this instanceof InterfaceC1803Gw0)) {
            return null;
        }
        Object obj = this.f22231a;
        if (obj instanceof C1699Ew0) {
            return ((C1699Ew0) obj).f18610a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        C1595Cw0 c1595Cw0;
        Object obj = this.f22231a;
        if (!(obj instanceof RunnableC1647Dw0) && !(obj == null)) {
            return false;
        }
        if (AbstractC2270Pw0.f22229f) {
            c1595Cw0 = new C1595Cw0(z9, new CancellationException("Future.cancel() was called."));
        } else {
            c1595Cw0 = z9 ? C1595Cw0.f18015c : C1595Cw0.f18016d;
            Objects.requireNonNull(c1595Cw0);
        }
        AbstractC1907Iw0 abstractC1907Iw0 = this;
        boolean z10 = false;
        while (true) {
            if (AbstractC2270Pw0.f(abstractC1907Iw0, obj, c1595Cw0)) {
                y(abstractC1907Iw0, z9);
                if (obj instanceof RunnableC1647Dw0) {
                    com.google.common.util.concurrent.p pVar = ((RunnableC1647Dw0) obj).f18316b;
                    if (pVar instanceof InterfaceC1803Gw0) {
                        abstractC1907Iw0 = (AbstractC1907Iw0) pVar;
                        obj = abstractC1907Iw0.f22231a;
                        if (!(obj == null) && !(obj instanceof RunnableC1647Dw0)) {
                            return true;
                        }
                        z10 = true;
                    } else {
                        pVar.cancel(z9);
                    }
                }
                return true;
            }
            obj = abstractC1907Iw0.f22231a;
            if (r(obj)) {
                return z10;
            }
        }
    }

    @Override // com.google.common.util.concurrent.p
    public void e(Runnable runnable, Executor executor) {
        C1751Fw0 c1751Fw0;
        AbstractC2418Ss0.k(runnable, "Runnable was null.");
        AbstractC2418Ss0.k(executor, "Executor was null.");
        if (!isDone() && (c1751Fw0 = this.f22232b) != C1751Fw0.f18876d) {
            C1751Fw0 c1751Fw1 = new C1751Fw0(runnable, executor);
            do {
                c1751Fw1.f18879c = c1751Fw0;
                if (c(c1751Fw0, c1751Fw1)) {
                    return;
                } else {
                    c1751Fw0 = this.f22232b;
                }
            } while (c1751Fw0 != C1751Fw0.f18876d);
        }
        A(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return i();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f22231a instanceof C1595Cw0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f22231a;
        return (obj != null) & r(obj);
    }

    protected boolean k(Object obj) {
        if (obj == null) {
            obj = AbstractC2270Pw0.f22227d;
        }
        if (!AbstractC2270Pw0.f(this, null, obj)) {
            return false;
        }
        y(this, false);
        return true;
    }

    protected boolean l(Throwable th) {
        th.getClass();
        if (!AbstractC2270Pw0.f(this, null, new C1699Ew0(th))) {
            return false;
        }
        y(this, false);
        return true;
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String n() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + 21);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    protected void s() {
    }

    protected final boolean t() {
        Object obj = this.f22231a;
        return (obj instanceof C1595Cw0) && ((C1595Cw0) obj).f18017a;
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            z(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f22231a;
            if (obj instanceof RunnableC1647Dw0) {
                sb.append(", setFuture=[");
                com.google.common.util.concurrent.p pVar = ((RunnableC1647Dw0) obj).f18316b;
                try {
                    if (pVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(pVar);
                    }
                } catch (Throwable th) {
                    AbstractC2324Qx0.b(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = AbstractC4040jt0.b(n());
                } catch (Throwable th2) {
                    AbstractC2324Qx0.b(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                z(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected final boolean u(com.google.common.util.concurrent.p pVar) {
        C1699Ew0 c1699Ew0;
        pVar.getClass();
        Object obj = this.f22231a;
        if (obj == null) {
            if (pVar.isDone()) {
                if (!AbstractC2270Pw0.f(this, null, o(pVar))) {
                    return false;
                }
                y(this, false);
                return true;
            }
            RunnableC1647Dw0 runnableC1647Dw0 = new RunnableC1647Dw0(this, pVar);
            if (AbstractC2270Pw0.f(this, null, runnableC1647Dw0)) {
                try {
                    pVar.e(runnableC1647Dw0, EnumC4300lx0.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c1699Ew0 = new C1699Ew0(th);
                    } catch (Error | Exception unused) {
                        c1699Ew0 = C1699Ew0.f18609b;
                    }
                    AbstractC2270Pw0.f(this, runnableC1647Dw0, c1699Ew0);
                }
                return true;
            }
            obj = this.f22231a;
        }
        if (obj instanceof C1595Cw0) {
            pVar.cancel(((C1595Cw0) obj).f18017a);
        }
        return false;
    }

    final void v(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(t());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return h(j10, timeUnit);
    }
}
