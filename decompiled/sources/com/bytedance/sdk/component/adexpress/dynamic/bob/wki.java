package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class wki implements rjo {
    private com.bytedance.sdk.component.adexpress.rhi.nze kq;

    public wki(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.nze(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(csiVar.getDynamicHeight(), csiVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
        this.kq.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.rhi.nze bob() {
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
