package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5087sC0 {
    public static boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i10 = i11;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            }
        }
        return true;
    }

    public static AbstractC4977rK0 b(String str) throws IOException {
        try {
            XK0 xk0 = new XK0(new StringReader(str));
            xk0.a(EnumC5607wK0.LEGACY_STRICT);
            return AbstractC4710pC0.c(xk0);
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static long c(Number number) {
        if (number instanceof C4836qC0) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
