package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3431f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28136g;

    public C3431f2() {
    }

    public final boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!AbstractC3557g2.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = i13 - 1;
        this.f28130a = i11;
        this.f28131b = AbstractC3557g2.f28545a[3 - i12];
        int i16 = AbstractC3557g2.f28546b[i14];
        this.f28133d = i16;
        if (i11 == 2) {
            i16 /= 2;
            this.f28133d = i16;
        } else if (i11 == 0) {
            i16 /= 4;
            this.f28133d = i16;
        }
        int i17 = (i10 >>> 9) & 1;
        this.f28136g = AbstractC3557g2.m(i11, i12);
        if (i12 == 3) {
            int i18 = i11 == 3 ? AbstractC3557g2.f28547c[i15] : AbstractC3557g2.f28548d[i15];
            this.f28135f = i18;
            this.f28132c = (((i18 * 12) / i16) + i17) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? AbstractC3557g2.f28549e[i15] : AbstractC3557g2.f28550f[i15];
                this.f28135f = i19;
                this.f28132c = ((i19 * 144) / i16) + i17;
            } else {
                int i20 = AbstractC3557g2.f28551g[i15];
                this.f28135f = i20;
                this.f28132c = (((i12 == 1 ? 72 : 144) * i20) / i16) + i17;
            }
        }
        this.f28134e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public C3431f2(C3431f2 c3431f2) {
        this.f28130a = c3431f2.f28130a;
        this.f28131b = c3431f2.f28131b;
        this.f28132c = c3431f2.f28132c;
        this.f28133d = c3431f2.f28133d;
        this.f28134e = c3431f2.f28134e;
        this.f28135f = c3431f2.f28135f;
        this.f28136g = c3431f2.f28136g;
    }
}
