package p230x;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashMap;
import p240y.e;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f50445q = 1000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f50446r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static long f50447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f50448t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f50451c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    p230x.b[] f50454f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final c f50461m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f50464p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f50449a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f50450b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50452d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50453e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50455g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50456h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean[] f50457i = new boolean[32];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f50458j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f50459k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50460l = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i[] f50462n = new i[f50445q];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f50463o = 0;

    interface a {
        void a(a aVar);

        void b(i iVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();
    }

    class b extends p230x.b {
        public b(c cVar) {
            this.f50439e = new j(this, cVar);
        }
    }

    public d() {
        this.f50454f = null;
        this.f50454f = new p230x.b[32];
        C();
        c cVar = new c();
        this.f50461m = cVar;
        this.f50451c = new h(cVar);
        if (f50446r) {
            this.f50464p = new b(cVar);
        } else {
            this.f50464p = new p230x.b(cVar);
        }
    }

    private final int B(a aVar, boolean z9) {
        for (int i10 = 0; i10 < this.f50458j; i10++) {
            this.f50457i[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 < this.f50458j * 2) {
                if (aVar.getKey() != null) {
                    this.f50457i[aVar.getKey().f50481c] = true;
                }
                i iVarC = aVar.c(this, this.f50457i);
                if (iVarC != null) {
                    boolean[] zArr = this.f50457i;
                    int i12 = iVarC.f50481c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarC != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f50459k; i14++) {
                        p230x.b bVar = this.f50454f[i14];
                        if (bVar.f50435a.f50488j != i.a.UNRESTRICTED && !bVar.f50440f && bVar.t(iVarC)) {
                            float fA = bVar.f50439e.a(iVarC);
                            if (fA < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                float f11 = (-bVar.f50436b) / fA;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        p230x.b bVar2 = this.f50454f[i13];
                        bVar2.f50435a.f50482d = -1;
                        bVar2.y(iVarC);
                        i iVar = bVar2.f50435a;
                        iVar.f50482d = i13;
                        iVar.g(bVar2);
                    }
                } else {
                    z10 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f50446r) {
            while (true) {
                p230x.b[] bVarArr = this.f50454f;
                if (i10 >= bVarArr.length) {
                    return;
                }
                p230x.b bVar = bVarArr[i10];
                if (bVar != null) {
                    this.f50461m.f50441a.a(bVar);
                }
                this.f50454f[i10] = null;
                i10++;
            }
        } else {
            while (true) {
                p230x.b[] bVarArr2 = this.f50454f;
                if (i10 >= bVarArr2.length) {
                    return;
                }
                p230x.b bVar2 = bVarArr2[i10];
                if (bVar2 != null) {
                    this.f50461m.f50442b.a(bVar2);
                }
                this.f50454f[i10] = null;
                i10++;
            }
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f50461m.f50443c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i10 = this.f50463o;
        int i11 = f50445q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f50445q = i12;
            this.f50462n = (i[]) Arrays.copyOf(this.f50462n, i12);
        }
        i[] iVarArr = this.f50462n;
        int i13 = this.f50463o;
        this.f50463o = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private final void l(p230x.b bVar) {
        if (f50446r) {
            p230x.b bVar2 = this.f50454f[this.f50459k];
            if (bVar2 != null) {
                this.f50461m.f50441a.a(bVar2);
            }
        } else {
            p230x.b bVar3 = this.f50454f[this.f50459k];
            if (bVar3 != null) {
                this.f50461m.f50442b.a(bVar3);
            }
        }
        p230x.b[] bVarArr = this.f50454f;
        int i10 = this.f50459k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f50435a;
        iVar.f50482d = i10;
        this.f50459k = i10 + 1;
        iVar.g(bVar);
    }

    private void n() {
        for (int i10 = 0; i10 < this.f50459k; i10++) {
            p230x.b bVar = this.f50454f[i10];
            bVar.f50435a.f50484f = bVar.f50436b;
        }
    }

    public static p230x.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f50459k; i10++) {
            p230x.b bVar = this.f50454f[i10];
            if (bVar.f50435a.f50488j != i.a.UNRESTRICTED && bVar.f50436b < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                boolean z9 = false;
                int i11 = 0;
                while (!z9) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = -1;
                    int i13 = -1;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= this.f50459k) {
                            break;
                        }
                        p230x.b bVar2 = this.f50454f[i14];
                        if (bVar2.f50435a.f50488j != i.a.UNRESTRICTED && !bVar2.f50440f && bVar2.f50436b < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            for (int i16 = 1; i16 < this.f50458j; i16++) {
                                i iVar = this.f50461m.f50444d[i16];
                                float fA = bVar2.f50439e.a(iVar);
                                if (fA > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    for (int i17 = 0; i17 < 9; i17++) {
                                        float f11 = iVar.f50486h[i17] / fA;
                                        if ((f11 < f10 && i17 == i15) || i17 > i15) {
                                            f10 = f11;
                                            i12 = i14;
                                            i13 = i16;
                                            i15 = i17;
                                        }
                                    }
                                }
                            }
                        }
                        i14++;
                    }
                    if (i12 != -1) {
                        p230x.b bVar3 = this.f50454f[i12];
                        bVar3.f50435a.f50482d = -1;
                        bVar3.y(this.f50461m.f50444d[i13]);
                        i iVar2 = bVar3.f50435a;
                        iVar2.f50482d = i12;
                        iVar2.g(bVar3);
                    } else {
                        z9 = true;
                    }
                    if (i11 > this.f50458j / 2) {
                        z9 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f50452d * 2;
        this.f50452d = i10;
        this.f50454f = (p230x.b[]) Arrays.copyOf(this.f50454f, i10);
        c cVar = this.f50461m;
        cVar.f50444d = (i[]) Arrays.copyOf(cVar.f50444d, this.f50452d);
        int i11 = this.f50452d;
        this.f50457i = new boolean[i11];
        this.f50453e = i11;
        this.f50460l = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f50461m;
            i[] iVarArr = cVar.f50444d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f50443c.c(this.f50462n, this.f50463o);
        this.f50463o = 0;
        Arrays.fill(this.f50461m.f50444d, (Object) null);
        HashMap map = this.f50450b;
        if (map != null) {
            map.clear();
        }
        this.f50449a = 0;
        this.f50451c.clear();
        this.f50458j = 1;
        for (int i11 = 0; i11 < this.f50459k; i11++) {
            this.f50454f[i11].f50437c = false;
        }
        C();
        this.f50459k = 0;
        if (f50446r) {
            this.f50464p = new b(this.f50461m);
        } else {
            this.f50464p = new p230x.b(this.f50461m);
        }
    }

    public void b(e eVar, e eVar2, float f10, int i10) {
        y.d.b bVar = y.d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        y.d.b bVar2 = y.d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        y.d.b bVar3 = y.d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        y.d.b bVar4 = y.d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        p230x.b bVarR = r();
        double d10 = f10;
        double d11 = i10;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(bVarR);
        p230x.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        p230x.b bVarR = r();
        bVarR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            bVarR.d(this, i12);
        }
        d(bVarR);
    }

    public void d(p230x.b bVar) {
        i iVarW;
        if (bVar == null) {
            return;
        }
        boolean z9 = true;
        if (this.f50459k + 1 >= this.f50460l || this.f50458j + 1 >= this.f50453e) {
            y();
        }
        boolean z10 = false;
        if (!bVar.f50440f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f50435a = iVarP;
                l(bVar);
                this.f50464p.a(bVar);
                B(this.f50464p, true);
                if (iVarP.f50482d == -1) {
                    if (bVar.f50435a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        bVar.y(iVarW);
                    }
                    if (!bVar.f50440f) {
                        bVar.f50435a.g(bVar);
                    }
                    this.f50459k--;
                }
            } else {
                z9 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z10 = z9;
            }
        }
        if (z10) {
            return;
        }
        l(bVar);
    }

    public p230x.b e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f50485g && iVar.f50482d == -1) {
            iVar.e(this, iVar2.f50484f + i10);
            return null;
        }
        p230x.b bVarR = r();
        bVarR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            bVarR.d(this, i11);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i10) {
        int i11 = iVar.f50482d;
        if (i11 == -1) {
            iVar.e(this, i10);
            return;
        }
        if (i11 == -1) {
            p230x.b bVarR = r();
            bVarR.i(iVar, i10);
            d(bVarR);
            return;
        }
        p230x.b bVar = this.f50454f[i11];
        if (bVar.f50440f) {
            bVar.f50436b = i10;
            return;
        }
        if (bVar.f50439e.g() == 0) {
            bVar.f50440f = true;
            bVar.f50436b = i10;
        } else {
            p230x.b bVarR2 = r();
            bVarR2.m(iVar, i10);
            d(bVarR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z9) {
        p230x.b bVarR = r();
        i iVarT = t();
        iVarT.f50483e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        p230x.b bVarR = r();
        i iVarT = t();
        iVarT.f50483e = 0;
        bVarR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f50439e.a(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z9) {
        p230x.b bVarR = r();
        i iVarT = t();
        iVarT.f50483e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        p230x.b bVarR = r();
        i iVarT = t();
        iVarT.f50483e = 0;
        bVarR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(bVarR, (int) (bVarR.f50439e.a(iVarT) * (-1.0f)), i11);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        p230x.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    void m(p230x.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f50458j + 1 >= this.f50453e) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f50449a + 1;
        this.f50449a = i11;
        this.f50458j++;
        iVarA.f50481c = i11;
        iVarA.f50483e = i10;
        this.f50461m.f50444d[i11] = iVarA;
        this.f50451c.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f50458j + 1 >= this.f50453e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f50449a + 1;
        this.f50449a = i10;
        this.f50458j++;
        iVarA.f50481c = i10;
        this.f50461m.f50444d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarF = null;
        if (obj == null) {
            return null;
        }
        if (this.f50458j + 1 >= this.f50453e) {
            y();
        }
        if (obj instanceof p240y.d) {
            p240y.d dVar = (p240y.d) obj;
            iVarF = dVar.f();
            if (iVarF == null) {
                dVar.m(this.f50461m);
                iVarF = dVar.f();
            }
            int i10 = iVarF.f50481c;
            if (i10 != -1 && i10 <= this.f50449a && this.f50461m.f50444d[i10] != null) {
                return iVarF;
            }
            if (i10 != -1) {
                iVarF.d();
            }
            int i11 = this.f50449a + 1;
            this.f50449a = i11;
            this.f50458j++;
            iVarF.f50481c = i11;
            iVarF.f50488j = i.a.UNRESTRICTED;
            this.f50461m.f50444d[i11] = iVarF;
        }
        return iVarF;
    }

    public p230x.b r() {
        p230x.b bVar;
        if (f50446r) {
            bVar = (p230x.b) this.f50461m.f50441a.b();
            if (bVar == null) {
                bVar = new b(this.f50461m);
                f50448t++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (p230x.b) this.f50461m.f50442b.b();
            if (bVar == null) {
                bVar = new p230x.b(this.f50461m);
                f50447s++;
            } else {
                bVar.z();
            }
        }
        i.b();
        return bVar;
    }

    public i t() {
        if (this.f50458j + 1 >= this.f50453e) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f50449a + 1;
        this.f50449a = i10;
        this.f50458j++;
        iVarA.f50481c = i10;
        this.f50461m.f50444d[i10] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f50461m;
    }

    public int x(Object obj) {
        i iVarF = ((p240y.d) obj).f();
        if (iVarF != null) {
            return (int) (iVarF.f50484f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (!this.f50455g && !this.f50456h) {
            A(this.f50451c);
            return;
        }
        for (int i10 = 0; i10 < this.f50459k; i10++) {
            if (!this.f50454f[i10].f50440f) {
                A(this.f50451c);
                return;
            }
        }
        n();
    }
}
