package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.jhe;

/* JADX INFO: loaded from: classes.dex */
public class csi extends sns<com.bytedance.sdk.component.adexpress.rhi.rjo> {
    public csi(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        super(context, csiVar, rjoVar);
        kq(rjoVar);
    }

    private void kq(com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.syt(this.oq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.kq.setLayoutParams(layoutParams);
        jhe jheVar = this.kq;
        if (jheVar instanceof com.bytedance.sdk.component.adexpress.rhi.syt) {
            ((com.bytedance.sdk.component.adexpress.rhi.syt) jheVar).setButtonText(this.fou.jq());
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
