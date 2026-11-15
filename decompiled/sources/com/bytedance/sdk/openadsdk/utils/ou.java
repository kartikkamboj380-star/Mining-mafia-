package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class ou {
    public static String kq(Context context) {
        int iKq = com.bytedance.sdk.component.utils.ibd.kq(context, 0L);
        if (iKq == 2) {
            return "2g";
        }
        if (iKq == 3) {
            return "3g";
        }
        if (iKq == 4) {
            return "wifi";
        }
        if (iKq != 5) {
            return iKq != 6 ? "mobile" : "5g";
        }
        return "4g";
    }
}
