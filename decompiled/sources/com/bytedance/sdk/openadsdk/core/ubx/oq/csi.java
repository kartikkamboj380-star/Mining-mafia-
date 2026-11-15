package com.bytedance.sdk.openadsdk.core.ubx.oq;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: loaded from: classes.dex */
public class csi extends com.bytedance.adsdk.ugeno.oq.bob<FrameLayout> {
    public csi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public FrameLayout kq() {
        FrameLayout frameLayout = new FrameLayout(this.oq);
        com.bytedance.sdk.openadsdk.core.model.oq oqVar = new com.bytedance.sdk.openadsdk.core.model.oq();
        oqVar.kq(true);
        PAGLogoView pAGLogoView = new PAGLogoView(this.oq);
        pAGLogoView.initData(oqVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        super.oq();
    }
}
