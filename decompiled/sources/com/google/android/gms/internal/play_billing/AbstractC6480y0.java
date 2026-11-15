package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6480y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f37346a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f37347b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f37348c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f37349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f37350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final V f37351f;

    static {
        byte[] bArr = new byte[0];
        f37349d = bArr;
        f37350e = ByteBuffer.wrap(bArr);
        int i10 = V.f37144a;
        T t10 = new T(bArr, 0, 0, false, null);
        try {
            t10.c(0);
            f37351f = t10;
        } catch (A0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f37347b);
    }
}
