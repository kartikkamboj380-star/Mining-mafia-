package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4094kJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f30747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4096kK0 f30748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3580gD0 f30749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3203dD0 f30750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AC0 f30751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC5717xC0 f30752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AC0 f30753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC5717xC0 f30754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C4206lC0 f30755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C4206lC0 f30756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f30757k = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f30747a = c4096kK0A;
        C4096kK0 c4096kK0A2 = HD0.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f30748b = c4096kK0A2;
        f30749c = AbstractC3580gD0.d(C3968jJ0.f30397a, C4344mI0.class, C5593wD0.class);
        f30750d = AbstractC3203dD0.d(C3340eJ0.f27753a, c4096kK0A, C5593wD0.class);
        f30751e = AC0.d(C3466fJ0.f28256a, C4848qI0.class, C5467vD0.class);
        f30752f = AbstractC5717xC0.d(C3592gJ0.f28618a, c4096kK0A2, C5467vD0.class);
        f30753g = AC0.d(C3718hJ0.f28897a, C4596oI0.class, C5467vD0.class);
        f30754h = AbstractC5717xC0.d(C3844iJ0.f29326a, c4096kK0A, C5467vD0.class);
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(EnumC5725xG0.RAW, C4218lI0.f31241e);
        c4080kC0A.a(EnumC5725xG0.TINK, C4218lI0.f31238b);
        c4080kC0A.a(EnumC5725xG0.CRUNCHY, C4218lI0.f31239c);
        c4080kC0A.a(EnumC5725xG0.LEGACY, C4218lI0.f31240d);
        f30755i = c4080kC0A.b();
        C4080kC0 c4080kC0A2 = C4206lC0.a();
        c4080kC0A2.a(RF0.SHA256, C4092kI0.f30743b);
        c4080kC0A2.a(RF0.SHA384, C4092kI0.f30744c);
        c4080kC0A2.a(RF0.SHA512, C4092kI0.f30745d);
        f30756j = c4080kC0A2.b();
    }

    public static void a(ZC0 zc0) {
        zc0.d(f30749c);
        zc0.e(f30750d);
        zc0.b(f30751e);
        zc0.c(f30752f);
        zc0.b(f30753g);
        zc0.c(f30754h);
    }

    static /* synthetic */ C5593wD0 b(C4344mI0 c4344mI0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        IG0 ig0H0 = JG0.h0();
        ig0H0.A(h(c4344mI0));
        ig0H0.B(c4344mI0.c());
        byte[] bArrA = XB0.a(c4344mI0.d());
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        ig0H0.C(AbstractC5231tL0.w(bArrA, 0, bArrA.length));
        c3209dG0H0.B(((JG0) ig0H0.w()).a());
        c3209dG0H0.C((EnumC5725xG0) f30755i.b(c4344mI0.e()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C4344mI0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            JG0 jg0G0 = JG0.g0(c5593wD0.d().e0(), HL0.a());
            C3966jI0 c3966jI0B = C4344mI0.b();
            C4206lC0 c4206lC0 = f30756j;
            c3966jI0B.d((C4092kI0) c4206lC0.c(jg0G0.d0().d0()));
            c3966jI0B.e((C4092kI0) c4206lC0.c(jg0G0.d0().e0()));
            c3966jI0B.b(new BigInteger(1, jg0G0.f0().D()));
            c3966jI0B.a(jg0G0.e0());
            c3966jI0B.f(jg0G0.d0().f0());
            c3966jI0B.c((C4218lI0) f30755i.c(c5593wD0.d().f0()));
            return c3966jI0B.g();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    static /* synthetic */ C4848qI0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            PG0 pg0H0 = PG0.h0(c5467vD0.c(), HL0.a());
            if (pg0H0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, pg0H0.f0().D());
            int iBitLength = bigInteger.bitLength();
            C3966jI0 c3966jI0B = C4344mI0.b();
            C4206lC0 c4206lC0 = f30756j;
            c3966jI0B.d((C4092kI0) c4206lC0.c(pg0H0.e0().d0()));
            c3966jI0B.e((C4092kI0) c4206lC0.c(pg0H0.e0().e0()));
            c3966jI0B.b(new BigInteger(1, pg0H0.g0().D()));
            c3966jI0B.a(iBitLength);
            c3966jI0B.f(pg0H0.e0().f0());
            c3966jI0B.c((C4218lI0) f30755i.c(c5467vD0.e()));
            C4344mI0 c4344mI0G = c3966jI0B.g();
            C4722pI0 c4722pI0D = C4848qI0.d();
            c4722pI0D.a(c4344mI0G);
            c4722pI0D.b(bigInteger);
            c4722pI0D.c(c5467vD0.f());
            return c4722pI0D.d();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    static /* synthetic */ C5467vD0 f(C4596oI0 c4596oI0, C1703Ey0 c1703Ey0) {
        MG0 mg0M0 = NG0.m0();
        mg0M0.A(0);
        mg0M0.B(i(c4596oI0.f()));
        byte[] bArrA = XB0.a(c4596oI0.i().b(c1703Ey0));
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        mg0M0.C(AbstractC5231tL0.w(bArrA, 0, bArrA.length));
        byte[] bArrA2 = XB0.a(c4596oI0.g().b(c1703Ey0));
        mg0M0.D(AbstractC5231tL0.w(bArrA2, 0, bArrA2.length));
        byte[] bArrA3 = XB0.a(c4596oI0.h().b(c1703Ey0));
        mg0M0.E(AbstractC5231tL0.w(bArrA3, 0, bArrA3.length));
        byte[] bArrA4 = XB0.a(c4596oI0.j().b(c1703Ey0));
        mg0M0.F(AbstractC5231tL0.w(bArrA4, 0, bArrA4.length));
        byte[] bArrA5 = XB0.a(c4596oI0.k().b(c1703Ey0));
        mg0M0.G(AbstractC5231tL0.w(bArrA5, 0, bArrA5.length));
        byte[] bArrA6 = XB0.a(c4596oI0.l().b(c1703Ey0));
        mg0M0.H(AbstractC5231tL0.w(bArrA6, 0, bArrA6.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((NG0) mg0M0.w()).a(), EnumC2832aG0.ASYMMETRIC_PRIVATE, (EnumC5725xG0) f30755i.b(c4596oI0.e().e()), c4596oI0.f().b());
    }

    static /* synthetic */ C4596oI0 g(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            NG0 ng0L0 = NG0.l0(c5467vD0.c(), HL0.a());
            if (ng0L0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            PG0 pg0E0 = ng0L0.e0();
            if (pg0E0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, pg0E0.f0().D());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, pg0E0.g0().D());
            C3966jI0 c3966jI0B = C4344mI0.b();
            C4206lC0 c4206lC0 = f30756j;
            c3966jI0B.d((C4092kI0) c4206lC0.c(pg0E0.e0().d0()));
            c3966jI0B.e((C4092kI0) c4206lC0.c(pg0E0.e0().e0()));
            c3966jI0B.b(bigInteger2);
            c3966jI0B.a(iBitLength);
            c3966jI0B.f(pg0E0.e0().f0());
            c3966jI0B.c((C4218lI0) f30755i.c(c5467vD0.e()));
            C4344mI0 c4344mI0G = c3966jI0B.g();
            C4722pI0 c4722pI0D = C4848qI0.d();
            c4722pI0D.a(c4344mI0G);
            c4722pI0D.b(bigInteger);
            c4722pI0D.c(c5467vD0.f());
            C4848qI0 c4848qI0D = c4722pI0D.d();
            C4470nI0 c4470nI0D = C4596oI0.d();
            c4470nI0D.a(c4848qI0D);
            c4470nI0D.b(j(ng0L0.g0(), c1703Ey0), j(ng0L0.h0(), c1703Ey0));
            c4470nI0D.c(j(ng0L0.f0(), c1703Ey0));
            c4470nI0D.d(j(ng0L0.i0(), c1703Ey0), j(ng0L0.j0(), c1703Ey0));
            c4470nI0D.e(j(ng0L0.k0(), c1703Ey0));
            return c4470nI0D.f();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    private static LG0 h(C4344mI0 c4344mI0) {
        KG0 kg0G0 = LG0.g0();
        C4206lC0 c4206lC0 = f30756j;
        kg0G0.A((RF0) c4206lC0.b(c4344mI0.f()));
        kg0G0.B((RF0) c4206lC0.b(c4344mI0.g()));
        kg0G0.C(c4344mI0.h());
        return (LG0) kg0G0.w();
    }

    private static PG0 i(C4848qI0 c4848qI0) {
        OG0 og0I0 = PG0.i0();
        og0I0.B(h(c4848qI0.f()));
        byte[] bArrA = XB0.a(c4848qI0.e());
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        og0I0.C(AbstractC5231tL0.w(bArrA, 0, bArrA.length));
        byte[] bArrA2 = XB0.a(c4848qI0.f().d());
        og0I0.D(AbstractC5231tL0.w(bArrA2, 0, bArrA2.length));
        og0I0.A(0);
        return (PG0) og0I0.w();
    }

    private static C4222lK0 j(AbstractC5231tL0 abstractC5231tL0, C1703Ey0 c1703Ey0) {
        return C4222lK0.a(new BigInteger(1, abstractC5231tL0.D()), c1703Ey0);
    }
}
