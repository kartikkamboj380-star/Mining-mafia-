package com.bytedance.adsdk.oq.bob.oq;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class suf {
    private boolean bob;
    private final List<com.bytedance.adsdk.oq.bob.kq> kq;
    private PointF oq;

    public suf(PointF pointF, boolean z9, List<com.bytedance.adsdk.oq.bob.kq> list) {
        this.oq = pointF;
        this.bob = z9;
        this.kq = new ArrayList(list);
    }

    public List<com.bytedance.adsdk.oq.bob.kq> bob() {
        return this.kq;
    }

    public void kq(float f10, float f11) {
        if (this.oq == null) {
            this.oq = new PointF();
        }
        this.oq.set(f10, f11);
    }

    public boolean oq() {
        return this.bob;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.kq.size() + "closed=" + this.bob + '}';
    }

    public PointF kq() {
        return this.oq;
    }

    public suf() {
        this.kq = new ArrayList();
    }

    public void kq(boolean z9) {
        this.bob = z9;
    }

    public void kq(suf sufVar, suf sufVar2, float f10) {
        if (this.oq == null) {
            this.oq = new PointF();
        }
        this.bob = sufVar.oq() || sufVar2.oq();
        if (sufVar.bob().size() != sufVar2.bob().size()) {
            sufVar.bob().size();
            sufVar2.bob().size();
        }
        int iMin = Math.min(sufVar.bob().size(), sufVar2.bob().size());
        if (this.kq.size() < iMin) {
            for (int size = this.kq.size(); size < iMin; size++) {
                this.kq.add(new com.bytedance.adsdk.oq.bob.kq());
            }
        } else if (this.kq.size() > iMin) {
            for (int size2 = this.kq.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.oq.bob.kq> list = this.kq;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFKq = sufVar.kq();
        PointF pointFKq2 = sufVar2.kq();
        kq(com.bytedance.adsdk.oq.rhi.csi.kq(pointFKq.x, pointFKq2.x, f10), com.bytedance.adsdk.oq.rhi.csi.kq(pointFKq.y, pointFKq2.y, f10));
        for (int size3 = this.kq.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.oq.bob.kq kqVar = sufVar.bob().get(size3);
            com.bytedance.adsdk.oq.bob.kq kqVar2 = sufVar2.bob().get(size3);
            PointF pointFKq3 = kqVar.kq();
            PointF pointFOq = kqVar.oq();
            PointF pointFBob = kqVar.bob();
            PointF pointFKq4 = kqVar2.kq();
            PointF pointFOq2 = kqVar2.oq();
            PointF pointFBob2 = kqVar2.bob();
            this.kq.get(size3).kq(com.bytedance.adsdk.oq.rhi.csi.kq(pointFKq3.x, pointFKq4.x, f10), com.bytedance.adsdk.oq.rhi.csi.kq(pointFKq3.y, pointFKq4.y, f10));
            this.kq.get(size3).oq(com.bytedance.adsdk.oq.rhi.csi.kq(pointFOq.x, pointFOq2.x, f10), com.bytedance.adsdk.oq.rhi.csi.kq(pointFOq.y, pointFOq2.y, f10));
            this.kq.get(size3).bob(com.bytedance.adsdk.oq.rhi.csi.kq(pointFBob.x, pointFBob2.x, f10), com.bytedance.adsdk.oq.rhi.csi.kq(pointFBob.y, pointFBob2.y, f10));
        }
    }
}
