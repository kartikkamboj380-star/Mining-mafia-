package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class DJ0 implements InterfaceC3171cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UJ0 f18142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6065zy0 f18143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f18145d;

    private DJ0(UJ0 uj0, InterfaceC6065zy0 interfaceC6065zy0, int i10, byte[] bArr) {
        this.f18142a = uj0;
        this.f18143b = interfaceC6065zy0;
        this.f18144c = i10;
        this.f18145d = bArr;
    }

    public static InterfaceC3171cy0 b(C2794Zy0 c2794Zy0) {
        C4598oJ0 c4598oJ0 = new C4598oJ0(c2794Zy0.e().c(AbstractC3800hy0.a()), c2794Zy0.g().f());
        String strValueOf = String.valueOf(c2794Zy0.g().h());
        return new DJ0(c4598oJ0, new ZJ0(new YJ0("HMAC".concat(strValueOf), new SecretKeySpec(c2794Zy0.f().c(AbstractC3800hy0.a()), "HMAC")), c2794Zy0.g().e()), c2794Zy0.g().e(), c2794Zy0.c().c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3171cy0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18145d;
        int length = bArr.length;
        int i10 = this.f18144c;
        int length2 = bArr3.length;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!HD0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((ZJ0) this.f18143b).c(AbstractC5479vJ0.a(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.f18142a.a(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
