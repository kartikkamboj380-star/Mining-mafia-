package com.google.android.material.carousel;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f38911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f38912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f38913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f38914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f38915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f38916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f38917h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f38910a = i10;
        this.f38911b = I.a.a(f10, f11, f12);
        this.f38912c = i11;
        this.f38914e = f13;
        this.f38913d = i12;
        this.f38915f = f14;
        this.f38916g = i13;
        d(f15, f11, f12, f14);
        this.f38917h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f12 = i11 / 2.0f;
        return (f10 - ((i10 + f12) * f11)) / (i12 + f12);
    }

    private float b(float f10) {
        if (g()) {
            return Math.abs(f10 - this.f38915f) * this.f38910a;
        }
        return Float.MAX_VALUE;
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = length;
                    int i16 = i12;
                    int i17 = i10;
                    int i18 = length2;
                    int i19 = i14;
                    a aVar2 = new a(i17, f11, f12, f13, iArr[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f38917h < aVar.f38917h) {
                        if (aVar2.f38917h == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    int i20 = i17 + 1;
                    i14 = i19 + 1;
                    i12 = i16;
                    i10 = i20;
                    length = i15;
                    length2 = i18;
                }
                i12++;
                i10 = i10;
                length = length;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f();
        int i10 = this.f38912c;
        if (i10 > 0 && f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f15 = this.f38911b;
            this.f38911b = f15 + Math.min(f14 / i10, f12 - f15);
        } else if (i10 > 0 && f14 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f16 = this.f38911b;
            this.f38911b = f16 + Math.max(f14 / i10, f11 - f16);
        }
        int i11 = this.f38912c;
        float f17 = i11 > 0 ? this.f38911b : 0.0f;
        this.f38911b = f17;
        float fA = a(f10, i11, f17, this.f38913d, this.f38916g);
        this.f38915f = fA;
        float f18 = (this.f38911b + fA) / 2.0f;
        this.f38914e = f18;
        int i12 = this.f38913d;
        if (i12 <= 0 || fA == f13) {
            return;
        }
        float f19 = (f13 - fA) * this.f38916g;
        float fMin = Math.min(Math.abs(f19), f18 * 0.1f * i12);
        if (f19 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.f38914e -= fMin / this.f38913d;
            this.f38915f += fMin / this.f38916g;
        } else {
            this.f38914e += fMin / this.f38913d;
            this.f38915f -= fMin / this.f38916g;
        }
    }

    private float f() {
        return (this.f38915f * this.f38916g) + (this.f38914e * this.f38913d) + (this.f38911b * this.f38912c);
    }

    private boolean g() {
        int i10 = this.f38916g;
        if (i10 <= 0 || this.f38912c <= 0 || this.f38913d <= 0) {
            return i10 <= 0 || this.f38912c <= 0 || this.f38915f > this.f38911b;
        }
        float f10 = this.f38915f;
        float f11 = this.f38914e;
        return f10 > f11 && f11 > this.f38911b;
    }

    int e() {
        return this.f38912c + this.f38913d + this.f38916g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f38910a + ", smallCount=" + this.f38912c + ", smallSize=" + this.f38911b + ", mediumCount=" + this.f38913d + ", mediumSize=" + this.f38914e + ", largeCount=" + this.f38916g + ", largeSize=" + this.f38915f + ", cost=" + this.f38917h + "]";
    }
}
