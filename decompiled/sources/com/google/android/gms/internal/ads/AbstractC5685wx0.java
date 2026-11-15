package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5685wx0 extends AbstractC5937yx0 {
    public static com.google.common.util.concurrent.p a(Object obj) {
        return obj == null ? C1493Ax0.f17437b : new C1493Ax0(obj);
    }

    public static com.google.common.util.concurrent.p b() {
        return C1493Ax0.f17437b;
    }

    public static com.google.common.util.concurrent.p c(Throwable th) {
        th.getClass();
        return new C6063zx0(th);
    }

    public static com.google.common.util.concurrent.p d(Callable callable, Executor executor) {
        RunnableFutureC2688Xx0 runnableFutureC2688Xx0 = new RunnableFutureC2688Xx0(callable);
        executor.execute(runnableFutureC2688Xx0);
        return runnableFutureC2688Xx0;
    }

    public static com.google.common.util.concurrent.p e(Runnable runnable, Executor executor) {
        RunnableFutureC2688Xx0 runnableFutureC2688Xx0C = RunnableFutureC2688Xx0.C(runnable, null);
        executor.execute(runnableFutureC2688Xx0C);
        return runnableFutureC2688Xx0C;
    }

    public static com.google.common.util.concurrent.p f(InterfaceC3169cx0 interfaceC3169cx0, Executor executor) {
        RunnableFutureC2688Xx0 runnableFutureC2688Xx0 = new RunnableFutureC2688Xx0(interfaceC3169cx0);
        executor.execute(runnableFutureC2688Xx0);
        return runnableFutureC2688Xx0;
    }

    public static com.google.common.util.concurrent.p g(com.google.common.util.concurrent.p pVar, Class cls, InterfaceC1899Is0 interfaceC1899Is0, Executor executor) {
        int i10 = AbstractRunnableC1543Bw0.f17744k;
        C1491Aw0 c1491Aw0 = new C1491Aw0(pVar, cls, interfaceC1899Is0);
        pVar.e(c1491Aw0, AbstractC2272Px0.d(executor, c1491Aw0));
        return c1491Aw0;
    }

    public static com.google.common.util.concurrent.p h(com.google.common.util.concurrent.p pVar, Class cls, InterfaceC3294dx0 interfaceC3294dx0, Executor executor) {
        int i10 = AbstractRunnableC1543Bw0.f17744k;
        C6061zw0 c6061zw0 = new C6061zw0(pVar, cls, interfaceC3294dx0);
        pVar.e(c6061zw0, AbstractC2272Px0.d(executor, c6061zw0));
        return c6061zw0;
    }

    public static com.google.common.util.concurrent.p i(com.google.common.util.concurrent.p pVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return pVar.isDone() ? pVar : C2532Ux0.C(pVar, j10, timeUnit, scheduledExecutorService);
    }

    public static com.google.common.util.concurrent.p j(com.google.common.util.concurrent.p pVar, InterfaceC3294dx0 interfaceC3294dx0, Executor executor) {
        int i10 = AbstractRunnableC2530Uw0.f24135j;
        C2426Sw0 c2426Sw0 = new C2426Sw0(pVar, interfaceC3294dx0);
        pVar.e(c2426Sw0, AbstractC2272Px0.d(executor, c2426Sw0));
        return c2426Sw0;
    }

    public static com.google.common.util.concurrent.p k(com.google.common.util.concurrent.p pVar, InterfaceC1899Is0 interfaceC1899Is0, Executor executor) {
        int i10 = AbstractRunnableC2530Uw0.f24135j;
        C2478Tw0 c2478Tw0 = new C2478Tw0(pVar, interfaceC1899Is0);
        pVar.e(c2478Tw0, AbstractC2272Px0.d(executor, c2478Tw0));
        return c2478Tw0;
    }

    public static com.google.common.util.concurrent.p l(com.google.common.util.concurrent.p... pVarArr) {
        return new C3420ex0(AbstractC5931yu0.v(pVarArr), true);
    }

    public static com.google.common.util.concurrent.p m(Iterable iterable) {
        return new C3420ex0(AbstractC5931yu0.t(iterable), true);
    }

    public static C5559vx0 n(Iterable iterable) {
        return new C5559vx0(false, AbstractC5931yu0.t(iterable), null);
    }

    public static C5559vx0 o(com.google.common.util.concurrent.p... pVarArr) {
        return new C5559vx0(true, AbstractC5931yu0.v(pVarArr), null);
    }

    public static C5559vx0 p(Iterable iterable) {
        return new C5559vx0(true, AbstractC5931yu0.t(iterable), null);
    }

    public static com.google.common.util.concurrent.p q(com.google.common.util.concurrent.p... pVarArr) {
        return new C3420ex0(AbstractC5931yu0.v(pVarArr), false);
    }

    public static void r(com.google.common.util.concurrent.p pVar, InterfaceC5307tx0 interfaceC5307tx0, Executor executor) {
        interfaceC5307tx0.getClass();
        pVar.e(new RunnableC5433ux0(pVar, interfaceC5307tx0), executor);
    }

    public static Object s(Future future) {
        if (future.isDone()) {
            return AbstractC2792Zx0.a(future);
        }
        throw new IllegalStateException(AbstractC4040jt0.d("Future was expected to be done: %s", future));
    }

    public static Object t(Future future) {
        try {
            return AbstractC2792Zx0.a(future);
        } catch (ExecutionException e10) {
            if (e10.getCause() instanceof Error) {
                throw new C4426mx0((Error) e10.getCause());
            }
            throw new C2740Yx0(e10.getCause());
        }
    }
}
