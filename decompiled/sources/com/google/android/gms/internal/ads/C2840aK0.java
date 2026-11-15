package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2840aK0 implements InterfaceC1651Dy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RSAPublicKey f26487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SJ0 f26488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f26489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f26490d;

    /* synthetic */ C2840aK0(RSAPublicKey rSAPublicKey, SJ0 sj0, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (VB0.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        AbstractC3846iK0.b(sj0);
        AbstractC3846iK0.c(rSAPublicKey.getModulus().bitLength());
        AbstractC3846iK0.d(rSAPublicKey.getPublicExponent());
        this.f26487a = rSAPublicKey;
        this.f26488b = sj0;
        this.f26489c = bArr;
        this.f26490d = bArr2;
    }

    private final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA;
        int i10;
        RSAPublicKey rSAPublicKey = this.f26487a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrB = XB0.b(bigInteger.modPow(publicExponent, modulus), iBitLength);
        SJ0 sj0 = this.f26488b;
        AbstractC3846iK0.b(sj0);
        MessageDigest messageDigest = (MessageDigest) JJ0.f19828e.b(AbstractC3720hK0.b(sj0));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f26490d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = sj0.ordinal();
        int i11 = 2;
        if (iOrdinal == 2) {
            bArrA = TJ0.a("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrA = TJ0.a("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(sj0.toString()));
            }
            bArrA = TJ0.a("3051300d060960864801650304020305000440");
        }
        int length = bArrA.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i12 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i12 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i11] = -1;
            i12++;
            i11 = i10;
        }
        bArr4[i11] = 0;
        int length2 = bArrA.length;
        System.arraycopy(bArrA, 0, bArr4, i10, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i10 + length2, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrB, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1651Dy0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f26489c;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else {
            if (!HD0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
