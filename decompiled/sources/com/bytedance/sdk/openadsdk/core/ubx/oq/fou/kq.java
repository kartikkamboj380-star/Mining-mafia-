package com.bytedance.sdk.openadsdk.core.ubx.oq.fou;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.fou;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq extends View {
    private RectF bob;
    private int csi;
    private int dgq;
    private int fou;
    private Paint kq;
    private String nn;
    private Paint oq;
    private float rhi;
    private float rjo;
    private float suf;
    private int syt;
    private fou ubx;
    private ValueAnimator vvw;
    private int wki;

    public kq(Context context) {
        super(context);
        this.fou = com.bytedance.adsdk.ugeno.rjo.kq.kq("#FFD813");
        this.csi = com.bytedance.adsdk.ugeno.rjo.kq.kq("rgba(0, 0, 0, 0.5)");
        this.rhi = 3.0f;
        this.rjo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.syt = 0;
        this.dgq = 100;
        this.nn = "line";
        this.wki = 1000;
        setBackgroundColor(0);
        kq();
    }

    private void oq(Canvas canvas) {
        Paint paint = this.kq;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f10 = this.rhi;
        float f11 = this.rjo;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f10, f11, f11, this.kq);
        float width2 = (getWidth() * this.suf) / this.dgq;
        this.oq.setStyle(style);
        if (!TextUtils.equals(this.nn, "line_reverse")) {
            float f12 = this.rhi;
            float f13 = this.rjo;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, f12, f13, f13, this.oq);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f14 = this.rhi;
            float f15 = this.rjo;
            canvas.drawRoundRect(width3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width4, f14, f15, f15, this.oq);
        }
    }

    public int getMaxProgress() {
        return this.dgq;
    }

    public int getProgress() {
        return this.syt;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.vvw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.nn, "ring") || TextUtils.equals(this.nn, "ring_reverse")) {
            kq(canvas);
        } else {
            oq(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        fou fouVar = this.ubx;
        if (fouVar != null) {
            int[] iArrKq = fouVar.kq(i10, i11);
            super.onMeasure(iArrKq[0], iArrKq[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        if (TextUtils.equals(this.nn, "ring") || TextUtils.equals(this.nn, "ring_reverse")) {
            int iMin = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.rhi);
        }
        fou fouVar2 = this.ubx;
        if (fouVar2 != null) {
            fouVar2.csi();
        }
    }

    public void setAnimationDuration(int i10) {
        this.wki = i10;
        this.vvw.setDuration(i10);
    }

    public void setMaxProgress(int i10) {
        this.dgq = i10;
        invalidate();
    }

    public void setProgress(int i10) {
        int iMin = Math.min(i10, this.dgq);
        this.syt = iMin;
        if (iMin < 0) {
            this.syt = 0;
        }
        ValueAnimator valueAnimator = this.vvw;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.vvw.setFloatValues(this.suf, this.syt);
            Log.d("UGenRender", "setProgress: animatedProgress=" + this.suf + " progress=" + i10);
            this.vvw.start();
        }
    }

    private void kq() {
        Paint paint = new Paint(1);
        this.kq = paint;
        paint.setColor(this.csi);
        Paint paint2 = this.kq;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.oq = paint3;
        paint3.setColor(this.fou);
        this.oq.setStyle(style);
        this.bob = new RectF();
        this.suf = this.syt;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(new float[0]);
        this.vvw = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.wki);
        this.vvw.setInterpolator(new LinearInterpolator());
        this.vvw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.ubx.oq.fou.kq.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                kq.this.suf = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kq.this.invalidate();
            }
        });
    }

    public kq oq(int i10) {
        this.kq.setColor(i10);
        return this;
    }

    public kq oq(float f10) {
        this.rjo = f10;
        return this;
    }

    private void kq(Canvas canvas) {
        float f10;
        int i10;
        float f11 = this.rhi / 2.0f;
        this.bob.set(f11, f11, getWidth() - f11, getHeight() - f11);
        Paint paint = this.kq;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.kq.setStrokeWidth(this.rhi);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f11, this.kq);
        if (TextUtils.equals(this.nn, "ring_reverse")) {
            f10 = this.suf * (-360.0f);
            i10 = this.dgq;
        } else {
            f10 = this.suf * 360.0f;
            i10 = this.dgq;
        }
        float f12 = f10 / i10;
        this.oq.setStyle(style);
        this.oq.setStrokeWidth(this.rhi);
        if (this.rjo <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.oq.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            this.oq.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.bob, -90.0f, f12, false, this.oq);
    }

    public kq kq(int i10) {
        this.oq.setColor(i10);
        return this;
    }

    public kq kq(float f10) {
        this.rhi = f10;
        invalidate();
        return this;
    }

    public kq kq(String str) {
        this.nn = str;
        return this;
    }

    public void kq(fou fouVar) {
        this.ubx = fouVar;
    }
}
