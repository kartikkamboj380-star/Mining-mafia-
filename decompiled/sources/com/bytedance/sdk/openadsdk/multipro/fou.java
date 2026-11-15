package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.sns;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static String kq = "com.bytedance.openadsdk";
    public static String oq = "content://" + kq + ".TTMultiProvider";

    static {
        kq();
    }

    public static void kq() {
        if (sns.kq() != null) {
            kq = sns.kq().getPackageName();
            oq = "content://" + kq + ".TTMultiProvider";
        }
    }
}
