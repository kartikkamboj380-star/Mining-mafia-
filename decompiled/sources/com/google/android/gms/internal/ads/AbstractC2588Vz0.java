package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2588Vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC4302ly0 f24621a = DC0.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, C5347uG0.h0());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC5213tC0 f24622b = C2536Uz0.f24146a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC4460nD0 f24623c = AbstractC4460nD0.d(C2484Tz0.f23881a, C3322eA0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24624d = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i10 = AbstractC4580oA0.f31979f;
        AbstractC4580oA0.a(ZC0.a());
        PC0.a().b(f24622b, C3826iA0.class);
        WC0.a().b(f24623c);
        C5339uC0.a().b(f24621a, true);
    }
}
