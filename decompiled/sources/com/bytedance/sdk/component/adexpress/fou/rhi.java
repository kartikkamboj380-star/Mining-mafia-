package com.bytedance.sdk.component.adexpress.fou;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    public static boolean kq(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }

    public static boolean oq(String str) {
        return com.bytedance.sdk.component.adexpress.fou.oq() && kq(str);
    }
}
