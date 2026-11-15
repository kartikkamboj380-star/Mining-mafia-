package com.bytedance.sdk.component.oq.kq;

/* JADX INFO: loaded from: classes.dex */
public final class rhi {
    private final String[] kq;

    public rhi(String[] strArr) {
        this.kq = strArr;
    }

    public int kq() {
        return this.kq.length / 2;
    }

    public String oq(int i10) {
        return this.kq[(i10 * 2) + 1];
    }

    public String kq(int i10) {
        return this.kq[i10 * 2];
    }
}
