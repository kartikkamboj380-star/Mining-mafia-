package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes3.dex */
class T extends B {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f41459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f41460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f41461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f41462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f41463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41464k;

    public T(ReactContext reactContext) {
        super(reactContext);
    }

    void G(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f41463j != null) {
            float f13 = this.f41459f;
            float f14 = this.mScale;
            float f15 = this.f41460g;
            canvas.concat(q0.a(new RectF(f13 * f14, f15 * f14, (f13 + this.f41461h) * f14, (f15 + this.f41462i) * f14), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11, f12), this.f41463j, this.f41464k));
            super.draw(canvas, paint, f10);
        }
    }

    @Override // com.horcrux.svg.B, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    public void setAlign(String str) {
        this.f41463j = str;
        invalidate();
    }

    public void setMeetOrSlice(int i10) {
        this.f41464k = i10;
        invalidate();
    }

    public void setMinX(float f10) {
        this.f41459f = f10;
        invalidate();
    }

    public void setMinY(float f10) {
        this.f41460g = f10;
        invalidate();
    }

    public void setVbHeight(float f10) {
        this.f41462i = f10;
        invalidate();
    }

    public void setVbWidth(float f10) {
        this.f41461h = f10;
        invalidate();
    }
}
