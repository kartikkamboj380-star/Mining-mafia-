package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class vvw {
    public static void kq(String str) {
        kq("any_door_id", str);
    }

    private static String oq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.fou.fou.oq(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String kq() {
        return oq("any_door_id", null);
    }

    private static void kq(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.fou.fou.kq((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
