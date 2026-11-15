package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M1 {
    public static void a(boolean z9, String str) throws C2817a9 {
        if (!z9) {
            throw C2817a9.b(str, null);
        }
    }

    public static int b(J1 j10, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iL = j10.L(bArr, i10 + i12, i11 - i12);
            if (iL == -1) {
                break;
            }
            i12 += iL;
        }
        return i12;
    }

    public static boolean c(J1 j10, byte[] bArr, int i10, int i11) {
        try {
            j10.I(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean d(J1 j10, int i10) {
        try {
            j10.n(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(J1 j10, byte[] bArr, int i10, int i11, boolean z9) throws EOFException {
        try {
            return j10.H(bArr, 0, i11, z9);
        } catch (EOFException e10) {
            if (z9) {
                return false;
            }
            throw e10;
        }
    }

    public static int f(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }
}
