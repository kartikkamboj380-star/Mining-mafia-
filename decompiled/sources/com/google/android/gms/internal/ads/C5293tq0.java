package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5293tq0 implements InterfaceC4916qq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5031rl0 f33503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5031rl0 f33504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2978bQ0 f33505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C5043rr0 f33506d;

    C5293tq0(AbstractC5031rl0 abstractC5031rl0, AbstractC5031rl0 abstractC5031rl1, InterfaceC2978bQ0 interfaceC2978bQ0, C5043rr0 c5043rr0) {
        this.f33503a = abstractC5031rl0;
        this.f33504b = abstractC5031rl1;
        this.f33505c = interfaceC2978bQ0;
        this.f33506d = c5043rr0;
    }

    private final com.google.common.util.concurrent.p e(C2456Tl0 c2456Tl0) {
        com.google.common.util.concurrent.p pVarC = this.f33503a.c(c2456Tl0);
        this.f33506d.e(20303, pVarC);
        return pVarC;
    }

    private final com.google.common.util.concurrent.p f(byte[] bArr) {
        com.google.common.util.concurrent.p pVarC = this.f33504b.c(bArr);
        this.f33506d.e(20305, pVarC);
        return pVarC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p a(final C2456Tl0 c2456Tl0, byte[] bArr, byte[] bArr2) {
        com.google.common.util.concurrent.p pVarC = ((AbstractC5031rl0) this.f33505c.zzb()).c(bArr);
        this.f33506d.e(20307, pVarC);
        return (AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(AbstractC5685wx0.l(pVarC, f(bArr2))), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.rq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f33031a.d(c2456Tl0, (List) obj);
            }
        }, AbstractC2272Px0.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p b(final C2456Tl0 c2456Tl0, byte[] bArr) {
        return (AbstractC4678ox0) AbstractC5685wx0.j(AbstractC4678ox0.B(f(bArr)), new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.sq0
            @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
            public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj) {
                return this.f33237a.c(c2456Tl0, (Void) obj);
            }
        }, AbstractC2272Px0.a());
    }

    final /* synthetic */ com.google.common.util.concurrent.p c(C2456Tl0 c2456Tl0, Void r10) {
        return e(c2456Tl0);
    }

    final /* synthetic */ com.google.common.util.concurrent.p d(C2456Tl0 c2456Tl0, List list) {
        return e(c2456Tl0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1737Fp0
    public final com.google.common.util.concurrent.p zzb() {
        com.google.common.util.concurrent.p pVarB = this.f33503a.b();
        this.f33506d.e(20302, pVarB);
        return pVarB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4916qq0
    public final com.google.common.util.concurrent.p zze() {
        com.google.common.util.concurrent.p pVarB = this.f33504b.b();
        this.f33506d.e(20304, pVarB);
        return pVarB;
    }
}
