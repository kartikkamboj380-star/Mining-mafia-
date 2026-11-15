package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends bob {
    public rjo(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iKq = com.bytedance.adsdk.ugeno.rjo.bob.kq(String.valueOf(objArr[0]), 0);
            Map<String, String> map = this.csi;
            if (map == null || map.isEmpty() || iKq == com.bytedance.adsdk.ugeno.rjo.bob.kq(this.csi.get(HandleInvocationsFromAdViewer.KEY_AD_TYPE), 0)) {
                this.kq.kq(this.oq, this.rhi, this.bob.oq());
            }
        }
        return false;
    }
}
