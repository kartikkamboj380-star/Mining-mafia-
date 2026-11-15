package com.bytedance.adsdk.oq.kq.oq;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi extends rjo<com.bytedance.adsdk.oq.bob.oq.fou> {
    private final com.bytedance.adsdk.oq.bob.oq.fou fou;

    public csi(List<com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou>> list) {
        super(list);
        com.bytedance.adsdk.oq.bob.oq.fou fouVar = list.get(0).kq;
        int iBob = fouVar != null ? fouVar.bob() : 0;
        this.fou = new com.bytedance.adsdk.oq.bob.oq.fou(new float[iBob], new int[iBob]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.oq.bob.oq.fou kq(com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.fou> kqVar, float f10) {
        this.fou.kq(kqVar.kq, kqVar.oq, f10);
        return this.fou;
    }
}
