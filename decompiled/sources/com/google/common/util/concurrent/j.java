package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends l {

    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future f39937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i f39938b;

        a(Future future, i iVar) {
            this.f39937a = future;
            this.f39938b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Object obj = this.f39937a;
            if ((obj instanceof Z5.a) && (thA = Z5.b.a((Z5.a) obj)) != null) {
                this.f39938b.onFailure(thA);
                return;
            }
            try {
                this.f39938b.onSuccess(j.b(this.f39937a));
            } catch (ExecutionException e10) {
                this.f39938b.onFailure(e10.getCause());
            } catch (Throwable th) {
                this.f39938b.onFailure(th);
            }
        }

        public String toString() {
            return X5.d.a(this).c(this.f39938b).toString();
        }
    }

    public static void a(p pVar, i iVar, Executor executor) {
        X5.j.h(iVar);
        pVar.e(new a(pVar, iVar), executor);
    }

    public static Object b(Future future) {
        X5.j.p(future.isDone(), "Future was expected to be done: %s", future);
        return y.a(future);
    }

    public static p c(Object obj) {
        return obj == null ? m.f39939b : new m(obj);
    }

    public static p d(p pVar, d dVar, Executor executor) {
        return c.G(pVar, dVar, executor);
    }
}
