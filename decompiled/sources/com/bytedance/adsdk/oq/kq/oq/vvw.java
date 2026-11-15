package com.bytedance.adsdk.oq.kq.oq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vvw extends rjo<com.bytedance.adsdk.oq.rjo.bob> {
    private final com.bytedance.adsdk.oq.rjo.bob fou;

    public vvw(List<com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.rjo.bob>> list) {
        super(list);
        this.fou = new com.bytedance.adsdk.oq.rjo.bob();
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oq.rjo.bob kq(com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.rjo.bob> kqVar, float f10) {
        com.bytedance.adsdk.oq.rjo.bob bobVar;
        com.bytedance.adsdk.oq.rjo.bob bobVar2 = kqVar.kq;
        if (bobVar2 == null || (bobVar = kqVar.oq) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.oq.rjo.bob bobVar3 = bobVar2;
        com.bytedance.adsdk.oq.rjo.bob bobVar4 = bobVar;
        if (this.bob == null) {
            this.fou.kq(com.bytedance.adsdk.oq.rhi.csi.kq(bobVar3.kq(), bobVar4.kq(), f10), com.bytedance.adsdk.oq.rhi.csi.kq(bobVar3.oq(), bobVar4.oq(), f10));
            return this.fou;
        }
        kqVar.rjo.getClass();
        fou();
        syt();
        throw null;
    }
}
