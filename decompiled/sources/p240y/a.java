package p240y;

import p230x.d;
import p230x.i;

/* JADX INFO: loaded from: classes.dex */
public class a extends j {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f50559y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f50560z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f50558A0 = 0;

    public boolean K0() {
        return this.f50560z0;
    }

    public int L0() {
        return this.f50559y0;
    }

    public int M0() {
        return this.f50558A0;
    }

    protected void N0() {
        for (int i10 = 0; i10 < this.f50756x0; i10++) {
            e eVar = this.f50755w0[i10];
            int i11 = this.f50559y0;
            if (i11 == 0 || i11 == 1) {
                eVar.o0(0, true);
            } else if (i11 == 2 || i11 == 3) {
                eVar.o0(1, true);
            }
        }
    }

    public void O0(boolean z9) {
        this.f50560z0 = z9;
    }

    public void P0(int i10) {
        this.f50559y0 = i10;
    }

    public void Q0(int i10) {
        this.f50558A0 = i10;
    }

    @Override // p240y.e
    public void f(d dVar) {
        d[] dVarArr;
        boolean z9;
        int i10;
        int i11;
        int i12;
        d[] dVarArr2 = this.f50611J;
        dVarArr2[0] = this.f50603B;
        dVarArr2[2] = this.f50604C;
        dVarArr2[1] = this.f50605D;
        dVarArr2[3] = this.f50606E;
        int i13 = 0;
        while (true) {
            dVarArr = this.f50611J;
            if (i13 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i13];
            dVar2.f50589g = dVar.q(dVar2);
            i13++;
        }
        int i14 = this.f50559y0;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i14];
        int i15 = 0;
        while (true) {
            if (i15 >= this.f50756x0) {
                z9 = false;
                break;
            }
            e eVar = this.f50755w0[i15];
            if ((this.f50560z0 || eVar.g()) && ((((i11 = this.f50559y0) == 0 || i11 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f50603B.f50586d != null && eVar.f50605D.f50586d != null) || (((i12 = this.f50559y0) == 2 || i12 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f50604C.f50586d != null && eVar.f50606E.f50586d != null))) {
                z9 = true;
                break;
            }
            i15++;
        }
        boolean z10 = this.f50603B.i() || this.f50605D.i();
        boolean z11 = this.f50604C.i() || this.f50606E.i();
        int i16 = !(!z9 && (((i10 = this.f50559y0) == 0 && z10) || ((i10 == 2 && z11) || ((i10 == 1 && z10) || (i10 == 3 && z11))))) ? 4 : 5;
        for (int i17 = 0; i17 < this.f50756x0; i17++) {
            e eVar2 = this.f50755w0[i17];
            if (this.f50560z0 || eVar2.g()) {
                i iVarQ = dVar.q(eVar2.f50611J[this.f50559y0]);
                d[] dVarArr3 = eVar2.f50611J;
                int i18 = this.f50559y0;
                d dVar4 = dVarArr3[i18];
                dVar4.f50589g = iVarQ;
                d dVar5 = dVar4.f50586d;
                int i19 = (dVar5 == null || dVar5.f50584b != this) ? 0 : dVar4.f50587e;
                if (i18 == 0 || i18 == 2) {
                    dVar.i(dVar3.f50589g, iVarQ, this.f50558A0 - i19, z9);
                } else {
                    dVar.g(dVar3.f50589g, iVarQ, this.f50558A0 + i19, z9);
                }
                dVar.e(dVar3.f50589g, iVarQ, this.f50558A0 + i19, i16);
            }
        }
        int i20 = this.f50559y0;
        if (i20 == 0) {
            dVar.e(this.f50605D.f50589g, this.f50603B.f50589g, 0, 8);
            dVar.e(this.f50603B.f50589g, this.f50615N.f50605D.f50589g, 0, 4);
            dVar.e(this.f50603B.f50589g, this.f50615N.f50603B.f50589g, 0, 0);
            return;
        }
        if (i20 == 1) {
            dVar.e(this.f50603B.f50589g, this.f50605D.f50589g, 0, 8);
            dVar.e(this.f50603B.f50589g, this.f50615N.f50603B.f50589g, 0, 4);
            dVar.e(this.f50603B.f50589g, this.f50615N.f50605D.f50589g, 0, 0);
        } else if (i20 == 2) {
            dVar.e(this.f50606E.f50589g, this.f50604C.f50589g, 0, 8);
            dVar.e(this.f50604C.f50589g, this.f50615N.f50606E.f50589g, 0, 4);
            dVar.e(this.f50604C.f50589g, this.f50615N.f50604C.f50589g, 0, 0);
        } else if (i20 == 3) {
            dVar.e(this.f50604C.f50589g, this.f50606E.f50589g, 0, 8);
            dVar.e(this.f50604C.f50589g, this.f50615N.f50604C.f50589g, 0, 4);
            dVar.e(this.f50604C.f50589g, this.f50615N.f50606E.f50589g, 0, 0);
        }
    }

    @Override // p240y.e
    public boolean g() {
        return true;
    }

    @Override // p240y.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i10 = 0; i10 < this.f50756x0; i10++) {
            e eVar = this.f50755w0[i10];
            if (i10 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
