package com.google.android.gms.internal.ads;

import android.util.Base64;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1760Gb {
    public static String a(byte[] bArr, boolean z9) {
        return Base64.encodeToString(bArr, true != z9 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z9) {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
