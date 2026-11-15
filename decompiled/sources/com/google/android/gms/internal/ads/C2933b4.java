package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2933b4 extends AbstractC5820y1 implements InterfaceC3687h4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f26705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f26708j;

    public C2933b4(long j10, long j11, int i10, int i11, boolean z9) {
        super(j10, j11, i10, i11, false);
        this.f26705g = j11;
        this.f26706h = i10;
        this.f26707i = i11;
        this.f26708j = j10 != -1 ? j10 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long b() {
        return this.f26708j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final long c(long j10) {
        return d(j10);
    }

    public final C2933b4 f(long j10) {
        return new C2933b4(j10, this.f26705g, this.f26706h, this.f26707i, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3687h4
    public final int zzg() {
        return this.f26706h;
    }
}
