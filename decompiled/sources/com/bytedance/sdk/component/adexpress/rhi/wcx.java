package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class wcx extends View {
    private ValueAnimator bob;
    private Paint csi;
    private Animator.AnimatorListener dgq;
    private ValueAnimator fou;
    private float kq;
    private int nn;
    private float oq;
    private long rhi;
    private float rjo;
    private float syt;

    public wcx(Context context, int i10) {
        super(context);
        this.rhi = 300L;
        this.rjo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.nn = i10;
        kq();
    }

    public void bob() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.syt, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.fou = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.rhi);
        this.fou.setInterpolator(new LinearInterpolator());
        this.fou.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.wcx.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wcx.this.rjo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcx.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.dgq;
        if (animatorListener != null) {
            this.fou.addListener(animatorListener);
        }
        this.fou.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.kq, this.oq, this.rjo, this.csi);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.kq = i10 / 2.0f;
        this.oq = i11 / 2.0f;
        this.syt = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void oq() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.syt);
        this.bob = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.rhi);
        this.bob.setInterpolator(new LinearInterpolator());
        this.bob.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.wcx.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                wcx.this.rjo = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wcx.this.invalidate();
            }
        });
        this.bob.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.dgq = animatorListener;
    }

    public void kq() {
        Paint paint = new Paint(1);
        this.csi = paint;
        paint.setStyle(Paint.Style.FILL);
        this.csi.setColor(this.nn);
    }
}
