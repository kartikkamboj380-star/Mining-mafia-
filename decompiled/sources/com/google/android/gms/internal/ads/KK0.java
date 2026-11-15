package com.google.android.gms.internal.ads;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class KK0 {
    public static BigDecimal a(String str) {
        c(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(String.valueOf(str)));
    }

    public static BigInteger b(String str) {
        c(str);
        return new BigInteger(str);
    }

    private static void c(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String strSubstring = str.substring(0, 30);
        StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 28);
        sb.append("Number string too large: ");
        sb.append(strSubstring);
        sb.append("...");
        throw new NumberFormatException(sb.toString());
    }
}
