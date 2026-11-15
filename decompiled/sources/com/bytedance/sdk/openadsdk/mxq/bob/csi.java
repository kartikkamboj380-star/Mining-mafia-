package com.bytedance.sdk.openadsdk.mxq.bob;

/* JADX INFO: loaded from: classes.dex */
class csi implements bob {
    private static volatile csi kq;

    private csi() {
    }

    @Override // com.bytedance.sdk.openadsdk.mxq.bob.bob
    public void kq(com.bytedance.sdk.openadsdk.mxq.oq oqVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.mxq.bob.bob
    public void kq(com.bytedance.sdk.openadsdk.mxq.oq oqVar, boolean z9) {
    }

    public static csi kq() {
        if (kq == null) {
            synchronized (csi.class) {
                try {
                    if (kq == null) {
                        kq = new csi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
    }
}
