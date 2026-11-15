package com.bytedance.adsdk.ugeno.fou.kq;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class oq implements bob {
    private List<fou> kq = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.fou.kq.bob
    public void kq(fou fouVar) {
        this.kq.add(fouVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fou.kq.bob
    public void kq(String str) {
        if (this.kq.isEmpty()) {
            return;
        }
        Iterator<fou> it = this.kq.iterator();
        while (it.hasNext()) {
            it.next().kq(str);
        }
    }
}
