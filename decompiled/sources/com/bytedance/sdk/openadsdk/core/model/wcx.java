package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class wcx {
    private int bob;
    private boolean csi;
    private double fou;
    private String kq;
    private int oq;
    private String rhi;

    public int bob() {
        return this.bob;
    }

    public boolean csi() {
        return !TextUtils.isEmpty(this.kq) && this.oq > 0 && this.bob > 0;
    }

    public double fou() {
        return this.fou;
    }

    public String kq() {
        return this.kq;
    }

    public int oq() {
        return this.oq;
    }

    public boolean rhi() {
        return this.csi;
    }

    public String rjo() {
        return this.rhi;
    }

    public void kq(String str) {
        this.kq = str;
    }

    public void oq(int i10) {
        this.bob = i10;
    }

    public void kq(int i10) {
        this.oq = i10;
    }

    public void oq(String str) {
        this.rhi = str;
    }

    public void kq(boolean z9) {
        this.csi = z9;
    }
}
