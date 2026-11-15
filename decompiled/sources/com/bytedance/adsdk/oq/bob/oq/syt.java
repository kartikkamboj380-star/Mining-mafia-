package com.bytedance.adsdk.oq.bob.oq;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private final com.bytedance.adsdk.oq.bob.kq.fou bob;
    private final boolean fou;
    private final kq kq;
    private final com.bytedance.adsdk.oq.bob.kq.syt oq;

    public enum kq {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public syt(kq kqVar, com.bytedance.adsdk.oq.bob.kq.syt sytVar, com.bytedance.adsdk.oq.bob.kq.fou fouVar, boolean z9) {
        this.kq = kqVar;
        this.oq = sytVar;
        this.bob = fouVar;
        this.fou = z9;
    }

    public com.bytedance.adsdk.oq.bob.kq.fou bob() {
        return this.bob;
    }

    public boolean fou() {
        return this.fou;
    }

    public kq kq() {
        return this.kq;
    }

    public com.bytedance.adsdk.oq.bob.kq.syt oq() {
        return this.oq;
    }
}
