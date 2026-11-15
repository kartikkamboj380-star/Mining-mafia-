package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes.dex */
public class mq {
    private long kq = 10000;
    private long oq = 10000;
    private long bob = 10;
    private long fou = 20;
    private String csi = "";

    public long bob() {
        return this.bob;
    }

    public String csi() {
        return this.csi;
    }

    public long fou() {
        return this.fou;
    }

    public long kq() {
        return this.kq;
    }

    public long oq() {
        return this.oq;
    }

    public void bob(long j10) {
        if (j10 <= 0) {
            this.bob = 10L;
        } else {
            this.bob = j10;
        }
    }

    public void fou(long j10) {
        if (j10 < 0) {
            this.fou = 20L;
        } else {
            this.fou = j10;
        }
    }

    public void kq(long j10) {
        if (j10 <= 0) {
            this.kq = 10L;
        } else {
            this.kq = j10;
        }
    }

    public void oq(long j10) {
        if (j10 < 0) {
            this.oq = 20L;
        } else {
            this.oq = j10;
        }
    }

    public void kq(String str) {
        this.csi = str;
    }
}
