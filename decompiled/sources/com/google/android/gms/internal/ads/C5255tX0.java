package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5255tX0 implements InterfaceC3996jX0 {
    protected C5255tX0(C5129sX0 c5129sX0) {
    }

    protected static int a(int i10, int i11, int i12) {
        return AbstractC5305tw0.a(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    protected static final int b(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 250000;
        if (i12 == 0) {
            int iA = a(250000, i14, i13);
            int iA2 = a(750000, i14, i13);
            String str = AbstractC4634ob0.f32117a;
            return Math.max(iA, Math.min(i10 * 4, iA2));
        }
        if (i12 == 1) {
            return AbstractC5305tw0.a((((long) c(i11)) * 50000000) / 1000000);
        }
        if (i11 == 5) {
            i16 = 500000;
        } else if (i11 == 8) {
            i16 = 1000000;
            i11 = 8;
        }
        return AbstractC5305tw0.a((((long) i16) * ((long) (i15 != -1 ? AbstractC4424mw0.b(i15, 8, RoundingMode.CEILING) : c(i11)))) / 1000000);
    }

    private static int c(int i10) {
        int iF = M1.f(i10);
        AbstractC2418Ss0.i(iF != -2147483647);
        return iF;
    }
}
