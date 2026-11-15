package p230x;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends p230x.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f50469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f50470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f50472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f50473l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f50481c - iVar2.f50481c;
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f50475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f50476b;

        public b(h hVar) {
            this.f50476b = hVar;
        }

        public boolean c(i iVar, float f10) {
            boolean z9 = true;
            if (!this.f50475a.f50479a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f50487i[i10];
                    if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f50475a.f50487i[i10] = f12;
                    } else {
                        this.f50475a.f50487i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f50475a.f50487i;
                float f13 = fArr[i11] + (iVar.f50487i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f50475a.f50487i[i11] = 0.0f;
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                h.this.G(this.f50475a);
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f50475a.f50481c - ((i) obj).f50481c;
        }

        public void d(i iVar) {
            this.f50475a = iVar;
        }

        public final boolean e() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f50475a.f50487i[i10];
                if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return false;
                }
                if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(i iVar) {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = iVar.f50487i[i10];
                float f11 = this.f50475a.f50487i[i10];
                if (f11 != f10) {
                    if (f11 < f10) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void g() {
            Arrays.fill(this.f50475a.f50487i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public String toString() {
            String str = "[ ";
            if (this.f50475a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f50475a.f50487i[i10] + " ";
                }
            }
            return str + "] " + this.f50475a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f50468g = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.f50469h = new i[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f50470i = new i[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT];
        this.f50471j = 0;
        this.f50472k = new b(this);
        this.f50473l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f50471j + 1;
        i[] iVarArr = this.f50469h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f50469h = iVarArr2;
            this.f50470i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f50469h;
        int i12 = this.f50471j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f50471j = i13;
        if (i13 > 1 && iVarArr3[i12].f50481c > iVar.f50481c) {
            int i14 = 0;
            while (true) {
                i10 = this.f50471j;
                if (i14 >= i10) {
                    break;
                }
                this.f50470i[i14] = this.f50469h[i14];
                i14++;
            }
            Arrays.sort(this.f50470i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f50471j; i15++) {
                this.f50469h[i15] = this.f50470i[i15];
            }
        }
        iVar.f50479a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f50471j) {
            if (this.f50469h[i10] == iVar) {
                while (true) {
                    int i11 = this.f50471j;
                    if (i10 >= i11 - 1) {
                        this.f50471j = i11 - 1;
                        iVar.f50479a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f50469h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // p230x.b
    public void C(p230x.b bVar, boolean z9) {
        i iVar = bVar.f50435a;
        if (iVar == null) {
            return;
        }
        x.b.a aVar = bVar.f50439e;
        int iG = aVar.g();
        for (int i10 = 0; i10 < iG; i10++) {
            i iVarC = aVar.c(i10);
            float fH = aVar.h(i10);
            this.f50472k.d(iVarC);
            if (this.f50472k.c(iVar, fH)) {
                F(iVarC);
            }
            this.f50436b += bVar.f50436b * fH;
        }
        G(iVar);
    }

    @Override // p230x.b, x.d.a
    public void b(i iVar) {
        this.f50472k.d(iVar);
        this.f50472k.g();
        iVar.f50487i[iVar.f50483e] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // p230x.b, x.d.a
    public i c(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f50471j; i11++) {
            i iVar = this.f50469h[i11];
            if (!zArr[iVar.f50481c]) {
                this.f50472k.d(iVar);
                if (i10 == -1) {
                    if (this.f50472k.e()) {
                        i10 = i11;
                    }
                } else if (this.f50472k.f(this.f50469h[i10])) {
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f50469h[i10];
    }

    @Override // p230x.b, x.d.a
    public void clear() {
        this.f50471j = 0;
        this.f50436b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // p230x.b
    public String toString() {
        String str = " goal -> (" + this.f50436b + ") : ";
        for (int i10 = 0; i10 < this.f50471j; i10++) {
            this.f50472k.d(this.f50469h[i10]);
            str = str + this.f50472k + " ";
        }
        return str;
    }
}
