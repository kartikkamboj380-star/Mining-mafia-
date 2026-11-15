package p250z;

import com.unity3d.services.UnityAdsConstants;
import p240y.d;
import p240y.e;
import p240y.i;

/* JADX INFO: loaded from: classes.dex */
public class l extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f50862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f50863l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50864a;

        static {
            int[] iArr = new int[m.b.values().length];
            f50864a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50864a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50864a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f50862k = fVar;
        this.f50863l = null;
        this.f50872h.f50834e = f.a.TOP;
        this.f50873i.f50834e = f.a.BOTTOM;
        fVar.f50834e = f.a.BASELINE;
        this.f50870f = 1;
    }

    @Override // p250z.m, p250z.d
    public void a(d dVar) {
        float f10;
        float fT;
        float fT2;
        int i10;
        int i11 = a.f50864a[this.f50874j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            e eVar = this.f50866b;
            n(dVar, eVar.f50604C, eVar.f50606E, 1);
            return;
        }
        g gVar = this.f50869e;
        if (gVar.f50832c && !gVar.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f50866b;
            int i12 = eVar2.f50652m;
            if (i12 == 2) {
                e eVarG = eVar2.G();
                if (eVarG != null) {
                    g gVar2 = eVarG.f50638f.f50869e;
                    if (gVar2.f50839j) {
                        this.f50869e.d((int) ((gVar2.f50836g * this.f50866b.f50666t) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f50636e.f50869e.f50839j) {
                int iU = eVar2.u();
                if (iU != -1) {
                    if (iU == 0) {
                        e eVar3 = this.f50866b;
                        fT2 = eVar3.f50636e.f50869e.f50836g * eVar3.t();
                        i10 = (int) (fT2 + 0.5f);
                    } else if (iU != 1) {
                        i10 = 0;
                    } else {
                        e eVar4 = this.f50866b;
                        f10 = eVar4.f50636e.f50869e.f50836g;
                        fT = eVar4.t();
                    }
                    this.f50869e.d(i10);
                } else {
                    e eVar5 = this.f50866b;
                    f10 = eVar5.f50636e.f50869e.f50836g;
                    fT = eVar5.t();
                }
                fT2 = f10 / fT;
                i10 = (int) (fT2 + 0.5f);
                this.f50869e.d(i10);
            }
        }
        f fVar = this.f50872h;
        if (fVar.f50832c) {
            f fVar2 = this.f50873i;
            if (fVar2.f50832c) {
                if (fVar.f50839j && fVar2.f50839j && this.f50869e.f50839j) {
                    return;
                }
                if (!this.f50869e.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT) {
                    e eVar6 = this.f50866b;
                    if (eVar6.f50650l == 0 && !eVar6.X()) {
                        f fVar3 = (f) this.f50872h.f50841l.get(0);
                        f fVar4 = (f) this.f50873i.f50841l.get(0);
                        int i13 = fVar3.f50836g;
                        f fVar5 = this.f50872h;
                        int i14 = i13 + fVar5.f50835f;
                        int i15 = fVar4.f50836g + this.f50873i.f50835f;
                        fVar5.d(i14);
                        this.f50873i.d(i15);
                        this.f50869e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f50869e.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT && this.f50865a == 1 && this.f50872h.f50841l.size() > 0 && this.f50873i.f50841l.size() > 0) {
                    f fVar6 = (f) this.f50872h.f50841l.get(0);
                    int i16 = (((f) this.f50873i.f50841l.get(0)).f50836g + this.f50873i.f50835f) - (fVar6.f50836g + this.f50872h.f50835f);
                    g gVar3 = this.f50869e;
                    int i17 = gVar3.f50851m;
                    if (i16 < i17) {
                        gVar3.d(i16);
                    } else {
                        gVar3.d(i17);
                    }
                }
                if (this.f50869e.f50839j && this.f50872h.f50841l.size() > 0 && this.f50873i.f50841l.size() > 0) {
                    f fVar7 = (f) this.f50872h.f50841l.get(0);
                    f fVar8 = (f) this.f50873i.f50841l.get(0);
                    int i18 = fVar7.f50836g + this.f50872h.f50835f;
                    int i19 = fVar8.f50836g + this.f50873i.f50835f;
                    float fK = this.f50866b.K();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f50836g;
                        i19 = fVar8.f50836g;
                        fK = 0.5f;
                    }
                    this.f50872h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f50869e.f50836g) * fK)));
                    this.f50873i.d(this.f50872h.f50836g + this.f50869e.f50836g);
                }
            }
        }
    }

    @Override // p250z.m
    void d() {
        e eVarG;
        e eVarG2;
        e eVar = this.f50866b;
        if (eVar.f50628a) {
            this.f50869e.d(eVar.v());
        }
        if (!this.f50869e.f50839j) {
            this.f50868d = this.f50866b.M();
            if (this.f50866b.S()) {
                this.f50863l = new p250z.a(this);
            }
            e.b bVar = this.f50868d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarG2 = this.f50866b.G()) != null && eVarG2.M() == e.b.FIXED) {
                    int iV = (eVarG2.v() - this.f50866b.f50604C.c()) - this.f50866b.f50606E.c();
                    b(this.f50872h, eVarG2.f50638f.f50872h, this.f50866b.f50604C.c());
                    b(this.f50873i, eVarG2.f50638f.f50873i, -this.f50866b.f50606E.c());
                    this.f50869e.d(iV);
                    return;
                }
                if (this.f50868d == e.b.FIXED) {
                    this.f50869e.d(this.f50866b.v());
                }
            }
        } else if (this.f50868d == e.b.MATCH_PARENT && (eVarG = this.f50866b.G()) != null && eVarG.M() == e.b.FIXED) {
            b(this.f50872h, eVarG.f50638f.f50872h, this.f50866b.f50604C.c());
            b(this.f50873i, eVarG.f50638f.f50873i, -this.f50866b.f50606E.c());
            return;
        }
        g gVar = this.f50869e;
        boolean z9 = gVar.f50839j;
        if (z9) {
            e eVar2 = this.f50866b;
            if (eVar2.f50628a) {
                d[] dVarArr = eVar2.f50611J;
                d dVar = dVarArr[2];
                d dVar2 = dVar.f50586d;
                if (dVar2 != null && dVarArr[3].f50586d != null) {
                    if (eVar2.X()) {
                        this.f50872h.f50835f = this.f50866b.f50611J[2].c();
                        this.f50873i.f50835f = -this.f50866b.f50611J[3].c();
                    } else {
                        f fVarH = h(this.f50866b.f50611J[2]);
                        if (fVarH != null) {
                            b(this.f50872h, fVarH, this.f50866b.f50611J[2].c());
                        }
                        f fVarH2 = h(this.f50866b.f50611J[3]);
                        if (fVarH2 != null) {
                            b(this.f50873i, fVarH2, -this.f50866b.f50611J[3].c());
                        }
                        this.f50872h.f50831b = true;
                        this.f50873i.f50831b = true;
                    }
                    if (this.f50866b.S()) {
                        b(this.f50862k, this.f50872h, this.f50866b.n());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f50872h, fVarH3, this.f50866b.f50611J[2].c());
                        b(this.f50873i, this.f50872h, this.f50869e.f50836g);
                        if (this.f50866b.S()) {
                            b(this.f50862k, this.f50872h, this.f50866b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                d dVar3 = dVarArr[3];
                if (dVar3.f50586d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f50873i, fVarH4, -this.f50866b.f50611J[3].c());
                        b(this.f50872h, this.f50873i, -this.f50869e.f50836g);
                    }
                    if (this.f50866b.S()) {
                        b(this.f50862k, this.f50872h, this.f50866b.n());
                        return;
                    }
                    return;
                }
                d dVar4 = dVarArr[4];
                if (dVar4.f50586d != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f50862k, fVarH5, 0);
                        b(this.f50872h, this.f50862k, -this.f50866b.n());
                        b(this.f50873i, this.f50872h, this.f50869e.f50836g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof i) || eVar2.G() == null || this.f50866b.m(d.b.CENTER).f50586d != null) {
                    return;
                }
                b(this.f50872h, this.f50866b.G().f50638f.f50872h, this.f50866b.R());
                b(this.f50873i, this.f50872h, this.f50869e.f50836g);
                if (this.f50866b.S()) {
                    b(this.f50862k, this.f50872h, this.f50866b.n());
                    return;
                }
                return;
            }
        }
        if (z9 || this.f50868d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            e eVar3 = this.f50866b;
            int i10 = eVar3.f50652m;
            if (i10 == 2) {
                e eVarG3 = eVar3.G();
                if (eVarG3 != null) {
                    g gVar2 = eVarG3.f50638f.f50869e;
                    this.f50869e.f50841l.add(gVar2);
                    gVar2.f50840k.add(this.f50869e);
                    g gVar3 = this.f50869e;
                    gVar3.f50831b = true;
                    gVar3.f50840k.add(this.f50872h);
                    this.f50869e.f50840k.add(this.f50873i);
                }
            } else if (i10 == 3 && !eVar3.X()) {
                e eVar4 = this.f50866b;
                if (eVar4.f50650l != 3) {
                    g gVar4 = eVar4.f50636e.f50869e;
                    this.f50869e.f50841l.add(gVar4);
                    gVar4.f50840k.add(this.f50869e);
                    g gVar5 = this.f50869e;
                    gVar5.f50831b = true;
                    gVar5.f50840k.add(this.f50872h);
                    this.f50869e.f50840k.add(this.f50873i);
                }
            }
        }
        e eVar5 = this.f50866b;
        d[] dVarArr2 = eVar5.f50611J;
        d dVar5 = dVarArr2[2];
        d dVar6 = dVar5.f50586d;
        if (dVar6 != null && dVarArr2[3].f50586d != null) {
            if (eVar5.X()) {
                this.f50872h.f50835f = this.f50866b.f50611J[2].c();
                this.f50873i.f50835f = -this.f50866b.f50611J[3].c();
            } else {
                f fVarH6 = h(this.f50866b.f50611J[2]);
                f fVarH7 = h(this.f50866b.f50611J[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f50874j = m.b.CENTER;
            }
            if (this.f50866b.S()) {
                c(this.f50862k, this.f50872h, 1, this.f50863l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f50872h, fVarH8, this.f50866b.f50611J[2].c());
                c(this.f50873i, this.f50872h, 1, this.f50869e);
                if (this.f50866b.S()) {
                    c(this.f50862k, this.f50872h, 1, this.f50863l);
                }
                e.b bVar2 = this.f50868d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f50866b.t() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    j jVar = this.f50866b.f50636e;
                    if (jVar.f50868d == bVar3) {
                        jVar.f50869e.f50840k.add(this.f50869e);
                        this.f50869e.f50841l.add(this.f50866b.f50636e.f50869e);
                        this.f50869e.f50830a = this;
                    }
                }
            }
        } else {
            d dVar7 = dVarArr2[3];
            if (dVar7.f50586d != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f50873i, fVarH9, -this.f50866b.f50611J[3].c());
                    c(this.f50872h, this.f50873i, -1, this.f50869e);
                    if (this.f50866b.S()) {
                        c(this.f50862k, this.f50872h, 1, this.f50863l);
                    }
                }
            } else {
                d dVar8 = dVarArr2[4];
                if (dVar8.f50586d != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f50862k, fVarH10, 0);
                        c(this.f50872h, this.f50862k, -1, this.f50863l);
                        c(this.f50873i, this.f50872h, 1, this.f50869e);
                    }
                } else if (!(eVar5 instanceof i) && eVar5.G() != null) {
                    b(this.f50872h, this.f50866b.G().f50638f.f50872h, this.f50866b.R());
                    c(this.f50873i, this.f50872h, 1, this.f50869e);
                    if (this.f50866b.S()) {
                        c(this.f50862k, this.f50872h, 1, this.f50863l);
                    }
                    e.b bVar4 = this.f50868d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f50866b.t() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        j jVar2 = this.f50866b.f50636e;
                        if (jVar2.f50868d == bVar5) {
                            jVar2.f50869e.f50840k.add(this.f50869e);
                            this.f50869e.f50841l.add(this.f50866b.f50636e.f50869e);
                            this.f50869e.f50830a = this;
                        }
                    }
                }
            }
        }
        if (this.f50869e.f50841l.size() == 0) {
            this.f50869e.f50832c = true;
        }
    }

    @Override // p250z.m
    public void e() {
        f fVar = this.f50872h;
        if (fVar.f50839j) {
            this.f50866b.G0(fVar.f50836g);
        }
    }

    @Override // p250z.m
    void f() {
        this.f50867c = null;
        this.f50872h.c();
        this.f50873i.c();
        this.f50862k.c();
        this.f50869e.c();
        this.f50871g = false;
    }

    @Override // p250z.m
    boolean m() {
        return this.f50868d != e.b.MATCH_CONSTRAINT || this.f50866b.f50652m == 0;
    }

    void q() {
        this.f50871g = false;
        this.f50872h.c();
        this.f50872h.f50839j = false;
        this.f50873i.c();
        this.f50873i.f50839j = false;
        this.f50862k.c();
        this.f50862k.f50839j = false;
        this.f50869e.f50839j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f50866b.r();
    }
}
