package com.bytedance.adsdk.ugeno.fou.oq;

import com.bytedance.adsdk.ugeno.fou.rhi;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class oq extends kq {
    private List<com.bytedance.adsdk.ugeno.fou.kq.fou> dgq;

    public oq(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
        super(bobVar, str, kqVar);
        this.dgq = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.fou.oq.kq
    public void kq() {
        com.bytedance.adsdk.ugeno.fou.kq.bob bobVarKq;
        Map<String, String> map = this.rhi;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.rhi.get(MediationMetaData.KEY_NAME);
        com.bytedance.adsdk.ugeno.fou.kq.kq kqVarWee = this.bob.wee();
        if (kqVarWee == null || (bobVarKq = kqVarWee.kq(str)) == null) {
            return;
        }
        bobVarKq.kq(str);
    }
}
