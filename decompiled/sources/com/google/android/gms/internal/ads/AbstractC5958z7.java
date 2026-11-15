package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5958z7 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long b(P10 p10, int i10, int i11) {
        p10.G(i10);
        if (p10.C() < 5) {
            return -9223372036854775807L;
        }
        int iB = p10.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i11 || (iB & 32) == 0 || p10.R() < 7 || p10.C() < 7 || (p10.R() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        p10.L(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }
}
