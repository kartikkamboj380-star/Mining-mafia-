package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class sns extends View {
    private RectF bob;
    private ValueAnimator csi;
    private float fou;
    private Context kq;
    private Paint oq;
    private int rhi;
    private boolean rjo;

    public sns(Context context) {
        super(context);
        this.rhi = 1500;
        this.kq = context;
        Paint paint = new Paint();
        this.oq = paint;
        paint.setAntiAlias(true);
        this.oq.setStyle(Paint.Style.STROKE);
        this.oq.setStrokeWidth(10.0f);
        this.oq.setColor(Color.parseColor("#80FFFFFF"));
        this.bob = new RectF();
    }

    public void bob() {
        this.rjo = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.rjo) {
            return;
        }
        canvas.drawArc(this.bob, 270.0f, this.fou, false, this.oq);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.bob.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void oq() {
        ValueAnimator valueAnimator = this.csi;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setDuration(int i10) {
        this.rhi = i10;
    }

    public void kq() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
        this.csi = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.rhi);
        this.csi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.sns.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                sns.this.fou = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sns.this.requestLayout();
            }
        });
        this.csi.start();
    }
}
