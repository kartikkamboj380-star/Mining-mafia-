package com.bytedance.adsdk.oq.rhi;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    private float kq;
    private int oq;

    public void kq(float f10) {
        float f11 = this.kq + f10;
        this.kq = f11;
        int i10 = this.oq + 1;
        this.oq = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.kq = f11 / 2.0f;
            this.oq = i10 / 2;
        }
    }
}
