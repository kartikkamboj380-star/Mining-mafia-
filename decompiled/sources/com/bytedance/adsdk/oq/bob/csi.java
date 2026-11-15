package com.bytedance.adsdk.oq.bob;

import com.bytedance.adsdk.oq.suf;

/* JADX INFO: loaded from: classes.dex */
public class csi {
    private static final csi kq = new csi();
    private final suf<String, com.bytedance.adsdk.oq.rjo> oq = new suf<>(20);

    csi() {
    }

    public static csi kq() {
        return kq;
    }

    public com.bytedance.adsdk.oq.rjo kq(String str) {
        if (str == null) {
            return null;
        }
        return this.oq.kq(str);
    }

    public void kq(String str, com.bytedance.adsdk.oq.rjo rjoVar) {
        if (str == null) {
            return;
        }
        this.oq.kq(str, rjoVar);
    }
}
