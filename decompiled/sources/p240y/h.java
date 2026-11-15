package p240y;

import p230x.d;
import p230x.i;

/* JADX INFO: loaded from: classes.dex */
public class h extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected float f50750w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected int f50751x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected int f50752y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private d f50753z0 = this.f50604C;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f50748A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f50749B0 = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50754a;

        static {
            int[] iArr = new int[d.b.values().length];
            f50754a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50754a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50754a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50754a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f50754a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50754a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50754a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f50754a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50754a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f50612K.clear();
        this.f50612K.add(this.f50753z0);
        int length = this.f50611J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f50611J[i10] = this.f50753z0;
        }
    }

    @Override // p240y.e
    public void J0(d dVar) {
        if (G() == null) {
            return;
        }
        int iX = dVar.x(this.f50753z0);
        if (this.f50748A0 == 1) {
            F0(iX);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(iX);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.f50748A0;
    }

    public int L0() {
        return this.f50751x0;
    }

    public int M0() {
        return this.f50752y0;
    }

    public float N0() {
        return this.f50750w0;
    }

    public void O0(int i10) {
        if (i10 > -1) {
            this.f50750w0 = -1.0f;
            this.f50751x0 = i10;
            this.f50752y0 = -1;
        }
    }

    public void P0(int i10) {
        if (i10 > -1) {
            this.f50750w0 = -1.0f;
            this.f50751x0 = -1;
            this.f50752y0 = i10;
        }
    }

    public void Q0(float f10) {
        if (f10 > -1.0f) {
            this.f50750w0 = f10;
            this.f50751x0 = -1;
            this.f50752y0 = -1;
        }
    }

    public void R0(int i10) {
        if (this.f50748A0 == i10) {
            return;
        }
        this.f50748A0 = i10;
        this.f50612K.clear();
        if (this.f50748A0 == 1) {
            this.f50753z0 = this.f50603B;
        } else {
            this.f50753z0 = this.f50604C;
        }
        this.f50612K.add(this.f50753z0);
        int length = this.f50611J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f50611J[i11] = this.f50753z0;
        }
    }

    @Override // p240y.e
    public void f(d dVar) {
        f fVar = (f) G();
        if (fVar == null) {
            return;
        }
        d dVarM = fVar.m(d.b.LEFT);
        d dVarM2 = fVar.m(d.b.RIGHT);
        e eVar = this.f50615N;
        boolean z9 = eVar != null && eVar.f50614M[0] == e.b.WRAP_CONTENT;
        if (this.f50748A0 == 0) {
            dVarM = fVar.m(d.b.TOP);
            dVarM2 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f50615N;
            z9 = eVar2 != null && eVar2.f50614M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f50751x0 != -1) {
            i iVarQ = dVar.q(this.f50753z0);
            dVar.e(iVarQ, dVar.q(dVarM), this.f50751x0, 8);
            if (z9) {
                dVar.h(dVar.q(dVarM2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f50752y0 == -1) {
            if (this.f50750w0 != -1.0f) {
                dVar.d(d.s(dVar, dVar.q(this.f50753z0), dVar.q(dVarM2), this.f50750w0));
                return;
            }
            return;
        }
        i iVarQ2 = dVar.q(this.f50753z0);
        i iVarQ3 = dVar.q(dVarM2);
        dVar.e(iVarQ2, iVarQ3, -this.f50752y0, 8);
        if (z9) {
            dVar.h(iVarQ2, dVar.q(dVarM), 0, 5);
            dVar.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // p240y.e
    public boolean g() {
        return true;
    }

    @Override // p240y.e
    public d m(d.b bVar) {
        switch (a.f50754a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f50748A0 == 1) {
                    return this.f50753z0;
                }
                break;
            case 3:
            case 4:
                if (this.f50748A0 == 0) {
                    return this.f50753z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
