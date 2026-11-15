package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class kq implements rjo {
    private com.bytedance.sdk.component.adexpress.rhi.oq kq;

    public kq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        double dUaj = rjoVar.uaj();
        dUaj = dUaj == 0.0d ? 1.0d : dUaj;
        double dHlh = rjoVar.hlh();
        double d10 = dHlh != 0.0d ? dHlh : 1.0d;
        int dynamicWidth = (int) (((double) csiVar.getDynamicWidth()) * 0.32d * dUaj);
        int dynamicWidth2 = (int) (((double) csiVar.getDynamicWidth()) * 0.32d * d10);
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.oq(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, rjoVar.xk() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, rjoVar.ui() - 3);
        this.kq.setLayoutParams(layoutParams);
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
