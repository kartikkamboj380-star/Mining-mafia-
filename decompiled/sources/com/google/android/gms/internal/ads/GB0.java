package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f18997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC3580gD0 f18998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3203dD0 f18999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AC0 f19000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC5717xC0 f19001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f19002f = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f18997a = c4096kK0A;
        f18998b = AbstractC3580gD0.d(FB0.f18714a, EA0.class, C5593wD0.class);
        f18999c = AbstractC3203dD0.d(CB0.f17820a, c4096kK0A, C5593wD0.class);
        f19000d = AC0.d(DB0.f18104a, C5965zA0.class, C5467vD0.class);
        f19001e = AbstractC5717xC0.d(EB0.f18431a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f18998b);
        zc0.e(f18999c);
        zc0.b(f19000d);
        zc0.c(f19001e);
    }

    static /* synthetic */ C5593wD0 b(EA0 ea0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        SG0 sg0G0 = TG0.g0();
        UG0 ug0E0 = VG0.e0();
        ug0E0.A(ea0.d());
        sg0G0.A((VG0) ug0E0.w());
        c3209dG0H0.B(((TG0) sg0G0.w()).a());
        c3209dG0H0.C(f(ea0.c()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ EA0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            TG0 tg0F0 = TG0.f0(c5593wD0.d().e0(), HL0.a());
            if (tg0F0.d0() == 0) {
                return EA0.b(g(c5593wD0.d().f0()), tg0F0.e0().d0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(C5965zA0 c5965zA0, C1703Ey0 c1703Ey0) {
        QG0 qg0H0 = RG0.h0();
        byte[] bArrC = c5965zA0.e().c(c1703Ey0);
        qg0H0.B(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        UG0 ug0E0 = VG0.e0();
        ug0E0.A(c5965zA0.f().d());
        qg0H0.A((VG0) ug0E0.w());
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((RG0) qg0H0.w()).a(), EnumC2832aG0.SYMMETRIC, f(c5965zA0.f().c()), c5965zA0.b());
    }

    static /* synthetic */ C5965zA0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            RG0 rg0G0 = RG0.g0(c5467vD0.c(), HL0.a());
            if (rg0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (rg0G0.f0().j() == 32) {
                return C5965zA0.d(EA0.b(g(c5467vD0.e()), rg0G0.e0().d0()), C4348mK0.a(rg0G0.f0().D(), c1703Ey0), c5467vD0.f());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static EnumC5725xG0 f(DA0 da0) throws GeneralSecurityException {
        if (Objects.equals(da0, DA0.f18100b)) {
            return EnumC5725xG0.TINK;
        }
        if (Objects.equals(da0, DA0.f18101c)) {
            return EnumC5725xG0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(da0.toString()));
    }

    private static DA0 g(EnumC5725xG0 enumC5725xG0) throws GeneralSecurityException {
        int iOrdinal = enumC5725xG0.ordinal();
        if (iOrdinal == 1) {
            return DA0.f18100b;
        }
        if (iOrdinal == 3) {
            return DA0.f18101c;
        }
        int iZza = enumC5725xG0.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
