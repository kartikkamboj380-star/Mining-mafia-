package com.bytedance.adsdk.kq.oq.oq.kq;

/* JADX INFO: loaded from: classes.dex */
public abstract class sns implements com.bytedance.adsdk.kq.oq.oq.kq {
    protected com.bytedance.adsdk.kq.oq.fou.bob bob;
    protected com.bytedance.adsdk.kq.oq.oq.kq kq;
    protected com.bytedance.adsdk.kq.oq.oq.kq oq;

    protected sns(com.bytedance.adsdk.kq.oq.fou.bob bobVar) {
        this.bob = bobVar;
    }

    public void kq(com.bytedance.adsdk.kq.oq.oq.kq kqVar) {
        this.kq = kqVar;
    }

    public void oq(com.bytedance.adsdk.kq.oq.oq.kq kqVar) {
        this.oq = kqVar;
    }

    public String toString() {
        return oq();
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public com.bytedance.adsdk.kq.oq.fou.csi kq() {
        return com.bytedance.adsdk.kq.oq.fou.rhi.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.kq.oq.oq.kq
    public String oq() {
        return this.kq.oq() + this.bob.kq() + this.oq.oq();
    }
}
