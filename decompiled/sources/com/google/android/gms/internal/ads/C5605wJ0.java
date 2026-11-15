package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5605wJ0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5463vB0 f34518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f34519b;

    private C5605wJ0(byte[] bArr, byte[] bArr2) {
        this.f34518a = new C5463vB0(bArr);
        this.f34519b = bArr2;
    }

    public static InterfaceC3171cy0 b(C1965Jz0 c1965Jz0) {
        return new C5605wJ0(c1965Jz0.e().c(AbstractC3800hy0.a()), c1965Jz0.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f34518a.b(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f34519b;
        int length = bArr3.length;
        if (length == 0) {
            return c(bArr, bArr2);
        }
        if (HD0.e(bArr3, bArr)) {
            return c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
