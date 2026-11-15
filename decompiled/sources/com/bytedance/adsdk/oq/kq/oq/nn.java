package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nn extends rjo<PointF> {
    private final float[] csi;
    private final PointF fou;
    private final PathMeasure rhi;
    private dgq rjo;

    public nn(List<? extends com.bytedance.adsdk.oq.rjo.kq<PointF>> list) {
        super(list);
        this.fou = new PointF();
        this.csi = new float[2];
        this.rhi = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public PointF kq(com.bytedance.adsdk.oq.rjo.kq<PointF> kqVar, float f10) {
        dgq dgqVar = (dgq) kqVar;
        Path pathOq = dgqVar.oq();
        if (pathOq == null) {
            return kqVar.kq;
        }
        if (this.bob != null) {
            dgqVar.rjo.getClass();
            fou();
            syt();
            throw null;
        }
        if (this.rjo != dgqVar) {
            this.rhi.setPath(pathOq, false);
            this.rjo = dgqVar;
        }
        PathMeasure pathMeasure = this.rhi;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.csi, null);
        PointF pointF = this.fou;
        float[] fArr = this.csi;
        pointF.set(fArr[0], fArr[1]);
        return this.fou;
    }
}
