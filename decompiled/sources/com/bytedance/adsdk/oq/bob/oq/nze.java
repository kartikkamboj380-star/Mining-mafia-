package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class nze implements bob {
    private final String bob;
    private final com.bytedance.adsdk.oq.bob.kq.fou csi;
    private final com.bytedance.adsdk.oq.bob.kq.kq fou;
    private final boolean kq;
    private final Path.FillType oq;
    private final boolean rhi;

    public nze(String str, boolean z9, Path.FillType fillType, com.bytedance.adsdk.oq.bob.kq.kq kqVar, com.bytedance.adsdk.oq.bob.kq.fou fouVar, boolean z10) {
        this.bob = str;
        this.kq = z9;
        this.oq = fillType;
        this.fou = kqVar;
        this.csi = fouVar;
        this.rhi = z10;
    }

    public com.bytedance.adsdk.oq.bob.kq.fou bob() {
        return this.csi;
    }

    public boolean csi() {
        return this.rhi;
    }

    public Path.FillType fou() {
        return this.oq;
    }

    public String kq() {
        return this.bob;
    }

    public com.bytedance.adsdk.oq.bob.kq.kq oq() {
        return this.fou;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.kq + '}';
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.rjo(dgqVar, kqVar, this);
    }
}
