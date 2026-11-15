package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3970jK0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5841yB0 f30401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f30402b;

    private C3970jK0(byte[] bArr, byte[] bArr2) {
        this.f30401a = new C5841yB0(bArr);
        this.f30402b = bArr2;
    }

    public static InterfaceC3171cy0 b(FA0 fa0) {
        return new C3970jK0(fa0.e().c(AbstractC3800hy0.a()), fa0.c().c());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.f30401a.b(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f30402b;
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
