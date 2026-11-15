package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class PE0 implements LE0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f22071d = new OE0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f22072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f22073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f22074c;

    private PE0(byte[] bArr) throws GeneralSecurityException {
        AbstractC3846iK0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f22072a = secretKeySpec;
        Cipher cipherC = c();
        cipherC.init(1, secretKeySpec);
        byte[] bArrA = AbstractC5973zE0.a(cipherC.doFinal(new byte[16]));
        this.f22073b = bArrA;
        this.f22074c = AbstractC5973zE0.a(bArrA);
    }

    public static LE0 b(JE0 je0) {
        return new PE0(je0.d().c(AbstractC3800hy0.a()));
    }

    private static Cipher c() throws GeneralSecurityException {
        if (UB0.a(1)) {
            return (Cipher) f22071d.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void d(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.LE0
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrB;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f22072a;
        Cipher cipherC = c();
        cipherC.init(1, secretKey);
        int length = bArr.length;
        int i11 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i12 = i11 - 1;
        int i13 = i12 * 16;
        if (i11 * 16 == length) {
            bArrB = AbstractC5479vJ0.b(bArr, i13, this.f22073b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            byte[] bArr2 = this.f22074c;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrB = AbstractC5479vJ0.b(bArrCopyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i14 = 0; i14 < i12; i14++) {
            d(bArr3, bArr, i14 * 16, bArr4);
            if (cipherC.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        d(bArr3, bArrB, 0, bArr4);
        if (cipherC.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i10 == 16 ? bArr3 : Arrays.copyOf(bArr3, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
