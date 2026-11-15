package com.bytedance.sdk.component.adexpress.dynamic.bob;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.rhi.fax;
import com.bytedance.sdk.component.adexpress.rhi.jhe;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends sns<com.bytedance.sdk.component.adexpress.rhi.rhi> {
    public rhi(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi csiVar, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, csiVar, rjoVar);
        this.oq = context;
        this.fou = rjoVar;
        this.bob = csiVar;
        kq(i10, i11, i12, jSONObject, rjoVar);
    }

    private void kq(int i10, int i11, int i12, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.fou.rjo rjoVar) {
        int iRz;
        this.kq = new com.bytedance.sdk.component.adexpress.rhi.rhi(this.oq, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.oq, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.oq;
        if (rjoVar.rz() > 0) {
            iRz = rjoVar.rz();
        } else {
            iRz = com.bytedance.sdk.component.adexpress.fou.oq() ? 0 : 120;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, iRz);
        this.kq.setLayoutParams(layoutParams);
        this.kq.setClipChildren(false);
        this.kq.setSlideText(this.fou.jq());
        jhe jheVar = this.kq;
        if (jheVar instanceof com.bytedance.sdk.component.adexpress.rhi.rhi) {
            ((com.bytedance.sdk.component.adexpress.rhi.rhi) jheVar).setShakeText(this.fou.xp());
            final fax shakeView = ((com.bytedance.sdk.component.adexpress.rhi.rhi) this.kq).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new com.bytedance.sdk.component.adexpress.rhi.gm.kq() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bob.rhi.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.bob.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bob.sns
    protected void fou() {
    }
}
