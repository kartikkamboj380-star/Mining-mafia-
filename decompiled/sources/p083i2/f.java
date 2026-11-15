package p083i2;

import Y1.i;
import Y1.k;
import Y1.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45048a;

    private class a extends p083i2.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f45049h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f45050i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f45051j = null;

        /* JADX INFO: renamed from: i2.f$a$a, reason: collision with other inner class name */
        private class C0440a implements e {
            @Override // p083i2.e
            public void b(c cVar) {
                a.this.E(cVar);
            }

            @Override // p083i2.e
            public void c(c cVar) {
                if (cVar.b()) {
                    a.this.F(cVar);
                } else if (cVar.c()) {
                    a.this.E(cVar);
                }
            }

            @Override // p083i2.e
            public void d(c cVar) {
                a.this.s(Math.max(a.this.f(), cVar.f()));
            }

            private C0440a() {
            }

            @Override // p083i2.e
            public void a(c cVar) {
            }
        }

        public a() {
            if (H()) {
                return;
            }
            p(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private void A(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized c B() {
            return this.f45051j;
        }

        private synchronized n C() {
            if (k() || this.f45049h >= f.this.f45048a.size()) {
                return null;
            }
            List list = f.this.f45048a;
            int i10 = this.f45049h;
            this.f45049h = i10 + 1;
            return (n) list.get(i10);
        }

        private void D(c cVar, boolean z9) {
            c cVar2;
            synchronized (this) {
                if (cVar == this.f45050i && cVar != (cVar2 = this.f45051j)) {
                    if (cVar2 == null || z9) {
                        this.f45051j = cVar;
                    } else {
                        cVar2 = null;
                    }
                    A(cVar2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void E(c cVar) {
            if (z(cVar)) {
                if (cVar != B()) {
                    A(cVar);
                }
                if (H()) {
                    return;
                }
                q(cVar.d(), cVar.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void F(c cVar) {
            D(cVar, cVar.c());
            if (cVar == B()) {
                u(null, cVar.c(), cVar.getExtras());
            }
        }

        private synchronized boolean G(c cVar) {
            if (k()) {
                return false;
            }
            this.f45050i = cVar;
            return true;
        }

        private boolean H() {
            n nVarC = C();
            c cVar = nVarC != null ? (c) nVarC.get() : null;
            if (!G(cVar) || cVar == null) {
                A(cVar);
                return false;
            }
            cVar.e(new C0440a(), W1.a.a());
            return true;
        }

        private synchronized boolean z(c cVar) {
            if (!k() && cVar == this.f45050i) {
                this.f45050i = null;
                return true;
            }
            return false;
        }

        @Override // p083i2.a, p083i2.c
        public synchronized Object a() {
            c cVarB;
            cVarB = B();
            return cVarB != null ? cVarB.a() : null;
        }

        @Override // p083i2.a, p083i2.c
        public synchronized boolean b() {
            c cVarB;
            cVarB = B();
            return cVarB != null && cVarB.b();
        }

        @Override // p083i2.a, p083i2.c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c cVar = this.f45050i;
                    this.f45050i = null;
                    c cVar2 = this.f45051j;
                    this.f45051j = null;
                    A(cVar2);
                    A(cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private f(List list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f45048a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    @Override // Y1.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return i.a(this.f45048a, ((f) obj).f45048a);
        }
        return false;
    }

    public int hashCode() {
        return this.f45048a.hashCode();
    }

    public String toString() {
        return i.b(this).b("list", this.f45048a).toString();
    }
}
