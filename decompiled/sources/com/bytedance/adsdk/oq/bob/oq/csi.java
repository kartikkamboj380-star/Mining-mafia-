package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class csi implements bob {
    private final com.bytedance.adsdk.oq.bob.kq.bob bob;
    private final com.bytedance.adsdk.oq.bob.kq.rhi csi;
    private final com.bytedance.adsdk.oq.bob.kq.oq dgq;
    private final com.bytedance.adsdk.oq.bob.kq.fou fou;
    private final rjo kq;
    private final boolean nn;
    private final Path.FillType oq;
    private final com.bytedance.adsdk.oq.bob.kq.rhi rhi;
    private final String rjo;
    private final com.bytedance.adsdk.oq.bob.kq.oq syt;

    public csi(String str, rjo rjoVar, Path.FillType fillType, com.bytedance.adsdk.oq.bob.kq.bob bobVar, com.bytedance.adsdk.oq.bob.kq.fou fouVar, com.bytedance.adsdk.oq.bob.kq.rhi rhiVar, com.bytedance.adsdk.oq.bob.kq.rhi rhiVar2, com.bytedance.adsdk.oq.bob.kq.oq oqVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar2, boolean z9) {
        this.kq = rjoVar;
        this.oq = fillType;
        this.bob = bobVar;
        this.fou = fouVar;
        this.csi = rhiVar;
        this.rhi = rhiVar2;
        this.rjo = str;
        this.syt = oqVar;
        this.dgq = oqVar2;
        this.nn = z9;
    }

    public Path.FillType bob() {
        return this.oq;
    }

    public com.bytedance.adsdk.oq.bob.kq.fou csi() {
        return this.fou;
    }

    public com.bytedance.adsdk.oq.bob.kq.bob fou() {
        return this.bob;
    }

    public String kq() {
        return this.rjo;
    }

    public rjo oq() {
        return this.kq;
    }

    public com.bytedance.adsdk.oq.bob.kq.rhi rhi() {
        return this.csi;
    }

    public com.bytedance.adsdk.oq.bob.kq.rhi rjo() {
        return this.rhi;
    }

    public boolean syt() {
        return this.nn;
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.syt(dgqVar, rjoVar, kqVar, this);
    }
}
