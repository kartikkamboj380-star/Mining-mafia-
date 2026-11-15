package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.Path;
import com.bytedance.adsdk.oq.kq.kq.gm;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wki extends kq<com.bytedance.adsdk.oq.bob.oq.suf, Path> {
    private final Path csi;
    private final com.bytedance.adsdk.oq.bob.oq.suf fou;
    private List<gm> rhi;

    public wki(List<com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.suf>> list) {
        super(list);
        this.fou = new com.bytedance.adsdk.oq.bob.oq.suf();
        this.csi = new Path();
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public Path kq(com.bytedance.adsdk.oq.rjo.kq<com.bytedance.adsdk.oq.bob.oq.suf> kqVar, float f10) {
        this.fou.kq(kqVar.kq, kqVar.oq, f10);
        com.bytedance.adsdk.oq.bob.oq.suf sufVarKq = this.fou;
        List<gm> list = this.rhi;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                sufVarKq = this.rhi.get(size).kq(sufVarKq);
            }
        }
        com.bytedance.adsdk.oq.rhi.csi.kq(sufVarKq, this.csi);
        return this.csi;
    }

    public void kq(List<gm> list) {
        this.rhi = list;
    }
}
