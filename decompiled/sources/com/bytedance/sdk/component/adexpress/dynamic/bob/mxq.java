package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.mq;

/* JADX INFO: loaded from: classes.dex */
public class mxq implements rjo {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi bob;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.rjo fou;
    private mq kq;
    private Context oq;

    public mxq(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        this.oq = context;
        this.bob = csiVar;
        this.fou = rjoVar;
        fou();
    }

    private void fou() {
        this.kq = new mq(this.oq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, 120.0f));
        layoutParams.gravity = 17;
        this.kq.setLayoutParams(layoutParams);
        this.kq.setClipChildren(false);
        this.kq.setGuideText(this.fou.jq());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar = this.bob;
        if (csiVar != null) {
            this.kq.setOnClickListener((View.OnClickListener) csiVar.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public ViewGroup bob() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        mq mqVar = this.kq;
        if (mqVar != null) {
            mqVar.kq();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        mq mqVar = this.kq;
        if (mqVar != null) {
            mqVar.oq();
        }
    }
}
