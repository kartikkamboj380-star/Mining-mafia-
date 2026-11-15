package com.bytedance.adsdk.oq.bob.oq;

import com.bytedance.adsdk.oq.kq.kq.mq;

/* JADX INFO: loaded from: classes.dex */
public class gm implements bob {
    private final com.bytedance.adsdk.oq.bob.kq.oq bob;
    private final com.bytedance.adsdk.oq.bob.kq.oq csi;
    private final com.bytedance.adsdk.oq.bob.kq.oq fou;
    private final String kq;
    private final kq oq;
    private final boolean rhi;

    public enum kq {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static kq kq(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
        }
    }

    public gm(String str, kq kqVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar, com.bytedance.adsdk.oq.bob.kq.oq oqVar2, com.bytedance.adsdk.oq.bob.kq.oq oqVar3, boolean z9) {
        this.kq = str;
        this.oq = kqVar;
        this.bob = oqVar;
        this.fou = oqVar2;
        this.csi = oqVar3;
        this.rhi = z9;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq bob() {
        return this.fou;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq csi() {
        return this.csi;
    }

    public com.bytedance.adsdk.oq.bob.kq.oq fou() {
        return this.bob;
    }

    public String kq() {
        return this.kq;
    }

    public kq oq() {
        return this.oq;
    }

    public boolean rhi() {
        return this.rhi;
    }

    public String toString() {
        return "Trim Path: {start: " + this.bob + ", end: " + this.fou + ", offset: " + this.csi + "}";
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new mq(kqVar, this);
    }
}
