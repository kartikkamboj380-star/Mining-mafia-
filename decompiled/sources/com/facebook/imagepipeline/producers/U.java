package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class U implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f14071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f14072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14075e;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f14076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet f14077b = Y1.m.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Closeable f14078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C1251e f14081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f14082g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.U$a$a, reason: collision with other inner class name */
        class C0325a extends AbstractC1252f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f14084a;

            C0325a(Pair pair) {
                this.f14084a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1252f, com.facebook.imagepipeline.producers.f0
            public void a() {
                C1251e.d(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void b() {
                boolean zRemove;
                List list;
                C1251e c1251e;
                List listT;
                List listR;
                synchronized (a.this) {
                    try {
                        zRemove = a.this.f14077b.remove(this.f14084a);
                        list = null;
                        if (!zRemove) {
                            c1251e = null;
                            listT = null;
                        } else if (a.this.f14077b.isEmpty()) {
                            c1251e = a.this.f14081f;
                            listT = null;
                        } else {
                            List listS = a.this.s();
                            listT = a.this.t();
                            listR = a.this.r();
                            c1251e = null;
                            list = listS;
                        }
                        listR = listT;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C1251e.e(list);
                C1251e.f(listT);
                C1251e.d(listR);
                if (c1251e != null) {
                    if (!U.this.f14073c || c1251e.Q()) {
                        c1251e.g();
                    } else {
                        C1251e.f(c1251e.m(I2.f.LOW));
                    }
                }
                if (zRemove) {
                    ((InterfaceC1260n) this.f14084a.first).a();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1252f, com.facebook.imagepipeline.producers.f0
            public void c() {
                C1251e.f(a.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1252f, com.facebook.imagepipeline.producers.f0
            public void d() {
                C1251e.e(a.this.s());
            }
        }

        private class b extends AbstractC1249c {
            @Override // com.facebook.imagepipeline.producers.AbstractC1249c
            protected void f() {
                try {
                    if (V2.b.d()) {
                        V2.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                } finally {
                    if (V2.b.d()) {
                        V2.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1249c
            protected void g(Throwable th) {
                try {
                    if (V2.b.d()) {
                        V2.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th);
                } finally {
                    if (V2.b.d()) {
                        V2.b.b();
                    }
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1249c
            protected void i(float f10) {
                try {
                    if (V2.b.d()) {
                        V2.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f10);
                } finally {
                    if (V2.b.d()) {
                        V2.b.b();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.AbstractC1249c
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void h(Closeable closeable, int i10) {
                try {
                    if (V2.b.d()) {
                        V2.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i10);
                } finally {
                    if (V2.b.d()) {
                        V2.b.b();
                    }
                }
            }

            private b() {
            }
        }

        public a(Object obj) {
            this.f14076a = obj;
        }

        private void g(Pair pair, e0 e0Var) {
            e0Var.c(new C0325a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        private synchronized boolean j() {
            Iterator it = this.f14077b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).G()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator it = this.f14077b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).Q()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized I2.f l() {
            I2.f fVarD;
            fVarD = I2.f.LOW;
            Iterator it = this.f14077b.iterator();
            while (it.hasNext()) {
                fVarD = I2.f.d(fVarD, ((e0) ((Pair) it.next()).second).J());
            }
            return fVarD;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(p063g2.e eVar) {
            synchronized (this) {
                try {
                    Y1.k.b(Boolean.valueOf(this.f14081f == null));
                    Y1.k.b(Boolean.valueOf(this.f14082g == null));
                    if (this.f14077b.isEmpty()) {
                        U.this.k(this.f14076a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f14077b.iterator().next()).second;
                    C1251e c1251e = new C1251e(e0Var.M(), e0Var.getId(), e0Var.x(), e0Var.a(), e0Var.S(), k(), j(), l(), e0Var.h());
                    this.f14081f = c1251e;
                    c1251e.N(e0Var.getExtras());
                    if (eVar.d()) {
                        this.f14081f.v("started_as_prefetch", Boolean.valueOf(eVar.c()));
                    }
                    b bVar = new b();
                    this.f14082g = bVar;
                    U.this.f14072b.b(bVar, this.f14081f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List r() {
            C1251e c1251e = this.f14081f;
            if (c1251e == null) {
                return null;
            }
            return c1251e.k(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List s() {
            C1251e c1251e = this.f14081f;
            if (c1251e == null) {
                return null;
            }
            return c1251e.l(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List t() {
            C1251e c1251e = this.f14081f;
            if (c1251e == null) {
                return null;
            }
            return c1251e.m(l());
        }

        public boolean h(InterfaceC1260n interfaceC1260n, e0 e0Var) {
            Pair pairCreate = Pair.create(interfaceC1260n, e0Var);
            synchronized (this) {
                try {
                    if (U.this.i(this.f14076a) != this) {
                        return false;
                    }
                    this.f14077b.add(pairCreate);
                    List listS = s();
                    List listT = t();
                    List listR = r();
                    Closeable closeableG = this.f14078c;
                    float f10 = this.f14079d;
                    int i10 = this.f14080e;
                    C1251e.e(listS);
                    C1251e.f(listT);
                    C1251e.d(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                try {
                                    if (closeableG != this.f14078c) {
                                        closeableG = null;
                                    } else if (closeableG != null) {
                                        closeableG = U.this.g(closeableG);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (closeableG != null) {
                                if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    interfaceC1260n.c(f10);
                                }
                                interfaceC1260n.b(closeableG, i10);
                                i(closeableG);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    g(pairCreate, e0Var);
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f14082g != bVar) {
                        return;
                    }
                    this.f14082g = null;
                    this.f14081f = null;
                    i(this.f14078c);
                    this.f14078c = null;
                    q(p063g2.e.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void n(b bVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f14082g != bVar) {
                        return;
                    }
                    this.f14077b.clear();
                    U.this.k(this.f14076a, this);
                    i(this.f14078c);
                    this.f14078c = null;
                    for (Pair pair : this.f14077b) {
                        synchronized (pair) {
                            try {
                                ((e0) pair.second).x().k((e0) pair.second, U.this.f14074d, th, null);
                                C1251e c1251e = this.f14081f;
                                if (c1251e != null) {
                                    ((e0) pair.second).N(c1251e.getExtras());
                                }
                                ((InterfaceC1260n) pair.first).onFailure(th);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public void o(b bVar, Closeable closeable, int i10) {
            synchronized (this) {
                try {
                    if (this.f14082g != bVar) {
                        return;
                    }
                    i(this.f14078c);
                    this.f14078c = null;
                    int size = this.f14077b.size();
                    if (AbstractC1249c.e(i10)) {
                        this.f14078c = U.this.g(closeable);
                        this.f14080e = i10;
                    } else {
                        this.f14077b.clear();
                        U.this.k(this.f14076a, this);
                    }
                    for (Pair pair : this.f14077b) {
                        synchronized (pair) {
                            try {
                                if (AbstractC1249c.d(i10)) {
                                    ((e0) pair.second).x().j((e0) pair.second, U.this.f14074d, null);
                                    C1251e c1251e = this.f14081f;
                                    if (c1251e != null) {
                                        ((e0) pair.second).N(c1251e.getExtras());
                                    }
                                    ((e0) pair.second).v(U.this.f14075e, Integer.valueOf(size));
                                }
                                ((InterfaceC1260n) pair.first).b(closeable, i10);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void p(b bVar, float f10) {
            synchronized (this) {
                try {
                    if (this.f14082g != bVar) {
                        return;
                    }
                    this.f14079d = f10;
                    for (Pair pair : this.f14077b) {
                        synchronized (pair) {
                            ((InterfaceC1260n) pair.first).c(f10);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    protected U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    private synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f14071a.put(obj, aVar);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        a aVarI;
        boolean z9;
        try {
            if (V2.b.d()) {
                V2.b.a("MultiplexProducer#produceResults");
            }
            e0Var.x().d(e0Var, this.f14074d);
            Object objJ = j(e0Var);
            do {
                synchronized (this) {
                    try {
                        aVarI = i(objJ);
                        if (aVarI == null) {
                            aVarI = h(objJ);
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (!aVarI.h(interfaceC1260n, e0Var));
            if (z9) {
                aVarI.q(p063g2.e.e(e0Var.Q()));
            }
            if (V2.b.d()) {
                V2.b.b();
            }
        } catch (Throwable th2) {
            if (V2.b.d()) {
                V2.b.b();
            }
            throw th2;
        }
    }

    protected abstract Closeable g(Closeable closeable);

    protected synchronized a i(Object obj) {
        return (a) this.f14071a.get(obj);
    }

    protected abstract Object j(e0 e0Var);

    protected synchronized void k(Object obj, a aVar) {
        if (this.f14071a.get(obj) == aVar) {
            this.f14071a.remove(obj);
        }
    }

    protected U(d0 d0Var, String str, String str2, boolean z9) {
        this.f14072b = d0Var;
        this.f14071a = new HashMap();
        this.f14073c = z9;
        this.f14074d = str;
        this.f14075e = str2;
    }
}
