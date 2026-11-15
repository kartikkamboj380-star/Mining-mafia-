package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4580oA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f31974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f31975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f31976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f31977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f31978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31979f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f31974a = c4096kK0A;
        f31975b = AbstractC3580gD0.d(C4328mA0.f31455a, C3826iA0.class, C5593wD0.class);
        f31976c = AbstractC3203dD0.d(C3950jA0.f30331a, c4096kK0A, C5593wD0.class);
        f31977d = AC0.d(C4076kA0.f30714a, C3322eA0.class, C5467vD0.class);
        f31978e = AbstractC5717xC0.d(C4202lA0.f31215a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f31975b);
        zc0.e(f31976c);
        zc0.b(f31977d);
        zc0.c(f31978e);
    }

    static /* synthetic */ C5593wD0 b(C3826iA0 c3826iA0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        c3209dG0H0.B(g(c3826iA0).a());
        c3209dG0H0.C(f(c3826iA0.c()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C3826iA0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            return h(C5599wG0.f0(c5593wD0.d().e0(), HL0.a()), c5593wD0.d().f0());
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C3322eA0 c3322eA0, C1703Ey0 c1703Ey0) {
        C5221tG0 c5221tG0G0 = C5347uG0.g0();
        c5221tG0G0.A(g(c3322eA0.e()));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C5347uG0) c5221tG0G0.w()).a(), EnumC2832aG0.REMOTE, f(c3322eA0.e().c()), c3322eA0.b());
    }

    static /* synthetic */ C3322eA0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            C5347uG0 c5347uG0F0 = C5347uG0.f0(c5467vD0.c(), HL0.a());
            if (c5347uG0F0.d0() == 0) {
                return C3322eA0.d(h(c5347uG0F0.e0(), c5467vD0.e()), c5467vD0.f());
            }
            String strValueOf = String.valueOf(c5347uG0F0);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    private static EnumC5725xG0 f(C3700hA0 c3700hA0) throws GeneralSecurityException {
        if (C3700hA0.f28856b.equals(c3700hA0)) {
            return EnumC5725xG0.TINK;
        }
        if (C3700hA0.f28857c.equals(c3700hA0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c3700hA0)));
    }

    private static C5599wG0 g(C3826iA0 c3826iA0) throws GeneralSecurityException {
        try {
            C3334eG0 c3334eG0G0 = C3334eG0.g0(AbstractC1807Gy0.a(c3826iA0.d()), HL0.a());
            C5473vG0 c5473vG0G0 = C5599wG0.g0();
            c5473vG0G0.A(c3826iA0.b());
            c5473vG0G0.B(c3334eG0G0);
            return (C5599wG0) c5473vG0G0.w();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    private static C3826iA0 h(C5599wG0 c5599wG0, EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        C3574gA0 c3574gA0;
        C3700hA0 c3700hA0;
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A(c5599wG0.e0().d0());
        c3209dG0H0.B(c5599wG0.e0().e0());
        c3209dG0H0.C(EnumC5725xG0.RAW);
        AbstractC1495Ay0 abstractC1495Ay0B = AbstractC1807Gy0.b(((C3334eG0) c3209dG0H0.w()).i());
        if (abstractC1495Ay0B instanceof C6067zz0) {
            c3574gA0 = C3574gA0.f28587b;
        } else if (abstractC1495Ay0B instanceof C2276Pz0) {
            c3574gA0 = C3574gA0.f28589d;
        } else if (abstractC1495Ay0B instanceof LA0) {
            c3574gA0 = C3574gA0.f28588c;
        } else if (abstractC1495Ay0B instanceof C3802hz0) {
            c3574gA0 = C3574gA0.f28590e;
        } else if (abstractC1495Ay0B instanceof C4934qz0) {
            c3574gA0 = C3574gA0.f28591f;
        } else {
            if (!(abstractC1495Ay0B instanceof C1913Iz0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(abstractC1495Ay0B.toString()));
            }
            c3574gA0 = C3574gA0.f28592g;
        }
        C3448fA0 c3448fA0 = new C3448fA0(null);
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            c3700hA0 = C3700hA0.f28856b;
        } else {
            if (iOrdinal != 3) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
            c3700hA0 = C3700hA0.f28857c;
        }
        c3448fA0.a(c3700hA0);
        c3448fA0.b(c5599wG0.d0());
        c3448fA0.d((AbstractC2482Ty0) abstractC1495Ay0B);
        c3448fA0.c(c3574gA0);
        return c3448fA0.e();
    }
}
