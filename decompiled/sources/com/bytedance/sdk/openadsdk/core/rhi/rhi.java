package com.bytedance.sdk.openadsdk.core.rhi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends FrameLayout {
    private Drawable bob;
    private Drawable csi;
    private Drawable fou;
    private int kq;
    private int oq;
    private boolean rhi;
    private ValueAnimator rjo;
    private boolean syt;

    public rhi(Context context) {
        super(context);
        this.kq = 100;
    }

    private void kq() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
        this.rjo = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.rjo.setRepeatCount(-1);
        this.rjo.setInterpolator(new LinearInterpolator());
        this.rjo.setRepeatMode(1);
        this.rjo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.rhi.rhi.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                rhi.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.rjo.start();
        setMax(UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rhi = true;
        if (this.csi != null) {
            kq();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rhi = false;
        ValueAnimator valueAnimator = this.rjo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.rjo.removeAllUpdateListeners();
            this.rjo = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0) {
            ValueAnimator valueAnimator = this.rjo;
            if (valueAnimator == null || this.syt) {
                return;
            }
            this.syt = true;
            valueAnimator.pause();
            return;
        }
        if (this.syt) {
            this.syt = false;
            ValueAnimator valueAnimator2 = this.rjo;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            } else {
                kq();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.csi = drawable;
        setProgressDrawable(drawable);
        if (this.rhi && this.rjo == null) {
            kq();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(dgq.kq(this, layoutParams));
    }

    public void setMax(int i10) {
        this.kq = i10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setProgress(int i10) {
        this.oq = i10;
        Drawable drawable = this.bob;
        if (drawable != null) {
            drawable.setLevel((int) ((i10 * 10000.0f) / this.kq));
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        this.fou = drawable;
        setBackground(drawable);
        Drawable drawable2 = this.fou;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                Drawable drawable3 = ((LayerDrawable) this.fou).getDrawable(i10);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.bob = drawable3;
                }
            }
        }
        Drawable drawable4 = this.fou;
        if (drawable4 instanceof RotateDrawable) {
            this.bob = drawable4;
        }
    }

    public rhi(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.kq = 100;
    }
}
