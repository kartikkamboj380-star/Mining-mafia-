package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4204lB0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f31217d = TJ0.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f31218e = TJ0.a("070000004041424344454647");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte[] f31219f = TJ0.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f31220g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f31221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f31222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31223c;

    private C4204lB0(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f31221a = new SecretKeySpec(bArr, "ChaCha20");
        this.f31222b = bArr2;
        this.f31223c = provider;
    }

    public static InterfaceC3171cy0 b(C1965Jz0 c1965Jz0) throws GeneralSecurityException {
        return new C4204lB0(c1965Jz0.e().c(AbstractC3800hy0.a()), c1965Jz0.c().c(), c().getProvider());
    }

    static Cipher c() throws GeneralSecurityException {
        Cipher cipher = (Cipher) JJ0.f19825b.b("ChaCha20-Poly1305");
        if (e(cipher)) {
            return cipher;
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    public static boolean d() {
        try {
            c();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private static boolean e(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f31218e);
            byte[] bArr = f31217d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f31219f;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f31222b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Provider provider = this.f31223c;
        SecretKey secretKey = this.f31221a;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKey, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
