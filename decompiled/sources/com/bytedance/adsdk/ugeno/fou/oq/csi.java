package com.bytedance.adsdk.ugeno.fou.oq;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fou.rhi;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class csi extends kq {
    public csi(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
        super(bobVar, str, kqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.oq.kq
    public void kq() {
        Map<String, String> map = this.rhi;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.rhi.get("id");
        if (TextUtils.isEmpty(str)) {
            kq(this.bob);
            return;
        }
        com.bytedance.adsdk.ugeno.oq.bob bobVar = this.bob;
        com.bytedance.adsdk.ugeno.oq.bob bobVarOq = bobVar.oq(bobVar);
        if (bobVarOq == null) {
            return;
        }
        kq(bobVarOq.csi(str));
    }

    private void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        if (bobVar == null) {
            return;
        }
        for (String str : this.rhi.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                bobVar.kq(str, this.rhi.get(str));
            }
        }
        bobVar.kq(this.rhi.containsKey("width"), this.rhi.containsKey("height"));
        bobVar.oq();
    }
}
