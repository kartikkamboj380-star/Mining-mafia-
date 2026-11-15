package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3635gf extends AbstractC2701Ye {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f28695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f28696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28697e;

    public C3635gf(int i10) {
        int i11 = i10 >> 3;
        this.f28696d = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.f28697e = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2701Ye
    public final byte[] a(String str) {
        synchronized (this.f25656a) {
            try {
                MessageDigest messageDigestB = b();
                this.f28695c = messageDigestB;
                if (messageDigestB == null) {
                    return new byte[0];
                }
                messageDigestB.reset();
                this.f28695c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f28695c.digest();
                int length = bArrDigest.length;
                int i10 = this.f28696d;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i11 = this.f28697e & 7;
                if (i11 > 0) {
                    long j10 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j10 <<= 8;
                        }
                        j10 += (long) (bArr[i12] & 255);
                    }
                    long j11 = j10 >>> (8 - i11);
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
