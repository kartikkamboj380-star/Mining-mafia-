package com.bytedance.adsdk.oq.bob.bob;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends kq {
    rhi(com.bytedance.adsdk.oq.dgq dgqVar, csi csiVar) {
        super(dgqVar, csiVar);
    }

    @Override // com.bytedance.adsdk.oq.bob.bob.kq, com.bytedance.adsdk.oq.kq.kq.csi
    public void kq(RectF rectF, Matrix matrix, boolean z9) {
        super.kq(rectF, matrix, z9);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.bytedance.adsdk.oq.bob.bob.kq
    public void oq(Canvas canvas, Matrix matrix, int i10) {
        super.oq(canvas, matrix, i10);
    }
}
