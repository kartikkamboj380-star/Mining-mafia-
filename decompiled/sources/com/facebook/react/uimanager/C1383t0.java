package com.facebook.react.uimanager;

import com.facebook.yoga.YogaValue;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.react.uimanager.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1383t0 implements InterfaceC1381s0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final com.facebook.yoga.c f15833x = C1389w0.f15858a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E0 f15837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15838e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f15840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C1383t0 f15841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1383t0 f15842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15843j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C1383t0 f15845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f15846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f15849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f15850q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float[] f15852s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.facebook.yoga.r f15854u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f15855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f15856w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15839f = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f15844k = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean[] f15853t = new boolean[9];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C0 f15851r = new C0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    static {
        p064g3.b.a("ReactShadowNodeImpl", p064g3.a.ERROR);
    }

    public C1383t0() {
        float[] fArr = new float[9];
        this.f15852s = fArr;
        if (P()) {
            this.f15854u = null;
            return;
        }
        com.facebook.yoga.r rVarA = (com.facebook.yoga.r) j1.b().b();
        rVarA = rVarA == null ? com.facebook.yoga.s.a(f15833x) : rVarA;
        this.f15854u = rVarA;
        rVarA.A(this);
        Arrays.fill(fArr, Float.NaN);
    }

    private int l0() {
        EnumC1346a0 enumC1346a0S = S();
        if (enumC1346a0S == EnumC1346a0.NONE) {
            return this.f15844k;
        }
        if (enumC1346a0S == EnumC1346a0.LEAF) {
            return this.f15844k + 1;
        }
        return 1;
    }

    private void r1(int i10) {
        if (S() != EnumC1346a0.PARENT) {
            for (C1383t0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f15844k += i10;
                if (parent.S() == EnumC1346a0.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    private void s1() {
        for (int i10 = 0; i10 <= 8; i10++) {
            if (i10 == 0 || i10 == 2 || i10 == 4 || i10 == 5) {
                if (com.facebook.yoga.g.a(this.f15852s[i10]) && com.facebook.yoga.g.a(this.f15852s[6]) && com.facebook.yoga.g.a(this.f15852s[8])) {
                    this.f15854u.i0(com.facebook.yoga.j.d(i10), this.f15851r.b(i10));
                } else if (this.f15853t[i10]) {
                    this.f15854u.j0(com.facebook.yoga.j.d(i10), this.f15852s[i10]);
                } else {
                    this.f15854u.i0(com.facebook.yoga.j.d(i10), this.f15852s[i10]);
                }
            } else if (i10 == 1 || i10 == 3) {
                if (com.facebook.yoga.g.a(this.f15852s[i10]) && com.facebook.yoga.g.a(this.f15852s[7]) && com.facebook.yoga.g.a(this.f15852s[8])) {
                    this.f15854u.i0(com.facebook.yoga.j.d(i10), this.f15851r.b(i10));
                } else if (this.f15853t[i10]) {
                    this.f15854u.j0(com.facebook.yoga.j.d(i10), this.f15852s[i10]);
                } else {
                    this.f15854u.i0(com.facebook.yoga.j.d(i10), this.f15852s[i10]);
                }
            } else if (com.facebook.yoga.g.a(this.f15852s[i10])) {
                this.f15854u.i0(com.facebook.yoga.j.d(i10), this.f15851r.b(i10));
            } else if (this.f15853t[i10]) {
                this.f15854u.j0(com.facebook.yoga.j.d(i10), this.f15852s[i10]);
            } else {
                this.f15854u.i0(com.facebook.yoga.j.d(i10), this.f15852s[i10]);
            }
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public int A() {
        return this.f15847n;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final C1383t0 B(int i10) {
        p004a3.a.c(this.f15846m);
        C1383t0 c1383t0 = (C1383t0) this.f15846m.remove(i10);
        c1383t0.f15845l = null;
        return c1383t0;
    }

    public void B0(com.facebook.yoga.a aVar) {
        this.f15854u.t(aVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final float C() {
        return this.f15854u.k();
    }

    public void C0(com.facebook.yoga.a aVar) {
        this.f15854u.u(aVar);
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f15854u.w(aVar);
    }

    public void E0(com.facebook.yoga.b bVar) {
        this.f15854u.y(bVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final void F(boolean z9) {
        p004a3.a.b(getParent() == null, "Must remove from no opt parent first");
        p004a3.a.b(this.f15845l == null, "Must remove from native parent first");
        p004a3.a.b(n() == 0, "Must remove all native children first");
        this.f15843j = z9;
    }

    public void F0(int i10, float f10) {
        this.f15854u.z(com.facebook.yoga.j.d(i10), f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final void G(C1385u0 c1385u0) {
        V0.g(this, c1385u0);
        x0();
    }

    public void G0(float f10) {
        this.f15854u.L(com.facebook.yoga.m.COLUMN, f10);
    }

    public void H0(float f10) {
        this.f15854u.M(com.facebook.yoga.m.COLUMN, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void I() {
        if (!P()) {
            this.f15854u.d();
        } else if (getParent() != null) {
            getParent().I();
        }
    }

    public void I0(int i10, float f10) {
        this.f15851r.c(i10, f10);
        s1();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final void J(String str) {
        this.f15835b = str;
    }

    public void J0(com.facebook.yoga.i iVar) {
        this.f15854u.C(iVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final YogaValue K() {
        return this.f15854u.e();
    }

    public void K0(float f10) {
        this.f15854u.E(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public Iterable L() {
        if (t0()) {
            return null;
        }
        return this.f15840g;
    }

    public void L0() {
        this.f15854u.F();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final int M() {
        return this.f15834a;
    }

    public void M0(float f10) {
        this.f15854u.G(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final void N() {
        ArrayList arrayList = this.f15846m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1383t0) this.f15846m.get(size)).f15845l = null;
            }
            this.f15846m.clear();
        }
    }

    public void N0(com.facebook.yoga.l lVar) {
        this.f15854u.H(lVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void O() {
        X(Float.NaN, Float.NaN);
    }

    public void O0(com.facebook.yoga.x xVar) {
        this.f15854u.q0(xVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public boolean P() {
        return false;
    }

    public void P0(float f10) {
        this.f15854u.L(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void Q(float f10) {
        this.f15854u.n0(f10);
    }

    public void Q0(float f10) {
        this.f15854u.L(com.facebook.yoga.m.ALL, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final E0 R() {
        return (E0) p004a3.a.c(this.f15837d);
    }

    public void R0(com.facebook.yoga.n nVar) {
        this.f15854u.U(nVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public EnumC1346a0 S() {
        if (P() || b0()) {
            return EnumC1346a0.NONE;
        }
        return n0() ? EnumC1346a0.LEAF : EnumC1346a0.PARENT;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final void x(C1383t0 c1383t0) {
        this.f15842i = c1383t0;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final int T() {
        p004a3.a.a(this.f15836c != 0);
        return this.f15836c;
    }

    public void T0(int i10, float f10) {
        this.f15854u.V(com.facebook.yoga.j.d(i10), f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public boolean U(float f10, float f11) {
        if (!m0()) {
            return false;
        }
        float fC = C();
        float fZ = z();
        float f12 = f10 + fC;
        int iRound = Math.round(f12);
        float f13 = f11 + fZ;
        int iRound2 = Math.round(f13);
        return (Math.round(fC) == this.f15847n && Math.round(fZ) == this.f15848o && Math.round(f12 + c0()) - iRound == this.f15849p && Math.round(f13 + h()) - iRound2 == this.f15850q) ? false : true;
    }

    public void U0(int i10) {
        this.f15854u.W(com.facebook.yoga.j.d(i10));
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final boolean V() {
        return this.f15838e;
    }

    public void V0(int i10, float f10) {
        this.f15854u.X(com.facebook.yoga.j.d(i10), f10);
    }

    public void W0(com.facebook.yoga.o oVar) {
        this.f15854u.c0(oVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void X(float f10, float f11) {
        this.f15854u.c(f10, f11);
    }

    public void X0(com.facebook.yoga.u uVar) {
        this.f15854u.h0(uVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void Y(C1350c0 c1350c0) {
    }

    public void Y0(int i10, float f10) {
        this.f15852s[i10] = f10;
        this.f15853t[i10] = !com.facebook.yoga.g.a(f10);
        s1();
    }

    public void Z0(int i10, float f10) {
        this.f15854u.k0(com.facebook.yoga.j.d(i10), f10);
    }

    public void a1(int i10, float f10) {
        this.f15854u.l0(com.facebook.yoga.j.d(i10), f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final int b() {
        ArrayList arrayList = this.f15840g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final boolean b0() {
        return this.f15843j;
    }

    public void b1(com.facebook.yoga.v vVar) {
        this.f15854u.m0(vVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void c() {
        com.facebook.yoga.r rVar = this.f15854u;
        if (rVar != null) {
            rVar.s();
            j1.b().a(this.f15854u);
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final float c0() {
        return this.f15854u.i();
    }

    public void c1(float f10) {
        this.f15854u.L(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final void d() {
        this.f15839f = false;
        if (m0()) {
            v0();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void v(C1383t0 c1383t0, int i10) {
        if (this.f15840g == null) {
            this.f15840g = new ArrayList(4);
        }
        this.f15840g.add(i10, c1383t0);
        c1383t0.f15841h = this;
        if (this.f15854u != null && !u0()) {
            com.facebook.yoga.r rVar = c1383t0.f15854u;
            if (rVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + c1383t0.toString() + "' to a '" + toString() + "')");
            }
            this.f15854u.b(rVar, i10);
        }
        w0();
        int iL0 = c1383t0.l0();
        this.f15844k += iL0;
        r1(iL0);
    }

    public void d1(float f10) {
        this.f15854u.M(com.facebook.yoga.m.ROW, f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void e(float f10) {
        this.f15854u.O(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void p(C1383t0 c1383t0, int i10) {
        p004a3.a.a(S() == EnumC1346a0.PARENT);
        p004a3.a.a(c1383t0.S() != EnumC1346a0.NONE);
        if (this.f15846m == null) {
            this.f15846m = new ArrayList(4);
        }
        this.f15846m.add(i10, c1383t0);
        c1383t0.f15845l = this;
    }

    public void e1(float f10) {
        this.f15854u.x(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void f(int i10, int i11) {
        this.f15855v = Integer.valueOf(i10);
        this.f15856w = Integer.valueOf(i11);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final C1383t0 a(int i10) {
        ArrayList arrayList = this.f15840g;
        if (arrayList != null) {
            return (C1383t0) arrayList.get(i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
    }

    public void f1() {
        this.f15854u.P();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void g(com.facebook.yoga.h hVar) {
        this.f15854u.B(hVar);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final C1383t0 Z() {
        C1383t0 c1383t0 = this.f15842i;
        return c1383t0 != null ? c1383t0 : a0();
    }

    public void g1(float f10) {
        this.f15854u.R(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public Integer getHeightMeasureSpec() {
        return this.f15856w;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final com.facebook.yoga.h getLayoutDirection() {
        return this.f15854u.f();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public int getScreenHeight() {
        return this.f15850q;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public int getScreenWidth() {
        return this.f15849p;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public Integer getWidthMeasureSpec() {
        return this.f15855v;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final float h() {
        return this.f15854u.g();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final int m(C1383t0 c1383t0) {
        int iL0 = 0;
        for (int i10 = 0; i10 < b(); i10++) {
            C1383t0 c1383t0A = a(i10);
            if (c1383t0 == c1383t0A) {
                return iL0;
            }
            iL0 += c1383t0A.l0();
        }
        throw new RuntimeException("Child " + c1383t0.M() + " was not a child of " + this.f15834a);
    }

    public void h1(float f10) {
        this.f15854u.Y(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final boolean i() {
        return this.f15839f || m0() || r0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final C1383t0 a0() {
        return this.f15845l;
    }

    public void i1(float f10) {
        this.f15854u.Z(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void j(float f10, float f11, N0 n10, C1350c0 c1350c0) {
        if (this.f15839f) {
            y0(n10);
        }
        if (m0()) {
            float fC = C();
            float fZ = z();
            float f12 = f10 + fC;
            int iRound = Math.round(f12);
            float f13 = f11 + fZ;
            int iRound2 = Math.round(f13);
            int iRound3 = Math.round(f12 + c0());
            int iRound4 = Math.round(f13 + h());
            int iRound5 = Math.round(fC);
            int iRound6 = Math.round(fZ);
            int i10 = iRound3 - iRound;
            int i11 = iRound4 - iRound2;
            boolean z9 = (iRound5 == this.f15847n && iRound6 == this.f15848o && i10 == this.f15849p && i11 == this.f15850q) ? false : true;
            this.f15847n = iRound5;
            this.f15848o = iRound6;
            this.f15849p = i10;
            this.f15850q = i11;
            if (z9) {
                if (c1350c0 != null) {
                    c1350c0.l(this);
                } else {
                    n10.P(getParent().M(), M(), A(), t(), getScreenWidth(), getScreenHeight(), getLayoutDirection());
                }
            }
        }
    }

    public final float j0(int i10) {
        return this.f15854u.h(com.facebook.yoga.j.d(i10));
    }

    public void j1(float f10) {
        this.f15854u.a0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void k() {
        if (b() == 0) {
            return;
        }
        int iL0 = 0;
        for (int iB = b() - 1; iB >= 0; iB--) {
            if (this.f15854u != null && !u0()) {
                this.f15854u.r(iB);
            }
            C1383t0 c1383t0A = a(iB);
            c1383t0A.f15841h = null;
            iL0 += c1383t0A.l0();
            c1383t0A.c();
        }
        ((ArrayList) p004a3.a.c(this.f15840g)).clear();
        w0();
        this.f15844k -= iL0;
        r1(-iL0);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C1383t0 getParent() {
        return this.f15841h;
    }

    public void k1(float f10) {
        this.f15854u.b0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void l(int i10, float f10) {
        this.f15852s[i10] = f10;
        this.f15853t[i10] = false;
        s1();
    }

    public void l1(float f10) {
        this.f15854u.d0(f10);
    }

    public final boolean m0() {
        com.facebook.yoga.r rVar = this.f15854u;
        return rVar != null && rVar.n();
    }

    public void m1(float f10) {
        this.f15854u.e0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final int n() {
        ArrayList arrayList = this.f15846m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public boolean n0() {
        return false;
    }

    public void n1(float f10) {
        this.f15854u.f0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final int W(C1383t0 c1383t0) {
        ArrayList arrayList = this.f15840g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(c1383t0);
    }

    public void o1(float f10) {
        this.f15854u.g0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final int o(C1383t0 c1383t0) {
        p004a3.a.c(this.f15846m);
        return this.f15846m.indexOf(c1383t0);
    }

    public void p1() {
        this.f15854u.o0();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final void q(int i10) {
        this.f15836c = i10;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public boolean E(C1383t0 c1383t0) {
        for (C1383t0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == c1383t0) {
                return true;
            }
        }
        return false;
    }

    public void q1(float f10) {
        this.f15854u.p0(f10);
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void r(E0 e10) {
        this.f15837d = e10;
    }

    public final boolean r0() {
        com.facebook.yoga.r rVar = this.f15854u;
        return rVar != null && rVar.o();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final YogaValue s() {
        return this.f15854u.m();
    }

    public boolean s0() {
        return this.f15854u.p();
    }

    public void setFlex(float f10) {
        this.f15854u.D(f10);
    }

    public void setFlexGrow(float f10) {
        this.f15854u.I(f10);
    }

    public void setFlexShrink(float f10) {
        this.f15854u.K(f10);
    }

    public void setShouldNotifyOnLayout(boolean z9) {
        this.f15838e = z9;
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public int t() {
        return this.f15848o;
    }

    public boolean t0() {
        return false;
    }

    public String toString() {
        return "[" + this.f15835b + " " + M() + "]";
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void u(Object obj) {
    }

    public boolean u0() {
        return s0();
    }

    public final void v0() {
        com.facebook.yoga.r rVar = this.f15854u;
        if (rVar != null) {
            rVar.q();
        }
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final String w() {
        return (String) p004a3.a.c(this.f15835b);
    }

    public void w0() {
        if (this.f15839f) {
            return;
        }
        this.f15839f = true;
        C1383t0 parent = getParent();
        if (parent != null) {
            parent.w0();
        }
    }

    public void x0() {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public void y(int i10) {
        this.f15834a = i10;
    }

    public void y0(N0 n10) {
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    public final float z() {
        return this.f15854u.l();
    }

    @Override // com.facebook.react.uimanager.InterfaceC1381s0
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C1383t0 H(int i10) {
        ArrayList arrayList = this.f15840g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i10 + " out of bounds: node has no children");
        }
        C1383t0 c1383t0 = (C1383t0) arrayList.remove(i10);
        c1383t0.f15841h = null;
        if (this.f15854u != null && !u0()) {
            this.f15854u.r(i10);
        }
        w0();
        int iL0 = c1383t0.l0();
        this.f15844k -= iL0;
        r1(-iL0);
        return c1383t0;
    }
}
