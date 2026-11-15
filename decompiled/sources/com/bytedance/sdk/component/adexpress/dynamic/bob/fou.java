package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.jhe;

/* JADX INFO: loaded from: classes.dex */
public class fou extends sns<com.bytedance.sdk.component.adexpress.rhi.rjo> {
    public fou(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        super(context, csiVar, rjoVar);
        kq(rjoVar);
    }

    private void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.rjo(this.oq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, rjoVar.rz());
        this.kq.setLayoutParams(layoutParams);
        this.kq.setSlideText(this.fou.jq());
        jhe jheVar = this.kq;
        if (jheVar instanceof com.bytedance.sdk.component.adexpress.rhi.rjo) {
            ((com.bytedance.sdk.component.adexpress.rhi.rjo) jheVar).setButtonText(this.fou.nn());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.sns
    protected void fou() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.sns, com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        this.kq.oq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.sns, com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        this.kq.kq();
    }
}
