package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class nn implements bob {
    private final com.bytedance.adsdk.oq.bob.kq.oq bob;
    private final com.bytedance.adsdk.oq.bob.kq.oq csi;
    private final com.bytedance.adsdk.oq.bob.kq.oq dgq;
    private final com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> fou;
    private final String kq;
    private final boolean nn;
    private final kq oq;
    private final com.bytedance.adsdk.oq.bob.kq.oq rhi;
    private final com.bytedance.adsdk.oq.bob.kq.oq rjo;
    private final com.bytedance.adsdk.oq.bob.kq.oq syt;
    private final boolean ubx;

    public enum kq {
        STAR(1),
        POLYGON(2);

        private final int bob;

        kq(int i10) {
            this.bob = i10;
        }

        public static kq kq(int i10) {
            for (kq kqVar : values()) {
                if (kqVar.bob == i10) {
                    return kqVar;
                }
            }
            return null;
        }
    }

    public nn(String str, kq kqVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar, com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> wkiVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar2, com.bytedance.adsdk.oq.bob.kq.oq oqVar3, com.bytedance.adsdk.oq.bob.kq.oq oqVar4, com.bytedance.adsdk.oq.bob.kq.oq oqVar5, com.bytedance.adsdk.oq.bob.kq.oq oqVar6, boolean z9, boolean z10) {
        this.kq = str;
        this.oq = kqVar;
        this.bob = oqVar;
        this.fou = wkiVar;
        this.csi = oqVar2;
        this.rhi = oqVar3;
        this.rjo = oqVar4;
        this.syt = oqVar5;
        this.dgq = oqVar6;
        this.nn = z9;
        this.ubx = z10;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq bob() {
        return this.bob;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq csi() {
        return this.csi;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq dgq() {
        return this.dgq;
    }

    public com.bytedance.adsdk.oq.bob.kq.wki<PointF, PointF> fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public boolean nn() {
        return this.nn;
    }

    public kq oq() {
        return this.oq;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq rhi() {
        return this.rhi;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq rjo() {
        return this.rjo;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq syt() {
        return this.syt;
    }

    public boolean ubx() {
        return this.ubx;
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.suf(dgqVar, kqVar, this);
    }
}
