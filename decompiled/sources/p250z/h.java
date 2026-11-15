package p250z;

import p240y.e;

/* JADX INFO: loaded from: classes.dex */
class h extends m {
    public h(e eVar) {
        super(eVar);
        eVar.f50636e.f();
        eVar.f50638f.f();
        this.f50870f = ((p240y.h) eVar).K0();
    }

    private void q(f fVar) {
        this.f50872h.f50840k.add(fVar);
        fVar.f50841l.add(this.f50872h);
    }

    @Override // p250z.m, p250z.d
    public void a(d dVar) {
        f fVar = this.f50872h;
        if (fVar.f50832c && !fVar.f50839j) {
            this.f50872h.d((int) ((((f) fVar.f50841l.get(0)).f50836g * ((p240y.h) this.f50866b).N0()) + 0.5f));
        }
    }

    @Override // p250z.m
    void d() {
        p240y.h hVar = (p240y.h) this.f50866b;
        int iL0 = hVar.L0();
        int iM0 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            if (iL0 != -1) {
                this.f50872h.f50841l.add(this.f50866b.f50615N.f50636e.f50872h);
                this.f50866b.f50615N.f50636e.f50872h.f50840k.add(this.f50872h);
                this.f50872h.f50835f = iL0;
            } else if (iM0 != -1) {
                this.f50872h.f50841l.add(this.f50866b.f50615N.f50636e.f50873i);
                this.f50866b.f50615N.f50636e.f50873i.f50840k.add(this.f50872h);
                this.f50872h.f50835f = -iM0;
            } else {
                f fVar = this.f50872h;
                fVar.f50831b = true;
                fVar.f50841l.add(this.f50866b.f50615N.f50636e.f50873i);
                this.f50866b.f50615N.f50636e.f50873i.f50840k.add(this.f50872h);
            }
            q(this.f50866b.f50636e.f50872h);
            q(this.f50866b.f50636e.f50873i);
            return;
        }
        if (iL0 != -1) {
            this.f50872h.f50841l.add(this.f50866b.f50615N.f50638f.f50872h);
            this.f50866b.f50615N.f50638f.f50872h.f50840k.add(this.f50872h);
            this.f50872h.f50835f = iL0;
        } else if (iM0 != -1) {
            this.f50872h.f50841l.add(this.f50866b.f50615N.f50638f.f50873i);
            this.f50866b.f50615N.f50638f.f50873i.f50840k.add(this.f50872h);
            this.f50872h.f50835f = -iM0;
        } else {
            f fVar2 = this.f50872h;
            fVar2.f50831b = true;
            fVar2.f50841l.add(this.f50866b.f50615N.f50638f.f50873i);
            this.f50866b.f50615N.f50638f.f50873i.f50840k.add(this.f50872h);
        }
        q(this.f50866b.f50638f.f50872h);
        q(this.f50866b.f50638f.f50873i);
    }

    @Override // p250z.m
    public void e() {
        if (((p240y.h) this.f50866b).K0() == 1) {
            this.f50866b.F0(this.f50872h.f50836g);
        } else {
            this.f50866b.G0(this.f50872h.f50836g);
        }
    }

    @Override // p250z.m
    void f() {
        this.f50872h.c();
    }

    @Override // p250z.m
    boolean m() {
        return false;
    }
}
