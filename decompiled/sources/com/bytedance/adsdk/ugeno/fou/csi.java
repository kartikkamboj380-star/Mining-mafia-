package com.bytedance.adsdk.ugeno.fou;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi implements bob {
    @Override // com.bytedance.adsdk.ugeno.fou.bob
    public List<oq> kq() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oq("update") { // from class: com.bytedance.adsdk.ugeno.fou.csi.1
            @Override // com.bytedance.adsdk.ugeno.fou.oq
            public com.bytedance.adsdk.ugeno.fou.oq.kq kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
                return new com.bytedance.adsdk.ugeno.fou.oq.csi(bobVar, str, kqVar);
            }
        });
        arrayList.add(new oq("emit") { // from class: com.bytedance.adsdk.ugeno.fou.csi.2
            @Override // com.bytedance.adsdk.ugeno.fou.oq
            public com.bytedance.adsdk.ugeno.fou.oq.kq kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
                return new com.bytedance.adsdk.ugeno.fou.oq.oq(bobVar, str, kqVar);
            }
        });
        arrayList.add(new oq("startAnimate") { // from class: com.bytedance.adsdk.ugeno.fou.csi.3
            @Override // com.bytedance.adsdk.ugeno.fou.oq
            public com.bytedance.adsdk.ugeno.fou.oq.kq kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, String str, rhi.kq kqVar) {
                return new com.bytedance.adsdk.ugeno.fou.oq.fou(bobVar, str, kqVar);
            }
        });
        return arrayList;
    }
}
