package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PI0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f22079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4096kK0 f22080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AbstractC3580gD0 f22081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3203dD0 f22082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AC0 f22083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC5717xC0 f22084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AC0 f22085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AbstractC5717xC0 f22086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C4206lC0 f22087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f22088j = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f22079a = c4096kK0A;
        C4096kK0 c4096kK0A2 = HD0.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f22080b = c4096kK0A2;
        f22081c = AbstractC3580gD0.d(OI0.f21504a, C4846qH0.class, C5593wD0.class);
        f22082d = AbstractC3203dD0.d(JI0.f19823a, c4096kK0A, C5593wD0.class);
        f22083e = AC0.d(KI0.f20166a, C5727xH0.class, C5467vD0.class);
        f22084f = AbstractC5717xC0.d(LI0.f20426a, c4096kK0A2, C5467vD0.class);
        f22085g = AC0.d(MI0.f20798a, C4971rH0.class, C5467vD0.class);
        f22086h = AbstractC5717xC0.d(NI0.f21169a, c4096kK0A, C5467vD0.class);
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(EnumC5725xG0.RAW, C4720pH0.f32354e);
        c4080kC0A.a(EnumC5725xG0.TINK, C4720pH0.f32351b);
        c4080kC0A.a(EnumC5725xG0.CRUNCHY, C4720pH0.f32352c);
        c4080kC0A.a(EnumC5725xG0.LEGACY, C4720pH0.f32353d);
        f22087i = c4080kC0A.b();
    }

    public static void a(ZC0 zc0) {
        zc0.d(f22081c);
        zc0.e(f22082d);
        zc0.b(f22083e);
        zc0.c(f22084f);
        zc0.b(f22085g);
        zc0.c(f22086h);
    }

    static /* synthetic */ C5593wD0 b(C4846qH0 c4846qH0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        c3209dG0H0.B(LF0.f0().a());
        c3209dG0H0.C((EnumC5725xG0) f22087i.b(c4846qH0.c()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C4846qH0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            if (LF0.e0(c5593wD0.d().e0(), HL0.a()).d0() == 0) {
                return C4846qH0.b((C4720pH0) f22087i.c(c5593wD0.d().f0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    static /* synthetic */ C5727xH0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            PF0 pf0F0 = PF0.f0(c5467vD0.c(), HL0.a());
            if (pf0F0.d0() == 0) {
                return C5727xH0.d((C4720pH0) f22087i.c(c5467vD0.e()), C4096kK0.a(pf0F0.e0().D()), c5467vD0.f());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    static /* synthetic */ C5467vD0 f(C4971rH0 c4971rH0, C1703Ey0 c1703Ey0) {
        MF0 mf0H0 = NF0.h0();
        mf0H0.B(h(c4971rH0.f()));
        byte[] bArrC = c4971rH0.g().c(c1703Ey0);
        mf0H0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((NF0) mf0H0.w()).a(), EnumC2832aG0.ASYMMETRIC_PRIVATE, (EnumC5725xG0) f22087i.b(c4971rH0.e().c()), c4971rH0.f().b());
    }

    static /* synthetic */ C4971rH0 g(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(c5467vD0.g())));
        }
        try {
            NF0 nf0G0 = NF0.g0(c5467vD0.c(), HL0.a());
            if (nf0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            PF0 pf0F0 = nf0G0.f0();
            if (pf0F0.d0() == 0) {
                return C4971rH0.d(C5727xH0.d((C4720pH0) f22087i.c(c5467vD0.e()), C4096kK0.a(pf0F0.e0().D()), c5467vD0.f()), C4348mK0.a(nf0G0.e0().D(), c1703Ey0));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C3598gM0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static PF0 h(C5727xH0 c5727xH0) {
        OF0 of0G0 = PF0.g0();
        byte[] bArrC = c5727xH0.e().c();
        of0G0.A(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return (PF0) of0G0.w();
    }
}
