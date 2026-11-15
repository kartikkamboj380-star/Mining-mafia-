package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3346eM0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f27765a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f27766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f27767c;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f27766b = bArr;
        f27767c = ByteBuffer.wrap(bArr);
        AbstractC5609wL0.e(bArr, 0, 0, false);
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int b(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
