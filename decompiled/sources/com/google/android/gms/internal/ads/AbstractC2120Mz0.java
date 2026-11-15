package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2120Mz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f20981a = AbstractC4460nD0.d(C2068Lz0.f20701a, C1965Jz0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC5213tC0 f20982b = C2017Kz0.f20309a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC4302ly0 f20983c = DC0.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, C5849yF0.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20984d = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = AbstractC4959rB0.f32855f;
        AbstractC4959rB0.a(ZC0.a());
        WC0.a().b(f20981a);
        PC0.a().b(f20982b, C2276Pz0.class);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", C2276Pz0.b(C2224Oz0.f21988b));
        map.put("CHACHA20_POLY1305_RAW", C2276Pz0.b(C2224Oz0.f21990d));
        vc0A.d(Collections.unmodifiableMap(map));
        C5339uC0.a().b(f20983c, true);
    }
}
