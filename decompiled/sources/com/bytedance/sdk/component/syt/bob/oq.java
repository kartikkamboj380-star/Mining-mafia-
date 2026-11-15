package com.bytedance.sdk.component.syt.bob;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq implements Comparable<oq>, Runnable {
    private Runnable bob;
    private long csi;
    private long fou;
    private int kq;
    private String oq;
    private long rhi;

    public oq(String str) {
        this.kq = 5;
        this.oq = str;
    }

    public long bob() {
        return this.fou;
    }

    public long csi() {
        return this.rhi;
    }

    public long fou() {
        return this.csi;
    }

    public void kq(int i10) {
        this.kq = i10;
    }

    public String oq() {
        return this.oq;
    }

    public Runnable rhi() {
        return this.bob;
    }

    public void bob(long j10) {
        this.rhi = j10;
    }

    public int kq() {
        return this.kq;
    }

    public void oq(long j10) {
        this.csi = j10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(oq oqVar) {
        if (kq() < oqVar.kq()) {
            return 1;
        }
        return kq() >= oqVar.kq() ? -1 : 0;
    }

    public oq(int i10, String str) {
        this.kq = i10;
        this.oq = str;
    }

    public void kq(long j10) {
        this.fou = j10;
    }

    public oq(String str, Runnable runnable) {
        this.kq = 5;
        this.oq = str;
        this.bob = runnable;
    }
}
