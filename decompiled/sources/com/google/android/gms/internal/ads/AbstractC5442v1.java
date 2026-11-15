package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5442v1 {
    public static void a(long j10, P10 p10, InterfaceC5570w2[] interfaceC5570w2Arr) {
        int iB;
        while (true) {
            if (p10.C() <= 1) {
                return;
            }
            int iC = c(p10);
            int iC2 = c(p10);
            int iF = p10.F() + iC2;
            if (iC2 == -1 || iC2 > p10.C()) {
                YU.c("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = p10.D();
            } else if (iC == 4 && iC2 >= 8) {
                int iR = p10.R();
                int iS = p10.S();
                if (iS == 49) {
                    iB = p10.b();
                    iS = 49;
                } else {
                    iB = 0;
                }
                int iR2 = p10.R();
                if (iS == 47) {
                    p10.J(1);
                    iS = 47;
                }
                boolean z9 = iR == 181 && (iS == 49 || iS == 47) && iR2 == 3;
                if (iS == 49) {
                    z9 &= iB == 1195456820;
                }
                if (z9) {
                    b(j10, p10, interfaceC5570w2Arr);
                }
            }
            p10.G(iF);
        }
    }

    public static void b(long j10, P10 p10, InterfaceC5570w2[] interfaceC5570w2Arr) {
        int iR = p10.R();
        if ((iR & 64) != 0) {
            int i10 = iR & 31;
            p10.J(1);
            int iF = p10.F();
            for (InterfaceC5570w2 interfaceC5570w2 : interfaceC5570w2Arr) {
                int i11 = i10 * 3;
                p10.G(iF);
                interfaceC5570w2.b(p10, i11);
                AbstractC2418Ss0.i(j10 != -9223372036854775807L);
                interfaceC5570w2.c(j10, 1, i11, 0, null);
            }
        }
    }

    private static int c(P10 p10) {
        int i10 = 0;
        while (p10.C() != 0) {
            int iR = p10.R();
            i10 += iR;
            if (iR != 255) {
                return i10;
            }
        }
        return -1;
    }
}
