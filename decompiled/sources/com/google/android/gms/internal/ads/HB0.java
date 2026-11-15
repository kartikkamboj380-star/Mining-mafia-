package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class HB0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f19234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f19236c;

    private HB0(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f19234a = bArr;
        this.f19235b = bArr2;
        this.f19236c = provider;
    }

    public static InterfaceC3171cy0 b(FA0 fa0) throws GeneralSecurityException {
        return new HB0(fa0.e().c(AbstractC3800hy0.a()), fa0.c().c(), C4204lB0.c().getProvider());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f19235b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, length2, bArr4, 0, 24);
        int[] iArrE = AbstractC5085sB0.e(AbstractC5085sB0.d(this.f19234a), AbstractC5085sB0.d(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrE.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrE);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Provider provider = this.f19236c;
        int i10 = C4204lB0.f31220g;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
