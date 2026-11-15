package com.bytedance.sdk.component.oq.kq.kq.kq;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class kq extends com.bytedance.sdk.component.oq.kq.fou {
    public static volatile nn kq;
    private ExecutorService fou;
    private List<com.bytedance.sdk.component.oq.kq.oq> oq = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.oq.kq.oq> bob = new CopyOnWriteArrayList();

    public kq(ExecutorService executorService) {
        this.fou = executorService;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public List<com.bytedance.sdk.component.oq.kq.oq> bob() {
        return this.oq;
    }

    public boolean csi() {
        return (kq == null || kq.kq() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public List<com.bytedance.sdk.component.oq.kq.oq> fou() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public int kq() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public ExecutorService oq() {
        ExecutorService executorServiceKq = kq != null ? kq.kq() : null;
        return executorServiceKq != null ? executorServiceKq : this.fou;
    }

    @Override // com.bytedance.sdk.component.oq.kq.fou
    public void kq(int i10) {
    }

    public static void kq(nn nnVar) {
        kq = nnVar;
    }
}
