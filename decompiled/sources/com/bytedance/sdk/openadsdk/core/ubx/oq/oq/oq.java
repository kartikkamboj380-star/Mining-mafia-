package com.bytedance.sdk.openadsdk.core.ubx.oq.oq;

import android.content.Context;
import com.bytedance.adsdk.oq.rhi;
import com.bytedance.adsdk.ugeno.fou;

/* JADX INFO: loaded from: classes.dex */
public class oq extends rhi {
    private fou kq;

    public oq(Context context) {
        super(context);
    }

    public void kq(fou fouVar) {
        this.kq = fouVar;
    }

    @Override // com.bytedance.adsdk.oq.rhi, android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // com.bytedance.adsdk.oq.rhi, android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.syt();
        }
    }
}
