package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nze implements rjo<com.bytedance.sdk.component.adexpress.rhi.gm> {
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi bob;
    private String csi;
    private JSONObject dgq;
    private com.bytedance.sdk.component.adexpress.dynamic.fou.rjo fou;
    private com.bytedance.sdk.component.adexpress.rhi.gm kq;
    private Context oq;
    private int rhi;
    private int rjo;
    private int syt;

    public nze(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.oq = context;
        this.bob = csiVar;
        this.fou = rjoVar;
        this.csi = str;
        this.rhi = i10;
        this.rjo = i11;
        this.syt = i12;
        this.dgq = jSONObject;
        csi();
    }

    private void csi() {
        final com.bytedance.sdk.component.adexpress.dynamic.rhi.kq dynamicClickListener = this.bob.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.csi)) {
            Context context = this.oq;
            com.bytedance.sdk.component.adexpress.rhi.gm gmVar = new com.bytedance.sdk.component.adexpress.rhi.gm(context, com.bytedance.sdk.component.adexpress.bob.kq.syt(context), this.rhi, this.rjo, this.syt, this.dgq);
            this.kq = gmVar;
            if (gmVar.getShakeLayout() != null) {
                this.kq.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.oq;
            this.kq = new com.bytedance.sdk.component.adexpress.rhi.gm(context2, com.bytedance.sdk.component.adexpress.bob.kq.rjo(context2), this.rhi, this.rjo, this.syt, this.dgq);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.kq.setGravity(17);
        layoutParams.gravity = 17;
        this.kq.setLayoutParams(layoutParams);
        this.kq.setTranslationY(com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, this.fou.qdf()));
        this.kq.setShakeText(this.fou.jq());
        this.kq.setClipChildren(false);
        this.kq.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.rhi.gm.kq() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.nze.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.rhi.gm bob() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void kq() {
        this.kq.kq();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.rjo
    public void oq() {
        this.kq.clearAnimation();
    }
}
