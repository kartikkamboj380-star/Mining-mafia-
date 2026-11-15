package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class nze extends com.bytedance.sdk.openadsdk.core.rhi.syt {
    private int bob;
    private Paint kq;
    private RectF oq;

    public nze(Context context) {
        this(context, null);
    }

    private void kq() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.kq = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.kq.setColor(Color.parseColor("#99333333"));
        this.kq.setAntiAlias(true);
        this.kq.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.oq = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.oq;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.kq);
        canvas.translate((this.oq.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi.syt, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.oq.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.bob = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i12 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i12, measuredHeight);
        this.oq.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12, measuredHeight);
    }

    public nze(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nze(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.bob = 0;
        kq();
    }
}
