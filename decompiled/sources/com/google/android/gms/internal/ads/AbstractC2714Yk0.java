package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2714Yk0 {
    public static String a(byte[] bArr, boolean z9) {
        return c(z9).h(bArr, 0, bArr.length);
    }

    public static byte[] b(String str, boolean z9) {
        byte[] bArrI = c(z9).i(str);
        if (bArrI.length != 0 || str.length() <= 0) {
            return bArrI;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static AbstractC2528Uv0 c(boolean z9) {
        return z9 ? AbstractC2528Uv0.k().f() : AbstractC2528Uv0.j();
    }
}
