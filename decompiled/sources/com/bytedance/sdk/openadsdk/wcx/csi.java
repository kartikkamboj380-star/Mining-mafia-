package com.bytedance.sdk.openadsdk.wcx;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dgq;
import com.bytedance.sdk.openadsdk.core.suf;

/* JADX INFO: loaded from: classes.dex */
class csi implements fou {
    private int bob;
    private int fou;
    private fou kq;
    private int oq;

    public csi(fou fouVar, int i10, int i11, int i12) {
        this.kq = fouVar;
        this.oq = i10;
        this.bob = i11;
        this.fou = i12;
    }

    @Override // com.bytedance.sdk.openadsdk.wcx.fou
    public com.bytedance.sdk.openadsdk.wcx.oq.kq kq() {
        com.bytedance.sdk.openadsdk.wcx.oq.kq kqVarKq = this.kq.kq();
        kqVarKq.kq(BuildConfig.VERSION_NAME);
        kqVarKq.kq(this.oq);
        kqVarKq.oq(this.bob);
        kqVarKq.bob(this.fou);
        kqVarKq.rhi(dgq.oq().rjo());
        kqVarKq.fou(suf.fou());
        return kqVarKq;
    }
}
