package p240y;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import p230x.d;
import p250z.b;
import p250z.e;

/* JADX INFO: loaded from: classes.dex */
public class f extends m {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    int f50684C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    int f50685D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    int f50686E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    int f50687F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    b f50702x0 = new b(this);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public e f50703y0 = new e(this);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected b.InterfaceC0560b f50704z0 = null;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private boolean f50682A0 = false;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    protected d f50683B0 = new d();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    int f50688G0 = 0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    int f50689H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    c[] f50690I0 = new c[4];

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    c[] f50691J0 = new c[4];

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f50692K0 = false;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f50693L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f50694M0 = false;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f50695N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f50696O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f50697P0 = 263;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f50698Q0 = false;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f50699R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f50700S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    int f50701T0 = 0;

    private void P0(e eVar) {
        int i10 = this.f50688G0 + 1;
        c[] cVarArr = this.f50691J0;
        if (i10 >= cVarArr.length) {
            this.f50691J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f50691J0[this.f50688G0] = new c(eVar, 0, a1());
        this.f50688G0++;
    }

    private void Q0(e eVar) {
        int i10 = this.f50689H0 + 1;
        c[] cVarArr = this.f50690I0;
        if (i10 >= cVarArr.length) {
            this.f50690I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f50690I0[this.f50689H0] = new c(eVar, 1, a1());
        this.f50689H0++;
    }

    private void e1() {
        this.f50688G0 = 0;
        this.f50689H0 = 0;
    }

    @Override // p240y.e
    public void I0(boolean z9, boolean z10) {
        super.I0(z9, z10);
        int size = this.f50771w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f50771w0.get(i10)).I0(z9, z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01cb A[PHI: r0 r12
      0x01cb: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:69:0x0190, B:77:0x01b3, B:78:0x01b5, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean) binds: [B:69:0x0190, B:77:0x01b3, B:78:0x01b5, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [int] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // p240y.m
    public void K0() {
        boolean z9;
        ?? Max;
        ?? r10;
        boolean z10 = false;
        this.f50620S = 0;
        this.f50621T = 0;
        int iMax = Math.max(0, P());
        int iMax2 = Math.max(0, v());
        this.f50699R0 = false;
        this.f50700S0 = false;
        boolean z11 = d1(64) || d1(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        d dVar = this.f50683B0;
        dVar.f50455g = false;
        dVar.f50456h = false;
        if (this.f50697P0 != 0 && z11) {
            dVar.f50456h = true;
        }
        e.b[] bVarArr = this.f50614M;
        e.b bVar = bVarArr[1];
        e.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.f50771w0;
        e.b bVarY = y();
        e.b bVar3 = e.b.WRAP_CONTENT;
        boolean z12 = bVarY == bVar3 || M() == bVar3;
        e1();
        int size = this.f50771w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f50771w0.get(i10);
            if (eVar instanceof m) {
                ((m) eVar).K0();
            }
        }
        int i11 = 0;
        boolean z13 = false;
        boolean zO0 = true;
        while (zO0) {
            int i12 = i11 + 1;
            try {
                this.f50683B0.D();
                e1();
                l(this.f50683B0);
                for (?? r11 = z10; r11 < size; r11++) {
                    ((e) this.f50771w0.get(r11)).l(this.f50683B0);
                }
                zO0 = O0(this.f50683B0);
                if (zO0) {
                    this.f50683B0.z();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                System.out.println("EXCEPTION : " + e10);
            }
            if (zO0) {
                i1(this.f50683B0, k.f50757a);
            } else {
                J0(this.f50683B0);
                for (?? r12 = z10; r12 < size; r12++) {
                    ((e) this.f50771w0.get(r12)).J0(this.f50683B0);
                }
            }
            if (z12 && i12 < 8 && k.f50757a[2]) {
                boolean z14 = z10;
                boolean z15 = z14;
                ?? Max2 = z15;
                while (r10 < size) {
                    r10 = z14;
                    Max = z15;
                    e eVar2 = (e) this.f50771w0.get(r10);
                    r10++;
                    Max = Math.max((int) Max, eVar2.f50620S + eVar2.P());
                    Max2 = Math.max((int) Max2, eVar2.f50621T + eVar2.v());
                }
                r10 = z14;
                Max = z15;
                int iMax3 = Math.max(this.f50627Z, (int) Max);
                int iMax4 = Math.max(this.f50629a0, (int) Max2);
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || P() >= iMax3) {
                    z9 = z10;
                    z13 = z13;
                } else {
                    E0(iMax3);
                    this.f50614M[z10] = bVar4;
                    z9 = true;
                    z13 = true;
                }
                if (bVar == bVar4 && v() < iMax4) {
                    h0(iMax4);
                    this.f50614M[1] = bVar4;
                    z9 = true;
                    z13 = true;
                }
            } else {
                z9 = z10;
            }
            int iMax5 = Math.max(this.f50627Z, P());
            boolean z16 = z13;
            if (iMax5 > P()) {
                E0(iMax5);
                this.f50614M[z10] = e.b.FIXED;
                z9 = true;
                z16 = true;
            }
            int iMax6 = Math.max(this.f50629a0, v());
            boolean z17 = z16;
            if (iMax6 > v()) {
                h0(iMax6);
                this.f50614M[1] = e.b.FIXED;
                z9 = true;
                z17 = true;
            }
            if (z17) {
                zO0 = z9;
            } else {
                e.b bVar5 = this.f50614M[z10];
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && iMax > 0) {
                    z17 = z17;
                    if (P() > iMax) {
                        this.f50699R0 = true;
                        this.f50614M[z10] = e.b.FIXED;
                        E0(iMax);
                        z9 = true;
                        z17 = true;
                    }
                }
                z17 = z17;
                z17 = z17;
                if (this.f50614M[1] != bVar6 || iMax2 <= 0 || v() <= iMax2) {
                    zO0 = z9;
                } else {
                    this.f50700S0 = true;
                    this.f50614M[1] = e.b.FIXED;
                    h0(iMax2);
                    zO0 = true;
                    z17 = true;
                }
            }
            i11 = i12;
            z10 = z10;
            z13 = z17;
        }
        boolean z18 = z10;
        this.f50771w0 = arrayList;
        if (z13) {
            e.b[] bVarArr2 = this.f50614M;
            bVarArr2[z18 ? 1 : 0] = bVar2;
            bVarArr2[1] = bVar;
        }
        a0(this.f50683B0.v());
    }

    void N0(e eVar, int i10) {
        if (i10 == 0) {
            P0(eVar);
        } else if (i10 == 1) {
            Q0(eVar);
        }
    }

    public boolean O0(d dVar) {
        f(dVar);
        int size = this.f50771w0.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f50771w0.get(i10);
            eVar.o0(0, false);
            eVar.o0(1, false);
            if (eVar instanceof a) {
                z9 = true;
            }
        }
        if (z9) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f50771w0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).N0();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = (e) this.f50771w0.get(i12);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            e eVar4 = (e) this.f50771w0.get(i13);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f50614M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.l0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(bVar2);
                }
            } else {
                k.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.f50688G0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.f50689H0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public boolean R0(boolean z9) {
        return this.f50703y0.f(z9);
    }

    public boolean S0(boolean z9) {
        return this.f50703y0.g(z9);
    }

    public boolean T0(boolean z9, int i10) {
        return this.f50703y0.h(z9, i10);
    }

    public b.InterfaceC0560b U0() {
        return this.f50704z0;
    }

    public int V0() {
        return this.f50697P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.f50703y0.j();
    }

    @Override // p240y.m, p240y.e
    public void Y() {
        this.f50683B0.D();
        this.f50684C0 = 0;
        this.f50686E0 = 0;
        this.f50685D0 = 0;
        this.f50687F0 = 0;
        this.f50698Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f50703y0.k();
    }

    public boolean Z0() {
        return this.f50700S0;
    }

    public boolean a1() {
        return this.f50682A0;
    }

    public boolean b1() {
        return this.f50699R0;
    }

    public long c1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f50684C0 = i17;
        this.f50685D0 = i18;
        return this.f50702x0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean d1(int i10) {
        return (this.f50697P0 & i10) == i10;
    }

    public void f1(b.InterfaceC0560b interfaceC0560b) {
        this.f50704z0 = interfaceC0560b;
        this.f50703y0.n(interfaceC0560b);
    }

    public void g1(int i10) {
        this.f50697P0 = i10;
        d.f50446r = k.b(i10, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
    }

    public void h1(boolean z9) {
        this.f50682A0 = z9;
    }

    public void i1(d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f50771w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f50771w0.get(i10)).J0(dVar);
        }
    }

    public void j1() {
        this.f50702x0.e(this);
    }
}
