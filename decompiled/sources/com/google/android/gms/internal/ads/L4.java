package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class L4 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M4[] f20359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20360c;

    public L4(long j10, M4[] m4Arr, int i10) {
        this.f20358a = j10;
        this.f20359b = m4Arr;
        this.f20360c = i10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i10;
        long jA;
        long jA2;
        X4 x10;
        int iB;
        M4[] m4Arr = this.f20359b;
        if (m4Arr.length == 0) {
            C4437n2 c4437n2 = C4437n2.f31650c;
            return new C4059k2(c4437n2, c4437n2);
        }
        int i11 = this.f20360c;
        if (i11 != -1) {
            X4 x11 = m4Arr[i11].f20744b;
            int iJ = N4.j(x11, j10);
            if (iJ == -1) {
                C4437n2 c4437n3 = C4437n2.f31650c;
                return new C4059k2(c4437n3, c4437n3);
            }
            long[] jArr = x11.f25134f;
            j12 = jArr[iJ];
            long[] jArr2 = x11.f25131c;
            j11 = jArr2[iJ];
            if (j12 < j10 && iJ < x11.f25130b - 1 && (iB = x11.b(j10)) != -1 && iB != iJ) {
                j13 = jArr[iB];
                j14 = jArr2[iB];
            }
            jA = j11;
            jA2 = j14;
            for (i10 = 0; i10 < m4Arr.length; i10++) {
                if (i10 != i11) {
                    x10 = m4Arr[i10].f20744b;
                    jA = N4.a(x10, j12, jA);
                    if (j13 != -9223372036854775807L) {
                        jA2 = N4.a(x10, j13, jA2);
                    }
                }
            }
            C4437n2 c4437n4 = new C4437n2(j12, jA);
            return j13 == -9223372036854775807L ? new C4059k2(c4437n4, c4437n4) : new C4059k2(c4437n4, new C4437n2(j13, jA2));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        j13 = -9223372036854775807L;
        j14 = -1;
        jA = j11;
        jA2 = j14;
        while (i10 < m4Arr.length) {
            if (i10 != i11) {
                x10 = m4Arr[i10].f20744b;
                jA = N4.a(x10, j12, jA);
                if (j13 != -9223372036854775807L) {
                    jA2 = N4.a(x10, j13, jA2);
                }
            }
        }
        C4437n2 c4437n5 = new C4437n2(j12, jA);
        if (j13 == -9223372036854775807L) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f20358a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}
