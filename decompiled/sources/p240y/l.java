package p240y;

import p250z.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends j {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f50769y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f50770z0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f50758A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f50759B0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f50760C0 = 0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private int f50761D0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f50762E0 = 0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f50763F0 = 0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private boolean f50764G0 = false;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f50765H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f50766I0 = 0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    protected b.a f50767J0 = new b.a();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    b.InterfaceC0560b f50768K0 = null;

    public void K0(boolean z9) {
        int i10 = this.f50760C0;
        if (i10 > 0 || this.f50761D0 > 0) {
            if (z9) {
                this.f50762E0 = this.f50761D0;
                this.f50763F0 = i10;
            } else {
                this.f50762E0 = i10;
                this.f50763F0 = this.f50761D0;
            }
        }
    }

    public void L0() {
        for (int i10 = 0; i10 < this.f50756x0; i10++) {
            e eVar = this.f50755w0[i10];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.f50766I0;
    }

    public int N0() {
        return this.f50765H0;
    }

    public int O0() {
        return this.f50770z0;
    }

    public int P0() {
        return this.f50762E0;
    }

    public int Q0() {
        return this.f50763F0;
    }

    public int R0() {
        return this.f50769y0;
    }

    public abstract void S0(int i10, int i11, int i12, int i13);

    protected void T0(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f50768K0 == null && G() != null) {
            this.f50768K0 = ((f) G()).U0();
        }
        b.a aVar = this.f50767J0;
        aVar.f50809a = bVar;
        aVar.f50810b = bVar2;
        aVar.f50811c = i10;
        aVar.f50812d = i11;
        this.f50768K0.b(eVar, aVar);
        eVar.E0(this.f50767J0.f50813e);
        eVar.h0(this.f50767J0.f50814f);
        eVar.g0(this.f50767J0.f50816h);
        eVar.b0(this.f50767J0.f50815g);
    }

    protected boolean U0() {
        e eVar = this.f50615N;
        b.InterfaceC0560b interfaceC0560bU0 = eVar != null ? ((f) eVar).U0() : null;
        if (interfaceC0560bU0 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f50756x0; i10++) {
            e eVar2 = this.f50755w0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarS = eVar2.s(0);
                e.b bVarS2 = eVar2.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || eVar2.f50650l == 1 || bVarS2 != bVar || eVar2.f50652m == 1) {
                    if (bVarS == bVar) {
                        bVarS = e.b.WRAP_CONTENT;
                    }
                    if (bVarS2 == bVar) {
                        bVarS2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f50767J0;
                    aVar.f50809a = bVarS;
                    aVar.f50810b = bVarS2;
                    aVar.f50811c = eVar2.P();
                    this.f50767J0.f50812d = eVar2.v();
                    interfaceC0560bU0.b(eVar2, this.f50767J0);
                    eVar2.E0(this.f50767J0.f50813e);
                    eVar2.h0(this.f50767J0.f50814f);
                    eVar2.b0(this.f50767J0.f50815g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.f50764G0;
    }

    protected void W0(boolean z9) {
        this.f50764G0 = z9;
    }

    public void X0(int i10, int i11) {
        this.f50765H0 = i10;
        this.f50766I0 = i11;
    }

    public void Y0(int i10) {
        this.f50758A0 = i10;
        this.f50769y0 = i10;
        this.f50759B0 = i10;
        this.f50770z0 = i10;
        this.f50760C0 = i10;
        this.f50761D0 = i10;
    }

    public void Z0(int i10) {
        this.f50770z0 = i10;
    }

    public void a1(int i10) {
        this.f50761D0 = i10;
    }

    @Override // p240y.j, p240y.i
    public void b(f fVar) {
        L0();
    }

    public void b1(int i10) {
        this.f50758A0 = i10;
        this.f50762E0 = i10;
    }

    public void c1(int i10) {
        this.f50759B0 = i10;
        this.f50763F0 = i10;
    }

    public void d1(int i10) {
        this.f50760C0 = i10;
        this.f50762E0 = i10;
        this.f50763F0 = i10;
    }

    public void e1(int i10) {
        this.f50769y0 = i10;
    }
}
