package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class BB0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f17527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LE0 f17529c;

    private BB0(byte[] bArr, C4096kK0 c4096kK0, int i10) {
        this.f17529c = WJ0.b(JE0.c(KE0.b(bArr.length), C4348mK0.a(bArr, AbstractC3800hy0.a())));
        this.f17527a = c4096kK0.c();
        this.f17528b = i10;
    }

    public static InterfaceC3171cy0 b(C5965zA0 c5965zA0) {
        c5965zA0.f();
        c5965zA0.f();
        return new BB0(c5965zA0.e().c(AbstractC3800hy0.a()), c5965zA0.c(), c5965zA0.f().d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f17527a;
        int i10 = this.f17528b;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i11 = i10 + length2;
        if (length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        LE0 le0 = this.f17529c;
        byte[] bArr6 = new byte[32];
        System.arraycopy(le0.a(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(le0.a(bArr5, 16), 0, bArr6, 16, 16);
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyB = YA0.b(bArr6);
        int i12 = i11 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, i12);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = YA0.c(bArrCopyOfRange2, 0, 12);
        Cipher cipherA = YA0.a();
        cipherA.init(2, secretKeyB, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        return cipherA.doFinal(bArr, i12, length - i12);
    }
}
