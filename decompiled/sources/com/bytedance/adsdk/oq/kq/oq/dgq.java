package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends com.bytedance.adsdk.oq.rjo.kq<PointF> {
    private Path nn;
    private final com.bytedance.adsdk.oq.rjo.kq<PointF> ubx;

    public dgq(com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.rjo.kq<PointF> kqVar) {
        super(rjoVar, kqVar.kq, kqVar.oq, kqVar.bob, kqVar.fou, kqVar.csi, kqVar.rhi, kqVar.rjo);
        this.ubx = kqVar;
        kq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void kq() {
        T t10;
        T t11;
        T t12 = this.oq;
        boolean z9 = (t12 == 0 || (t11 = this.kq) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.kq;
        if (t13 == 0 || (t10 = this.oq) == 0 || z9) {
            return;
        }
        com.bytedance.adsdk.oq.rjo.kq<PointF> kqVar = this.ubx;
        this.nn = com.bytedance.adsdk.oq.rhi.rhi.kq((PointF) t13, (PointF) t10, kqVar.syt, kqVar.dgq);
    }

    Path oq() {
        return this.nn;
    }
}
