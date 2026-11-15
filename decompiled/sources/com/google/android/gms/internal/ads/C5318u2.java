package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5318u2 implements L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f33719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L1 f33720b;

    public C5318u2(long j10, L1 l10) {
        this.f33719a = j10;
        this.f33720b = l10;
    }

    final /* synthetic */ long a() {
        return this.f33719a;
    }

    @Override // com.google.android.gms.internal.ads.L1
    public final InterfaceC5570w2 b(int i10, int i11) {
        return this.f33720b.b(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.L1
    public final void o(InterfaceC4311m2 interfaceC4311m2) {
        this.f33720b.o(new C5192t2(this, interfaceC4311m2, interfaceC4311m2));
    }

    @Override // com.google.android.gms.internal.ads.L1
    public final void q() {
        this.f33720b.q();
    }
}
