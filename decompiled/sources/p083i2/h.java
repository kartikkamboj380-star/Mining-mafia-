package p083i2;

import Y1.i;
import Y1.k;
import Y1.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45055b;

    private h(List list, boolean z9) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f45054a = list;
        this.f45055b = z9;
    }

    public static h c(List list, boolean z9) {
        return new h(list, z9);
    }

    @Override // Y1.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return i.a(this.f45054a, ((h) obj).f45054a);
        }
        return false;
    }

    public int hashCode() {
        return this.f45054a.hashCode();
    }

    public String toString() {
        return i.b(this).b("list", this.f45054a).toString();
    }

    private class a extends p083i2.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ArrayList f45056h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f45057i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f45058j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private AtomicInteger f45059k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Throwable f45060l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Map f45061m;

        public a() {
            if (h.this.f45055b) {
                return;
            }
            A();
        }

        private void A() {
            if (this.f45059k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f45059k == null) {
                        this.f45059k = new AtomicInteger(0);
                        int size = h.this.f45054a.size();
                        this.f45058j = size;
                        this.f45057i = size;
                        this.f45056h = new ArrayList(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            c cVar = (c) ((n) h.this.f45054a.get(i10)).get();
                            this.f45056h.add(cVar);
                            cVar.e(new C0441a(i10), W1.a.a());
                            if (cVar.b()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private synchronized c B(int i10) {
            c cVar;
            ArrayList arrayList = this.f45056h;
            cVar = null;
            if (arrayList != null && i10 < arrayList.size()) {
                cVar = (c) this.f45056h.set(i10, null);
            }
            return cVar;
        }

        private synchronized c C(int i10) {
            ArrayList arrayList;
            arrayList = this.f45056h;
            return (arrayList == null || i10 >= arrayList.size()) ? null : (c) this.f45056h.get(i10);
        }

        private synchronized c D() {
            return C(this.f45057i);
        }

        private void E() {
            Throwable th;
            if (this.f45059k.incrementAndGet() != this.f45058j || (th = this.f45060l) == null) {
                return;
            }
            q(th, this.f45061m);
        }

        private void F(int i10, c cVar, boolean z9) {
            synchronized (this) {
                try {
                    int i11 = this.f45057i;
                    if (cVar == C(i10) && i10 != this.f45057i) {
                        if (D() == null || (z9 && i10 < this.f45057i)) {
                            this.f45057i = i10;
                        } else {
                            i10 = i11;
                        }
                        while (i11 > i10) {
                            z(B(i11));
                            i11--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void G(int i10, c cVar) {
            z(I(i10, cVar));
            if (i10 == 0) {
                this.f45060l = cVar.d();
                this.f45061m = cVar.getExtras();
            }
            E();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void H(int i10, c cVar) {
            F(i10, cVar, cVar.c());
            if (cVar == D()) {
                u(null, i10 == 0 && cVar.c(), cVar.getExtras());
            }
            E();
        }

        private synchronized c I(int i10, c cVar) {
            if (cVar == D()) {
                return null;
            }
            if (cVar != C(i10)) {
                return cVar;
            }
            return B(i10);
        }

        private void z(c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        @Override // p083i2.a, p083i2.c
        public synchronized Object a() {
            c cVarD;
            try {
                if (h.this.f45055b) {
                    A();
                }
                cVarD = D();
            } catch (Throwable th) {
                throw th;
            }
            return cVarD != null ? cVarD.a() : null;
        }

        @Override // p083i2.a, p083i2.c
        public synchronized boolean b() {
            c cVarD;
            try {
                if (h.this.f45055b) {
                    A();
                }
                cVarD = D();
            } catch (Throwable th) {
                throw th;
            }
            return cVarD != null && cVarD.b();
        }

        @Override // p083i2.a, p083i2.c
        public boolean close() {
            if (h.this.f45055b) {
                A();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList arrayList = this.f45056h;
                    this.f45056h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        z((c) arrayList.get(i10));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: i2.h$a$a, reason: collision with other inner class name */
        private class C0441a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f45063a;

            public C0441a(int i10) {
                this.f45063a = i10;
            }

            @Override // p083i2.e
            public void b(c cVar) {
                a.this.G(this.f45063a, cVar);
            }

            @Override // p083i2.e
            public void c(c cVar) {
                if (cVar.b()) {
                    a.this.H(this.f45063a, cVar);
                } else if (cVar.c()) {
                    a.this.G(this.f45063a, cVar);
                }
            }

            @Override // p083i2.e
            public void d(c cVar) {
                if (this.f45063a == 0) {
                    a.this.s(cVar.f());
                }
            }

            @Override // p083i2.e
            public void a(c cVar) {
            }
        }
    }
}
