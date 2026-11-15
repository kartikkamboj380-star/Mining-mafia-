package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ND0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC5213tC0 f21148a = MD0.f20792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC4460nD0 f21149b = AbstractC4460nD0.d(KD0.f20156a, JD0.class, RD0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC4460nD0 f21150c = AbstractC4460nD0.d(LD0.f20418a, JD0.class, InterfaceC6065zy0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC4302ly0 f21151d = DC0.c("type.googleapis.com/google.crypto.tink.AesCmacKey", InterfaceC6065zy0.class, EnumC2832aG0.SYMMETRIC, SE0.i0());

    public static void a(boolean z9) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i10 = AbstractC5847yE0.f35318f;
        AbstractC5847yE0.a(ZC0.a());
        PC0.a().b(f21148a, QD0.class);
        WC0.a().b(f21149b);
        WC0.a().b(f21150c);
        VC0 vc0A = VC0.a();
        HashMap map = new HashMap();
        QD0 qd0 = AbstractC5091sE0.f33123c;
        map.put("AES_CMAC", qd0);
        map.put("AES256_CMAC", qd0);
        OD0 od0 = new OD0(null);
        od0.a(32);
        od0.b(16);
        od0.c(PD0.f22068e);
        map.put("AES256_CMAC_RAW", od0.d());
        vc0A.d(Collections.unmodifiableMap(map));
        C5339uC0.a().b(f21151d, true);
    }

    static /* synthetic */ JD0 b(QD0 qd0, Integer num) throws GeneralSecurityException {
        e(qd0);
        ID0 id0 = new ID0(null);
        id0.a(qd0);
        id0.b(C4348mK0.b(qd0.c()));
        id0.c(num);
        return id0.d();
    }

    static /* synthetic */ RD0 c(JD0 jd0) throws GeneralSecurityException {
        e(jd0.f());
        return BE0.a(jd0);
    }

    static /* synthetic */ InterfaceC6065zy0 d(JD0 jd0) throws GeneralSecurityException {
        e(jd0.f());
        return ZJ0.a(jd0);
    }

    private static void e(QD0 qd0) throws GeneralSecurityException {
        if (qd0.c() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
