package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends rjo<PointF> {
    private final PointF fou;

    public ubx(List<com.bytedance.adsdk.oq.rjo.kq<PointF>> list) {
        super(list);
        this.fou = new PointF();
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public PointF kq(com.bytedance.adsdk.oq.rjo.kq<PointF> kqVar, float f10) {
        return kq(kqVar, f10, f10, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public PointF kq(com.bytedance.adsdk.oq.rjo.kq<PointF> kqVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = kqVar.kq;
        if (pointF2 == null || (pointF = kqVar.oq) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.bob != null) {
            kqVar.rjo.getClass();
            fou();
            syt();
            throw null;
        }
        PointF pointF5 = this.fou;
        float f13 = pointF3.x;
        float f14 = f13 + (f11 * (pointF4.x - f13));
        float f15 = pointF3.y;
        pointF5.set(f14, f15 + (f12 * (pointF4.y - f15)));
        return this.fou;
    }
}
