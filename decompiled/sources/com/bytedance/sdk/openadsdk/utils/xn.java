package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class xn {
    private static String kq;

    public static boolean bob() {
        return false;
    }

    public static boolean kq() {
        return com.bytedance.sdk.component.utils.nze.fou() && com.bytedance.sdk.openadsdk.core.dgq.oq().sns() && com.bytedance.sdk.openadsdk.core.dgq.oq().gm();
    }

    public static String oq() {
        if (TextUtils.isEmpty(kq)) {
            kq = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return kq;
    }

    public static String kq(String str) {
        try {
            if (!kq()) {
                return str;
            }
            String strFax = com.bytedance.sdk.openadsdk.core.dgq.oq().fax();
            if (TextUtils.isEmpty(strFax)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strFax)));
            return Uri.parse(str).buildUpon().appendQueryParameter(oq(), strFax).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
