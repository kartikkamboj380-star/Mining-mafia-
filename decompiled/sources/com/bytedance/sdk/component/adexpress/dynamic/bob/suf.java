package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class suf implements rjo<com.bytedance.sdk.component.adexpress.rhi.mxq> {
    private com.bytedance.sdk.component.adexpress.rhi.mxq kq;

    public suf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.mxq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, 180.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, 20.0f);
        this.kq.setLayoutParams(layoutParams);
        this.kq.setGuideText(rjoVar.jq());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.rhi.mxq bob() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        this.kq.kq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        this.kq.oq();
    }
}
