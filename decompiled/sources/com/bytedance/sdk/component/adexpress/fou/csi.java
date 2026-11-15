package com.bytedance.sdk.component.adexpress.fou;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    public static boolean kq(String str) {
        if (com.bytedance.sdk.component.adexpress.fou.oq()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
