package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private static final byte[] kq = kq("VP8X");

    private static byte[] kq(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean kq(byte[] bArr, int i10) {
        try {
            boolean zKq = kq(bArr, i10 + 12, kq);
            int i11 = i10 + 20;
            if (bArr.length <= i11) {
                return false;
            }
            boolean z9 = (bArr[i11] & 2) == 2;
            if (zKq && z9) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean kq(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
