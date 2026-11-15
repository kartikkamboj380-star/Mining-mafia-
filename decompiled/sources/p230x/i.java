package p230x;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f50478o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f50479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50480b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f50484f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f50488j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50481c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f50482d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50483e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50485g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f50486h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f50487i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f50489k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f50490l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f50491m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    HashSet f50492n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f50488j = aVar;
    }

    static void b() {
        f50478o++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f50490l;
            if (i10 >= i11) {
                b[] bVarArr = this.f50489k;
                if (i11 >= bVarArr.length) {
                    this.f50489k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f50489k;
                int i12 = this.f50490l;
                bVarArr2[i12] = bVar;
                this.f50490l = i12 + 1;
                return;
            }
            if (this.f50489k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f50490l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f50489k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f50489k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f50490l--;
                return;
            }
            i11++;
        }
    }

    public void d() {
        this.f50480b = null;
        this.f50488j = a.UNKNOWN;
        this.f50483e = 0;
        this.f50481c = -1;
        this.f50482d = -1;
        this.f50484f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f50485g = false;
        int i10 = this.f50490l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f50489k[i11] = null;
        }
        this.f50490l = 0;
        this.f50491m = 0;
        this.f50479a = false;
        Arrays.fill(this.f50487i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public void e(d dVar, float f10) {
        this.f50484f = f10;
        this.f50485g = true;
        int i10 = this.f50490l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f50489k[i11].B(dVar, this, false);
        }
        this.f50490l = 0;
    }

    public void f(a aVar, String str) {
        this.f50488j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f50490l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f50489k[i11].C(bVar, false);
        }
        this.f50490l = 0;
    }

    public String toString() {
        if (this.f50480b != null) {
            return "" + this.f50480b;
        }
        return "" + this.f50481c;
    }
}
