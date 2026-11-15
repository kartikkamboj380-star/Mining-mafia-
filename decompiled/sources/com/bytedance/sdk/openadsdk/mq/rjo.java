package com.bytedance.sdk.openadsdk.mq;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private static kq kq;

    public interface kq {
    }

    public static void kq(kq kqVar) {
        kq = kqVar;
    }

    public static boolean kq() {
        return kq != null;
    }

    public static void kq(String str, String str2, Throwable th) {
        if (kq != null && th == null) {
            new Throwable();
        }
    }
}
