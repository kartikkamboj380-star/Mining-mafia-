package com.bytedance.adsdk.oq.kq.oq;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq extends rjo<Integer> {
    public oq(List<com.bytedance.adsdk.oq.rjo.kq<Integer>> list) {
        super(list);
    }

    public int bob(com.bytedance.adsdk.oq.rjo.kq<Integer> kqVar, float f10) {
        if (kqVar.kq == null || kqVar.oq == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.bob == null) {
            return com.bytedance.adsdk.oq.rhi.oq.kq(com.bytedance.adsdk.oq.rhi.csi.oq(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), kqVar.kq.intValue(), kqVar.oq.intValue());
        }
        kqVar.rjo.getClass();
        fou();
        syt();
        throw null;
    }

    public int dgq() {
        return bob(bob(), csi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public Integer kq(com.bytedance.adsdk.oq.rjo.kq<Integer> kqVar, float f10) {
        return Integer.valueOf(bob(kqVar, f10));
    }
}
