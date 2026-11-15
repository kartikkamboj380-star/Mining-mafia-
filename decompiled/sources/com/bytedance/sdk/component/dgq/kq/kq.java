package com.bytedance.sdk.component.dgq.kq;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private static volatile kq oq;
    private volatile oq kq;

    private kq() {
    }

    public static kq kq() {
        if (oq == null) {
            synchronized (kq.class) {
                try {
                    if (oq == null) {
                        oq = new kq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    public oq oq() {
        return this.kq;
    }

    public void kq(oq oqVar) {
        this.kq = oqVar;
    }
}
