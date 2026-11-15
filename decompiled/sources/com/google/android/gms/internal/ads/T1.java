package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class T1 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V1 f23366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23367b;

    public T1(V1 v10, long j10) {
        this.f23366a = v10;
        this.f23367b = j10;
    }

    private final C4437n2 d(long j10, long j11) {
        return new C4437n2((j10 * 1000000) / ((long) this.f23366a.f24161e), this.f23367b + j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        V1 v10 = this.f23366a;
        U1 u10 = v10.f24167k;
        u10.getClass();
        long jB = v10.b(j10);
        long[] jArr = u10.f23893a;
        int I9 = AbstractC4634ob0.I(jArr, jB, true, false);
        long j11 = I9 == -1 ? 0L : jArr[I9];
        long[] jArr2 = u10.f23894b;
        C4437n2 c4437n2D = d(j11, I9 != -1 ? jArr2[I9] : 0L);
        if (c4437n2D.f31651a == j10 || I9 == jArr.length - 1) {
            return new C4059k2(c4437n2D, c4437n2D);
        }
        int i10 = I9 + 1;
        return new C4059k2(c4437n2D, d(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f23366a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}
