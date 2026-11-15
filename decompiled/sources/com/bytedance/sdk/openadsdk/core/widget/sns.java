package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class sns extends com.bytedance.sdk.openadsdk.core.rhi.fou {
    private int bob;
    private final RectF csi;
    private final Matrix fou;
    private final Paint kq;
    private int oq;
    private BitmapShader rhi;

    public sns(Context context) {
        this(context, null);
    }

    private Bitmap kq(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Bitmap bitmapKq;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.dgq.fou.a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.rhi == null && (bitmapKq = kq(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.rhi = new BitmapShader(bitmapKq, tileMode, tileMode);
            float fMax = (bitmapKq.getWidth() == getWidth() && bitmapKq.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapKq.getWidth(), (getHeight() * 1.0f) / bitmapKq.getHeight());
            this.fou.setScale(fMax, fMax);
            this.rhi.setLocalMatrix(this.fou);
        }
        BitmapShader bitmapShader = this.rhi;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.kq.setShader(bitmapShader);
            canvas.drawRoundRect(this.csi, this.oq, this.bob, this.kq);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.csi.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i10, i11);
    }

    public void setXRound(int i10) {
        this.oq = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.bob = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.rhi = null;
    }

    public sns(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public sns(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.oq = 25;
        this.bob = 25;
        this.csi = new RectF();
        Paint paint = new Paint();
        this.kq = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.fou = new Matrix();
    }
}
