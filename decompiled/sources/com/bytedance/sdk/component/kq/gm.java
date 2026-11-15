package com.bytedance.sdk.component.kq;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
class gm {
    private static boolean kq;

    static String kq(Throwable th) {
        StringBuilder sb = new StringBuilder("{\"code\":");
        sb.append(th instanceof mxq ? ((mxq) th).kq : 0);
        sb.append("}");
        return sb.toString();
    }

    static String kq(String str, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!kq || z9) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + "," + strSubstring + "}";
    }

    static String kq() {
        return "";
    }

    static void kq(boolean z9) {
        kq = z9;
    }
}
