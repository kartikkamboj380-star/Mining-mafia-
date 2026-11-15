package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266td extends AbstractCallableC2127Nd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C2697Yc f33436h;

    public C5266td(C2645Xc c2645Xc, String str, String str2, C1966Ka c1966Ka, int i10, int i11, C2697Yc c2697Yc) {
        super(c2645Xc, "uAqKAtpzCVdzsQfO3VsjAegcR1bzJIPV7WnBpdLTTlepVA45FMcx2CHHUDw9JuIC", "/PvocKqER/fglRgbozHO01MU+uyxr0WG8/b5JQrvhOY=", c1966Ka, i10, 85);
        this.f33436h = c2697Yc;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2127Nd
    protected final void a() {
        Method method = this.f21302e;
        C2697Yc c2697Yc = this.f33436h;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(c2697Yc.f()), Long.valueOf(c2697Yc.g()), Long.valueOf(c2697Yc.i()), Long.valueOf(c2697Yc.h()));
        C1966Ka c1966Ka = this.f21301d;
        synchronized (c1966Ka) {
            c1966Ka.d0(jArr[0]);
            c1966Ka.e0(jArr[1]);
        }
    }
}
