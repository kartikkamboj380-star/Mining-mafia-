package com.bytedance.adsdk.oq.bob.oq;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class mxq implements bob {
    private final boolean bob;
    private final String kq;
    private final List<bob> oq;

    public mxq(String str, List<bob> list, boolean z9) {
        this.kq = str;
        this.oq = list;
        this.bob = z9;
    }

    public boolean bob() {
        return this.bob;
    }

    public String kq() {
        return this.kq;
    }

    public List<bob> oq() {
        return this.oq;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.kq + "' Shapes: " + Arrays.toString(this.oq.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.oq.bob.oq.bob
    public com.bytedance.adsdk.oq.kq.kq.bob kq(com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, com.bytedance.adsdk.oq.bob.bob.kq kqVar) {
        return new com.bytedance.adsdk.oq.kq.kq.fou(dgqVar, kqVar, this, rjoVar);
    }
}
