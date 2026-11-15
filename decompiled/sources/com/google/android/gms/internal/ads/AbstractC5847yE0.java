package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5847yE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f35313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f35314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f35315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f35316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f35317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f35318f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f35313a = c4096kK0A;
        f35314b = AbstractC3580gD0.d(C5721xE0.f34764a, QD0.class, C5593wD0.class);
        f35315c = AbstractC3203dD0.d(C5217tE0.f33373a, c4096kK0A, C5593wD0.class);
        f35316d = AC0.d(C5343uE0.f33757a, JD0.class, C5467vD0.class);
        f35317e = AbstractC5717xC0.d(C5595wE0.f34501a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f35314b);
        zc0.e(f35315c);
        zc0.b(f35316d);
        zc0.c(f35317e);
    }

    static /* synthetic */ C5593wD0 b(QD0 qd0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.AesCmacKey");
        TE0 te0G0 = UE0.g0();
        te0G0.B(h(qd0));
        te0G0.A(qd0.c());
        c3209dG0H0.B(((UE0) te0G0.w()).a());
        c3209dG0H0.C(f(qd0.f()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ QD0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            UE0 ue0F0 = UE0.f0(c5593wD0.d().e0(), HL0.a());
            OD0 od0B = QD0.b();
            od0B.a(ue0F0.d0());
            od0B.b(ue0F0.e0().d0());
            od0B.c(g(c5593wD0.d().f0()));
            return od0B.d();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(JD0 jd0, C1703Ey0 c1703Ey0) {
        RE0 re0H0 = SE0.h0();
        re0H0.B(h(jd0.f()));
        byte[] bArrC = jd0.e().c(c1703Ey0);
        re0H0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((SE0) re0H0.w()).a(), EnumC2832aG0.SYMMETRIC, f(jd0.f().f()), jd0.b());
    }

    static /* synthetic */ JD0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            SE0 se0G0 = SE0.g0(c5467vD0.c(), HL0.a());
            if (se0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            OD0 od0B = QD0.b();
            od0B.a(se0G0.e0().j());
            od0B.b(se0G0.f0().d0());
            od0B.c(g(c5467vD0.e()));
            QD0 qd0D = od0B.d();
            ID0 id0D = JD0.d();
            id0D.a(qd0D);
            id0D.b(C4348mK0.a(se0G0.e0().D(), c1703Ey0));
            id0D.c(c5467vD0.f());
            return id0D.d();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static EnumC5725xG0 f(PD0 pd0) throws GeneralSecurityException {
        if (PD0.f22065b.equals(pd0)) {
            return EnumC5725xG0.TINK;
        }
        if (PD0.f22066c.equals(pd0)) {
            return EnumC5725xG0.CRUNCHY;
        }
        if (PD0.f22068e.equals(pd0)) {
            return EnumC5725xG0.RAW;
        }
        if (PD0.f22067d.equals(pd0)) {
            return EnumC5725xG0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(pd0)));
    }

    private static PD0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return PD0.f22065b;
        }
        if (iOrdinal == 2) {
            return PD0.f22067d;
        }
        if (iOrdinal == 3) {
            return PD0.f22068e;
        }
        if (iOrdinal == 4) {
            return PD0.f22066c;
        }
        int iZza = enumC5725xG0.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static XE0 h(QD0 qd0) {
        VE0 ve0E0 = XE0.e0();
        ve0E0.A(qd0.d());
        return (XE0) ve0E0.w();
    }
}
