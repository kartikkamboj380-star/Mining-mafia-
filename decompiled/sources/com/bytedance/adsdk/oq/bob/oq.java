package com.bytedance.adsdk.oq.bob;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    public float bob;
    public int csi;
    public int dgq;
    public kq fou;
    public String kq;
    public float nn;
    public String oq;
    public float rhi;
    public float rjo;
    public int syt;
    public boolean ubx;
    public PointF vvw;
    public PointF wki;

    public enum kq {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public oq(String str, String str2, float f10, kq kqVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z9, PointF pointF, PointF pointF2) {
        kq(str, str2, f10, kqVar, i10, f11, f12, i11, i12, f13, z9, pointF, pointF2);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.kq.hashCode() * 31) + this.oq.hashCode()) * 31) + this.bob)) * 31) + this.fou.ordinal()) * 31) + this.csi;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.rhi);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.syt;
    }

    public void kq(String str, String str2, float f10, kq kqVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z9, PointF pointF, PointF pointF2) {
        this.kq = str;
        this.oq = str2;
        this.bob = f10;
        this.fou = kqVar;
        this.csi = i10;
        this.rhi = f11;
        this.rjo = f12;
        this.syt = i11;
        this.dgq = i12;
        this.nn = f13;
        this.ubx = z9;
        this.vvw = pointF;
        this.wki = pointF2;
    }

    public oq() {
    }
}
