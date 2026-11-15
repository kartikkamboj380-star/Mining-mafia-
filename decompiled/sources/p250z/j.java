package p250z;

import p240y.d;
import p240y.e;
import p240y.i;

/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int[] f50852k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50853a;

        static {
            int[] iArr = new int[m.b.values().length];
            f50853a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50853a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50853a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(e eVar) {
        super(eVar);
        this.f50872h.f50834e = f.a.LEFT;
        this.f50873i.f50834e = f.a.RIGHT;
        this.f50870f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // p250z.m, p250z.d
    public void a(d dVar) {
        int iG;
        int i10;
        int iG2;
        float f10;
        float fT;
        float fT2;
        int i11;
        int i12 = a.f50853a[this.f50874j.ordinal()];
        if (i12 == 1) {
            p(dVar);
        } else if (i12 == 2) {
            o(dVar);
        } else if (i12 == 3) {
            e eVar = this.f50866b;
            n(dVar, eVar.f50603B, eVar.f50605D, 0);
            return;
        }
        if (!this.f50869e.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f50866b;
            int i13 = eVar2.f50650l;
            if (i13 == 2) {
                e eVarG = eVar2.G();
                if (eVarG != null) {
                    g gVar = eVarG.f50636e.f50869e;
                    if (gVar.f50839j) {
                        this.f50869e.d((int) ((gVar.f50836g * this.f50866b.f50660q) + 0.5f));
                    }
                }
            } else if (i13 == 3) {
                int i14 = eVar2.f50652m;
                if (i14 == 0 || i14 == 3) {
                    l lVar = eVar2.f50638f;
                    f fVar = lVar.f50872h;
                    f fVar2 = lVar.f50873i;
                    boolean z9 = eVar2.f50603B.f50586d != null;
                    boolean z10 = eVar2.f50604C.f50586d != null;
                    boolean z11 = eVar2.f50605D.f50586d != null;
                    boolean z12 = eVar2.f50606E.f50586d != null;
                    int iU = eVar2.u();
                    if (z9 && z10 && z11 && z12) {
                        float fT3 = this.f50866b.t();
                        if (fVar.f50839j && fVar2.f50839j) {
                            f fVar3 = this.f50872h;
                            if (fVar3.f50832c && this.f50873i.f50832c) {
                                q(f50852k, this.f50872h.f50835f + ((f) fVar3.f50841l.get(0)).f50836g, ((f) this.f50873i.f50841l.get(0)).f50836g - this.f50873i.f50835f, fVar.f50835f + fVar.f50836g, fVar2.f50836g - fVar2.f50835f, fT3, iU);
                                this.f50869e.d(f50852k[0]);
                                this.f50866b.f50638f.f50869e.d(f50852k[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f50872h;
                        if (fVar4.f50839j) {
                            f fVar5 = this.f50873i;
                            if (fVar5.f50839j) {
                                if (!fVar.f50832c || !fVar2.f50832c) {
                                    return;
                                }
                                q(f50852k, fVar4.f50836g + fVar4.f50835f, fVar5.f50836g - fVar5.f50835f, fVar.f50835f + ((f) fVar.f50841l.get(0)).f50836g, ((f) fVar2.f50841l.get(0)).f50836g - fVar2.f50835f, fT3, iU);
                                this.f50869e.d(f50852k[0]);
                                this.f50866b.f50638f.f50869e.d(f50852k[1]);
                            }
                        }
                        f fVar6 = this.f50872h;
                        if (!fVar6.f50832c || !this.f50873i.f50832c || !fVar.f50832c || !fVar2.f50832c) {
                            return;
                        }
                        q(f50852k, this.f50872h.f50835f + ((f) fVar6.f50841l.get(0)).f50836g, ((f) this.f50873i.f50841l.get(0)).f50836g - this.f50873i.f50835f, fVar.f50835f + ((f) fVar.f50841l.get(0)).f50836g, ((f) fVar2.f50841l.get(0)).f50836g - fVar2.f50835f, fT3, iU);
                        this.f50869e.d(f50852k[0]);
                        this.f50866b.f50638f.f50869e.d(f50852k[1]);
                    } else if (z9 && z11) {
                        if (!this.f50872h.f50832c || !this.f50873i.f50832c) {
                            return;
                        }
                        float fT4 = this.f50866b.t();
                        int i15 = ((f) this.f50872h.f50841l.get(0)).f50836g + this.f50872h.f50835f;
                        int i16 = ((f) this.f50873i.f50841l.get(0)).f50836g - this.f50873i.f50835f;
                        if (iU == -1 || iU == 0) {
                            int iG3 = g(i16 - i15, 0);
                            int i17 = (int) ((iG3 * fT4) + 0.5f);
                            int iG4 = g(i17, 1);
                            if (i17 != iG4) {
                                iG3 = (int) ((iG4 / fT4) + 0.5f);
                            }
                            this.f50869e.d(iG3);
                            this.f50866b.f50638f.f50869e.d(iG4);
                        } else if (iU == 1) {
                            int iG5 = g(i16 - i15, 0);
                            int i18 = (int) ((iG5 / fT4) + 0.5f);
                            int iG6 = g(i18, 1);
                            if (i18 != iG6) {
                                iG5 = (int) ((iG6 * fT4) + 0.5f);
                            }
                            this.f50869e.d(iG5);
                            this.f50866b.f50638f.f50869e.d(iG6);
                        }
                    } else if (z10 && z12) {
                        if (!fVar.f50832c || !fVar2.f50832c) {
                            return;
                        }
                        float fT5 = this.f50866b.t();
                        int i19 = ((f) fVar.f50841l.get(0)).f50836g + fVar.f50835f;
                        int i20 = ((f) fVar2.f50841l.get(0)).f50836g - fVar2.f50835f;
                        if (iU == -1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fT5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fT5) + 0.5f);
                            }
                            this.f50869e.d(iG2);
                            this.f50866b.f50638f.f50869e.d(iG);
                        } else if (iU == 0) {
                            int iG7 = g(i20 - i19, 1);
                            int i21 = (int) ((iG7 * fT5) + 0.5f);
                            int iG8 = g(i21, 0);
                            if (i21 != iG8) {
                                iG7 = (int) ((iG8 / fT5) + 0.5f);
                            }
                            this.f50869e.d(iG8);
                            this.f50866b.f50638f.f50869e.d(iG7);
                        } else if (iU == 1) {
                            iG = g(i20 - i19, 1);
                            i10 = (int) ((iG / fT5) + 0.5f);
                            iG2 = g(i10, 0);
                            if (i10 != iG2) {
                                iG = (int) ((iG2 * fT5) + 0.5f);
                            }
                            this.f50869e.d(iG2);
                            this.f50866b.f50638f.f50869e.d(iG);
                        }
                    }
                } else {
                    int iU2 = eVar2.u();
                    if (iU2 != -1) {
                        if (iU2 == 0) {
                            e eVar3 = this.f50866b;
                            fT2 = eVar3.f50638f.f50869e.f50836g / eVar3.t();
                            i11 = (int) (fT2 + 0.5f);
                        } else if (iU2 != 1) {
                            i11 = 0;
                        } else {
                            e eVar4 = this.f50866b;
                            f10 = eVar4.f50638f.f50869e.f50836g;
                            fT = eVar4.t();
                        }
                        this.f50869e.d(i11);
                    } else {
                        e eVar5 = this.f50866b;
                        f10 = eVar5.f50638f.f50869e.f50836g;
                        fT = eVar5.t();
                    }
                    fT2 = f10 * fT;
                    i11 = (int) (fT2 + 0.5f);
                    this.f50869e.d(i11);
                }
            }
        }
        f fVar7 = this.f50872h;
        if (fVar7.f50832c) {
            f fVar8 = this.f50873i;
            if (fVar8.f50832c) {
                if (fVar7.f50839j && fVar8.f50839j && this.f50869e.f50839j) {
                    return;
                }
                if (!this.f50869e.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT) {
                    e eVar6 = this.f50866b;
                    if (eVar6.f50650l == 0 && !eVar6.V()) {
                        f fVar9 = (f) this.f50872h.f50841l.get(0);
                        f fVar10 = (f) this.f50873i.f50841l.get(0);
                        int i22 = fVar9.f50836g;
                        f fVar11 = this.f50872h;
                        int i23 = i22 + fVar11.f50835f;
                        int i24 = fVar10.f50836g + this.f50873i.f50835f;
                        fVar11.d(i23);
                        this.f50873i.d(i24);
                        this.f50869e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f50869e.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT && this.f50865a == 1 && this.f50872h.f50841l.size() > 0 && this.f50873i.f50841l.size() > 0) {
                    int iMin = Math.min((((f) this.f50873i.f50841l.get(0)).f50836g + this.f50873i.f50835f) - (((f) this.f50872h.f50841l.get(0)).f50836g + this.f50872h.f50835f), this.f50869e.f50851m);
                    e eVar7 = this.f50866b;
                    int i25 = eVar7.f50658p;
                    int iMax = Math.max(eVar7.f50656o, iMin);
                    if (i25 > 0) {
                        iMax = Math.min(i25, iMax);
                    }
                    this.f50869e.d(iMax);
                }
                if (this.f50869e.f50839j) {
                    f fVar12 = (f) this.f50872h.f50841l.get(0);
                    f fVar13 = (f) this.f50873i.f50841l.get(0);
                    int i26 = fVar12.f50836g + this.f50872h.f50835f;
                    int i27 = fVar13.f50836g + this.f50873i.f50835f;
                    float fW = this.f50866b.w();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f50836g;
                        i27 = fVar13.f50836g;
                        fW = 0.5f;
                    }
                    this.f50872h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f50869e.f50836g) * fW)));
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
            this.f50869e.d(eVar.P());
        }
        if (this.f50869e.f50839j) {
            e.b bVar = this.f50868d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarG = this.f50866b.G()) != null && eVarG.y() == e.b.FIXED) || eVarG.y() == bVar2)) {
                b(this.f50872h, eVarG.f50636e.f50872h, this.f50866b.f50603B.c());
                b(this.f50873i, eVarG.f50636e.f50873i, -this.f50866b.f50605D.c());
                return;
            }
        } else {
            e.b bVarY = this.f50866b.y();
            this.f50868d = bVarY;
            if (bVarY != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((eVarG2 = this.f50866b.G()) != null && eVarG2.y() == e.b.FIXED) || eVarG2.y() == bVar3)) {
                    int iP = (eVarG2.P() - this.f50866b.f50603B.c()) - this.f50866b.f50605D.c();
                    b(this.f50872h, eVarG2.f50636e.f50872h, this.f50866b.f50603B.c());
                    b(this.f50873i, eVarG2.f50636e.f50873i, -this.f50866b.f50605D.c());
                    this.f50869e.d(iP);
                    return;
                }
                if (this.f50868d == e.b.FIXED) {
                    this.f50869e.d(this.f50866b.P());
                }
            }
        }
        g gVar = this.f50869e;
        if (gVar.f50839j) {
            e eVar2 = this.f50866b;
            if (eVar2.f50628a) {
                d[] dVarArr = eVar2.f50611J;
                d dVar = dVarArr[0];
                d dVar2 = dVar.f50586d;
                if (dVar2 != null && dVarArr[1].f50586d != null) {
                    if (eVar2.V()) {
                        this.f50872h.f50835f = this.f50866b.f50611J[0].c();
                        this.f50873i.f50835f = -this.f50866b.f50611J[1].c();
                        return;
                    }
                    f fVarH = h(this.f50866b.f50611J[0]);
                    if (fVarH != null) {
                        b(this.f50872h, fVarH, this.f50866b.f50611J[0].c());
                    }
                    f fVarH2 = h(this.f50866b.f50611J[1]);
                    if (fVarH2 != null) {
                        b(this.f50873i, fVarH2, -this.f50866b.f50611J[1].c());
                    }
                    this.f50872h.f50831b = true;
                    this.f50873i.f50831b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f50872h, fVarH3, this.f50866b.f50611J[0].c());
                        b(this.f50873i, this.f50872h, this.f50869e.f50836g);
                        return;
                    }
                    return;
                }
                d dVar3 = dVarArr[1];
                if (dVar3.f50586d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f50873i, fVarH4, -this.f50866b.f50611J[1].c());
                        b(this.f50872h, this.f50873i, -this.f50869e.f50836g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof i) || eVar2.G() == null || this.f50866b.m(d.b.CENTER).f50586d != null) {
                    return;
                }
                b(this.f50872h, this.f50866b.G().f50636e.f50872h, this.f50866b.Q());
                b(this.f50873i, this.f50872h, this.f50869e.f50836g);
                return;
            }
        }
        if (this.f50868d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f50866b;
            int i10 = eVar3.f50650l;
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
            } else if (i10 == 3) {
                if (eVar3.f50652m == 3) {
                    this.f50872h.f50830a = this;
                    this.f50873i.f50830a = this;
                    l lVar = eVar3.f50638f;
                    lVar.f50872h.f50830a = this;
                    lVar.f50873i.f50830a = this;
                    gVar.f50830a = this;
                    if (eVar3.X()) {
                        this.f50869e.f50841l.add(this.f50866b.f50638f.f50869e);
                        this.f50866b.f50638f.f50869e.f50840k.add(this.f50869e);
                        l lVar2 = this.f50866b.f50638f;
                        lVar2.f50869e.f50830a = this;
                        this.f50869e.f50841l.add(lVar2.f50872h);
                        this.f50869e.f50841l.add(this.f50866b.f50638f.f50873i);
                        this.f50866b.f50638f.f50872h.f50840k.add(this.f50869e);
                        this.f50866b.f50638f.f50873i.f50840k.add(this.f50869e);
                    } else if (this.f50866b.V()) {
                        this.f50866b.f50638f.f50869e.f50841l.add(this.f50869e);
                        this.f50869e.f50840k.add(this.f50866b.f50638f.f50869e);
                    } else {
                        this.f50866b.f50638f.f50869e.f50841l.add(this.f50869e);
                    }
                } else {
                    g gVar4 = eVar3.f50638f.f50869e;
                    gVar.f50841l.add(gVar4);
                    gVar4.f50840k.add(this.f50869e);
                    this.f50866b.f50638f.f50872h.f50840k.add(this.f50869e);
                    this.f50866b.f50638f.f50873i.f50840k.add(this.f50869e);
                    g gVar5 = this.f50869e;
                    gVar5.f50831b = true;
                    gVar5.f50840k.add(this.f50872h);
                    this.f50869e.f50840k.add(this.f50873i);
                    this.f50872h.f50841l.add(this.f50869e);
                    this.f50873i.f50841l.add(this.f50869e);
                }
            }
        }
        e eVar4 = this.f50866b;
        d[] dVarArr2 = eVar4.f50611J;
        d dVar4 = dVarArr2[0];
        d dVar5 = dVar4.f50586d;
        if (dVar5 != null && dVarArr2[1].f50586d != null) {
            if (eVar4.V()) {
                this.f50872h.f50835f = this.f50866b.f50611J[0].c();
                this.f50873i.f50835f = -this.f50866b.f50611J[1].c();
                return;
            }
            f fVarH5 = h(this.f50866b.f50611J[0]);
            f fVarH6 = h(this.f50866b.f50611J[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f50874j = m.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f50872h, fVarH7, this.f50866b.f50611J[0].c());
                c(this.f50873i, this.f50872h, 1, this.f50869e);
                return;
            }
            return;
        }
        d dVar6 = dVarArr2[1];
        if (dVar6.f50586d != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f50873i, fVarH8, -this.f50866b.f50611J[1].c());
                c(this.f50872h, this.f50873i, -1, this.f50869e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof i) || eVar4.G() == null) {
            return;
        }
        b(this.f50872h, this.f50866b.G().f50636e.f50872h, this.f50866b.Q());
        c(this.f50873i, this.f50872h, 1, this.f50869e);
    }

    @Override // p250z.m
    public void e() {
        f fVar = this.f50872h;
        if (fVar.f50839j) {
            this.f50866b.F0(fVar.f50836g);
        }
    }

    @Override // p250z.m
    void f() {
        this.f50867c = null;
        this.f50872h.c();
        this.f50873i.c();
        this.f50869e.c();
        this.f50871g = false;
    }

    @Override // p250z.m
    boolean m() {
        return this.f50868d != e.b.MATCH_CONSTRAINT || this.f50866b.f50650l == 0;
    }

    void r() {
        this.f50871g = false;
        this.f50872h.c();
        this.f50872h.f50839j = false;
        this.f50873i.c();
        this.f50873i.f50839j = false;
        this.f50869e.f50839j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f50866b.r();
    }
}
