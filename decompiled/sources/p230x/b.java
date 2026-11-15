package p230x;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f50439e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f50435a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f50436b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f50437c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f50438d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f50440f = false;

    public interface a {
        float a(i iVar);

        void b(i iVar, float f10);

        i c(int i10);

        void clear();

        void d();

        float e(i iVar, boolean z9);

        float f(b bVar, boolean z9);

        int g();

        float h(int i10);

        void i(i iVar, float f10, boolean z9);

        void j(float f10);

        boolean k(i iVar);
    }

    public b() {
    }

    private boolean v(i iVar, d dVar) {
        return iVar.f50491m <= 1;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int iG = this.f50439e.g();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iG; i10++) {
            float fH = this.f50439e.h(i10);
            if (fH < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                i iVarC = this.f50439e.c(i10);
                if ((zArr == null || !zArr[iVarC.f50481c]) && iVarC != iVar && (((aVar = iVarC.f50488j) == i.a.SLACK || aVar == i.a.ERROR) && fH < f10)) {
                    f10 = fH;
                    iVar2 = iVarC;
                }
            }
        }
        return iVar2;
    }

    String A() {
        boolean z9;
        String str = (this.f50435a == null ? "0" : "" + this.f50435a) + " = ";
        if (this.f50436b != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            str = str + this.f50436b;
            z9 = true;
        } else {
            z9 = false;
        }
        int iG = this.f50439e.g();
        for (int i10 = 0; i10 < iG; i10++) {
            i iVarC = this.f50439e.c(i10);
            if (iVarC != null) {
                float fH = this.f50439e.h(i10);
                if (fH != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    String string = iVarC.toString();
                    if (z9) {
                        if (fH > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fH *= -1.0f;
                        }
                    } else if (fH < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        str = str + "- ";
                        fH *= -1.0f;
                    }
                    str = fH == 1.0f ? str + string : str + fH + " " + string;
                    z9 = true;
                }
            }
        }
        if (z9) {
            return str;
        }
        return str + "0.0";
    }

    public void B(d dVar, i iVar, boolean z9) {
        if (iVar.f50485g) {
            this.f50436b += iVar.f50484f * this.f50439e.a(iVar);
            this.f50439e.e(iVar, z9);
            if (z9) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z9) {
        this.f50436b += bVar.f50436b * this.f50439e.f(bVar, z9);
        if (z9) {
            bVar.f50435a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f50454f.length == 0) {
            return;
        }
        boolean z9 = false;
        while (!z9) {
            int iG = this.f50439e.g();
            for (int i10 = 0; i10 < iG; i10++) {
                i iVarC = this.f50439e.c(i10);
                if (iVarC.f50482d != -1 || iVarC.f50485g) {
                    this.f50438d.add(iVarC);
                }
            }
            if (this.f50438d.size() > 0) {
                ArrayList arrayList = this.f50438d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    i iVar = (i) obj;
                    if (iVar.f50485g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f50454f[iVar.f50482d], true);
                    }
                }
                this.f50438d.clear();
            } else {
                z9 = true;
            }
        }
    }

    @Override // x.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f50435a = null;
            this.f50439e.clear();
            for (int i10 = 0; i10 < bVar.f50439e.g(); i10++) {
                this.f50439e.i(bVar.f50439e.c(i10), bVar.f50439e.h(i10), true);
            }
        }
    }

    @Override // x.d.a
    public void b(i iVar) {
        int i10 = iVar.f50483e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f50439e.b(iVar, f10);
    }

    @Override // x.d.a
    public i c(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // x.d.a
    public void clear() {
        this.f50439e.clear();
        this.f50435a = null;
        this.f50436b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public b d(d dVar, int i10) {
        this.f50439e.b(dVar.o(i10, "ep"), 1.0f);
        this.f50439e.b(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f50439e.b(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z9;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z9 = true;
        } else {
            y(iVarG);
            z9 = false;
        }
        if (this.f50439e.g() == 0) {
            this.f50440f = true;
        }
        return z9;
    }

    i g(d dVar) {
        int iG = this.f50439e.g();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z9 = false;
        boolean z10 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iG; i10++) {
            float fH = this.f50439e.h(i10);
            i iVarC = this.f50439e.c(i10);
            if (iVarC.f50488j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fH) {
                    boolean zV = v(iVarC, dVar);
                    z9 = zV;
                    f10 = fH;
                    iVar = iVarC;
                } else if (!z9 && v(iVarC, dVar)) {
                    f10 = fH;
                    iVar = iVarC;
                    z9 = true;
                }
            } else if (iVar == null && fH < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (iVar2 == null || f11 > fH) {
                    boolean zV2 = v(iVarC, dVar);
                    z10 = zV2;
                    f11 = fH;
                    iVar2 = iVarC;
                } else if (!z10 && v(iVarC, dVar)) {
                    f11 = fH;
                    iVar2 = iVarC;
                    z10 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // x.d.a
    public i getKey() {
        return this.f50435a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar4, 1.0f);
            this.f50439e.b(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar2, -1.0f);
            this.f50439e.b(iVar3, -1.0f);
            this.f50439e.b(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f50436b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f50439e.b(iVar, -1.0f);
                this.f50439e.b(iVar2, 1.0f);
                this.f50436b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f50439e.b(iVar4, -1.0f);
                this.f50439e.b(iVar3, 1.0f);
                this.f50436b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f50439e.b(iVar, f11 * 1.0f);
            this.f50439e.b(iVar2, f11 * (-1.0f));
            this.f50439e.b(iVar3, (-1.0f) * f10);
            this.f50439e.b(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f50436b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f50435a = iVar;
        float f10 = i10;
        iVar.f50484f = f10;
        this.f50436b = f10;
        this.f50440f = true;
        return this;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f50439e.b(iVar, -1.0f);
        this.f50439e.b(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f50439e.b(iVar, -1.0f);
        this.f50439e.b(iVar2, 1.0f);
        this.f50439e.b(iVar3, f10);
        this.f50439e.b(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f50436b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 == f12) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar2, -1.0f);
            this.f50439e.b(iVar4, 1.0f);
            this.f50439e.b(iVar3, -1.0f);
            return this;
        }
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar2, -1.0f);
            return this;
        }
        if (f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f50439e.b(iVar3, 1.0f);
            this.f50439e.b(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f50439e.b(iVar, 1.0f);
        this.f50439e.b(iVar2, -1.0f);
        this.f50439e.b(iVar4, f13);
        this.f50439e.b(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f50436b = i10 * (-1);
            this.f50439e.b(iVar, 1.0f);
            return this;
        }
        this.f50436b = i10;
        this.f50439e.b(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f50436b = i10;
        }
        if (z9) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar2, -1.0f);
            return this;
        }
        this.f50439e.b(iVar, -1.0f);
        this.f50439e.b(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f50436b = i10;
        }
        if (z9) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar2, -1.0f);
            this.f50439e.b(iVar3, -1.0f);
            return this;
        }
        this.f50439e.b(iVar, -1.0f);
        this.f50439e.b(iVar2, 1.0f);
        this.f50439e.b(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z9 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z9 = true;
            }
            this.f50436b = i10;
        }
        if (z9) {
            this.f50439e.b(iVar, 1.0f);
            this.f50439e.b(iVar2, -1.0f);
            this.f50439e.b(iVar3, 1.0f);
            return this;
        }
        this.f50439e.b(iVar, -1.0f);
        this.f50439e.b(iVar2, 1.0f);
        this.f50439e.b(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f50439e.b(iVar3, 0.5f);
        this.f50439e.b(iVar4, 0.5f);
        this.f50439e.b(iVar, -0.5f);
        this.f50439e.b(iVar2, -0.5f);
        this.f50436b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f50436b;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f50436b = f10 * (-1.0f);
            this.f50439e.d();
        }
    }

    boolean s() {
        i iVar = this.f50435a;
        if (iVar != null) {
            return iVar.f50488j == i.a.UNRESTRICTED || this.f50436b >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f50439e.k(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f50435a == null && this.f50436b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f50439e.g() == 0;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    void y(i iVar) {
        i iVar2 = this.f50435a;
        if (iVar2 != null) {
            this.f50439e.b(iVar2, -1.0f);
            this.f50435a = null;
        }
        float fE = this.f50439e.e(iVar, true) * (-1.0f);
        this.f50435a = iVar;
        if (fE == 1.0f) {
            return;
        }
        this.f50436b /= fE;
        this.f50439e.j(fE);
    }

    public void z() {
        this.f50435a = null;
        this.f50439e.clear();
        this.f50436b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f50440f = false;
    }

    public b(c cVar) {
        this.f50439e = new p230x.a(this, cVar);
    }
}
