package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HE0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4096kK0 f19244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4206lC0 f19245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C4206lC0 f19246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AbstractC3580gD0 f19247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AbstractC3203dD0 f19248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AC0 f19249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AbstractC5717xC0 f19250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f19251h = 0;

    static {
        C4096kK0 c4096kK0A = HD0.a("type.googleapis.com/google.crypto.tink.HmacKey");
        f19244a = c4096kK0A;
        C4080kC0 c4080kC0A = C4206lC0.a();
        c4080kC0A.a(EnumC5725xG0.RAW, C3330eE0.f27725e);
        c4080kC0A.a(EnumC5725xG0.TINK, C3330eE0.f27722b);
        c4080kC0A.a(EnumC5725xG0.LEGACY, C3330eE0.f27724d);
        c4080kC0A.a(EnumC5725xG0.CRUNCHY, C3330eE0.f27723c);
        f19245b = c4080kC0A.b();
        C4080kC0 c4080kC0A2 = C4206lC0.a();
        c4080kC0A2.a(RF0.SHA1, C3205dE0.f27385b);
        c4080kC0A2.a(RF0.SHA224, C3205dE0.f27386c);
        c4080kC0A2.a(RF0.SHA256, C3205dE0.f27387d);
        c4080kC0A2.a(RF0.SHA384, C3205dE0.f27388e);
        c4080kC0A2.a(RF0.SHA512, C3205dE0.f27389f);
        f19246c = c4080kC0A2.b();
        f19247d = AbstractC3580gD0.d(GE0.f19009a, C3456fE0.class, C5593wD0.class);
        f19248e = AbstractC3203dD0.d(DE0.f18115a, c4096kK0A, C5593wD0.class);
        f19249f = AC0.d(EE0.f18444a, WD0.class, C5467vD0.class);
        f19250g = AbstractC5717xC0.d(FE0.f18724a, c4096kK0A, C5467vD0.class);
    }

    public static void a(ZC0 zc0) {
        zc0.d(f19247d);
        zc0.e(f19248e);
        zc0.b(f19249f);
        zc0.c(f19250g);
    }

    static /* synthetic */ C5593wD0 b(C3456fE0 c3456fE0) {
        C3209dG0 c3209dG0H0 = C3334eG0.h0();
        c3209dG0H0.A("type.googleapis.com/google.crypto.tink.HmacKey");
        UF0 uf0H0 = VF0.h0();
        uf0H0.A(f(c3456fE0));
        uf0H0.B(c3456fE0.c());
        c3209dG0H0.B(((VF0) uf0H0.w()).a());
        c3209dG0H0.C((EnumC5725xG0) f19245b.b(c3456fE0.f()));
        return C5593wD0.a((C3334eG0) c3209dG0H0.w());
    }

    static /* synthetic */ C3456fE0 c(C5593wD0 c5593wD0) throws GeneralSecurityException {
        if (!c5593wD0.d().d0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c5593wD0.d().d0())));
        }
        try {
            VF0 vf0G0 = VF0.g0(c5593wD0.d().e0(), HL0.a());
            if (vf0G0.f0() != 0) {
                int iF0 = vf0G0.f0();
                StringBuilder sb = new StringBuilder(String.valueOf(iF0).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(iF0);
                throw new GeneralSecurityException(sb.toString());
            }
            C3079cE0 c3079cE0B = C3456fE0.b();
            c3079cE0B.a(vf0G0.e0());
            c3079cE0B.b(vf0G0.d0().e0());
            c3079cE0B.d((C3205dE0) f19246c.c(vf0G0.d0().d0()));
            c3079cE0B.c((C3330eE0) f19245b.c(c5593wD0.d().f0()));
            return c3079cE0B.e();
        } catch (C3598gM0 e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    static /* synthetic */ C5467vD0 d(WD0 wd0, C1703Ey0 c1703Ey0) {
        SF0 sf0H0 = TF0.h0();
        sf0H0.A(f(wd0.f()));
        byte[] bArrC = wd0.e().c(c1703Ey0);
        sf0H0.B(AbstractC5231tL0.w(bArrC, 0, bArrC.length));
        return C5467vD0.a("type.googleapis.com/google.crypto.tink.HmacKey", ((TF0) sf0H0.w()).a(), EnumC2832aG0.SYMMETRIC, (EnumC5725xG0) f19245b.b(wd0.f().f()), wd0.b());
    }

    static /* synthetic */ WD0 e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) throws GeneralSecurityException {
        if (!c5467vD0.g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            TF0 tf0G0 = TF0.g0(c5467vD0.c(), HL0.a());
            if (tf0G0.d0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C3079cE0 c3079cE0B = C3456fE0.b();
            c3079cE0B.a(tf0G0.f0().j());
            c3079cE0B.b(tf0G0.e0().e0());
            c3079cE0B.d((C3205dE0) f19246c.c(tf0G0.e0().d0()));
            c3079cE0B.c((C3330eE0) f19245b.c(c5467vD0.e()));
            C3456fE0 c3456fE0E = c3079cE0B.e();
            VD0 vd0D = WD0.d();
            vd0D.a(c3456fE0E);
            vd0D.b(C4348mK0.a(tf0G0.f0().D(), c1703Ey0));
            vd0D.c(c5467vD0.f());
            return vd0D.d();
        } catch (C3598gM0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static XF0 f(C3456fE0 c3456fE0) {
        WF0 wf0F0 = XF0.f0();
        wf0F0.B(c3456fE0.d());
        wf0F0.A((RF0) f19246c.b(c3456fE0.g()));
        return (XF0) wf0F0.w();
    }
}
