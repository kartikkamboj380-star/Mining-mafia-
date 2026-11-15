package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3806i01 implements InterfaceC4557o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4431n f29226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3806i01 f29227d;

    public C3806i01(long j10, int i10) {
        a(j10, 65536);
    }

    public final void a(long j10, int i10) {
        AbstractC2418Ss0.i(this.f29226c == null);
        this.f29224a = j10;
        this.f29225b = j10 + 65536;
    }

    public final int b(long j10) {
        long j11 = j10 - this.f29224a;
        int i10 = this.f29226c.f31638b;
        return (int) j11;
    }

    public final C3806i01 c() {
        this.f29226c = null;
        C3806i01 c3806i01 = this.f29227d;
        this.f29227d = null;
        return c3806i01;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4557o
    public final C4431n zzd() {
        C4431n c4431n = this.f29226c;
        c4431n.getClass();
        return c4431n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4557o
    public final InterfaceC4557o zze() {
        C3806i01 c3806i01 = this.f29227d;
        if (c3806i01 == null || c3806i01.f29226c == null) {
            return null;
        }
        return c3806i01;
    }
}
