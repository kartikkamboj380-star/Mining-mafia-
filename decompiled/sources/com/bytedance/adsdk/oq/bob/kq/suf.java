package com.bytedance.adsdk.oq.bob.kq;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class suf<V, O> implements wki<V, O> {
    final List<com.bytedance.adsdk.oq.rjo.kq<V>> kq;

    suf(List<com.bytedance.adsdk.oq.rjo.kq<V>> list) {
        this.kq = list;
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public List<com.bytedance.adsdk.oq.rjo.kq<V>> bob() {
        return this.kq;
    }

    @Override // com.bytedance.adsdk.oq.bob.kq.wki
    public boolean oq() {
        return this.kq.isEmpty() || (this.kq.size() == 1 && this.kq.get(0).csi());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.kq.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.kq.toArray()));
        }
        return sb.toString();
    }
}
