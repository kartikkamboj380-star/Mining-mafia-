package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f24722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f24723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f24724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f24725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f24726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f24727f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f24722a = c4096kK0A;
        f24723b = AbstractC3580gD0.d(VA0.f24209a, C4934qz0.class, C5593wD0.class);
        f24724c = AbstractC3203dD0.d(SA0.f23147a, c4096kK0A, C5593wD0.class);
        f24725d = AC0.d(TA0.f23456a, C4052jz0.class, C5467vD0.class);
        f24726e = AbstractC5717xC0.d(UA0.f23942a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f24723b);
        zc0.e(f24724c);
        zc0.b(f24725d);
        zc0.c(f24726e);
    }

    static /* synthetic */ C5593wD0 b(C4934qz0 c4934qz0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.AesEaxKey");
        C4086kF0 c4086kF0G0 = C4212lF0.g0();
        c4086kF0G0.A(h(c4934qz0));
        c4086kF0G0.B(c4934qz0.c());
        c3209dG0H0.B(((C4212lF0) c4086kF0G0.w()).a());
        c3209dG0H0.C(f(c4934qz0.e()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C4934qz0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            C4212lF0 c4212lF0F0 = C4212lF0.f0(c5593wD0.d().e0(), HL0.a());
            C4682oz0 c4682oz0B = C4934qz0.b();
            c4682oz0B.a(c4212lF0F0.e0());
            c4682oz0B.b(c4212lF0F0.d0().d0());
            c4682oz0B.c(16);
            c4682oz0B.d(g(c5593wD0.d().f0()));
            return c4682oz0B.e();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C4052jz0 c4052jz0, C1703Ey0 c1703Ey0) {
        C3836iF0 c3836iF0H0 = C3960jF0.h0();
        c3836iF0H0.A(h(c4052jz0.f()));
        byte[] bArrC = c4052jz0.e().c(c1703Ey0);
        c3836iF0H0.B(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C3960jF0) c3836iF0H0.w()).a(), EnumC2832aG0.SYMMETRIC, f(c4052jz0.f().e()), c4052jz0.b());
    }

    static /* synthetic */ C4052jz0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            C3960jF0 c3960jF0G0 = C3960jF0.g0(c5467vD0.c(), HL0.a());
            if (c3960jF0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C4682oz0 c4682oz0B = C4934qz0.b();
            c4682oz0B.a(c3960jF0G0.f0().j());
            c4682oz0B.b(c3960jF0G0.e0().d0());
            c4682oz0B.c(16);
            c4682oz0B.d(g(c5467vD0.e()));
            C4934qz0 c4934qz0E = c4682oz0B.e();
            C3926iz0 c3926iz0D = C4052jz0.d();
            c3926iz0D.a(c4934qz0E);
            c3926iz0D.b(C4348mK0.a(c3960jF0G0.f0().D(), c1703Ey0));
            c3926iz0D.c(c5467vD0.f());
            return c3926iz0D.d();
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static EnumC5725xG0 f(C4808pz0 c4808pz0) throws GeneralSecurityException {
        if (C4808pz0.f32528b.equals(c4808pz0)) {
            return EnumC5725xG0.TINK;
        }
        if (C4808pz0.f32529c.equals(c4808pz0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (C4808pz0.f32530d.equals(c4808pz0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c4808pz0)));
    }

    private static C4808pz0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C4808pz0.f32528b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C4808pz0.f32530d;
            }
            if (iOrdinal != 4) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return C4808pz0.f32529c;
    }

    private static C4464nF0 h(C4934qz0 c4934qz0) {
        C4338mF0 c4338mF0E0 = C4464nF0.e0();
        c4338mF0E0.A(c4934qz0.d());
        return (C4464nF0) c4338mF0E0.w();
    }
}
