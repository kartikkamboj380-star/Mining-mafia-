package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2432Sz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f23353a = AbstractC4460nD0.d(C2380Rz0.f23097a, C2640Wz0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC4302ly0 f23354b = DC0.c("type.googleapis.com/google.crypto.tink.KmsAeadKey", InterfaceC3171cy0.class, EnumC2832aG0.REMOTE, C4844qG0.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC5213tC0 f23355c = C2328Qz0.f22677a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23356d = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i10 = AbstractC3197dA0.f27358f;
        AbstractC3197dA0.a(ZC0.a());
        WC0.a().b(f23353a);
        PC0.a().b(f23355c, C2744Yz0.class);
        C5339uC0.a().b(f23354b, true);
    }
}
