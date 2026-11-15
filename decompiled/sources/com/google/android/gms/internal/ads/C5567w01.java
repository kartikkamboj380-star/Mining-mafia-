package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5567w01 implements InterfaceC4812q01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4812q01 f34446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34447b;

    public C5567w01(InterfaceC4812q01 interfaceC4812q01, long j10) {
        this.f34446a = interfaceC4812q01;
        this.f34447b = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final int a(ZR0 zr0, C5741xO0 c5741xO0, int i10) {
        int iA = this.f34446a.a(zr0, c5741xO0, i10);
        if (iA != -4) {
            return iA;
        }
        c5741xO0.f34805f += this.f34447b;
        return -4;
    }

    public final InterfaceC4812q01 b() {
        return this.f34446a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final int c(long j10) {
        return this.f34446a.c(j10 - this.f34447b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final boolean zzb() {
        return this.f34446a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4812q01
    public final void zzc() {
        this.f34446a.zzc();
    }
}
