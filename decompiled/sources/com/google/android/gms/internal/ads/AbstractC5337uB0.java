package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC5337uB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f33746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33747b;

    public AbstractC5337uB0(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f33746a = AbstractC5085sB0.d(bArr);
        this.f33747b = i10;
    }

    abstract int[] a(int[] iArr, int i10);

    abstract int b();

    public final byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != b()) {
            int iB = b();
            StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 36);
            sb.append("The nonce length (in bytes) must be ");
            sb.append(iB);
            throw new GeneralSecurityException(sb.toString());
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining / 64;
        for (int i11 = 0; i11 < i10 + 1; i11++) {
            ByteBuffer byteBufferD = d(bArr, this.f33747b + i11);
            if (i11 == i10) {
                AbstractC5479vJ0.c(byteBufferAllocate, byteBuffer, byteBufferD, iRemaining % 64);
            } else {
                AbstractC5479vJ0.c(byteBufferAllocate, byteBuffer, byteBufferD, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    final ByteBuffer d(byte[] bArr, int i10) {
        int[] iArrA = a(AbstractC5085sB0.d(bArr), i10);
        int[] iArr = (int[]) iArrA.clone();
        AbstractC5085sB0.b(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrA[i11] = iArrA[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrA, 0, 16);
        return byteBufferOrder;
    }
}
