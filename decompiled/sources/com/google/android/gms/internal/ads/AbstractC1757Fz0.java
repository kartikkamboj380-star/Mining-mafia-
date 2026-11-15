package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1757Fz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f18882a = AbstractC4460nD0.d(C1601Cz0.f18027a, C1549Bz0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC5213tC0 f18883b = C1705Ez0.f18616a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final QC0 f18884c = C1653Dz0.f18320a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC4302ly0 f18885d = DC0.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, C5219tF0.h0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18886e = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i10 = AbstractC4078kB0.f30723f;
        AbstractC4078kB0.a(ZC0.a());
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        C1809Gz0 c1809Gz0 = new C1809Gz0(null);
        c1809Gz0.a(16);
        C1861Hz0 c1861Hz0 = C1861Hz0.f19425b;
        c1809Gz0.b(c1861Hz0);
        map.put("AES128_GCM_SIV", c1809Gz0.c());
        C1809Gz0 c1809Gz1 = new C1809Gz0(null);
        c1809Gz1.a(16);
        C1861Hz0 c1861Hz1 = C1861Hz0.f19427d;
        c1809Gz1.b(c1861Hz1);
        map.put("AES128_GCM_SIV_RAW", c1809Gz1.c());
        C1809Gz0 c1809Gz2 = new C1809Gz0(null);
        c1809Gz2.a(32);
        c1809Gz2.b(c1861Hz0);
        map.put("AES256_GCM_SIV", c1809Gz2.c());
        C1809Gz0 c1809Gz3 = new C1809Gz0(null);
        c1809Gz3.a(32);
        c1809Gz3.b(c1861Hz1);
        map.put("AES256_GCM_SIV_RAW", c1809Gz3.c());
        vc0A.d(Collections.unmodifiableMap(map));
        RC0.a().b(f18884c, C1913Iz0.class);
        PC0.a().b(f18883b, C1913Iz0.class);
        WC0.a().b(f18882a);
        C5339uC0.a().b(f18885d, true);
    }
}
