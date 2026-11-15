package com.bytedance.sdk.openadsdk.core.ubx.oq.fou;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.fou.ubx;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends com.bytedance.adsdk.ugeno.fou.fou.bob {
    private float ubx;

    public oq(Context context) {
        super(context);
        this.ubx = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.rjo.bob.kq(String.valueOf(objArr[1]), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ubx ubxVar = this.kq;
                if (ubxVar != null) {
                    ubxVar.kq(this.oq, this.rhi, this.bob.oq());
                }
                return true;
            }
            this.ubx = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("rate"), 100);
            float fKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fKq + " mTargetProgress=" + this.ubx);
            if (fKq >= this.ubx) {
                ubx ubxVar2 = this.kq;
                if (ubxVar2 != null) {
                    ubxVar2.kq(this.oq, this.rhi, this.bob.oq());
                }
                return true;
            }
        }
        return false;
    }
}
