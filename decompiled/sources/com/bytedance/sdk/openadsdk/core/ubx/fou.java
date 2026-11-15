package com.bytedance.sdk.openadsdk.core.ubx;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.ubx;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static String kq(String str) {
        return TextUtils.isEmpty(str) ? str : kq(ubx.bob().mq(), str);
    }

    public static String kq(String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.startsWith("http://") || str2.startsWith("https://")) {
            return str2;
        }
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            return str + "/static/" + str2;
        }
        return str + "static/" + str2;
    }
}
