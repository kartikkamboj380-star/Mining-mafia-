package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class OC0 implements InterfaceC5213tC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ OC0 f21493a = new OC0();

    private /* synthetic */ OC0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5213tC0
    public final /* synthetic */ AbstractC4050jy0 a(AbstractC1495Ay0 abstractC1495Ay0, Integer num) throws GeneralSecurityException {
        int i10 = PC0.f22062d;
        C3334eG0 c3334eG0D = ((HC0) abstractC1495Ay0).b().d();
        InterfaceC4302ly0 interfaceC4302ly0D = C5339uC0.a().d(c3334eG0D.d0());
        if (!C5339uC0.a().e(c3334eG0D.d0())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        C2958bG0 c2958bG0B = interfaceC4302ly0D.b(c3334eG0D.e0());
        return new GC0(C5467vD0.a(c2958bG0B.d0(), c2958bG0B.e0(), c2958bG0B.f0(), c3334eG0D.f0(), num), AbstractC3800hy0.a());
    }
}
