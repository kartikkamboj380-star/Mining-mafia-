package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3199dB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f27361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f27362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f27363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f27364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f27365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27366f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f27361a = c4096kK0A;
        f27362b = AbstractC3580gD0.d(C3073cB0.f27061a, C6067zz0.class, C5593wD0.class);
        f27363c = AbstractC3203dD0.d(ZA0.f26127a, c4096kK0A, C5593wD0.class);
        f27364d = AC0.d(C2822aB0.f26448a, C5185sz0.class, C5467vD0.class);
        f27365e = AbstractC5717xC0.d(C2948bB0.f26753a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f27362b);
        zc0.e(f27363c);
        zc0.b(f27364d);
        zc0.c(f27365e);
    }

    static /* synthetic */ C5593wD0 b(C6067zz0 c6067zz0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.AesGcmKey");
        C4842qF0 c4842qF0G0 = C4967rF0.g0();
        c4842qF0G0.A(c6067zz0.c());
        c3209dG0H0.B(((C4967rF0) c4842qF0G0.w()).a());
        c3209dG0H0.C(f(c6067zz0.d()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C6067zz0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            C4967rF0 c4967rF0F0 = C4967rF0.f0(c5593wD0.d().e0(), HL0.a());
            if (c4967rF0F0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            C5815xz0 c5815xz0B = C6067zz0.b();
            c5815xz0B.a(c4967rF0F0.d0());
            c5815xz0B.b(12);
            c5815xz0B.c(16);
            c5815xz0B.d(g(c5593wD0.d().f0()));
            return c5815xz0B.e();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C5185sz0 c5185sz0, C1703Ey0 c1703Ey0) {
        C4590oF0 c4590oF0G0 = C4716pF0.g0();
        byte[] bArrC = c5185sz0.e().c(c1703Ey0);
        c4590oF0G0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C4716pF0) c4590oF0G0.w()).a(), EnumC2832aG0.SYMMETRIC, f(c5185sz0.f().d()), c5185sz0.b());
    }

    static /* synthetic */ C5185sz0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            C4716pF0 c4716pF0F0 = C4716pF0.f0(c5467vD0.c(), HL0.a());
            if (c4716pF0F0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C5815xz0 c5815xz0B = C6067zz0.b();
            c5815xz0B.a(c4716pF0F0.e0().j());
            c5815xz0B.b(12);
            c5815xz0B.c(16);
            c5815xz0B.d(g(c5467vD0.e()));
            C6067zz0 c6067zz0E = c5815xz0B.e();
            C5059rz0 c5059rz0D = C5185sz0.d();
            c5059rz0D.a(c6067zz0E);
            c5059rz0D.b(C4348mK0.a(c4716pF0F0.e0().D(), c1703Ey0));
            c5059rz0D.c(c5467vD0.f());
            return c5059rz0D.d();
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static EnumC5725xG0 f(C5941yz0 c5941yz0) throws GeneralSecurityException {
        if (C5941yz0.f35593b.equals(c5941yz0)) {
            return EnumC5725xG0.TINK;
        }
        if (C5941yz0.f35594c.equals(c5941yz0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (C5941yz0.f35595d.equals(c5941yz0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c5941yz0)));
    }

    private static C5941yz0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C5941yz0.f35593b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C5941yz0.f35595d;
            }
            if (iOrdinal != 4) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return C5941yz0.f35594c;
    }
}
