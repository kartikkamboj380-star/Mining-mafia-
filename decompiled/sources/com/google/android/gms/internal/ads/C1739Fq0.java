package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1739Fq0 implements InterfaceC1687Eq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2978bQ0 f18846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5043rr0 f18847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18848c;

    C1739Fq0(InterfaceC2978bQ0 interfaceC2978bQ0, C5043rr0 c5043rr0, C4148kk0 c4148kk0, long j10) {
        this.f18846a = interfaceC2978bQ0;
        this.f18847b = c5043rr0;
        this.f18848c = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1687Eq0
    public final boolean a(C2456Tl0 c2456Tl0) {
        if (c2456Tl0 == null || c2456Tl0.equals(C2456Tl0.i0())) {
            this.f18847b.b(15102);
            return false;
        }
        if (c2456Tl0.f0() == this.f18846a.zzb()) {
            return true;
        }
        this.f18847b.b(15103);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1687Eq0
    public final boolean b(C2456Tl0 c2456Tl0) {
        if (c2456Tl0 == null || c2456Tl0.equals(C2456Tl0.i0())) {
            this.f18847b.b(15104);
            return true;
        }
        if (c2456Tl0.f0() != this.f18846a.zzb()) {
            this.f18847b.b(15105);
            return true;
        }
        boolean z9 = (c2456Tl0.d0().f0() * 1000) - System.currentTimeMillis() <= this.f18848c;
        if (z9) {
            this.f18847b.b(15106);
        }
        return z9;
    }
}
