package com.bytedance.sdk.openadsdk.core.ubx.rhi;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.fou.ubx;
import com.bytedance.adsdk.ugeno.fou.wki;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class bob implements wki {
    @Override // com.bytedance.adsdk.ugeno.fou.wki
    public boolean kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent, ubx ubxVar, com.bytedance.adsdk.ugeno.fou.fou.bob bobVar2) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            if (kq(bobVar.ubx(), motionEvent.getX(), motionEvent.getY()) && ubxVar != null) {
                ubxVar.kq(bobVar, bobVar2.fou(), bobVar2.rhi().oq());
            }
        }
        return true;
    }

    private boolean kq(View view, float f10, float f11) {
        return f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < ((float) view.getWidth()) && f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 < ((float) view.getHeight());
    }
}
