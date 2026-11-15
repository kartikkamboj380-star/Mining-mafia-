package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C5437uz0 implements InterfaceC5213tC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C5437uz0 f33963a = new C5437uz0();

    private /* synthetic */ C5437uz0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5213tC0
    public final /* synthetic */ AbstractC4050jy0 a(AbstractC1495Ay0 abstractC1495Ay0, Integer num) throws GeneralSecurityException {
        C6067zz0 c6067zz0 = (C6067zz0) abstractC1495Ay0;
        int i10 = AbstractC5689wz0.f34685f;
        if (c6067zz0.c() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        C5059rz0 c5059rz0 = new C5059rz0(null);
        c5059rz0.a(c6067zz0);
        c5059rz0.c(num);
        c5059rz0.b(C4348mK0.b(c6067zz0.c()));
        return c5059rz0.d();
    }
}
