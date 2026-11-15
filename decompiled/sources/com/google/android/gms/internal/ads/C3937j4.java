package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3937j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3431f2 f30288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f30289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f30290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f30293f;

    private C3937j4(C3431f2 c3431f2, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f30288a = new C3431f2(c3431f2);
        this.f30289b = j10;
        this.f30290c = j11;
        this.f30293f = jArr;
        this.f30291d = i10;
        this.f30292e = i11;
    }

    public static C3937j4 a(C3431f2 c3431f2, P10 p10) {
        long[] jArr;
        int i10;
        int i11;
        int iB = p10.b();
        int iH = (iB & 1) != 0 ? p10.h() : -1;
        long jY = (iB & 2) != 0 ? p10.Y() : -1L;
        if ((iB & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = p10.R();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iB & 8) != 0) {
            p10.J(4);
        }
        if (p10.C() >= 24) {
            p10.J(21);
            int iW = p10.W();
            i11 = iW & 4095;
            i10 = iW >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new C3937j4(c3431f2, iH, jY, jArr2, i10, i11);
    }

    public final long b() {
        long j10 = this.f30289b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        C3431f2 c3431f2 = this.f30288a;
        return AbstractC4634ob0.N((j10 * ((long) c3431f2.f28136g)) - 1, c3431f2.f28133d);
    }
}
