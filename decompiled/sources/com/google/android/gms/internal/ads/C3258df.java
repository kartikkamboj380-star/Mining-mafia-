package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3258df extends AbstractC2701Ye {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f27484c;

    @Override // com.google.android.gms.internal.ads.AbstractC2701Ye
    public final byte[] a(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iA = AbstractC3132cf.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iA2 = AbstractC3132cf.a(strArrSplit[i11]);
                    int i12 = (iA2 >> 16) ^ ((char) iA2);
                    byte b10 = (byte) i12;
                    byte b11 = (byte) (i12 >> 8);
                    int i13 = i11 + i11;
                    bArr[i13] = new byte[]{b10, b11}[0];
                    bArr[i13 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iA3 = AbstractC3132cf.a(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f27484c = b();
        synchronized (this.f25656a) {
            try {
                MessageDigest messageDigest = this.f27484c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f27484c.update(bArrArray);
                byte[] bArrDigest = this.f27484c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i10 = length2;
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i10);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
