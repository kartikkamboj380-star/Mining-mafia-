package androidx.lifecycle;

import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1177x {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f10248k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f10249a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p150p.b f10250b = new p150p.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f10251c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f10253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f10254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f10258j;

    /* JADX INFO: renamed from: androidx.lifecycle.x$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1177x.this.f10249a) {
                obj = AbstractC1177x.this.f10254f;
                AbstractC1177x.this.f10254f = AbstractC1177x.f10248k;
            }
            AbstractC1177x.this.n(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$b */
    private class b extends d {
        b(A a10) {
            super(a10);
        }

        @Override // androidx.lifecycle.AbstractC1177x.d
        boolean e() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$c */
    class c extends d implements InterfaceC1168n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final r f10261e;

        c(r rVar, A a10) {
            super(a10);
            this.f10261e = rVar;
        }

        @Override // androidx.lifecycle.AbstractC1177x.d
        void b() {
            this.f10261e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.AbstractC1177x.d
        boolean d(r rVar) {
            return this.f10261e == rVar;
        }

        @Override // androidx.lifecycle.AbstractC1177x.d
        boolean e() {
            return this.f10261e.getLifecycle().b().d(AbstractC1164j.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1168n
        public void onStateChanged(r rVar, AbstractC1164j.a aVar) {
            AbstractC1164j.b bVarB = this.f10261e.getLifecycle().b();
            if (bVarB == AbstractC1164j.b.DESTROYED) {
                AbstractC1177x.this.m(this.f10263a);
                return;
            }
            AbstractC1164j.b bVar = null;
            while (bVar != bVarB) {
                a(e());
                bVar = bVarB;
                bVarB = this.f10261e.getLifecycle().b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$d */
    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final A f10263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f10264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10265c = -1;

        d(A a10) {
            this.f10263a = a10;
        }

        void a(boolean z9) {
            if (z9 == this.f10264b) {
                return;
            }
            this.f10264b = z9;
            AbstractC1177x.this.c(z9 ? 1 : -1);
            if (this.f10264b) {
                AbstractC1177x.this.e(this);
            }
        }

        void b() {
        }

        boolean d(r rVar) {
            return false;
        }

        abstract boolean e();
    }

    public AbstractC1177x() {
        Object obj = f10248k;
        this.f10254f = obj;
        this.f10258j = new a();
        this.f10253e = obj;
        this.f10255g = -1;
    }

    static void b(String str) {
        if (p140o.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f10264b) {
            if (!dVar.e()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f10265c;
            int i11 = this.f10255g;
            if (i10 >= i11) {
                return;
            }
            dVar.f10265c = i11;
            dVar.f10263a.a(this.f10253e);
        }
    }

    void c(int i10) {
        int i11 = this.f10251c;
        this.f10251c = i10 + i11;
        if (this.f10252d) {
            return;
        }
        this.f10252d = true;
        while (true) {
            try {
                int i12 = this.f10251c;
                if (i11 == i12) {
                    this.f10252d = false;
                    return;
                }
                boolean z9 = i11 == 0 && i12 > 0;
                boolean z10 = i11 > 0 && i12 == 0;
                if (z9) {
                    j();
                } else if (z10) {
                    k();
                }
                i11 = i12;
            } catch (Throwable th) {
                this.f10252d = false;
                throw th;
            }
        }
    }

    void e(d dVar) {
        if (this.f10256h) {
            this.f10257i = true;
            return;
        }
        this.f10256h = true;
        do {
            this.f10257i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                p.b.d dVarD = this.f10250b.d();
                while (dVarD.hasNext()) {
                    d((d) ((Map.Entry) dVarD.next()).getValue());
                    if (this.f10257i) {
                        break;
                    }
                }
            }
        } while (this.f10257i);
        this.f10256h = false;
    }

    public Object f() {
        Object obj = this.f10253e;
        if (obj != f10248k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.f10251c > 0;
    }

    public void h(r rVar, A a10) {
        b("observe");
        if (rVar.getLifecycle().b() == AbstractC1164j.b.DESTROYED) {
            return;
        }
        c cVar = new c(rVar, a10);
        d dVar = (d) this.f10250b.i(a10, cVar);
        if (dVar != null && !dVar.d(rVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        rVar.getLifecycle().a(cVar);
    }

    public void i(A a10) {
        b("observeForever");
        b bVar = new b(a10);
        d dVar = (d) this.f10250b.i(a10, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void j() {
    }

    protected void k() {
    }

    protected void l(Object obj) {
        boolean z9;
        synchronized (this.f10249a) {
            z9 = this.f10254f == f10248k;
            this.f10254f = obj;
        }
        if (z9) {
            p140o.c.g().c(this.f10258j);
        }
    }

    public void m(A a10) {
        b("removeObserver");
        d dVar = (d) this.f10250b.j(a10);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void n(Object obj) {
        b("setValue");
        this.f10255g++;
        this.f10253e = obj;
        e(null);
    }
}
