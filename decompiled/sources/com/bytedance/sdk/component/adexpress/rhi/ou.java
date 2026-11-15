package com.bytedance.sdk.component.adexpress.rhi;

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
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class ou extends ImageView {
    private int bob;
    private Matrix fou;
    private Paint kq;
    private int oq;

    public ou(Context context) {
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
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.dgq.fou.a.a(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapKq = kq(drawable);
        if (bitmapKq == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapKq, tileMode, tileMode);
        float fMax = (bitmapKq.getWidth() == getWidth() && bitmapKq.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapKq.getWidth(), (getHeight() * 1.0f) / bitmapKq.getHeight());
        this.fou.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.fou);
        this.kq.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight()), this.oq, this.bob, this.kq);
    }

    public void setXRound(int i10) {
        this.oq = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.bob = i10;
        postInvalidate();
    }

    public ou(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ou(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.oq = 25;
        this.bob = 25;
        Paint paint = new Paint();
        this.kq = paint;
        paint.setAntiAlias(true);
        this.kq.setFilterBitmap(true);
        this.fou = new Matrix();
    }
}
