package com.bytedance.adsdk.oq.bob.kq;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi implements wki<PointF, PointF> {
    private final List<com.bytedance.adsdk.oq.rjo.kq<PointF>> kq;

    public csi(List<com.bytedance.adsdk.oq.rjo.kq<PointF>> list) {
        this.kq = list;
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public List<com.bytedance.adsdk.oq.rjo.kq<PointF>> bob() {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public com.bytedance.adsdk.oq.kq.oq.kq<PointF, PointF> kq() {
        return this.kq.get(0).csi() ? new com.bytedance.adsdk.oq.kq.oq.ubx(this.kq) : new com.bytedance.adsdk.oq.kq.oq.nn(this.kq);
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public boolean oq() {
        return this.kq.size() == 1 && this.kq.get(0).csi();
    }
}
