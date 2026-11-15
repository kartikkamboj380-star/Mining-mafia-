package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class suf extends com.bytedance.sdk.openadsdk.core.rhi.fou {
    private Paint kq;
    private RectF oq;

    public suf(Context context) {
        super(context);
        kq();
    }

    private void kq() {
        Paint paint = new Paint();
        this.kq = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.kq.setColor(Color.parseColor("#99333333"));
        this.kq.setAntiAlias(true);
        this.kq.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.oq = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.oq;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.kq);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.rhi.fou, android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.oq.right == getMeasuredWidth() && this.oq.bottom == getMeasuredHeight()) {
            return;
        }
        this.oq.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight());
    }
}
