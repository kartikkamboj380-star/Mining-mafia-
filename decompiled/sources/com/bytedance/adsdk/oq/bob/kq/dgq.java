package com.bytedance.adsdk.oq.bob.kq;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dgq implements wki<PointF, PointF> {
    private final oq kq;
    private final oq oq;

    public dgq(oq oqVar, oq oqVar2) {
        this.kq = oqVar;
        this.oq = oqVar2;
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public List<com.bytedance.adsdk.oq.rjo.kq<PointF>> bob() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public com.bytedance.adsdk.oq.kq.oq.kq<PointF, PointF> kq() {
        return new com.bytedance.adsdk.oq.kq.oq.suf(this.kq.kq(), this.oq.kq());
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public boolean oq() {
        return this.kq.oq() && this.oq.oq();
    }
}
