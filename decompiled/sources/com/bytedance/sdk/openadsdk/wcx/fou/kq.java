package com.bytedance.sdk.openadsdk.wcx.fou;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public static long kq() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis - (jCurrentTimeMillis % 86400000);
    }

    public static boolean kq(long j10) {
        return j10 - (j10 % 86400000) == kq();
    }
}
