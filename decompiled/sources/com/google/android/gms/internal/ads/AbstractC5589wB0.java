package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5589wB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5337uB0 f34493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5337uB0 f34494b;

    public AbstractC5589wB0(byte[] bArr) throws GeneralSecurityException {
        if (!UB0.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f34493a = a(bArr, 1);
        this.f34494b = a(bArr, 0);
    }

    abstract AbstractC5337uB0 a(byte[] bArr, int i10);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.f34494b.d(bArr, 0).get(bArr4);
            int length = bArr2.length;
            int i10 = length & 15;
            int i11 = i10 == 0 ? length : (length + 16) - i10;
            int iRemaining = byteBuffer.remaining();
            int i12 = iRemaining % 16;
            int i13 = (i12 == 0 ? iRemaining : (iRemaining + 16) - i12) + i11;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i13 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i11);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i13);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(AB0.a(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            return this.f34493a.c(bArr, byteBuffer);
        } catch (GeneralSecurityException e10) {
            throw new AEADBadTagException(e10.toString());
        }
    }
}
