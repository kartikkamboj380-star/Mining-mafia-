package p230x;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f50499n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50500a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50501b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50502c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f50503d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f50504e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f50505f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f50506g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f50507h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f50508i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f50509j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f50510k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f50511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f50512m;

    j(b bVar, c cVar) {
        this.f50511l = bVar;
        this.f50512m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f50481c % this.f50502c;
        int[] iArr2 = this.f50503d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f50504e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f50504e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f50505f[i10] = iVar.f50481c;
        this.f50506g[i10] = f10;
        this.f50507h[i10] = -1;
        this.f50508i[i10] = -1;
        iVar.a(this.f50511l);
        iVar.f50491m++;
        this.f50509j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f50501b; i10++) {
            if (this.f50505f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f50501b * 2;
        this.f50505f = Arrays.copyOf(this.f50505f, i10);
        this.f50506g = Arrays.copyOf(this.f50506g, i10);
        this.f50507h = Arrays.copyOf(this.f50507h, i10);
        this.f50508i = Arrays.copyOf(this.f50508i, i10);
        this.f50504e = Arrays.copyOf(this.f50504e, i10);
        for (int i11 = this.f50501b; i11 < i10; i11++) {
            this.f50505f[i11] = -1;
            this.f50504e[i11] = -1;
        }
        this.f50501b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f50507h[iN] = i10;
            int[] iArr = this.f50508i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f50507h[iN] = -1;
            if (this.f50509j > 0) {
                this.f50508i[iN] = this.f50510k;
                this.f50510k = iN;
            } else {
                this.f50508i[iN] = -1;
            }
        }
        int i11 = this.f50508i[iN];
        if (i11 != -1) {
            this.f50507h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f50481c;
        int i12 = i11 % this.f50502c;
        int[] iArr2 = this.f50503d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f50505f[i13] == i11) {
            int[] iArr3 = this.f50504e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f50504e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f50505f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f50505f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // x.b.a
    public float a(i iVar) {
        int iP = p(iVar);
        return iP != -1 ? this.f50506g[iP] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // x.b.a
    public void b(i iVar, float f10) {
        float f11 = f50499n;
        if (f10 > (-f11) && f10 < f11) {
            e(iVar, true);
            return;
        }
        if (this.f50509j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f50510k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f50506g[iP] = f10;
            return;
        }
        if (this.f50509j + 1 >= this.f50501b) {
            o();
        }
        int i10 = this.f50509j;
        int i11 = this.f50510k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f50505f[i11];
            int i15 = iVar.f50481c;
            if (i14 == i15) {
                this.f50506g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f50508i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // x.b.a
    public i c(int i10) {
        int i11 = this.f50509j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f50510k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f50512m.f50444d[this.f50505f[i12]];
            }
            i12 = this.f50508i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // x.b.a
    public void clear() {
        int i10 = this.f50509j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarC = c(i11);
            if (iVarC != null) {
                iVarC.c(this.f50511l);
            }
        }
        for (int i12 = 0; i12 < this.f50501b; i12++) {
            this.f50505f[i12] = -1;
            this.f50504e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f50502c; i13++) {
            this.f50503d[i13] = -1;
        }
        this.f50509j = 0;
        this.f50510k = -1;
    }

    @Override // x.b.a
    public void d() {
        int i10 = this.f50509j;
        int i11 = this.f50510k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f50506g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f50508i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // x.b.a
    public float e(i iVar, boolean z9) {
        int iP = p(iVar);
        if (iP == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        r(iVar);
        float f10 = this.f50506g[iP];
        if (this.f50510k == iP) {
            this.f50510k = this.f50508i[iP];
        }
        this.f50505f[iP] = -1;
        int[] iArr = this.f50507h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f50508i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f50508i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f50509j--;
        iVar.f50491m--;
        if (z9) {
            iVar.c(this.f50511l);
        }
        return f10;
    }

    @Override // x.b.a
    public float f(b bVar, boolean z9) {
        float fA = a(bVar.f50435a);
        e(bVar.f50435a, z9);
        j jVar = (j) bVar.f50439e;
        int iG = jVar.g();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iG) {
            int i12 = jVar.f50505f[i11];
            if (i12 != -1) {
                i(this.f50512m.f50444d[i12], jVar.f50506g[i11] * fA, z9);
                i10++;
            }
            i11++;
        }
        return fA;
    }

    @Override // x.b.a
    public int g() {
        return this.f50509j;
    }

    @Override // x.b.a
    public float h(int i10) {
        int i11 = this.f50509j;
        int i12 = this.f50510k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f50506g[i12];
            }
            i12 = this.f50508i[i12];
            if (i12 == -1) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // x.b.a
    public void i(i iVar, float f10, boolean z9) {
        float f11 = f50499n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                b(iVar, f10);
                return;
            }
            float[] fArr = this.f50506g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f50499n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            e(iVar, z9);
        }
    }

    @Override // x.b.a
    public void j(float f10) {
        int i10 = this.f50509j;
        int i11 = this.f50510k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f50506g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f50508i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // x.b.a
    public boolean k(i iVar) {
        return p(iVar) != -1;
    }

    public int p(i iVar) {
        if (this.f50509j == 0) {
            return -1;
        }
        int i10 = iVar.f50481c;
        int i11 = this.f50503d[i10 % this.f50502c];
        if (i11 == -1) {
            return -1;
        }
        if (this.f50505f[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f50504e[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f50505f[i11] != i10);
        if (i11 != -1 && this.f50505f[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f50509j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarC = c(i11);
            if (iVarC != null) {
                String str2 = str + iVarC + " = " + h(i11) + " ";
                int iP = p(iVarC);
                String str3 = str2 + "[p: ";
                String str4 = (this.f50507h[iP] != -1 ? str3 + this.f50512m.f50444d[this.f50505f[this.f50507h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f50508i[iP] != -1 ? str4 + this.f50512m.f50444d[this.f50505f[this.f50508i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
