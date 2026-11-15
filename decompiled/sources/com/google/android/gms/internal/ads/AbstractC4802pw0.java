package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4802pw0 {
    static long a(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j10);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    static void b(boolean z9) {
        if (!z9) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
