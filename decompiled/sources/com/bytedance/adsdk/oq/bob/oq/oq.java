package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class oq implements bob {
    private final com.bytedance.adsdk.oq.bob.kq.rhi bob;
    private final boolean csi;
    private final boolean fou;
    private final String kq;
    private final com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> oq;

    public oq(String str, com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVar, com.bytedance.adsdk.oq.bob.kq.rhi rhiVar, boolean z9, boolean z10) {
        this.kq = str;
        this.oq = wkiVar;
        this.bob = rhiVar;
        this.fou = z9;
        this.csi = z10;
    }

    public com.bytedance.adsdk.oq.bob.kq.rhi bob() {
        return this.bob;
    }

    public boolean csi() {
        return this.csi;
    }

    public boolean fou() {
        return this.fou;
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.rhi(dgqVar, kqVar, this);
    }

    public com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> oq() {
        return this.oq;
    }

    public String kq() {
        return this.kq;
    }
}
