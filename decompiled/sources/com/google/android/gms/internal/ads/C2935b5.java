package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2935b5 implements InterfaceC3689h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V1 f26710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U1 f26711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26712c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26713d = -1;

    public C2935b5(V1 v10, U1 u10) {
        this.f26710a = v10;
        this.f26711b = u10;
    }

    public final void a(long j10) {
        this.f26712c = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3689h5
    public final void b(long j10) {
        long[] jArr = this.f26711b.f23893a;
        this.f26713d = jArr[AbstractC4634ob0.I(jArr, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3689h5
    public final long e(J1 j10) {
        long j11 = this.f26713d;
        if (j11 < 0) {
            return -1L;
        }
        this.f26713d = -1L;
        return -(j11 + 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3689h5
    public final InterfaceC4311m2 zzc() {
        AbstractC2418Ss0.i(this.f26712c != -1);
        return new T1(this.f26710a, this.f26712c);
    }
}
