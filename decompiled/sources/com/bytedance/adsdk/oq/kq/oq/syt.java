package com.bytedance.adsdk.oq.kq.oq;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private final List<com.bytedance.adsdk.oq.bob.oq.syt> bob;
    private final List<kq<com.bytedance.adsdk.oq.bob.oq.suf, Path>> kq;
    private final List<kq<Integer, Integer>> oq;

    public syt(List<com.bytedance.adsdk.oq.bob.oq.syt> list) {
        this.bob = list;
        this.kq = new ArrayList(list.size());
        this.oq = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.kq.add(list.get(i10).oq().kq());
            this.oq.add(list.get(i10).bob().kq());
        }
    }

    public List<kq<Integer, Integer>> bob() {
        return this.oq;
    }

    public List<com.bytedance.adsdk.oq.bob.oq.syt> kq() {
        return this.bob;
    }

    public List<kq<com.bytedance.adsdk.oq.bob.oq.suf, Path>> oq() {
        return this.kq;
    }
}
