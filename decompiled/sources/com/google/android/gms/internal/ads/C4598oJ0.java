package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4598oJ0 implements UJ0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f32033d = new C4472nJ0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f32034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32036c;

    public C4598oJ0(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3846iK0.a(bArr.length);
        this.f32034a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f32033d.get()).getBlockSize();
        this.f32036c = blockSize;
        if (i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f32035b = i10;
    }

    @Override // com.google.android.gms.internal.ads.UJ0
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f32035b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int i11 = length - i10;
        byte[] bArr3 = new byte[i11];
        Cipher cipher = (Cipher) f32033d.get();
        byte[] bArr4 = new byte[this.f32036c];
        System.arraycopy(bArr2, 0, bArr4, 0, i10);
        cipher.init(2, this.f32034a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i10, i11, bArr3, 0) == i11) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
