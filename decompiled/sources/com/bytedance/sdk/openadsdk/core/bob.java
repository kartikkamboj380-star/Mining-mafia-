package com.bytedance.sdk.openadsdk.core;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private static volatile bob kq;

    private bob() {
    }

    public static bob kq() {
        if (kq == null) {
            synchronized (bob.class) {
                try {
                    if (kq == null) {
                        kq = new bob();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }

    public String oq(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.fou.fou.oq("ttopenadsdk", str, str2);
    }

    public int oq(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", str, i10);
    }

    public Long oq(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", str, j10));
    }

    public void kq(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", str, str2);
    }

    public void kq(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void kq(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.fou.fou.kq("ttopenadsdk", str, Long.valueOf(j10));
    }
}
