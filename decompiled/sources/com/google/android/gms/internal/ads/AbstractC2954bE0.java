package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2954bE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4460nD0 f26765a = AbstractC4460nD0.d(XD0.f25165a, WD0.class, RD0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC4460nD0 f26766b = AbstractC4460nD0.d(C2828aE0.f26456a, WD0.class, InterfaceC6065zy0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final InterfaceC4302ly0 f26767c = DC0.c("type.googleapis.com/google.crypto.tink.HmacKey", InterfaceC6065zy0.class, EnumC2832aG0.SYMMETRIC, TF0.j0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final QC0 f26768d = ZD0.f26138a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final InterfaceC5213tC0 f26769e = YD0.f25567a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f26770f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26771g = 0;

    public static void a(boolean z9) throws GeneralSecurityException {
        int i10 = f26770f;
        if (!UB0.a(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = HE0.f19251h;
        HE0.a(ZC0.a());
        WC0.a().b(f26765a);
        WC0.a().b(f26766b);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", AbstractC5091sE0.f33121a);
        C3079cE0 c3079cE0 = new C3079cE0(null);
        c3079cE0.a(32);
        c3079cE0.b(16);
        C3330eE0 c3330eE0 = C3330eE0.f27725e;
        c3079cE0.c(c3330eE0);
        C3205dE0 c3205dE0 = C3205dE0.f27387d;
        c3079cE0.d(c3205dE0);
        map.put("HMAC_SHA256_128BITTAG_RAW", c3079cE0.e());
        C3079cE0 c3079cE1 = new C3079cE0(null);
        c3079cE1.a(32);
        c3079cE1.b(32);
        C3330eE0 c3330eE1 = C3330eE0.f27722b;
        c3079cE1.c(c3330eE1);
        c3079cE1.d(c3205dE0);
        map.put("HMAC_SHA256_256BITTAG", c3079cE1.e());
        C3079cE0 c3079cE2 = new C3079cE0(null);
        c3079cE2.a(32);
        c3079cE2.b(32);
        c3079cE2.c(c3330eE0);
        c3079cE2.d(c3205dE0);
        map.put("HMAC_SHA256_256BITTAG_RAW", c3079cE2.e());
        C3079cE0 c3079cE3 = new C3079cE0(null);
        c3079cE3.a(64);
        c3079cE3.b(16);
        c3079cE3.c(c3330eE1);
        C3205dE0 c3205dE1 = C3205dE0.f27389f;
        c3079cE3.d(c3205dE1);
        map.put("HMAC_SHA512_128BITTAG", c3079cE3.e());
        C3079cE0 c3079cE4 = new C3079cE0(null);
        c3079cE4.a(64);
        c3079cE4.b(16);
        c3079cE4.c(c3330eE0);
        c3079cE4.d(c3205dE1);
        map.put("HMAC_SHA512_128BITTAG_RAW", c3079cE4.e());
        C3079cE0 c3079cE5 = new C3079cE0(null);
        c3079cE5.a(64);
        c3079cE5.b(32);
        c3079cE5.c(c3330eE1);
        c3079cE5.d(c3205dE1);
        map.put("HMAC_SHA512_256BITTAG", c3079cE5.e());
        C3079cE0 c3079cE6 = new C3079cE0(null);
        c3079cE6.a(64);
        c3079cE6.b(32);
        c3079cE6.c(c3330eE0);
        c3079cE6.d(c3205dE1);
        map.put("HMAC_SHA512_256BITTAG_RAW", c3079cE6.e());
        map.put("HMAC_SHA512_512BITTAG", AbstractC5091sE0.f33122b);
        C3079cE0 c3079cE7 = new C3079cE0(null);
        c3079cE7.a(64);
        c3079cE7.b(64);
        c3079cE7.c(c3330eE0);
        c3079cE7.d(c3205dE1);
        map.put("HMAC_SHA512_512BITTAG_RAW", c3079cE7.e());
        vc0A.d(Collections.unmodifiableMap(map));
        PC0.a().b(f26769e, C3456fE0.class);
        RC0.a().b(f26768d, C3456fE0.class);
        C5339uC0.a().f(f26767c, i10, true);
    }
}
