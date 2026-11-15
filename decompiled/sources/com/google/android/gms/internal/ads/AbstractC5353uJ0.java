package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5353uJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f33778a = Charset.forName("UTF-8");

    public static byte[] a(String str, int i10) {
        byte[] bytes = str.getBytes(f33778a);
        int length = bytes.length;
        C5227tJ0 c5227tJ0 = new C5227tJ0(2, new byte[(length * 3) / 4]);
        if (!c5227tJ0.a(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i11 = c5227tJ0.f33135b;
        byte[] bArr = c5227tJ0.f33134a;
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }
}
