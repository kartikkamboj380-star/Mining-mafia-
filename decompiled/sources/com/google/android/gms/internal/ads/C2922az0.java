package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.az0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C2922az0 implements InterfaceC5213tC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C2922az0 f26689a = new C2922az0();

    private /* synthetic */ C2922az0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5213tC0
    public final /* synthetic */ AbstractC4050jy0 a(AbstractC1495Ay0 abstractC1495Ay0, Integer num) throws GeneralSecurityException {
        C3802hz0 c3802hz0 = (C3802hz0) abstractC1495Ay0;
        int i10 = AbstractC3298dz0.f27654f;
        if (c3802hz0.c() != 16 && c3802hz0.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        C2742Yy0 c2742Yy0 = new C2742Yy0(null);
        c2742Yy0.a(c3802hz0);
        c2742Yy0.d(num);
        c2742Yy0.b(C4348mK0.b(c3802hz0.c()));
        c2742Yy0.c(C4348mK0.b(c3802hz0.d()));
        return c2742Yy0.e();
    }
}
