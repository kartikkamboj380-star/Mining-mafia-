package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class c extends f.a implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    p f39932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f39933i;

    private static final class a extends c {
        a(p pVar, d dVar) {
            super(pVar, dVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public p H(d dVar, Object obj) {
            p pVarApply = dVar.apply(obj);
            X5.j.j(pVarApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", dVar);
            return pVarApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.c
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void I(p pVar) {
            E(pVar);
        }
    }

    c(p pVar, Object obj) {
        this.f39932h = (p) X5.j.h(pVar);
        this.f39933i = X5.j.h(obj);
    }

    static p G(p pVar, d dVar, Executor executor) {
        X5.j.h(executor);
        a aVar = new a(pVar, dVar);
        pVar.e(aVar, s.c(executor, aVar));
        return aVar;
    }

    abstract Object H(Object obj, Object obj2);

    abstract void I(Object obj);

    @Override // com.google.common.util.concurrent.a
    protected final void n() {
        y(this.f39932h);
        this.f39932h = null;
        this.f39933i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f39932h;
        Object obj = this.f39933i;
        if ((isCancelled() | (pVar == null)) || (obj == null)) {
            return;
        }
        this.f39932h = null;
        if (pVar.isCancelled()) {
            E(pVar);
            return;
        }
        try {
            try {
                Object objH = H(obj, j.b(pVar));
                this.f39933i = null;
                I(objH);
            } catch (Throwable th) {
                try {
                    v.a(th);
                    D(th);
                } finally {
                    this.f39933i = null;
                }
            }
        } catch (Error e10) {
            D(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            D(e11.getCause());
        } catch (Exception e12) {
            D(e12);
        }
    }

    @Override // com.google.common.util.concurrent.a
    protected String z() {
        String str;
        p pVar = this.f39932h;
        Object obj = this.f39933i;
        String strZ = super.z();
        if (pVar != null) {
            str = "inputFuture=[" + pVar + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (strZ == null) {
            return null;
        }
        return str + strZ;
    }
}
