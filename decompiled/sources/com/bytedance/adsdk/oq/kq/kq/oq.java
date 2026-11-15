package com.bytedance.adsdk.oq.kq.kq;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private final List<mq> kq = new ArrayList();

    void kq(mq mqVar) {
        this.kq.add(mqVar);
    }

    public void kq(Path path) {
        for (int size = this.kq.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.oq.rhi.rhi.kq(path, this.kq.get(size));
        }
    }
}
