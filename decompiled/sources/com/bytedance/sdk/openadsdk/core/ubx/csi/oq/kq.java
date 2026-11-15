package com.bytedance.sdk.openadsdk.core.ubx.csi.oq;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fou.ubx;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.adsdk.ugeno.fou.fou.bob {
    private boolean ubx;

    public kq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        Map<String, String> map = this.csi;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(obj.toString(), -1);
                if (this.csi.containsKey("remainingSeconds")) {
                    int iKq2 = com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get("remainingSeconds"), -1);
                    if (iKq >= 0 && iKq2 >= 0 && iKq == iKq2 && !this.ubx) {
                        this.ubx = true;
                        ubx ubxVar = this.kq;
                        if (ubxVar != null) {
                            ubxVar.kq(this.oq, this.rhi, this.bob.oq());
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
