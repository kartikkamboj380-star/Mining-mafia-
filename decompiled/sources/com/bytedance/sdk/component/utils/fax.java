package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class fax {
    private static boolean kq = false;
    private static String oq = "";

    public static void bob(String str, String str2) {
        if (kq && str2 != null) {
            Log.e(oq(str), str2);
        }
    }

    public static void kq() {
        kq = true;
    }

    public static void oq() {
        kq = false;
    }

    public static void kq(String str, String str2) {
        if (kq && str2 != null) {
            Log.d(oq(str), str2);
        }
    }

    public static void oq(String str, String str2) {
        if (kq && str2 != null) {
            Log.i(oq(str), str2);
        }
    }

    public static void bob(String str, Object... objArr) {
        if (kq && objArr != null) {
            Log.e(oq(str), kq(objArr));
        }
    }

    public static void kq(String str, Object... objArr) {
        if (kq && objArr != null) {
            Log.d(oq(str), kq(objArr));
        }
    }

    public static void oq(String str, Object... objArr) {
        if (kq && objArr != null) {
            Log.i(oq(str), kq(objArr));
        }
    }

    public static void kq(String str, String str2, Throwable th) {
        if (kq) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(oq(str), str2, th);
        }
    }

    private static String oq(String str) {
        if (TextUtils.isEmpty(oq)) {
            return str;
        }
        return kq("[" + oq + "]-[" + str + "]");
    }

    public static void kq(String str) {
        oq = str;
    }

    private static String kq(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb.append(obj.toString());
                } else {
                    sb.append(" null ");
                }
                sb.append(" ");
            }
            return sb.toString();
        }
        return "";
    }
}
