package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f20785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f20786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f20787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f20788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f20789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20790f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f20785a = c4096kK0A;
        f20786b = AbstractC3580gD0.d(LB0.f20414a, LA0.class, C5593wD0.class);
        f20787c = AbstractC3203dD0.d(IB0.f19495a, c4096kK0A, C5593wD0.class);
        f20788d = AC0.d(JB0.f19801a, FA0.class, C5467vD0.class);
        f20789e = AbstractC5717xC0.d(KB0.f20120a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f20786b);
        zc0.e(f20787c);
        zc0.b(f20788d);
        zc0.c(f20789e);
    }

    static /* synthetic */ C5593wD0 b(LA0 la0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        c3209dG0H0.B(C2834aH0.f0().a());
        c3209dG0H0.C(f(la0.c()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ LA0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            if (C2834aH0.e0(c5593wD0.d().e0(), HL0.a()).d0() == 0) {
                return LA0.b(g(c5593wD0.d().f0()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(FA0 fa0, C1703Ey0 c1703Ey0) {
        WG0 wg0G0 = XG0.g0();
        byte[] bArrC = fa0.e().c(c1703Ey0);
        wg0G0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((XG0) wg0G0.w()).a(), EnumC2832aG0.SYMMETRIC, f(fa0.f().c()), fa0.b());
    }

    static /* synthetic */ FA0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            XG0 xg0F0 = XG0.f0(c5467vD0.c(), HL0.a());
            if (xg0F0.d0() == 0) {
                return FA0.d(g(c5467vD0.e()), C4348mK0.a(xg0F0.e0().D(), c1703Ey0), c5467vD0.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static EnumC5725xG0 f(KA0 ka0) throws GeneralSecurityException {
        if (KA0.f20115b.equals(ka0)) {
            return EnumC5725xG0.TINK;
        }
        if (KA0.f20116c.equals(ka0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (KA0.f20117d.equals(ka0)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ka0.toString()));
    }

    private static KA0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return KA0.f20115b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return KA0.f20117d;
            }
            if (iOrdinal != 4) {
                int iZza = enumC5725xG0.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return KA0.f20116c;
    }
}
