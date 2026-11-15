package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class ubx implements bob {
    private final com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> bob;
    private final boolean csi;
    private final com.bytedance.adsdk.oq.bob.kq.oq fou;
    private final String kq;
    private final com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> oq;

    public ubx(String str, com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVar, com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVar2, com.bytedance.adsdk.oq.bob.kq.oq oqVar, boolean z9) {
        this.kq = str;
        this.oq = wkiVar;
        this.bob = wkiVar2;
        this.fou = oqVar;
        this.csi = z9;
    }

    public com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> bob() {
        return this.bob;
    }

    public boolean csi() {
        return this.csi;
    }

    public com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> fou() {
        return this.oq;
    }

    public String kq() {
        return this.kq;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq oq() {
        return this.fou;
    }

    public String toString() {
        return "RectangleShape{position=" + this.oq + ", size=" + this.bob + '}';
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.nze(dgqVar, kqVar, this);
    }
}
