package p250z;

import p240y.d;
import p240y.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f50866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    k f50867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e.b f50868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f50869e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50870f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f50871g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f50872h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f50873i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected b f50874j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50875a;

        static {
            int[] iArr = new int[d.b.values().length];
            f50875a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50875a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50875a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50875a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50875a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(e eVar) {
        this.f50866b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f50865a;
        if (i12 == 0) {
            this.f50869e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f50869e.d(Math.min(g(this.f50869e.f50851m, i10), i11));
            return;
        }
        if (i12 == 2) {
            e eVarG = this.f50866b.G();
            if (eVarG != null) {
                g gVar = (i10 == 0 ? eVarG.f50636e : eVarG.f50638f).f50869e;
                if (gVar.f50839j) {
                    e eVar = this.f50866b;
                    this.f50869e.d(g((int) ((gVar.f50836g * (i10 == 0 ? eVar.f50660q : eVar.f50666t)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        e eVar2 = this.f50866b;
        m mVar = eVar2.f50636e;
        e.b bVar = mVar.f50868d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f50865a == 3) {
            l lVar = eVar2.f50638f;
            if (lVar.f50868d == bVar2 && lVar.f50865a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            mVar = eVar2.f50638f;
        }
        if (mVar.f50869e.f50839j) {
            float fT = eVar2.t();
            this.f50869e.d(i10 == 1 ? (int) ((mVar.f50869e.f50836g / fT) + 0.5f) : (int) ((fT * mVar.f50869e.f50836g) + 0.5f));
        }
    }

    @Override // p250z.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f50841l.add(fVar2);
        fVar.f50835f = i10;
        fVar2.f50840k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f50841l.add(fVar2);
        fVar.f50841l.add(this.f50869e);
        fVar.f50837h = i10;
        fVar.f50838i = gVar;
        fVar2.f50840k.add(fVar);
        gVar.f50840k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            e eVar = this.f50866b;
            int i12 = eVar.f50658p;
            int iMax = Math.max(eVar.f50656o, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            e eVar2 = this.f50866b;
            int i13 = eVar2.f50664s;
            int iMax2 = Math.max(eVar2.f50662r, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(d dVar) {
        d dVar2 = dVar.f50586d;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f50584b;
        int i10 = a.f50875a[dVar2.f50585c.ordinal()];
        if (i10 == 1) {
            return eVar.f50636e.f50872h;
        }
        if (i10 == 2) {
            return eVar.f50636e.f50873i;
        }
        if (i10 == 3) {
            return eVar.f50638f.f50872h;
        }
        if (i10 == 4) {
            return eVar.f50638f.f50862k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f50638f.f50873i;
    }

    protected final f i(d dVar, int i10) {
        d dVar2 = dVar.f50586d;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f50584b;
        m mVar = i10 == 0 ? eVar.f50636e : eVar.f50638f;
        int i11 = a.f50875a[dVar2.f50585c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f50873i;
        }
        return mVar.f50872h;
    }

    public long j() {
        g gVar = this.f50869e;
        if (gVar.f50839j) {
            return gVar.f50836g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f50871g;
    }

    abstract boolean m();

    protected void n(d dVar, d dVar2, d dVar3, int i10) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f50839j && fVarH2.f50839j) {
            int iC = fVarH.f50836g + dVar2.c();
            int iC2 = fVarH2.f50836g - dVar3.c();
            int i11 = iC2 - iC;
            if (!this.f50869e.f50839j && this.f50868d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f50869e;
            if (gVar.f50839j) {
                if (gVar.f50836g == i11) {
                    this.f50872h.d(iC);
                    this.f50873i.d(iC2);
                    return;
                }
                e eVar = this.f50866b;
                float fW = i10 == 0 ? eVar.w() : eVar.K();
                if (fVarH == fVarH2) {
                    iC = fVarH.f50836g;
                    iC2 = fVarH2.f50836g;
                    fW = 0.5f;
                }
                this.f50872h.d((int) (iC + 0.5f + (((iC2 - iC) - this.f50869e.f50836g) * fW)));
                this.f50873i.d(this.f50872h.f50836g + this.f50869e.f50836g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
