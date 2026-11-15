package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class nb {
    public static boolean kq() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            return i10 >= 32 && kq("T", Build.VERSION.CODENAME);
        }
        return true;
    }

    public static boolean kq(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }
}
