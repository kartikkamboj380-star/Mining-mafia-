package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CJ0 {
    public static byte[] a(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i10;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i11 = length >> 1;
        byte[] bArrC = c(Arrays.copyOf(bArr, i11));
        byte[] bArrC2 = c(Arrays.copyOfRange(bArr, i11, length));
        int length2 = bArrC.length;
        int length3 = bArrC2.length;
        int i12 = length2 + 4 + length3;
        if (i12 >= 128) {
            bArr2 = new byte[i12 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i12;
            i10 = 3;
        } else {
            bArr2 = new byte[i12 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i12;
            i10 = 2;
        }
        int i13 = i10 + 1;
        bArr2[i10] = 2;
        int i14 = i10 + 2;
        bArr2[i13] = (byte) length2;
        System.arraycopy(bArrC, 0, bArr2, i14, length2);
        int i15 = i14 + length2;
        bArr2[i15] = 2;
        bArr2[i15 + 1] = (byte) length3;
        System.arraycopy(bArrC2, 0, bArr2, i15 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec b(AJ0 aj0) throws NoSuchAlgorithmException {
        int iOrdinal = aj0.ordinal();
        if (iOrdinal == 0) {
            return AbstractC3954jC0.f30346a;
        }
        if (iOrdinal == 1) {
            return AbstractC3954jC0.f30347b;
        }
        if (iOrdinal == 2) {
            return AbstractC3954jC0.f30348c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(aj0.toString()));
    }

    private static byte[] c(byte[] bArr) {
        int length;
        int i10 = 0;
        while (true) {
            length = bArr.length;
            if (i10 >= length || bArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == length) {
            i10 = length - 1;
        }
        int i11 = (bArr[i10] & 128) == 128 ? 1 : 0;
        int i12 = length - i10;
        byte[] bArr2 = new byte[i12 + i11];
        System.arraycopy(bArr, i10, bArr2, i11, i12);
        return bArr2;
    }
}
