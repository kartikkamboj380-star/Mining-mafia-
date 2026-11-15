package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3809i2 {
    public static List a(byte[] bArr) {
        long jE = e(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(h(i(jE)));
        arrayList.add(h(i(3840L)));
        return arrayList;
    }

    public static int b(ByteBuffer byteBuffer) {
        int i10;
        if ((byteBuffer.get(5) & 2) == 0) {
            i10 = 0;
        } else {
            byte b10 = byteBuffer.get(26);
            int i11 = 28;
            int i12 = 28;
            for (int i13 = 0; i13 < b10; i13++) {
                i12 += byteBuffer.get(i13 + 27);
            }
            byte b11 = byteBuffer.get(i12 + 26);
            for (int i14 = 0; i14 < b11; i14++) {
                i11 += byteBuffer.get(i12 + 27 + i14);
            }
            i10 = i12 + i11;
        }
        int i15 = byteBuffer.get(i10 + 26) + 27 + i10;
        return (int) ((g(byteBuffer.get(i15), byteBuffer.limit() - i15 > 1 ? byteBuffer.get(i15 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (int) ((g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long d(byte[] bArr) {
        return g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int e(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean f(long j10, long j11) {
        return j10 - j11 <= i(3840L) / 1000;
    }

    private static long g(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL << i15;
        } else if (i14 >= 12) {
            i11 = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    private static byte[] h(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    private static long i(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}
