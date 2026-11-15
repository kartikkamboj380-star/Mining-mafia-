package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p190t.k f10746a = new p190t.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p190t.h f10747b = new p190t.h();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static N.d f10748d = new Pools$SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.m.b f10750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.m.b f10751c;

        private a() {
        }

        static void a() {
            while (f10748d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f10748d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f10749a = 0;
            aVar.f10750b = null;
            aVar.f10751c = null;
            f10748d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.D d10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void b(RecyclerView.D d10);

        void c(RecyclerView.D d10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);

        void d(RecyclerView.D d10, RecyclerView.m.b bVar, RecyclerView.m.b bVar2);
    }

    p() {
    }

    private RecyclerView.m.b l(RecyclerView.D d10, int i10) {
        a aVar;
        RecyclerView.m.b bVar;
        int iE = this.f10746a.e(d10);
        if (iE >= 0 && (aVar = (a) this.f10746a.k(iE)) != null) {
            int i11 = aVar.f10749a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f10749a = i12;
                if (i10 == 4) {
                    bVar = aVar.f10750b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f10751c;
                }
                if ((i12 & 12) == 0) {
                    this.f10746a.i(iE);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.D d10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f10746a.get(d10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10746a.put(d10, aVarB);
        }
        aVarB.f10749a |= 2;
        aVarB.f10750b = bVar;
    }

    void b(RecyclerView.D d10) {
        a aVarB = (a) this.f10746a.get(d10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10746a.put(d10, aVarB);
        }
        aVarB.f10749a |= 1;
    }

    void c(long j10, RecyclerView.D d10) {
        this.f10747b.g(j10, d10);
    }

    void d(RecyclerView.D d10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f10746a.get(d10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10746a.put(d10, aVarB);
        }
        aVarB.f10751c = bVar;
        aVarB.f10749a |= 8;
    }

    void e(RecyclerView.D d10, RecyclerView.m.b bVar) {
        a aVarB = (a) this.f10746a.get(d10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f10746a.put(d10, aVarB);
        }
        aVarB.f10750b = bVar;
        aVarB.f10749a |= 4;
    }

    void f() {
        this.f10746a.clear();
        this.f10747b.b();
    }

    RecyclerView.D g(long j10) {
        return (RecyclerView.D) this.f10747b.d(j10);
    }

    boolean h(RecyclerView.D d10) {
        a aVar = (a) this.f10746a.get(d10);
        return (aVar == null || (aVar.f10749a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.D d10) {
        a aVar = (a) this.f10746a.get(d10);
        return (aVar == null || (aVar.f10749a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.D d10) {
        p(d10);
    }

    RecyclerView.m.b m(RecyclerView.D d10) {
        return l(d10, 8);
    }

    RecyclerView.m.b n(RecyclerView.D d10) {
        return l(d10, 4);
    }

    void o(b bVar) {
        for (int size = this.f10746a.size() - 1; size >= 0; size--) {
            RecyclerView.D d10 = (RecyclerView.D) this.f10746a.g(size);
            a aVar = (a) this.f10746a.i(size);
            int i10 = aVar.f10749a;
            if ((i10 & 3) == 3) {
                bVar.b(d10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.b bVar2 = aVar.f10750b;
                if (bVar2 == null) {
                    bVar.b(d10);
                } else {
                    bVar.c(d10, bVar2, aVar.f10751c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(d10, aVar.f10750b, aVar.f10751c);
            } else if ((i10 & 12) == 12) {
                bVar.d(d10, aVar.f10750b, aVar.f10751c);
            } else if ((i10 & 4) != 0) {
                bVar.c(d10, aVar.f10750b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(d10, aVar.f10750b, aVar.f10751c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.D d10) {
        a aVar = (a) this.f10746a.get(d10);
        if (aVar == null) {
            return;
        }
        aVar.f10749a &= -2;
    }

    void q(RecyclerView.D d10) {
        for (int iK = this.f10747b.k() - 1; iK >= 0; iK--) {
            if (d10 == this.f10747b.l(iK)) {
                this.f10747b.i(iK);
                break;
            }
        }
        a aVar = (a) this.f10746a.remove(d10);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
