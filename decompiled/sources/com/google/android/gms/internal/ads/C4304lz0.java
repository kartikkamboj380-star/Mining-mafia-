package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C4304lz0 implements InterfaceC5213tC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C4304lz0 f31399a = new C4304lz0();

    private /* synthetic */ C4304lz0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5213tC0
    public final /* synthetic */ AbstractC4050jy0 a(AbstractC1495Ay0 abstractC1495Ay0, Integer num) throws GeneralSecurityException {
        C4934qz0 c4934qz0 = (C4934qz0) abstractC1495Ay0;
        int i10 = AbstractC4556nz0.f31914d;
        if (c4934qz0.c() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        C3926iz0 c3926iz0 = new C3926iz0(null);
        c3926iz0.a(c4934qz0);
        c3926iz0.c(num);
        c3926iz0.b(C4348mK0.b(c4934qz0.c()));
        return c3926iz0.d();
    }
}
