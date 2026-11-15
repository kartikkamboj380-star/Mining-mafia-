package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5066s2 extends W1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f33071b;

    public C5066s2(J1 j10, long j11) {
        super(j10);
        AbstractC2418Ss0.a(j10.zzn() >= j11);
        this.f33071b = j11;
    }

    @Override // com.google.android.gms.internal.ads.W1, com.google.android.gms.internal.ads.J1
    public final long e() {
        return super.e() - this.f33071b;
    }

    @Override // com.google.android.gms.internal.ads.W1, com.google.android.gms.internal.ads.J1
    public final long zzn() {
        return super.zzn() - this.f33071b;
    }

    @Override // com.google.android.gms.internal.ads.W1, com.google.android.gms.internal.ads.J1
    public final long zzo() {
        return super.zzo() - this.f33071b;
    }
}
