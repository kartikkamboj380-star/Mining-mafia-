package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2838aJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f26475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4096kK0 f26476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3580gD0 f26477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3203dD0 f26478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AC0 f26479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC5717xC0 f26480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AC0 f26481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC5717xC0 f26482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C4206lC0 f26483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C4206lC0 f26484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f26485k = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f26475a = c4096kK0A;
        C4096kK0 c4096kK0A2 = HD0.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f26476b = c4096kK0A2;
        f26477c = AbstractC3580gD0.d(ZI0.f26148a, ZH0.class, C5593wD0.class);
        f26478d = AbstractC3203dD0.d(UI0.f23978a, c4096kK0A, C5593wD0.class);
        f26479e = AC0.d(VI0.f24236a, C3338eI0.class, C5467vD0.class);
        f26480f = AbstractC5717xC0.d(WI0.f24750a, c4096kK0A2, C5467vD0.class);
        f26481g = AC0.d(XI0.f25180a, C3087cI0.class, C5467vD0.class);
        f26482h = AbstractC5717xC0.d(YI0.f25584a, c4096kK0A, C5467vD0.class);
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(EnumC5725xG0.RAW, YH0.f25581e);
        c4080kC0A.a(EnumC5725xG0.TINK, YH0.f25578b);
        c4080kC0A.a(EnumC5725xG0.CRUNCHY, YH0.f25579c);
        c4080kC0A.a(EnumC5725xG0.LEGACY, YH0.f25580d);
        f26483i = c4080kC0A.b();
        C4080kC0 c4080kC0A2 = C4206lC0.a();
        c4080kC0A2.a(RF0.SHA256, XH0.f25176b);
        c4080kC0A2.a(RF0.SHA384, XH0.f25177c);
        c4080kC0A2.a(RF0.SHA512, XH0.f25178d);
        f26484j = c4080kC0A2.b();
    }

    public static void a(ZC0 zc0) {
        zc0.d(f26477c);
        zc0.e(f26478d);
        zc0.b(f26479e);
        zc0.c(f26480f);
        zc0.b(f26481g);
        zc0.c(f26482h);
    }

    static /* synthetic */ C5593wD0 b(ZH0 zh0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        AG0 ag0H0 = BG0.h0();
        ag0H0.A(h(zh0));
        ag0H0.B(zh0.c());
        byte[] bArrA = XB0.a(zh0.d());
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        ag0H0.C(AbstractC5231tL0.w(bArrA, 0, bArrA.length));
        c3209dG0H0.B(((BG0) ag0H0.w()).a());
        c3209dG0H0.C((EnumC5725xG0) f26483i.b(zh0.e()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ ZH0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            BG0 bg0G0 = BG0.g0(c5593wD0.d().e0(), HL0.a());
            WH0 wh0B = ZH0.b();
            wh0B.d((XH0) f26484j.c(bg0G0.d0().d0()));
            wh0B.b(new BigInteger(1, bg0G0.f0().D()));
            wh0B.a(bg0G0.e0());
            wh0B.c((YH0) f26483i.c(c5593wD0.d().f0()));
            return wh0B.e();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
        }
    }

    static /* synthetic */ C3338eI0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            HG0 hg0H0 = HG0.h0(c5467vD0.c(), HL0.a());
            if (hg0H0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, hg0H0.f0().D());
            int iBitLength = bigInteger.bitLength();
            WH0 wh0B = ZH0.b();
            wh0B.d((XH0) f26484j.c(hg0H0.e0().d0()));
            wh0B.b(new BigInteger(1, hg0H0.g0().D()));
            wh0B.a(iBitLength);
            wh0B.c((YH0) f26483i.c(c5467vD0.e()));
            ZH0 zh0E = wh0B.e();
            C3213dI0 c3213dI0D = C3338eI0.d();
            c3213dI0D.a(zh0E);
            c3213dI0D.b(bigInteger);
            c3213dI0D.c(c5467vD0.f());
            return c3213dI0D.d();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    static /* synthetic */ C5467vD0 f(C3087cI0 c3087cI0, C1703Ey0 c1703Ey0) {
        EG0 eg0M0 = FG0.m0();
        eg0M0.A(0);
        eg0M0.B(i(c3087cI0.f()));
        byte[] bArrA = XB0.a(c3087cI0.i().b(c1703Ey0));
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        eg0M0.C(AbstractC5231tL0.w(bArrA, 0, bArrA.length));
        byte[] bArrA2 = XB0.a(c3087cI0.g().b(c1703Ey0));
        eg0M0.D(AbstractC5231tL0.w(bArrA2, 0, bArrA2.length));
        byte[] bArrA3 = XB0.a(c3087cI0.h().b(c1703Ey0));
        eg0M0.E(AbstractC5231tL0.w(bArrA3, 0, bArrA3.length));
        byte[] bArrA4 = XB0.a(c3087cI0.j().b(c1703Ey0));
        eg0M0.F(AbstractC5231tL0.w(bArrA4, 0, bArrA4.length));
        byte[] bArrA5 = XB0.a(c3087cI0.k().b(c1703Ey0));
        eg0M0.G(AbstractC5231tL0.w(bArrA5, 0, bArrA5.length));
        byte[] bArrA6 = XB0.a(c3087cI0.l().b(c1703Ey0));
        eg0M0.H(AbstractC5231tL0.w(bArrA6, 0, bArrA6.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((FG0) eg0M0.w()).a(), EnumC2832aG0.ASYMMETRIC_PRIVATE, (EnumC5725xG0) f26483i.b(c3087cI0.e().e()), c3087cI0.f().b());
    }

    static /* synthetic */ C3087cI0 g(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            FG0 fg0L0 = FG0.l0(c5467vD0.c(), HL0.a());
            if (fg0L0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            HG0 hg0E0 = fg0L0.e0();
            if (hg0E0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigInteger = new BigInteger(1, hg0E0.f0().D());
            int iBitLength = bigInteger.bitLength();
            BigInteger bigInteger2 = new BigInteger(1, hg0E0.g0().D());
            WH0 wh0B = ZH0.b();
            wh0B.d((XH0) f26484j.c(hg0E0.e0().d0()));
            wh0B.b(bigInteger2);
            wh0B.a(iBitLength);
            wh0B.c((YH0) f26483i.c(c5467vD0.e()));
            ZH0 zh0E = wh0B.e();
            C3213dI0 c3213dI0D = C3338eI0.d();
            c3213dI0D.a(zh0E);
            c3213dI0D.b(bigInteger);
            c3213dI0D.c(c5467vD0.f());
            C3338eI0 c3338eI0D = c3213dI0D.d();
            C2836aI0 c2836aI0D = C3087cI0.d();
            c2836aI0D.a(c3338eI0D);
            c2836aI0D.b(j(fg0L0.g0(), c1703Ey0), j(fg0L0.h0(), c1703Ey0));
            c2836aI0D.c(j(fg0L0.f0(), c1703Ey0));
            c2836aI0D.d(j(fg0L0.i0(), c1703Ey0), j(fg0L0.j0(), c1703Ey0));
            c2836aI0D.e(j(fg0L0.k0(), c1703Ey0));
            return c2836aI0D.f();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    private static DG0 h(ZH0 zh0) {
        CG0 cg0E0 = DG0.e0();
        cg0E0.A((RF0) f26484j.b(zh0.f()));
        return (DG0) cg0E0.w();
    }

    private static HG0 i(C3338eI0 c3338eI0) {
        GG0 gg0I0 = HG0.i0();
        gg0I0.A(h(c3338eI0.f()));
        byte[] bArrA = XB0.a(c3338eI0.e());
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        gg0I0.B(AbstractC5231tL0.w(bArrA, 0, bArrA.length));
        byte[] bArrA2 = XB0.a(c3338eI0.f().d());
        gg0I0.C(AbstractC5231tL0.w(bArrA2, 0, bArrA2.length));
        return (HG0) gg0I0.w();
    }

    private static C4222lK0 j(AbstractC5231tL0 abstractC5231tL0, C1703Ey0 c1703Ey0) {
        return C4222lK0.a(new BigInteger(1, abstractC5231tL0.D()), c1703Ey0);
    }
}
