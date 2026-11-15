package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5689wz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f34680a = AbstractC4460nD0.d(C5311tz0.f33660a, C5185sz0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC4302ly0 f34681b = DC0.c("type.googleapis.com/google.crypto.tink.AesGcmKey", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, C4716pF0.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final QC0 f34682c = C5563vz0.f34442a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC5213tC0 f34683d = C5437uz0.f33963a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f34684e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34685f = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        int i10 = f34684e;
        if (!UB0.a(i10)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = AbstractC3199dB0.f27366f;
        AbstractC3199dB0.a(ZC0.a());
        WC0.a().b(f34680a);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        map.put("AES128_GCM", AbstractC5839yA0.f35276a);
        C5815xz0 c5815xz0 = new C5815xz0(null);
        c5815xz0.b(12);
        c5815xz0.a(16);
        c5815xz0.c(16);
        C5941yz0 c5941yz0 = C5941yz0.f35595d;
        c5815xz0.d(c5941yz0);
        map.put("AES128_GCM_RAW", c5815xz0.e());
        map.put("AES256_GCM", AbstractC5839yA0.f35277b);
        C5815xz0 c5815xz1 = new C5815xz0(null);
        c5815xz1.b(12);
        c5815xz1.a(32);
        c5815xz1.c(16);
        c5815xz1.d(c5941yz0);
        map.put("AES256_GCM_RAW", c5815xz1.e());
        vc0A.d(Collections.unmodifiableMap(map));
        RC0.a().b(f34682c, C6067zz0.class);
        PC0.a().b(f34683d, C6067zz0.class);
        C5339uC0.a().f(f34681b, i10, true);
    }
}
