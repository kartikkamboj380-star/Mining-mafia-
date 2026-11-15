package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6268m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f36751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f36752b;

    static {
        Charset.forName("US-ASCII");
        f36751a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f36752b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = M4.f36410a;
        try {
            new L4(bArr, 0, 0, false, null).c(0);
        } catch (C6286o5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z9) {
        return z9 ? 1231 : 1237;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static boolean d(F5 f10) {
        return false;
    }
}
