package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q1 {
    public static boolean a(P10 p10, V1 v10, int i10, P1 p11) {
        int iF = p10.F();
        long jY = p10.Y();
        long j10 = jY >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z9 = (j10 & 1) == 1;
        long j11 = jY >> 12;
        long j12 = jY >> 8;
        long j13 = jY >> 4;
        long j14 = jY >> 1;
        long j15 = jY & 1;
        int i11 = (int) (j13 & 15);
        if (i11 <= 7) {
            if (i11 != v10.f24163g - 1) {
                return false;
            }
        } else if (i11 > 10 || v10.f24163g != 2) {
            return false;
        }
        int i12 = (int) (j14 & 7);
        if ((i12 != 0 && i12 != v10.f24165i) || j15 == 1 || !d(p10, v10, z9, p11)) {
            return false;
        }
        long j16 = p11.f22002a;
        int iC = c(p10, (int) (j11 & 15));
        long j17 = v10.f24166j;
        boolean z10 = j17 == 0 || j16 + ((long) iC) >= j17;
        if (iC == -1) {
            return false;
        }
        if ((!z10 && iC < v10.f24157a) || iC > v10.f24158b) {
            return false;
        }
        int i13 = v10.f24161e;
        int i14 = (int) (j12 & 15);
        if (i14 != 0) {
            if (i14 <= 11) {
                if (i14 != v10.f24162f) {
                    return false;
                }
            } else if (i14 == 12) {
                if (p10.R() * 1000 != i13) {
                    return false;
                }
            } else {
                if (i14 > 14) {
                    return false;
                }
                int iS = p10.S();
                if (i14 == 14) {
                    iS *= 10;
                }
                if (iS != i13) {
                    return false;
                }
            }
        }
        if (p10.R() != AbstractC4634ob0.i(p10.H(), iF, p10.F() - 1, 0)) {
            return false;
        }
        if (p10.C() != 0) {
            int iM = p10.M();
            if ((iM & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                return false;
            }
            int i15 = (iM & 126) >> 1;
            if ((i15 >= 2 && i15 <= 7) || (i15 >= 13 && i15 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i15).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i15);
                YU.b("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long b(J1 j10, V1 v10) throws C2817a9 {
        j10.zzl();
        j10.E(1);
        byte[] bArr = new byte[1];
        j10.J(bArr, 0, 1);
        int i10 = bArr[0] & 1;
        boolean z9 = 1 == i10;
        j10.E(2);
        int i11 = 1 != i10 ? 6 : 7;
        P10 p10 = new P10(i11);
        p10.E(M1.b(j10, p10.H(), 0, i11));
        j10.zzl();
        P1 p11 = new P1();
        if (d(p10, v10, z9, p11)) {
            return p11.f22002a;
        }
        throw C2817a9.b(null, null);
    }

    public static int c(P10 p10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return p10.R() + 1;
            case 7:
                return p10.S() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER << (i10 - 8);
            default:
                return -1;
        }
    }

    private static boolean d(P10 p10, V1 v10, boolean z9, P1 p11) {
        try {
            long jO = p10.o();
            if (!z9) {
                jO *= (long) v10.f24158b;
            }
            long j10 = v10.f24166j;
            if (j10 != 0 && jO > j10) {
                return false;
            }
            p11.f22002a = jO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
