package com.bytedance.sdk.component.bob.kq;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    long bob;
    long csi;
    long fou;
    long kq = SystemClock.elapsedRealtime();
    long oq;
    long rhi;
    long rjo;
    long syt;

    public void bob() {
        this.csi = SystemClock.elapsedRealtime();
    }

    public void csi() {
        this.rhi = SystemClock.elapsedRealtime();
    }

    public long dgq() {
        return this.csi;
    }

    public long fou() {
        return this.kq;
    }

    public void kq() {
        this.bob = SystemClock.elapsedRealtime();
    }

    public long nn() {
        return this.rjo;
    }

    public void nze() {
        this.oq = SystemClock.elapsedRealtime();
    }

    public void oq() {
        this.fou = SystemClock.elapsedRealtime();
    }

    public long rhi() {
        return this.rhi;
    }

    public long rjo() {
        return this.bob;
    }

    public long suf() {
        return this.oq;
    }

    public long syt() {
        return this.fou;
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.kq + ", asyncCallExecTs=" + this.oq + ", requestStartExecTs=" + this.bob + ", requestConnectStartTs=" + this.fou + ", requestConnectFinishTs=" + this.csi + ", reqCallServerStartTs=" + this.rjo + ", reqCallServerFinishTs=" + this.syt + '}';
    }

    public void ubx() {
        this.rjo = SystemClock.elapsedRealtime();
    }

    public long vvw() {
        return this.syt;
    }

    public void wki() {
        this.syt = SystemClock.elapsedRealtime();
    }
}
