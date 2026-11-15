package com.bytedance.adsdk.ugeno.rhi.oq;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq implements com.bytedance.adsdk.ugeno.syt.bob.csi {
    @Override // com.bytedance.adsdk.ugeno.syt.bob.csi
    public void kq(View view, float f10) {
        int width = view.getWidth();
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setTranslationX((-width) * f10);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f10);
        }
        view.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - Math.abs(f10)));
    }
}
