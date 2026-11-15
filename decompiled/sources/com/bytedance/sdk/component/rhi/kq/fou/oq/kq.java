package com.bytedance.sdk.component.rhi.kq.fou.oq;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private int kq;
    private int oq;

    kq(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.kq = i10;
        this.oq = i11;
    }

    public static kq bob() {
        return new kq(1, 100, 172800000L);
    }

    public static kq csi() {
        return new kq(3, 100, 172800000L);
    }

    public static kq fou() {
        return new kq(1, 100, -1L);
    }

    public int kq() {
        return this.kq;
    }

    public int oq() {
        return this.oq;
    }
}
