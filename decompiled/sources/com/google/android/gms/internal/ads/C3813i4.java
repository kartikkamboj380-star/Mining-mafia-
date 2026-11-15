package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3813i4 implements InterfaceC3687h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f29247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f29248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f29251e;

    private C3813i4(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f29247a = jArr;
        this.f29248b = jArr2;
        this.f29249c = j10;
        this.f29250d = j12;
        this.f29251e = i10;
    }

    public static C3813i4 d(long j10, long j11, C3431f2 c3431f2, P10 p10) {
        int iR;
        P10 p11 = p10;
        p11.J(6);
        int iB = p11.b();
        long j12 = c3431f2.f28132c;
        long j13 = iB;
        int iB2 = p11.b();
        if (iB2 <= 0) {
            return null;
        }
        long jN = AbstractC4634ob0.N((((long) iB2) * ((long) c3431f2.f28136g)) - 1, c3431f2.f28133d);
        int iS = p11.S();
        int iS2 = p11.S();
        int iS3 = p11.S();
        p11.J(2);
        long[] jArr = new long[iS];
        long[] jArr2 = new long[iS];
        int i10 = 0;
        long j14 = j11 + ((long) c3431f2.f28132c);
        while (i10 < iS) {
            long j15 = j12;
            jArr[i10] = (((long) i10) * jN) / ((long) iS);
            jArr2[i10] = j14;
            if (iS3 == 1) {
                iR = p11.R();
            } else if (iS3 == 2) {
                iR = p11.S();
            } else if (iS3 == 3) {
                iR = p11.W();
            } else {
                if (iS3 != 4) {
                    return null;
                }
                iR = p11.h();
            }
            j14 += ((long) iR) * ((long) iS2);
            i10++;
            p11 = p10;
            iS = iS;
            j12 = j15;
        }
        long j16 = j11 + j12;
        long jMax = j16 + j13;
        if (j10 != -1 && j10 != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 27 + String.valueOf(jMax).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j10);
            sb.append(", ");
            sb.append(jMax);
            YU.c("VbriSeeker", sb.toString());
        }
        if (jMax != j14) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMax).length() + 43 + String.valueOf(j14).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(jMax);
            sb2.append(", ");
            sb2.append(j14);
            sb2.append("\nSeeking will be inaccurate.");
            YU.c("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j14);
        }
        return new C3813i4(jArr, jArr2, jN, j16, jMax, c3431f2.f28135f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        long[] jArr = this.f29247a;
        int I9 = AbstractC4634ob0.I(jArr, j10, true, true);
        long j11 = jArr[I9];
        long[] jArr2 = this.f29248b;
        C4437n2 c4437n2 = new C4437n2(j11, jArr2[I9]);
        if (c4437n2.f31651a >= j10 || I9 == jArr.length - 1) {
            return new C4059k2(c4437n2, c4437n2);
        }
        int i10 = I9 + 1;
        return new C4059k2(c4437n2, new C4437n2(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long b() {
        return this.f29250d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long c(long j10) {
        return this.f29247a[AbstractC4634ob0.I(this.f29248b, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f29249c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final int zzg() {
        return this.f29251e;
    }
}
