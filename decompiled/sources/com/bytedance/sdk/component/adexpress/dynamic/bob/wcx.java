package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class wcx implements rjo<com.bytedance.sdk.component.adexpress.rhi.ubx> {
    private final com.bytedance.sdk.component.adexpress.rhi.ubx kq;

    public wcx(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        com.bytedance.sdk.component.adexpress.rhi.ubx ubxVar = new com.bytedance.sdk.component.adexpress.rhi.ubx(context);
        this.kq = ubxVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, rjoVar.rz() > 0 ? rjoVar.rz() : com.bytedance.sdk.component.adexpress.fou.oq() ? 0 : 120);
        ubxVar.setLayoutParams(layoutParams);
        ubxVar.setClipChildren(false);
        ubxVar.setText(rjoVar.jq());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.rhi.ubx bob() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        com.bytedance.sdk.component.adexpress.rhi.ubx ubxVar = this.kq;
        if (ubxVar != null) {
            ubxVar.kq();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        com.bytedance.sdk.component.adexpress.rhi.ubx ubxVar = this.kq;
        if (ubxVar != null) {
            ubxVar.oq();
        }
    }
}
