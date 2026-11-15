package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class vvw implements rjo {
    private com.bytedance.sdk.component.adexpress.rhi.suf kq;

    public vvw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.suf(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, 180.0f));
        layoutParams.gravity = 17;
        this.kq.setLayoutParams(layoutParams);
        this.kq.setGuideText(rjoVar.jq());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public ViewGroup bob() {
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
