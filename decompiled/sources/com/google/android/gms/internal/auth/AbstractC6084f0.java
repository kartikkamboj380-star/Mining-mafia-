package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC6084f0 {
    static int a(byte[] bArr, int i10, C6081e0 c6081e0) {
        int iH = h(bArr, i10, c6081e0);
        int i11 = c6081e0.f36016a;
        if (i11 < 0) {
            throw H0.c();
        }
        if (i11 > bArr.length - iH) {
            throw H0.f();
        }
        if (i11 == 0) {
            c6081e0.f36018c = AbstractC6117q0.f36138b;
            return iH;
        }
        c6081e0.f36018c = AbstractC6117q0.m(bArr, iH, i11);
        return iH + i11;
    }

    static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int c(InterfaceC6100k1 interfaceC6100k1, byte[] bArr, int i10, int i11, int i12, C6081e0 c6081e0) {
        Object objZzd = interfaceC6100k1.zzd();
        int iL = l(objZzd, interfaceC6100k1, bArr, i10, i11, i12, c6081e0);
        interfaceC6100k1.a(objZzd);
        c6081e0.f36018c = objZzd;
        return iL;
    }

    static int d(InterfaceC6100k1 interfaceC6100k1, byte[] bArr, int i10, int i11, C6081e0 c6081e0) {
        Object objZzd = interfaceC6100k1.zzd();
        int iM = m(objZzd, interfaceC6100k1, bArr, i10, i11, c6081e0);
        interfaceC6100k1.a(objZzd);
        c6081e0.f36018c = objZzd;
        return iM;
    }

    static int e(InterfaceC6100k1 interfaceC6100k1, int i10, byte[] bArr, int i11, int i12, E0 e10, C6081e0 c6081e0) {
        int iD = d(interfaceC6100k1, bArr, i11, i12, c6081e0);
        e10.add(c6081e0.f36018c);
        while (iD < i12) {
            int iH = h(bArr, iD, c6081e0);
            if (i10 != c6081e0.f36016a) {
                break;
            }
            iD = d(interfaceC6100k1, bArr, iH, i12, c6081e0);
            e10.add(c6081e0.f36018c);
        }
        return iD;
    }

    static int f(byte[] bArr, int i10, E0 e10, C6081e0 c6081e0) {
        p070h.w.a(e10);
        int iH = h(bArr, i10, c6081e0);
        int i11 = c6081e0.f36016a + iH;
        if (iH < i11) {
            h(bArr, iH, c6081e0);
            throw null;
        }
        if (iH == i11) {
            return iH;
        }
        throw H0.f();
    }

    static int g(int i10, byte[] bArr, int i11, int i12, C6120r1 c6120r1, C6081e0 c6081e0) {
        if ((i10 >>> 3) == 0) {
            throw H0.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iK = k(bArr, i11, c6081e0);
            c6120r1.h(i10, Long.valueOf(c6081e0.f36017b));
            return iK;
        }
        if (i13 == 1) {
            c6120r1.h(i10, Long.valueOf(n(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iH = h(bArr, i11, c6081e0);
            int i14 = c6081e0.f36016a;
            if (i14 < 0) {
                throw H0.c();
            }
            if (i14 > bArr.length - iH) {
                throw H0.f();
            }
            if (i14 == 0) {
                c6120r1.h(i10, AbstractC6117q0.f36138b);
            } else {
                c6120r1.h(i10, AbstractC6117q0.m(bArr, iH, i14));
            }
            return iH + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw H0.a();
            }
            c6120r1.h(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C6120r1 c6120r1D = C6120r1.d();
        int i16 = 0;
        while (i11 < i12) {
            int iH2 = h(bArr, i11, c6081e0);
            i16 = c6081e0.f36016a;
            if (i16 == i15) {
                i11 = iH2;
                break;
            }
            i11 = g(i16, bArr, iH2, i12, c6120r1D, c6081e0);
        }
        if (i11 > i12 || i16 != i15) {
            throw H0.d();
        }
        c6120r1.h(i10, c6120r1D);
        return i11;
    }

    static int h(byte[] bArr, int i10, C6081e0 c6081e0) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return i(b10, bArr, i11, c6081e0);
        }
        c6081e0.f36016a = b10;
        return i11;
    }

    static int i(int i10, byte[] bArr, int i11, C6081e0 c6081e0) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            c6081e0.f36016a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            c6081e0.f36016a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c6081e0.f36016a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c6081e0.f36016a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c6081e0.f36016a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int j(int i10, byte[] bArr, int i11, int i12, E0 e10, C6081e0 c6081e0) {
        p070h.w.a(e10);
        h(bArr, i11, c6081e0);
        int i13 = c6081e0.f36016a;
        throw null;
    }

    static int k(byte[] bArr, int i10, C6081e0 c6081e0) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c6081e0.f36017b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        c6081e0.f36017b = j11;
        return i12;
    }

    static int l(Object obj, InterfaceC6100k1 interfaceC6100k1, byte[] bArr, int i10, int i11, int i12, C6081e0 c6081e0) {
        int iO = ((C6079d1) interfaceC6100k1).o(obj, bArr, i10, i11, i12, c6081e0);
        c6081e0.f36018c = obj;
        return iO;
    }

    static int m(Object obj, InterfaceC6100k1 interfaceC6100k1, byte[] bArr, int i10, int i11, C6081e0 c6081e0) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = i(i13, bArr, i12, c6081e0);
            i13 = c6081e0.f36016a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw H0.f();
        }
        int i15 = i14 + i13;
        interfaceC6100k1.c(obj, bArr, i14, i15, c6081e0);
        c6081e0.f36018c = obj;
        return i15;
    }

    static long n(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
