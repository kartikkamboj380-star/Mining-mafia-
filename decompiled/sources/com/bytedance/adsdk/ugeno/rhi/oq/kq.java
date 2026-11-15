package com.bytedance.adsdk.ugeno.rhi.oq;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq implements com.bytedance.adsdk.ugeno.syt.bob.csi {
    @Override // com.bytedance.adsdk.ugeno.syt.bob.csi
    public void kq(View view, float f10) {
        float width = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            width = view.getWidth();
        }
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f10 * 90.0f);
    }
}
