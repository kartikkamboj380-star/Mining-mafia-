package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4850qJ0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f32617e = new C4724pJ0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f32618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LE0 f32619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f32620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32621d;

    private C4850qJ0(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f32621d = i10;
        int length = bArr.length;
        AbstractC3846iK0.a(length);
        this.f32620c = new SecretKeySpec(bArr, "AES");
        this.f32619b = WJ0.b(JE0.c(KE0.b(length), C4348mK0.a(bArr, AbstractC3800hy0.a())));
        this.f32618a = bArr2;
    }

    public static InterfaceC3171cy0 b(C4052jz0 c4052jz0) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        c4052jz0.f();
        return new C4850qJ0(c4052jz0.e().c(AbstractC3800hy0.a()), c4052jz0.f().d(), c4052jz0.c().c());
    }

    private final byte[] c(int i10, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12 + 16];
        bArr2[15] = (byte) i10;
        System.arraycopy(bArr, i11, bArr2, 16, i12);
        return this.f32619b.a(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f32618a;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i10 = this.f32621d;
        int i11 = ((length - length2) - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrC = c(0, bArr, length2, i10);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrC2 = c(1, bArr2, 0, bArr2.length);
        byte[] bArrC3 = c(2, bArr, length2 + i10, i11);
        int i12 = length - 16;
        byte b10 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b10 = (byte) (b10 | (((bArr[i12 + i13] ^ bArrC2[i13]) ^ bArrC[i13]) ^ bArrC3[i13]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f32617e.get();
        cipher.init(1, this.f32620c, new IvParameterSpec(bArrC));
        return cipher.doFinal(bArr, bArr3.length + i10, i11);
    }
}
