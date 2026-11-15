package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14252b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f14255e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f14254d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14253c = 0;

    private class a extends AbstractC1265t {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        class RunnableC0329a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f14257a;

            RunnableC0329a(Pair pair) {
                this.f14257a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f14257a;
                r0Var.g((InterfaceC1260n) pair.first, (e0) pair.second);
            }
        }

        private void p() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f14254d.poll();
                    if (pair == null) {
                        r0.this.f14253c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                r0.this.f14255e.execute(new RunnableC0329a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1265t, com.facebook.imagepipeline.producers.AbstractC1249c
        protected void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1265t, com.facebook.imagepipeline.producers.AbstractC1249c
        protected void g(Throwable th) {
            o().onFailure(th);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        protected void h(Object obj, int i10) {
            o().b(obj, i10);
            if (AbstractC1249c.d(i10)) {
                p();
            }
        }

        private a(InterfaceC1260n interfaceC1260n) {
            super(interfaceC1260n);
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f14252b = i10;
        this.f14255e = (Executor) Y1.k.g(executor);
        this.f14251a = (d0) Y1.k.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        boolean z9;
        e0Var.x().d(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f14253c;
                z9 = true;
                if (i10 >= this.f14252b) {
                    this.f14254d.add(Pair.create(interfaceC1260n, e0Var));
                } else {
                    this.f14253c = i10 + 1;
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            return;
        }
        g(interfaceC1260n, e0Var);
    }

    void g(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        e0Var.x().j(e0Var, "ThrottlingProducer", null);
        this.f14251a.b(new a(interfaceC1260n), e0Var);
    }
}
