package com.bytedance.adsdk.oq.bob;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private final PointF bob;
    private final PointF kq;
    private final PointF oq;

    public kq() {
        this.kq = new PointF();
        this.oq = new PointF();
        this.bob = new PointF();
    }

    public void bob(float f10, float f11) {
        this.bob.set(f10, f11);
    }

    public void kq(float f10, float f11) {
        this.kq.set(f10, f11);
    }

    public void oq(float f10, float f11) {
        this.oq.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.bob.x), Float.valueOf(this.bob.y), Float.valueOf(this.kq.x), Float.valueOf(this.kq.y), Float.valueOf(this.oq.x), Float.valueOf(this.oq.y));
    }

    public PointF bob() {
        return this.bob;
    }

    public PointF kq() {
        return this.kq;
    }

    public PointF oq() {
        return this.oq;
    }

    public kq(PointF pointF, PointF pointF2, PointF pointF3) {
        this.kq = pointF;
        this.oq = pointF2;
        this.bob = pointF3;
    }
}
