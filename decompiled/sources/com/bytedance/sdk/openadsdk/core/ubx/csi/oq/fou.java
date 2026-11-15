package com.bytedance.sdk.openadsdk.core.ubx.csi.oq;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fou.ubx;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class fou extends com.bytedance.adsdk.ugeno.fou.fou.bob {
    private boolean ubx;

    public fou(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        Map<String, String> map = this.csi;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.ubx = false;
        }
        if (this.csi.containsKey("percent")) {
            float fKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("percent"), -1.0f);
            if (fKq >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jLongValue >= (fKq / 100.0f) * jLongValue2 && !this.ubx) {
                this.ubx = true;
                ubx ubxVar = this.kq;
                if (ubxVar != null) {
                    ubxVar.kq(this.oq, this.rhi, this.bob.oq());
                }
            }
        } else if (jLongValue >= com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("interval"), -1) && !this.ubx) {
            this.ubx = true;
            ubx ubxVar2 = this.kq;
            if (ubxVar2 != null) {
                ubxVar2.kq(this.oq, this.rhi, this.bob.oq());
            }
        }
        return true;
    }
}
