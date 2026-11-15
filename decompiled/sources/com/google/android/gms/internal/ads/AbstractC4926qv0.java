package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4926qv0 {
    static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            b(objArr[i11], i11);
        }
        return objArr;
    }

    static Object b(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 9);
        sb.append("at index ");
        sb.append(i10);
        throw new NullPointerException(sb.toString());
    }
}
