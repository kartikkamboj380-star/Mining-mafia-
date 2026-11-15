package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ry0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2378Ry0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC4584oC0 f23094a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23095b = 0;

    public static AbstractC3674gy0 a() throws GeneralSecurityException {
        if (VB0.a()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return f23094a;
    }

    private static AbstractC4584oC0 b() {
        try {
            C4586oD0 c4586oD0A = C4963rD0.a();
            C2690Xy0.c(c4586oD0A);
            c4586oD0A.a(AbstractC4460nD0.d(C2274Py0.f22262a, C2794Zy0.class, InterfaceC3171cy0.class));
            c4586oD0A.a(AbstractC4460nD0.d(C2170Ny0.f21411a, C5185sz0.class, InterfaceC3171cy0.class));
            c4586oD0A.a(AbstractC4460nD0.d(C2222Oy0.f21987a, C1549Bz0.class, InterfaceC3171cy0.class));
            c4586oD0A.a(AbstractC4460nD0.d(C2118My0.f20963a, C4052jz0.class, InterfaceC3171cy0.class));
            c4586oD0A.a(AbstractC4460nD0.d(C2015Ky0.f20306a, C1965Jz0.class, InterfaceC3171cy0.class));
            c4586oD0A.a(AbstractC4460nD0.d(C1963Jy0.f20030a, FA0.class, InterfaceC3171cy0.class));
            c4586oD0A.a(AbstractC4460nD0.d(C2326Qy0.f22675a, C5965zA0.class, InterfaceC3171cy0.class));
            return AbstractC4584oC0.b(c4586oD0A.c());
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
