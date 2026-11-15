package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class GC0 extends AbstractC4050jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5467vD0 f19005a;

    public GC0(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) {
        e(c5467vD0, c1703Ey0);
        this.f19005a = c5467vD0;
    }

    private static void e(C5467vD0 c5467vD0, C1703Ey0 c1703Ey0) {
        int i10 = EC0.f18435b[c5467vD0.d().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final AbstractC1495Ay0 a() {
        C5467vD0 c5467vD0 = this.f19005a;
        return new FC0(c5467vD0.g(), c5467vD0.e(), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4050jy0
    public final Integer b() {
        return this.f19005a.f();
    }

    public final C5467vD0 c(C1703Ey0 c1703Ey0) {
        C5467vD0 c5467vD0 = this.f19005a;
        e(c5467vD0, c1703Ey0);
        return c5467vD0;
    }

    public final C4096kK0 d() throws GeneralSecurityException {
        C5467vD0 c5467vD0 = this.f19005a;
        if (c5467vD0.e().equals(EnumC5725xG0.RAW)) {
            return C4096kK0.a(new byte[0]);
        }
        if (c5467vD0.e().equals(EnumC5725xG0.TINK)) {
            return AbstractC2826aD0.b(c5467vD0.f().intValue());
        }
        if (c5467vD0.e().equals(EnumC5725xG0.LEGACY) || c5467vD0.e().equals(EnumC5725xG0.CRUNCHY)) {
            return AbstractC2826aD0.a(c5467vD0.f().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
