package com.bytedance.sdk.component.adexpress.rhi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.dgq.fou.b;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class wki extends ImageView {
    private int bob;
    private boolean csi;
    private float dgq;
    private AnimatedImageDrawable fou;
    private Movie kq;
    private int nn;
    private long oq;
    private boolean rhi;
    private float rjo;
    private boolean suf;
    private float syt;
    private int ubx;
    private volatile boolean vvw;
    private boolean wki;

    public wki(Context context) {
        super(context);
        this.csi = Build.VERSION.SDK_INT >= 28;
        this.rhi = false;
        this.wki = true;
        this.suf = true;
        kq();
    }

    private void bob() {
        if (this.kq == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.oq == 0) {
            this.oq = jUptimeMillis;
        }
        int iDuration = this.kq.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        if (this.suf || Math.abs(iDuration - this.bob) >= 60) {
            this.bob = (int) ((jUptimeMillis - this.oq) % ((long) iDuration));
        } else {
            this.bob = iDuration;
            this.vvw = true;
        }
    }

    private void oq() {
        if (this.kq == null || this.csi || !this.wki) {
            return;
        }
        postInvalidateOnAnimation();
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.dgq.fou.a.a(drawable)) {
            AnimatedImageDrawable animatedImageDrawableA = b.a(drawable);
            this.fou = animatedImageDrawableA;
            if (!this.vvw) {
                animatedImageDrawableA.start();
            }
            if (!this.suf) {
                animatedImageDrawableA.setRepeatCount(0);
            }
        }
        oq();
    }

    void kq() {
        if (this.csi) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.kq == null || this.csi) {
            super.onDraw(canvas);
            return;
        }
        try {
            if (this.vvw) {
                kq(canvas);
                return;
            }
            bob();
            kq(canvas);
            oq();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.kq != null && !this.csi) {
            this.rjo = (getWidth() - this.nn) / 2.0f;
            this.syt = (getHeight() - this.ubx) / 2.0f;
        }
        this.wki = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        Movie movie;
        int size;
        int size2;
        super.onMeasure(i10, i11);
        if (this.csi || (movie = this.kq) == null) {
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.kq.height();
        float fMax = 1.0f / Math.max((View.MeasureSpec.getMode(i10) == 0 || iWidth <= (size2 = View.MeasureSpec.getSize(i10))) ? 1.0f : iWidth / size2, (View.MeasureSpec.getMode(i11) == 0 || iHeight <= (size = View.MeasureSpec.getSize(i11))) ? 1.0f : iHeight / size);
        this.dgq = fMax;
        int i12 = (int) (iWidth * fMax);
        this.nn = i12;
        int i13 = (int) (iHeight * fMax);
        this.ubx = i13;
        setMeasuredDimension(i12, i13);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        if (this.kq != null) {
            this.wki = i10 == 1;
            oq();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.kq != null) {
            this.wki = i10 == 0;
            oq();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.kq != null) {
            this.wki = i10 == 0;
            oq();
        }
    }

    public void setRepeatConfig(boolean z9) {
        AnimatedImageDrawable animatedImageDrawable;
        this.suf = z9;
        if (z9) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 28 || (animatedImageDrawable = this.fou) == null) {
                return;
            }
            animatedImageDrawable.setRepeatCount(0);
        } catch (Exception unused) {
        }
    }

    private void kq(Canvas canvas) {
        Movie movie = this.kq;
        if (movie == null) {
            return;
        }
        movie.setTime(this.bob);
        float f10 = this.dgq;
        if (f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.scale(1.0f, 1.0f);
            this.kq.draw(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            canvas.scale(f10, f10);
            Movie movie2 = this.kq;
            float f11 = this.rjo;
            float f12 = this.dgq;
            movie2.draw(canvas, f11 / f12, this.syt / f12);
        }
        canvas.restore();
    }
}
