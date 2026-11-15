package com.bytedance.adsdk.oq.kq.oq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou extends rjo<Float> {
    public fou(List<com.bytedance.adsdk.oq.rjo.kq<Float>> list) {
        super(list);
    }

    float bob(com.bytedance.adsdk.oq.rjo.kq<Float> kqVar, float f10) {
        if (kqVar.kq == null || kqVar.oq == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.bob == null) {
            return com.bytedance.adsdk.oq.rhi.csi.kq(kqVar.rhi(), kqVar.rjo(), f10);
        }
        kqVar.rjo.getClass();
        fou();
        syt();
        throw null;
    }

    public float dgq() {
        return bob(bob(), csi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public Float kq(com.bytedance.adsdk.oq.rjo.kq<Float> kqVar, float f10) {
        return Float.valueOf(bob(kqVar, f10));
    }
}
