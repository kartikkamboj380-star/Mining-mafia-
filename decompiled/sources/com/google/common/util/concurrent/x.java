package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes2.dex */
class x extends f.a implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile n f39954h;

    private final class a extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable f39955c;

        a(Callable callable) {
            this.f39955c = (Callable) X5.j.h(callable);
        }

        @Override // com.google.common.util.concurrent.n
        void a(Throwable th) {
            x.this.D(th);
        }

        @Override // com.google.common.util.concurrent.n
        void b(Object obj) {
            x.this.C(obj);
        }

        @Override // com.google.common.util.concurrent.n
        final boolean d() {
            return x.this.isDone();
        }

        @Override // com.google.common.util.concurrent.n
        Object e() {
            return this.f39955c.call();
        }

        @Override // com.google.common.util.concurrent.n
        String f() {
            return this.f39955c.toString();
        }
    }

    x(Callable callable) {
        this.f39954h = new a(callable);
    }

    static x G(Runnable runnable, Object obj) {
        return new x(Executors.callable(runnable, obj));
    }

    static x H(Callable callable) {
        return new x(callable);
    }

    @Override // com.google.common.util.concurrent.a
    protected void n() {
        n nVar;
        super.n();
        if (F() && (nVar = this.f39954h) != null) {
            nVar.c();
        }
        this.f39954h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        n nVar = this.f39954h;
        if (nVar != null) {
            nVar.run();
        }
        this.f39954h = null;
    }

    @Override // com.google.common.util.concurrent.a
    protected String z() {
        n nVar = this.f39954h;
        if (nVar == null) {
            return super.z();
        }
        return "task=[" + nVar + "]";
    }
}
