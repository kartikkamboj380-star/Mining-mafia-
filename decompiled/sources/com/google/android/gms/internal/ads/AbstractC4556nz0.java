package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4556nz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f31911a = AbstractC4460nD0.d(C4178kz0.f31144a, C4052jz0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC4302ly0 f31912b = DC0.c("type.googleapis.com/google.crypto.tink.AesEaxKey", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, C3960jF0.i0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC5213tC0 f31913c = C4304lz0.f31399a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31914d = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i10 = WA0.f24727f;
        WA0.a(ZC0.a());
        WC0.a().b(f31911a);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        map.put("AES128_EAX", AbstractC5839yA0.f35278c);
        C4682oz0 c4682oz0 = new C4682oz0(null);
        c4682oz0.b(16);
        c4682oz0.a(16);
        c4682oz0.c(16);
        C4808pz0 c4808pz0 = C4808pz0.f32530d;
        c4682oz0.d(c4808pz0);
        map.put("AES128_EAX_RAW", c4682oz0.e());
        map.put("AES256_EAX", AbstractC5839yA0.f35279d);
        C4682oz0 c4682oz1 = new C4682oz0(null);
        c4682oz1.b(16);
        c4682oz1.a(32);
        c4682oz1.c(16);
        c4682oz1.d(c4808pz0);
        map.put("AES256_EAX_RAW", c4682oz1.e());
        vc0A.d(Collections.unmodifiableMap(map));
        PC0.a().b(f31913c, C4934qz0.class);
        C5339uC0.a().b(f31912b, true);
    }
}
