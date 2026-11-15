package com.google.android.gms.internal.common;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6152j {
    static Object[] a(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 9);
                sb.append("at index ");
                sb.append(i11);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
