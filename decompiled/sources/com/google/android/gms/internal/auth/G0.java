package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f35911a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f35912b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f35913c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f35914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f35915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC6128u0 f35916f;

    static {
        byte[] bArr = new byte[0];
        f35914d = bArr;
        f35915e = ByteBuffer.wrap(bArr);
        int i10 = AbstractC6128u0.f36155a;
        C6122s0 c6122s0 = new C6122s0(bArr, 0, 0, false, null);
        try {
            c6122s0.c(0);
            f35916f = c6122s0;
        } catch (H0 e10) {
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
        return new String(bArr, f35912b);
    }
}
