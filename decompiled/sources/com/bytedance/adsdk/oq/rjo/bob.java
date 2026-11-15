package com.bytedance.adsdk.oq.rjo;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private float kq;
    private float oq;

    public bob(float f10, float f11) {
        this.kq = f10;
        this.oq = f11;
    }

    public float kq() {
        return this.kq;
    }

    public float oq() {
        return this.oq;
    }

    public String toString() {
        return kq() + "x" + oq();
    }

    public void kq(float f10, float f11) {
        this.kq = f10;
        this.oq = f11;
    }

    public boolean oq(float f10, float f11) {
        return this.kq == f10 && this.oq == f11;
    }

    public bob() {
        this(1.0f, 1.0f);
    }
}
