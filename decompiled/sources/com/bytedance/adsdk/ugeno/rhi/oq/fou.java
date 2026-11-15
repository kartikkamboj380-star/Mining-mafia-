package com.bytedance.adsdk.ugeno.rhi.oq;

import android.text.TextUtils;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class fou implements com.bytedance.adsdk.ugeno.syt.bob.csi {
    private String kq;

    public void kq(String str) {
        this.kq = str;
    }

    @Override // com.bytedance.adsdk.ugeno.syt.bob.csi
    public void kq(View view, float f10) {
        float height = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f10));
            view.setTranslationY(view.getHeight() * f10);
        }
        if (TextUtils.equals(this.kq, "cube")) {
            if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height = view.getHeight();
            }
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f10 * (-90.0f));
        }
    }
}
