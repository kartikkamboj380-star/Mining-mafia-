package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3298dz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f27649a = AbstractC4460nD0.d(C3173cz0.f27266a, C2794Zy0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC4302ly0 f27650b = DC0.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, ZE0.i0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final QC0 f27651c = C3047bz0.f26965a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC5213tC0 f27652d = C2922az0.f26689a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f27653e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27654f = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        int i10 = f27653e;
        if (!UB0.a(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = RA0.f22752f;
        RA0.a(ZC0.a());
        WC0.a().b(f27649a);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", AbstractC5839yA0.f35280e);
        C3424ez0 c3424ez0 = new C3424ez0(null);
        c3424ez0.a(16);
        c3424ez0.b(32);
        c3424ez0.d(16);
        c3424ez0.c(16);
        C3550fz0 c3550fz0 = C3550fz0.f28522d;
        c3424ez0.f(c3550fz0);
        C3676gz0 c3676gz0 = C3676gz0.f28773d;
        c3424ez0.e(c3676gz0);
        map.put("AES128_CTR_HMAC_SHA256_RAW", c3424ez0.g());
        map.put("AES256_CTR_HMAC_SHA256", AbstractC5839yA0.f35281f);
        C3424ez0 c3424ez1 = new C3424ez0(null);
        c3424ez1.a(32);
        c3424ez1.b(32);
        c3424ez1.d(32);
        c3424ez1.c(16);
        c3424ez1.f(c3550fz0);
        c3424ez1.e(c3676gz0);
        map.put("AES256_CTR_HMAC_SHA256_RAW", c3424ez1.g());
        vc0A.d(Collections.unmodifiableMap(map));
        RC0.a().b(f27651c, C3802hz0.class);
        PC0.a().b(f27652d, C3802hz0.class);
        C5339uC0.a().f(f27650b, i10, true);
    }
}
