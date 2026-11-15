package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4078kB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f30718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f30719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f30720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f30721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f30722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f30723f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f30718a = c4096kK0A;
        f30719b = AbstractC3580gD0.d(C3952jB0.f30335a, C1913Iz0.class, C5593wD0.class);
        f30720c = AbstractC3203dD0.d(C3576gB0.f28595a, c4096kK0A, C5593wD0.class);
        f30721d = AC0.d(C3702hB0.f28861a, C1549Bz0.class, C5467vD0.class);
        f30722e = AbstractC5717xC0.d(C3828iB0.f29295a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f30719b);
        zc0.e(f30720c);
        zc0.b(f30721d);
        zc0.c(f30722e);
    }

    static /* synthetic */ C5593wD0 b(C1913Iz0 c1913Iz0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        C5345uF0 c5345uF0G0 = C5471vF0.g0();
        c5345uF0G0.A(c1913Iz0.c());
        c3209dG0H0.B(((C5471vF0) c5345uF0G0.w()).a());
        c3209dG0H0.C(f(c1913Iz0.d()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C1913Iz0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            C5471vF0 c5471vF0F0 = C5471vF0.f0(c5593wD0.d().e0(), HL0.a());
            if (c5471vF0F0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            C1809Gz0 c1809Gz0B = C1913Iz0.b();
            c1809Gz0B.a(c5471vF0F0.d0());
            c1809Gz0B.b(g(c5593wD0.d().f0()));
            return c1809Gz0B.c();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C1549Bz0 c1549Bz0, C1703Ey0 c1703Ey0) {
        C5093sF0 c5093sF0G0 = C5219tF0.g0();
        byte[] bArrC = c1549Bz0.e().c(c1703Ey0);
        c5093sF0G0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C5219tF0) c5093sF0G0.w()).a(), EnumC2832aG0.SYMMETRIC, f(c1549Bz0.f().d()), c1549Bz0.b());
    }

    static /* synthetic */ C1549Bz0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            C5219tF0 c5219tF0F0 = C5219tF0.f0(c5467vD0.c(), HL0.a());
            if (c5219tF0F0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C1809Gz0 c1809Gz0B = C1913Iz0.b();
            c1809Gz0B.a(c5219tF0F0.e0().j());
            c1809Gz0B.b(g(c5467vD0.e()));
            C1913Iz0 c1913Iz0C = c1809Gz0B.c();
            C1497Az0 c1497Az0D = C1549Bz0.d();
            c1497Az0D.a(c1913Iz0C);
            c1497Az0D.b(C4348mK0.a(c5219tF0F0.e0().D(), c1703Ey0));
            c1497Az0D.c(c5467vD0.f());
            return c1497Az0D.d();
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static EnumC5725xG0 f(C1861Hz0 c1861Hz0) throws GeneralSecurityException {
        if (C1861Hz0.f19425b.equals(c1861Hz0)) {
            return EnumC5725xG0.TINK;
        }
        if (C1861Hz0.f19426c.equals(c1861Hz0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (C1861Hz0.f19427d.equals(c1861Hz0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1861Hz0)));
    }

    private static C1861Hz0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C1861Hz0.f19425b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C1861Hz0.f19427d;
            }
            if (iOrdinal != 4) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return C1861Hz0.f19426c;
    }
}
