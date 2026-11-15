package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3197dA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f27353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f27354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f27355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f27356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f27357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27358f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f27353a = c4096kK0A;
        f27354b = AbstractC3580gD0.d(C3071cA0.f27058a, C2744Yz0.class, C5593wD0.class);
        f27355c = AbstractC3203dD0.d(C2796Zz0.f26366a, c4096kK0A, C5593wD0.class);
        f27356d = AC0.d(C2820aA0.f26438a, C2640Wz0.class, C5467vD0.class);
        f27357e = AbstractC5717xC0.d(C2946bA0.f26746a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f27354b);
        zc0.e(f27355c);
        zc0.b(f27356d);
        zc0.c(f27357e);
    }

    static /* synthetic */ C5593wD0 b(C2744Yz0 c2744Yz0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        C4969rG0 c4969rG0F0 = C5095sG0.f0();
        c4969rG0F0.A(c2744Yz0.c());
        c3209dG0H0.B(((C5095sG0) c4969rG0F0.w()).a());
        c3209dG0H0.C(f(c2744Yz0.d()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C2744Yz0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            return C2744Yz0.b(C5095sG0.e0(c5593wD0.d().e0(), HL0.a()).d0(), g(c5593wD0.d().f0()));
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C2640Wz0 c2640Wz0, C1703Ey0 c1703Ey0) {
        C4718pG0 c4718pG0G0 = C4844qG0.g0();
        C4969rG0 c4969rG0F0 = C5095sG0.f0();
        c4969rG0F0.A(c2640Wz0.e().c());
        c4718pG0G0.A((C5095sG0) c4969rG0F0.w());
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C4844qG0) c4718pG0G0.w()).a(), EnumC2832aG0.REMOTE, f(c2640Wz0.e().d()), c2640Wz0.b());
    }

    static /* synthetic */ C2640Wz0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            C4844qG0 c4844qG0F0 = C4844qG0.f0(c5467vD0.c(), HL0.a());
            if (c4844qG0F0.d0() == 0) {
                return C2640Wz0.d(C2744Yz0.b(c4844qG0F0.e0().d0(), g(c5467vD0.e())), c5467vD0.f());
            }
            String strValueOf = String.valueOf(c4844qG0F0);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    private static EnumC5725xG0 f(C2692Xz0 c2692Xz0) throws GeneralSecurityException {
        if (C2692Xz0.f25424b.equals(c2692Xz0)) {
            return EnumC5725xG0.TINK;
        }
        if (C2692Xz0.f25425c.equals(c2692Xz0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c2692Xz0.toString()));
    }

    private static C2692Xz0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C2692Xz0.f25424b;
        }
        if (iOrdinal == 3) {
            return C2692Xz0.f25425c;
        }
        int iZza = enumC5725xG0.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
