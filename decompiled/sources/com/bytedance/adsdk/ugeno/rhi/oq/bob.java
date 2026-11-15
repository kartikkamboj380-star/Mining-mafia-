package com.bytedance.adsdk.ugeno.rhi.oq;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class bob implements com.bytedance.adsdk.ugeno.syt.bob.csi {
    final float kq = 0.8f;
    final float oq = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.syt.bob.csi
    public void kq(View view, float f10) {
        float f11 = ((f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
