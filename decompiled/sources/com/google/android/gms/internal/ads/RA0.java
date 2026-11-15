package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f22747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f22748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f22749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f22750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f22751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f22752f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f22747a = c4096kK0A;
        f22748b = AbstractC3580gD0.d(QA0.f22320a, C3802hz0.class, C5593wD0.class);
        f22749c = AbstractC3203dD0.d(MA0.f20782a, c4096kK0A, C5593wD0.class);
        f22750d = AC0.d(NA0.f21144a, C2794Zy0.class, C5467vD0.class);
        f22751e = AbstractC5717xC0.d(PA0.f22057a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f22748b);
        zc0.e(f22749c);
        zc0.b(f22750d);
        zc0.c(f22751e);
    }

    static /* synthetic */ C5593wD0 b(C3802hz0 c3802hz0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        C2830aF0 c2830aF0G0 = C2956bF0.g0();
        C3332eF0 c3332eF0F0 = C3458fF0.f0();
        C3584gF0 c3584gF0E0 = C3710hF0.e0();
        c3584gF0E0.A(c3802hz0.f());
        c3332eF0F0.A((C3710hF0) c3584gF0E0.w());
        c3332eF0F0.B(c3802hz0.c());
        c2830aF0G0.A((C3458fF0) c3332eF0F0.w());
        UF0 uf0H0 = VF0.h0();
        uf0H0.A(i(c3802hz0));
        uf0H0.B(c3802hz0.d());
        c2830aF0G0.B((VF0) uf0H0.w());
        c3209dG0H0.B(((C2956bF0) c2830aF0G0.w()).a());
        c3209dG0H0.C(f(c3802hz0.g()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C3802hz0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            C2956bF0 c2956bF0F0 = C2956bF0.f0(c5593wD0.d().e0(), HL0.a());
            if (c2956bF0F0.e0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C3424ez0 c3424ez0B = C3802hz0.b();
            c3424ez0B.a(c2956bF0F0.d0().e0());
            c3424ez0B.b(c2956bF0F0.e0().e0());
            c3424ez0B.c(c2956bF0F0.d0().d0().d0());
            c3424ez0B.d(c2956bF0F0.e0().d0().e0());
            c3424ez0B.f(h(c2956bF0F0.e0().d0().d0()));
            c3424ez0B.e(g(c5593wD0.d().f0()));
            return c3424ez0B.g();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C2794Zy0 c2794Zy0, C1703Ey0 c1703Ey0) {
        YE0 ye0H0 = ZE0.h0();
        C3081cF0 c3081cF0G0 = C3207dF0.g0();
        C3584gF0 c3584gF0E0 = C3710hF0.e0();
        c3584gF0E0.A(c2794Zy0.g().f());
        c3081cF0G0.A((C3710hF0) c3584gF0E0.w());
        byte[] bArrC = c2794Zy0.e().c(c1703Ey0);
        c3081cF0G0.B(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        ye0H0.A((C3207dF0) c3081cF0G0.w());
        SF0 sf0H0 = TF0.h0();
        sf0H0.A(i(c2794Zy0.g()));
        byte[] bArrC2 = c2794Zy0.f().c(c1703Ey0);
        sf0H0.B(AbstractC5231tL0.w(bArrC2, 0, bArrC2.length));
        ye0H0.B((TF0) sf0H0.w());
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((ZE0) ye0H0.w()).a(), EnumC2832aG0.SYMMETRIC, f(c2794Zy0.g().g()), c2794Zy0.b());
    }

    static /* synthetic */ C2794Zy0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            ZE0 ze0G0 = ZE0.g0(c5467vD0.c(), HL0.a());
            if (ze0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (ze0G0.e0().d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (ze0G0.f0().d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            C3424ez0 c3424ez0B = C3802hz0.b();
            c3424ez0B.a(ze0G0.e0().f0().j());
            c3424ez0B.b(ze0G0.f0().f0().j());
            c3424ez0B.c(ze0G0.e0().e0().d0());
            c3424ez0B.d(ze0G0.f0().e0().e0());
            c3424ez0B.f(h(ze0G0.f0().e0().d0()));
            c3424ez0B.e(g(c5467vD0.e()));
            C3802hz0 c3802hz0G = c3424ez0B.g();
            C2742Yy0 c2742Yy0D = C2794Zy0.d();
            c2742Yy0D.a(c3802hz0G);
            c2742Yy0D.b(C4348mK0.a(ze0G0.e0().f0().D(), c1703Ey0));
            c2742Yy0D.c(C4348mK0.a(ze0G0.f0().f0().D(), c1703Ey0));
            c2742Yy0D.d(c5467vD0.f());
            return c2742Yy0D.e();
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static EnumC5725xG0 f(C3676gz0 c3676gz0) throws GeneralSecurityException {
        if (C3676gz0.f28771b.equals(c3676gz0)) {
            return EnumC5725xG0.TINK;
        }
        if (C3676gz0.f28772c.equals(c3676gz0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (C3676gz0.f28773d.equals(c3676gz0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3676gz0)));
    }

    private static C3676gz0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C3676gz0.f28771b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C3676gz0.f28773d;
            }
            if (iOrdinal != 4) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return C3676gz0.f28772c;
    }

    private static C3550fz0 h(RF0 rf0) throws GeneralSecurityException {
        int iOrdinal = rf0.ordinal();
        if (iOrdinal == 1) {
            return C3550fz0.f28520b;
        }
        if (iOrdinal == 2) {
            return C3550fz0.f28523e;
        }
        if (iOrdinal == 3) {
            return C3550fz0.f28522d;
        }
        if (iOrdinal == 4) {
            return C3550fz0.f28524f;
        }
        if (iOrdinal == 5) {
            return C3550fz0.f28521c;
        }
        int iZza = rf0.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static XF0 i(C3802hz0 c3802hz0) throws GeneralSecurityException {
        RF0 rf0;
        WF0 wf0F0 = XF0.f0();
        wf0F0.B(c3802hz0.e());
        C3550fz0 c3550fz0H = c3802hz0.h();
        if (C3550fz0.f28520b.equals(c3550fz0H)) {
            rf0 = RF0.SHA1;
        } else if (C3550fz0.f28521c.equals(c3550fz0H)) {
            rf0 = RF0.SHA224;
        } else if (C3550fz0.f28522d.equals(c3550fz0H)) {
            rf0 = RF0.SHA256;
        } else if (C3550fz0.f28523e.equals(c3550fz0H)) {
            rf0 = RF0.SHA384;
        } else {
            if (!C3550fz0.f28524f.equals(c3550fz0H)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c3550fz0H)));
            }
            rf0 = RF0.SHA512;
        }
        wf0F0.A(rf0);
        return (XF0) wf0F0.w();
    }
}
