package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3058c4 implements InterfaceC3687h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f27009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f27010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f27011c;

    private C3058c4(long[] jArr, long[] jArr2, long j10) {
        this.f27009a = jArr;
        this.f27010b = jArr2;
        this.f27011c = j10 == -9223372036854775807L ? AbstractC4634ob0.M(jArr2[jArr2.length - 1]) : j10;
    }

    public static C3058c4 d(long j10, H3 h10, long j11) {
        int[] iArr = h10.f19190e;
        int length = iArr.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (h10.f19188c + iArr[i12]);
            j12 += (long) (h10.f19189d + h10.f19191f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C3058c4(jArr, jArr2, j11);
    }

    private static Pair e(long j10, long[] jArr, long[] jArr2) {
        int I9 = AbstractC4634ob0.I(jArr, j10, true, true);
        long j11 = jArr[I9];
        long j12 = jArr2[I9];
        int i10 = I9 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        String str = AbstractC4634ob0.f32117a;
        Pair pairE = e(AbstractC4634ob0.L(Math.max(0L, Math.min(j10, this.f27011c))), this.f27010b, this.f27009a);
        C4437n2 c4437n2 = new C4437n2(AbstractC4634ob0.M(((Long) pairE.first).longValue()), ((Long) pairE.second).longValue());
        return new C4059k2(c4437n2, c4437n2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long b() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long c(long j10) {
        return AbstractC4634ob0.M(((Long) e(j10, this.f27009a, this.f27010b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f27011c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final int zzg() {
        return -2147483647;
    }
}
