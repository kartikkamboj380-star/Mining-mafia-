package com.bytedance.adsdk.oq.rjo;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.oq.rjo;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq<T> {
    public final Interpolator bob;
    public final Interpolator csi;
    public PointF dgq;
    public final Interpolator fou;
    public final T kq;
    private float mxq;
    private final rjo nn;
    private float nze;
    public T oq;
    public final float rhi;
    public Float rjo;
    private int suf;
    public PointF syt;
    private float ubx;
    private float vvw;
    private int wki;

    public kq(rjo rjoVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.ubx = -3987645.8f;
        this.vvw = -3987645.8f;
        this.wki = 784923401;
        this.suf = 784923401;
        this.nze = Float.MIN_VALUE;
        this.mxq = Float.MIN_VALUE;
        this.syt = null;
        this.dgq = null;
        this.nn = rjoVar;
        this.kq = t10;
        this.oq = t11;
        this.bob = interpolator;
        this.fou = null;
        this.csi = null;
        this.rhi = f10;
        this.rjo = f11;
    }

    public float bob() {
        rjo rjoVar = this.nn;
        if (rjoVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.nze == Float.MIN_VALUE) {
            this.nze = (this.rhi - rjoVar.rhi()) / this.nn.sns();
        }
        return this.nze;
    }

    public boolean csi() {
        return this.bob == null && this.fou == null && this.csi == null;
    }

    public int dgq() {
        if (this.suf == 784923401) {
            this.suf = ((Integer) this.oq).intValue();
        }
        return this.suf;
    }

    public float fou() {
        if (this.nn == null) {
            return 1.0f;
        }
        if (this.mxq == Float.MIN_VALUE) {
            if (this.rjo == null) {
                this.mxq = 1.0f;
            } else {
                this.mxq = bob() + ((this.rjo.floatValue() - this.rhi) / this.nn.sns());
            }
        }
        return this.mxq;
    }

    public kq<T> kq(T t10, T t11) {
        return new kq<>(t10, t11);
    }

    public float rhi() {
        if (this.ubx == -3987645.8f) {
            this.ubx = ((Float) this.kq).floatValue();
        }
        return this.ubx;
    }

    public float rjo() {
        if (this.vvw == -3987645.8f) {
            this.vvw = ((Float) this.oq).floatValue();
        }
        return this.vvw;
    }

    public int syt() {
        if (this.wki == 784923401) {
            this.wki = ((Integer) this.kq).intValue();
        }
        return this.wki;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.kq + ", endValue=" + this.oq + ", startFrame=" + this.rhi + ", endFrame=" + this.rjo + ", interpolator=" + this.bob + '}';
    }

    public boolean kq(float f10) {
        return f10 >= bob() && f10 < fou();
    }

    public kq(rjo rjoVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.ubx = -3987645.8f;
        this.vvw = -3987645.8f;
        this.wki = 784923401;
        this.suf = 784923401;
        this.nze = Float.MIN_VALUE;
        this.mxq = Float.MIN_VALUE;
        this.syt = null;
        this.dgq = null;
        this.nn = rjoVar;
        this.kq = t10;
        this.oq = t11;
        this.bob = null;
        this.fou = interpolator;
        this.csi = interpolator2;
        this.rhi = f10;
        this.rjo = f11;
    }

    protected kq(rjo rjoVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.ubx = -3987645.8f;
        this.vvw = -3987645.8f;
        this.wki = 784923401;
        this.suf = 784923401;
        this.nze = Float.MIN_VALUE;
        this.mxq = Float.MIN_VALUE;
        this.syt = null;
        this.dgq = null;
        this.nn = rjoVar;
        this.kq = t10;
        this.oq = t11;
        this.bob = interpolator;
        this.fou = interpolator2;
        this.csi = interpolator3;
        this.rhi = f10;
        this.rjo = f11;
    }

    public kq(T t10) {
        this.ubx = -3987645.8f;
        this.vvw = -3987645.8f;
        this.wki = 784923401;
        this.suf = 784923401;
        this.nze = Float.MIN_VALUE;
        this.mxq = Float.MIN_VALUE;
        this.syt = null;
        this.dgq = null;
        this.nn = null;
        this.kq = t10;
        this.oq = t10;
        this.bob = null;
        this.fou = null;
        this.csi = null;
        this.rhi = Float.MIN_VALUE;
        this.rjo = Float.valueOf(Float.MAX_VALUE);
    }

    private kq(T t10, T t11) {
        this.ubx = -3987645.8f;
        this.vvw = -3987645.8f;
        this.wki = 784923401;
        this.suf = 784923401;
        this.nze = Float.MIN_VALUE;
        this.mxq = Float.MIN_VALUE;
        this.syt = null;
        this.dgq = null;
        this.nn = null;
        this.kq = t10;
        this.oq = t11;
        this.bob = null;
        this.fou = null;
        this.csi = null;
        this.rhi = Float.MIN_VALUE;
        this.rjo = Float.valueOf(Float.MAX_VALUE);
    }
}
