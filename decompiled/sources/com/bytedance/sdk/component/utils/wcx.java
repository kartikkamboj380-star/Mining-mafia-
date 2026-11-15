package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class wcx {
    public static int bob(Context context) {
        return ibd.kq(context, 60000L);
    }

    public static boolean csi(Context context) {
        return bob(context) == 5;
    }

    public static boolean fou(Context context) {
        return bob(context) == 4;
    }

    public static boolean kq(Context context) {
        return bob(context) != 0;
    }

    public static int oq(Context context) {
        int iBob = bob(context);
        if (iBob == 1) {
            return 0;
        }
        if (iBob == 4) {
            return 1;
        }
        if (iBob == 5) {
            return 4;
        }
        if (iBob != 6) {
            return iBob;
        }
        return 6;
    }

    public static boolean rhi(Context context) {
        return bob(context) == 6;
    }

    public static String rjo(Context context) {
        int iBob = bob(context);
        if (iBob == 2) {
            return "2g";
        }
        if (iBob == 3) {
            return "3g";
        }
        if (iBob == 4) {
            return "wifi";
        }
        if (iBob != 5) {
            return iBob != 6 ? "mobile" : "5g";
        }
        return "4g";
    }

    public static boolean syt(Context context) {
        if (context == null) {
            return false;
        }
        int iBob = bob(context);
        return iBob == 2 || iBob == 3 || iBob == 4 || iBob == 5 || iBob == 6;
    }

    public static boolean kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}
