package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4959rB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f32850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f32851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f32852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f32853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f32854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32855f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f32850a = c4096kK0A;
        f32851b = AbstractC3580gD0.d(C4834qB0.f32599a, C2276Pz0.class, C5593wD0.class);
        f32852c = AbstractC3203dD0.d(C4330mB0.f31457a, c4096kK0A, C5593wD0.class);
        f32853d = AC0.d(C4456nB0.f31756a, C1965Jz0.class, C5467vD0.class);
        f32854e = AbstractC5717xC0.d(C4582oB0.f31996a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f32851b);
        zc0.e(f32852c);
        zc0.b(f32853d);
        zc0.c(f32854e);
    }

    static /* synthetic */ C5593wD0 b(C2276Pz0 c2276Pz0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        c3209dG0H0.B(AF0.e0().a());
        c3209dG0H0.C(f(c2276Pz0.c()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C2276Pz0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            AF0.d0(c5593wD0.d().e0(), HL0.a());
            return C2276Pz0.b(g(c5593wD0.d().f0()));
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C1965Jz0 c1965Jz0, C1703Ey0 c1703Ey0) {
        C5597wF0 c5597wF0G0 = C5849yF0.g0();
        byte[] bArrC = c1965Jz0.e().c(c1703Ey0);
        c5597wF0G0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C5849yF0) c5597wF0G0.w()).a(), EnumC2832aG0.SYMMETRIC, f(c1965Jz0.f().c()), c1965Jz0.b());
    }

    static /* synthetic */ C1965Jz0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            C5849yF0 c5849yF0F0 = C5849yF0.f0(c5467vD0.c(), HL0.a());
            if (c5849yF0F0.d0() == 0) {
                return C1965Jz0.d(g(c5467vD0.e()), C4348mK0.a(c5849yF0F0.e0().D(), c1703Ey0), c5467vD0.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static EnumC5725xG0 f(C2224Oz0 c2224Oz0) throws GeneralSecurityException {
        if (C2224Oz0.f21988b.equals(c2224Oz0)) {
            return EnumC5725xG0.TINK;
        }
        if (C2224Oz0.f21989c.equals(c2224Oz0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (C2224Oz0.f21990d.equals(c2224Oz0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c2224Oz0.toString()));
    }

    private static C2224Oz0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return C2224Oz0.f21988b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C2224Oz0.f21990d;
            }
            if (iOrdinal != 4) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return C2224Oz0.f21989c;
    }
}
