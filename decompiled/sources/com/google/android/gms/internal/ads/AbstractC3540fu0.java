package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3540fu0 {
    static Object a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 41);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    static int b(Object obj, int i10) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    static void c(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    static int d(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    static int e(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iB = AbstractC4924qu0.b(obj);
        int i11 = iB & i10;
        int iB2 = b(obj3, i11);
        if (iB2 != 0) {
            int i12 = ~i10;
            int i13 = iB & i12;
            int i14 = -1;
            while (true) {
                int i15 = iB2 - 1;
                int i16 = iArr[i15];
                int i17 = i16 & i10;
                if ((i16 & i12) != i13 || !Objects.equals(obj, objArr[i15]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i15]))) {
                    if (i17 == 0) {
                        break;
                    }
                    i14 = i15;
                    iB2 = i17;
                } else {
                    if (i14 == -1) {
                        c(obj3, i11, i17);
                        return i15;
                    }
                    iArr[i14] = (iArr[i14] & i12) | (i17 & i10);
                    return i15;
                }
            }
        }
        return -1;
    }
}
