package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class yyl {
    public long kq;
    private long oq;

    private yyl(boolean z9) {
        if (z9) {
            csi();
        }
    }

    public static yyl bob() {
        return new yyl(false);
    }

    public static yyl oq() {
        return new yyl(true);
    }

    public void csi() {
        this.kq = System.currentTimeMillis();
        this.oq = SystemClock.elapsedRealtime();
    }

    public long fou() {
        return SystemClock.elapsedRealtime() - this.oq;
    }

    public long kq() {
        return this.oq;
    }

    public boolean rhi() {
        return this.oq > 0;
    }

    public String toString() {
        return String.valueOf(this.kq);
    }

    public long kq(yyl yylVar) {
        return Math.abs(yylVar.oq - this.oq);
    }
}
