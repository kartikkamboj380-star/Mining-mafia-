package com.bytedance.sdk.openadsdk.core.ubx.oq.bob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class oq extends com.bytedance.adsdk.ugeno.oq.kq<com.bytedance.adsdk.ugeno.dgq.oq.kq> {
    public oq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.dgq.oq.kq kq() {
        kq kqVar = new kq(this.oq);
        kqVar.kq(this);
        return kqVar;
    }

    public com.bytedance.adsdk.ugeno.dgq.oq.kq fou() {
        return ((kq) this.csi).getPlayableView();
    }
}
