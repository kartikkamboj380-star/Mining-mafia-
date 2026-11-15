package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f19789a = AbstractC4460nD0.d(IA0.f19492a, FA0.class, InterfaceC3171cy0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC4302ly0 f19790b = DC0.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", InterfaceC3171cy0.class, EnumC2832aG0.SYMMETRIC, XG0.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final QC0 f19791c = GA0.f18979a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC5213tC0 f19792d = HA0.f19231a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f19793e = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = MB0.f20790f;
        MB0.a(ZC0.a());
        WC0.a().b(f19789a);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", LA0.b(KA0.f20115b));
        map.put("XCHACHA20_POLY1305_RAW", LA0.b(KA0.f20117d));
        vc0A.d(Collections.unmodifiableMap(map));
        PC0.a().b(f19792d, LA0.class);
        RC0.a().b(f19791c, LA0.class);
        C5339uC0.a().b(f19790b, true);
    }
}
