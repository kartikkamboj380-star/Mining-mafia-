package com.bytedance.adsdk.ugeno.fou.fou;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob implements com.bytedance.adsdk.ugeno.kq.oq {
    private String ubx;

    public oq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.fou.bob
    public boolean kq(Object... objArr) {
        com.bytedance.adsdk.ugeno.oq.bob bobVar;
        com.bytedance.adsdk.ugeno.oq.bob bobVarOq;
        com.bytedance.adsdk.ugeno.kq.kq kqVarWki;
        Map<String, String> map = this.csi;
        if (map != null && map.size() > 0) {
            String str = this.csi.get(MediationMetaData.KEY_NAME);
            this.ubx = this.csi.get("state");
            if (!TextUtils.isEmpty(str) && (bobVarOq = (bobVar = this.oq).oq(bobVar)) != null && (kqVarWki = bobVarOq.syt(str).wki(str)) != null) {
                kqVarWki.kq(this);
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq
    public void oq() {
        com.bytedance.adsdk.ugeno.fou.ubx ubxVar;
        if ((TextUtils.equals(this.ubx, "complete") || TextUtils.isEmpty(this.ubx)) && (ubxVar = this.kq) != null) {
            ubxVar.kq(this.oq, this.rhi, this.bob.oq());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kq.oq
    public void kq() {
        com.bytedance.adsdk.ugeno.fou.ubx ubxVar;
        if ((TextUtils.equals(this.ubx, "start") || TextUtils.isEmpty(this.ubx)) && (ubxVar = this.kq) != null) {
            ubxVar.kq(this.oq, this.rhi, this.bob.oq());
        }
    }
}
