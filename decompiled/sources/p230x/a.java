package p230x;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f50423l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f50425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f50426c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f50424a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50427d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f50428e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f50429f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f50430g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f50431h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50432i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50433j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f50434k = false;

    a(b bVar, c cVar) {
        this.f50425b = bVar;
        this.f50426c = cVar;
    }

    @Override // x.b.a
    public final float a(i iVar) {
        int i10 = this.f50432i;
        for (int i11 = 0; i10 != -1 && i11 < this.f50424a; i11++) {
            if (this.f50429f[i10] == iVar.f50481c) {
                return this.f50431h[i10];
            }
            i10 = this.f50430g[i10];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // x.b.a
    public final void b(i iVar, float f10) {
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e(iVar, true);
            return;
        }
        int i10 = this.f50432i;
        if (i10 == -1) {
            this.f50432i = 0;
            this.f50431h[0] = f10;
            this.f50429f[0] = iVar.f50481c;
            this.f50430g[0] = -1;
            iVar.f50491m++;
            iVar.a(this.f50425b);
            this.f50424a++;
            if (this.f50434k) {
                return;
            }
            int i11 = this.f50433j + 1;
            this.f50433j = i11;
            int[] iArr = this.f50429f;
            if (i11 >= iArr.length) {
                this.f50434k = true;
                this.f50433j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f50424a; i13++) {
            int i14 = this.f50429f[i10];
            int i15 = iVar.f50481c;
            if (i14 == i15) {
                this.f50431h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f50430g[i10];
        }
        int length = this.f50433j;
        int i16 = length + 1;
        if (this.f50434k) {
            int[] iArr2 = this.f50429f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f50429f;
        if (length >= iArr3.length && this.f50424a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f50429f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f50429f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f50427d * 2;
            this.f50427d = i18;
            this.f50434k = false;
            this.f50433j = length - 1;
            this.f50431h = Arrays.copyOf(this.f50431h, i18);
            this.f50429f = Arrays.copyOf(this.f50429f, this.f50427d);
            this.f50430g = Arrays.copyOf(this.f50430g, this.f50427d);
        }
        this.f50429f[length] = iVar.f50481c;
        this.f50431h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f50430g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f50430g[length] = this.f50432i;
            this.f50432i = length;
        }
        iVar.f50491m++;
        iVar.a(this.f50425b);
        int i19 = this.f50424a + 1;
        this.f50424a = i19;
        if (!this.f50434k) {
            this.f50433j++;
        }
        int[] iArr7 = this.f50429f;
        if (i19 >= iArr7.length) {
            this.f50434k = true;
        }
        if (this.f50433j >= iArr7.length) {
            this.f50434k = true;
            this.f50433j = iArr7.length - 1;
        }
    }

    @Override // x.b.a
    public i c(int i10) {
        int i11 = this.f50432i;
        for (int i12 = 0; i11 != -1 && i12 < this.f50424a; i12++) {
            if (i12 == i10) {
                return this.f50426c.f50444d[this.f50429f[i11]];
            }
            i11 = this.f50430g[i11];
        }
        return null;
    }

    @Override // x.b.a
    public final void clear() {
        int i10 = this.f50432i;
        for (int i11 = 0; i10 != -1 && i11 < this.f50424a; i11++) {
            i iVar = this.f50426c.f50444d[this.f50429f[i10]];
            if (iVar != null) {
                iVar.c(this.f50425b);
            }
            i10 = this.f50430g[i10];
        }
        this.f50432i = -1;
        this.f50433j = -1;
        this.f50434k = false;
        this.f50424a = 0;
    }

    @Override // x.b.a
    public void d() {
        int i10 = this.f50432i;
        for (int i11 = 0; i10 != -1 && i11 < this.f50424a; i11++) {
            float[] fArr = this.f50431h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f50430g[i10];
        }
    }

    @Override // x.b.a
    public final float e(i iVar, boolean z9) {
        if (this.f50428e == iVar) {
            this.f50428e = null;
        }
        int i10 = this.f50432i;
        if (i10 == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f50424a) {
            if (this.f50429f[i10] == iVar.f50481c) {
                if (i10 == this.f50432i) {
                    this.f50432i = this.f50430g[i10];
                } else {
                    int[] iArr = this.f50430g;
                    iArr[i12] = iArr[i10];
                }
                if (z9) {
                    iVar.c(this.f50425b);
                }
                iVar.f50491m--;
                this.f50424a--;
                this.f50429f[i10] = -1;
                if (this.f50434k) {
                    this.f50433j = i10;
                }
                return this.f50431h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f50430g[i10];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // x.b.a
    public float f(b bVar, boolean z9) {
        float fA = a(bVar.f50435a);
        e(bVar.f50435a, z9);
        b.a aVar = bVar.f50439e;
        int iG = aVar.g();
        for (int i10 = 0; i10 < iG; i10++) {
            i iVarC = aVar.c(i10);
            i(iVarC, aVar.a(iVarC) * fA, z9);
        }
        return fA;
    }

    @Override // x.b.a
    public int g() {
        return this.f50424a;
    }

    @Override // x.b.a
    public float h(int i10) {
        int i11 = this.f50432i;
        for (int i12 = 0; i11 != -1 && i12 < this.f50424a; i12++) {
            if (i12 == i10) {
                return this.f50431h[i11];
            }
            i11 = this.f50430g[i11];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // x.b.a
    public void i(i iVar, float f10, boolean z9) {
        float f11 = f50423l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f50432i;
            if (i10 == -1) {
                this.f50432i = 0;
                this.f50431h[0] = f10;
                this.f50429f[0] = iVar.f50481c;
                this.f50430g[0] = -1;
                iVar.f50491m++;
                iVar.a(this.f50425b);
                this.f50424a++;
                if (this.f50434k) {
                    return;
                }
                int i11 = this.f50433j + 1;
                this.f50433j = i11;
                int[] iArr = this.f50429f;
                if (i11 >= iArr.length) {
                    this.f50434k = true;
                    this.f50433j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f50424a; i13++) {
                int i14 = this.f50429f[i10];
                int i15 = iVar.f50481c;
                if (i14 == i15) {
                    float[] fArr = this.f50431h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f50423l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (i10 == this.f50432i) {
                            this.f50432i = this.f50430g[i10];
                        } else {
                            int[] iArr2 = this.f50430g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z9) {
                            iVar.c(this.f50425b);
                        }
                        if (this.f50434k) {
                            this.f50433j = i10;
                        }
                        iVar.f50491m--;
                        this.f50424a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f50430g[i10];
            }
            int length = this.f50433j;
            int i16 = length + 1;
            if (this.f50434k) {
                int[] iArr3 = this.f50429f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f50429f;
            if (length >= iArr4.length && this.f50424a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f50429f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f50429f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f50427d * 2;
                this.f50427d = i18;
                this.f50434k = false;
                this.f50433j = length - 1;
                this.f50431h = Arrays.copyOf(this.f50431h, i18);
                this.f50429f = Arrays.copyOf(this.f50429f, this.f50427d);
                this.f50430g = Arrays.copyOf(this.f50430g, this.f50427d);
            }
            this.f50429f[length] = iVar.f50481c;
            this.f50431h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f50430g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f50430g[length] = this.f50432i;
                this.f50432i = length;
            }
            iVar.f50491m++;
            iVar.a(this.f50425b);
            this.f50424a++;
            if (!this.f50434k) {
                this.f50433j++;
            }
            int i19 = this.f50433j;
            int[] iArr8 = this.f50429f;
            if (i19 >= iArr8.length) {
                this.f50434k = true;
                this.f50433j = iArr8.length - 1;
            }
        }
    }

    @Override // x.b.a
    public void j(float f10) {
        int i10 = this.f50432i;
        for (int i11 = 0; i10 != -1 && i11 < this.f50424a; i11++) {
            float[] fArr = this.f50431h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f50430g[i10];
        }
    }

    @Override // x.b.a
    public boolean k(i iVar) {
        int i10 = this.f50432i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f50424a; i11++) {
            if (this.f50429f[i10] == iVar.f50481c) {
                return true;
            }
            i10 = this.f50430g[i10];
        }
        return false;
    }

    public String toString() {
        int i10 = this.f50432i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f50424a; i11++) {
            str = ((str + " -> ") + this.f50431h[i10] + " : ") + this.f50426c.f50444d[this.f50429f[i10]];
            i10 = this.f50430g[i10];
        }
        return str;
    }
}
