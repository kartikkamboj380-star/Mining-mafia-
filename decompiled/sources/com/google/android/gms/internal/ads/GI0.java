package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f19019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4096kK0 f19020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3580gD0 f19021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3203dD0 f19022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AC0 f19023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC5717xC0 f19024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AC0 f19025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC5717xC0 f19026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f19027i = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f19019a = c4096kK0A;
        C4096kK0 c4096kK0A2 = HD0.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f19020b = c4096kK0A2;
        f19021c = AbstractC3580gD0.d(FI0.f18729a, C3588gH0.class, C5593wD0.class);
        f19022d = AbstractC3203dD0.d(C5981zI0.f35687a, c4096kK0A, C5593wD0.class);
        f19023e = AC0.d(AI0.f17282a, C4090kH0.class, C5467vD0.class);
        f19024f = AbstractC5717xC0.d(BI0.f17545a, c4096kK0A2, C5467vD0.class);
        f19025g = AC0.d(DI0.f18141a, C3840iH0.class, C5467vD0.class);
        f19026h = AbstractC5717xC0.d(EI0.f18450a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f19021c);
        zc0.e(f19022d);
        zc0.b(f19023e);
        zc0.c(f19024f);
        zc0.b(f19025g);
        zc0.c(f19026h);
    }

    static /* synthetic */ C5593wD0 b(C3588gH0 c3588gH0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        BF0 bf0F0 = CF0.f0();
        bf0F0.A(l(c3588gH0));
        c3209dG0H0.B(((CF0) bf0F0.w()).a());
        c3209dG0H0.C(h(c3588gH0.f()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C3588gH0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            CF0 cf0E0 = CF0.e0(c5593wD0.d().e0(), HL0.a());
            C2960bH0 c2960bH0B = C3588gH0.b();
            c2960bH0B.c(i(cf0E0.d0().d0()));
            c2960bH0B.a(o(cf0E0.d0().j0()));
            c2960bH0B.b(n(cf0E0.d0().i0()));
            c2960bH0B.d(j(c5593wD0.d().f0()));
            return c2960bH0B.e();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
        }
    }

    static /* synthetic */ C4090kH0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            IF0 if0H0 = IF0.h0(c5467vD0.c(), HL0.a());
            if (if0H0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C2960bH0 c2960bH0B = C3588gH0.b();
            c2960bH0B.c(i(if0H0.e0().d0()));
            c2960bH0B.a(o(if0H0.e0().j0()));
            c2960bH0B.b(n(if0H0.e0().i0()));
            c2960bH0B.d(j(c5467vD0.e()));
            C3588gH0 c3588gH0E = c2960bH0B.e();
            C3964jH0 c3964jH0D = C4090kH0.d();
            c3964jH0D.a(c3588gH0E);
            c3964jH0D.b(new ECPoint(new BigInteger(1, if0H0.f0().D()), new BigInteger(1, if0H0.g0().D())));
            c3964jH0D.c(c5467vD0.f());
            return c3964jH0D.d();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    static /* synthetic */ C5467vD0 f(C3840iH0 c3840iH0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        int iK = k(c3840iH0.e().d());
        FF0 ff0H0 = GF0.h0();
        ff0H0.A(m(c3840iH0.f()));
        byte[] bArrB = XB0.b(c3840iH0.g().b(c1703Ey0), iK);
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        ff0H0.B(AbstractC5231tL0.w(bArrB, 0, bArrB.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((GF0) ff0H0.w()).a(), EnumC2832aG0.ASYMMETRIC_PRIVATE, h(c3840iH0.e().f()), c3840iH0.f().b());
    }

    static /* synthetic */ C3840iH0 g(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            GF0 gf0G0 = GF0.g0(c5467vD0.c(), HL0.a());
            if (gf0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            IF0 if0E0 = gf0G0.e0();
            if (if0E0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C2960bH0 c2960bH0B = C3588gH0.b();
            c2960bH0B.c(i(if0E0.e0().d0()));
            c2960bH0B.a(o(if0E0.e0().j0()));
            c2960bH0B.b(n(if0E0.e0().i0()));
            c2960bH0B.d(j(c5467vD0.e()));
            C3588gH0 c3588gH0E = c2960bH0B.e();
            C3964jH0 c3964jH0D = C4090kH0.d();
            c3964jH0D.a(c3588gH0E);
            c3964jH0D.b(new ECPoint(new BigInteger(1, if0E0.f0().D()), new BigInteger(1, if0E0.g0().D())));
            c3964jH0D.c(c5467vD0.f());
            C4090kH0 c4090kH0D = c3964jH0D.d();
            C3714hH0 c3714hH0D = C3840iH0.d();
            c3714hH0D.a(c4090kH0D);
            c3714hH0D.b(C4222lK0.a(new BigInteger(1, gf0G0.f0().D()), c1703Ey0));
            return c3714hH0D.c();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    private static EnumC5725xG0 h(C3462fH0 c3462fH0) throws GeneralSecurityException {
        if (C3462fH0.f28233b.equals(c3462fH0)) {
            return EnumC5725xG0.TINK;
        }
        if (C3462fH0.f28234c.equals(c3462fH0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (C3462fH0.f28236e.equals(c3462fH0)) {
            return EnumC5725xG0.RAW;
        }
        if (C3462fH0.f28235d.equals(c3462fH0)) {
            return EnumC5725xG0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c3462fH0.toString()));
    }

    private static C3211dH0 i(RF0 rf0) throws GeneralSecurityException {
        int iOrdinal = rf0.ordinal();
        if (iOrdinal == 2) {
            return C3211dH0.f27394c;
        }
        if (iOrdinal == 3) {
            return C3211dH0.f27393b;
        }
        if (iOrdinal == 4) {
            return C3211dH0.f27395d;
        }
        int iZza = rf0.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static C3462fH0 j(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C3462fH0.f28233b;
        }
        if (iOrdinal == 2) {
            return C3462fH0.f28235d;
        }
        if (iOrdinal == 3) {
            return C3462fH0.f28236e;
        }
        if (iOrdinal == 4) {
            return C3462fH0.f28234c;
        }
        int iZza = enumC5725xG0.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static int k(C3085cH0 c3085cH0) throws GeneralSecurityException {
        if (C3085cH0.f27077c.equals(c3085cH0)) {
            return 33;
        }
        if (C3085cH0.f27078d.equals(c3085cH0)) {
            return 49;
        }
        if (C3085cH0.f27079e.equals(c3085cH0)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(c3085cH0.toString()));
    }

    private static EF0 l(C3588gH0 c3588gH0) throws GeneralSecurityException {
        RF0 rf0;
        int i10;
        DF0 df0E0 = EF0.e0();
        C3211dH0 c3211dH0E = c3588gH0.e();
        if (C3211dH0.f27393b.equals(c3211dH0E)) {
            rf0 = RF0.SHA256;
        } else if (C3211dH0.f27394c.equals(c3211dH0E)) {
            rf0 = RF0.SHA384;
        } else {
            if (!C3211dH0.f27395d.equals(c3211dH0E)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(c3211dH0E.toString()));
            }
            rf0 = RF0.SHA512;
        }
        df0E0.A(rf0);
        C3085cH0 c3085cH0D = c3588gH0.d();
        int i11 = 4;
        if (C3085cH0.f27077c.equals(c3085cH0D)) {
            i10 = 4;
        } else if (C3085cH0.f27078d.equals(c3085cH0D)) {
            i10 = 5;
        } else {
            if (!C3085cH0.f27079e.equals(c3085cH0D)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(c3085cH0D.toString()));
            }
            i10 = 6;
        }
        df0E0.B(i10);
        C3336eH0 c3336eH0C = c3588gH0.c();
        if (C3336eH0.f27730b.equals(c3336eH0C)) {
            i11 = 3;
        } else if (!C3336eH0.f27731c.equals(c3336eH0C)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(c3336eH0C.toString()));
        }
        df0E0.C(i11);
        return (EF0) df0E0.w();
    }

    private static IF0 m(C4090kH0 c4090kH0) throws GeneralSecurityException {
        int iK = k(c4090kH0.f().d());
        ECPoint eCPointE = c4090kH0.e();
        HF0 hf0I0 = IF0.i0();
        hf0I0.A(l(c4090kH0.f()));
        byte[] bArrB = XB0.b(eCPointE.getAffineX(), iK);
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        hf0I0.B(AbstractC5231tL0.w(bArrB, 0, bArrB.length));
        byte[] bArrB2 = XB0.b(eCPointE.getAffineY(), iK);
        hf0I0.C(AbstractC5231tL0.w(bArrB2, 0, bArrB2.length));
        return (IF0) hf0I0.w();
    }

    private static C3085cH0 n(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return C3085cH0.f27077c;
        }
        if (i11 == 3) {
            return C3085cH0.f27078d;
        }
        if (i11 == 4) {
            return C3085cH0.f27079e;
        }
        int iA = QF0.a(i10);
        StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 35);
        sb.append("Unable to parse EllipticCurveType: ");
        sb.append(iA);
        throw new GeneralSecurityException(sb.toString());
    }

    private static C3336eH0 o(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return C3336eH0.f27730b;
        }
        if (i11 == 2) {
            return C3336eH0.f27731c;
        }
        int iA = JF0.a(i10);
        StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 40);
        sb.append("Unable to parse EcdsaSignatureEncoding: ");
        sb.append(iA);
        throw new GeneralSecurityException(sb.toString());
    }
}
