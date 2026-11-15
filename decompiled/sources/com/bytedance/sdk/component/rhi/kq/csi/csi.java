package com.bytedance.sdk.component.rhi.kq.csi;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class csi implements Comparable<csi>, Runnable {
    private String bob;
    private int kq = 5;
    private String oq = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public csi(String str) {
        this.bob = str;
    }

    public void kq(int i10) {
        this.kq = i10;
    }

    public int kq() {
        return this.kq;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(csi csiVar) {
        if (kq() < csiVar.kq()) {
            return 1;
        }
        return kq() >= csiVar.kq() ? -1 : 0;
    }
}
