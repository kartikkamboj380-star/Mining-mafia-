package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4975rJ0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SecretKey f32875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f32876b;

    private C4975rJ0(byte[] bArr, C4096kK0 c4096kK0) throws GeneralSecurityException {
        if (!UB0.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f32875a = YA0.b(bArr);
        this.f32876b = c4096kK0.c();
    }

    public static InterfaceC3171cy0 b(C5185sz0 c5185sz0) {
        c5185sz0.f();
        c5185sz0.f();
        return new C4975rJ0(c5185sz0.e().c(AbstractC3800hy0.a()), c5185sz0.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.f32876b;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = YA0.c(bArr, length2, 12);
        SecretKey secretKey = this.f32875a;
        Cipher cipherA = YA0.a();
        cipherA.init(2, secretKey, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            cipherA.updateAAD(bArr2);
        }
        return cipherA.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
