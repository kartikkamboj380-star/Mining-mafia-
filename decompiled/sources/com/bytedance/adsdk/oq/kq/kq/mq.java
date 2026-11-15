package com.bytedance.adsdk.oq.kq.kq;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mq implements bob, com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq {
    private final List<com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq> bob = new ArrayList();
    private final com.bytedance.adsdk.oq.kq.oq.kq<?, Float> csi;
    private final com.bytedance.adsdk.oq.bob.oq.gm.kq fou;
    private final String kq;
    private final boolean oq;
    private final com.bytedance.adsdk.oq.kq.oq.kq<?, Float> rhi;
    private final com.bytedance.adsdk.oq.kq.oq.kq<?, Float> rjo;

    public mq(com.bytedance.adsdk.oq.bob.bob.kq kqVar, com.bytedance.adsdk.oq.bob.oq.gm gmVar) {
        this.kq = gmVar.kq();
        this.oq = gmVar.rhi();
        this.fou = gmVar.oq();
        com.bytedance.adsdk.oq.kq.oq.kq<Float, Float> kqVarKq = gmVar.fou().kq();
        this.csi = kqVarKq;
        com.bytedance.adsdk.oq.kq.oq.kq<Float, Float> kqVarKq2 = gmVar.bob().kq();
        this.rhi = kqVarKq2;
        com.bytedance.adsdk.oq.kq.oq.kq<Float, Float> kqVarKq3 = gmVar.csi().kq();
        this.rjo = kqVarKq3;
        kqVar.kq(kqVarKq);
        kqVar.kq(kqVarKq2);
        kqVar.kq(kqVarKq3);
        kqVarKq.kq(this);
        kqVarKq2.kq(this);
        kqVarKq3.kq(this);
    }

    public com.bytedance.adsdk.oq.kq.oq.kq<?, Float> bob() {
        return this.csi;
    }

    public com.bytedance.adsdk.oq.kq.oq.kq<?, Float> csi() {
        return this.rjo;
    }

    public com.bytedance.adsdk.oq.kq.oq.kq<?, Float> fou() {
        return this.rhi;
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.bob
    public void kq(List<bob> list, List<bob> list2) {
    }

    com.bytedance.adsdk.oq.bob.oq.gm.kq oq() {
        return this.fou;
    }

    public boolean rhi() {
        return this.oq;
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq
    public void kq() {
        for (int i10 = 0; i10 < this.bob.size(); i10++) {
            this.bob.get(i10).kq();
        }
    }

    void kq(com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq interfaceC0222kq) {
        this.bob.add(interfaceC0222kq);
    }
}
