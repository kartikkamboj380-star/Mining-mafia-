package com.bytedance.adsdk.ugeno.dgq.fou;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class oq extends Drawable {
    private final RectF bob;
    private final Paint csi;
    private final Paint dgq;
    private ImageView.ScaleType fax;
    private final Bitmap fou;
    private ColorStateList gm;
    private final boolean[] mxq;
    private final Matrix nn;
    private float nze;
    private final int rhi;
    private final int rjo;
    private boolean sns;
    private boolean suf;
    private final RectF syt;
    private final RectF ubx;
    private Shader.TileMode vvw;
    private float wcx;
    private Shader.TileMode wki;
    private final RectF kq = new RectF();
    private final RectF oq = new RectF();

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.dgq.fou.oq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            kq = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kq[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kq[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kq[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kq[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public oq(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.bob = rectF;
        this.syt = new RectF();
        this.nn = new Matrix();
        this.ubx = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.vvw = tileMode;
        this.wki = tileMode;
        this.suf = true;
        this.nze = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.mxq = new boolean[]{true, true, true, true};
        this.sns = false;
        this.wcx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gm = ColorStateList.valueOf(-16777216);
        this.fax = ImageView.ScaleType.FIT_CENTER;
        this.fou = bitmap;
        int width = bitmap.getWidth();
        this.rhi = width;
        int height = bitmap.getHeight();
        this.rjo = height;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height);
        Paint paint = new Paint();
        this.csi = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.dgq = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.gm.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.wcx);
    }

    public static oq kq(Bitmap bitmap) {
        if (bitmap != null) {
            return new oq(bitmap);
        }
        return null;
    }

    public static Bitmap oq(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.suf) {
            BitmapShader bitmapShader = new BitmapShader(this.fou, this.vvw, this.wki);
            Shader.TileMode tileMode = this.vvw;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.wki == tileMode2) {
                bitmapShader.setLocalMatrix(this.nn);
            }
            this.csi.setShader(bitmapShader);
            this.suf = false;
        }
        if (this.sns) {
            if (this.wcx <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawOval(this.oq, this.csi);
                return;
            } else {
                canvas.drawOval(this.oq, this.csi);
                canvas.drawOval(this.syt, this.dgq);
                return;
            }
        }
        if (!kq(this.mxq)) {
            canvas.drawRect(this.oq, this.csi);
            if (this.wcx > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                canvas.drawRect(this.syt, this.dgq);
                return;
            }
            return;
        }
        float f10 = this.nze;
        if (this.wcx <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            canvas.drawRoundRect(this.oq, f10, f10, this.csi);
            kq(canvas);
        } else {
            canvas.drawRoundRect(this.oq, f10, f10, this.csi);
            canvas.drawRoundRect(this.syt, f10, f10, this.dgq);
            kq(canvas);
            oq(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.csi.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.csi.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.rjo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.rhi;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.gm.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.kq.set(rect);
        kq();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.gm.getColorForState(iArr, 0);
        if (this.dgq.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.dgq.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.csi.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.csi.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        this.csi.setDither(z9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        this.csi.setFilterBitmap(z9);
        invalidateSelf();
    }

    public static Drawable kq(Drawable drawable) {
        if (drawable != null) {
            if (drawable instanceof oq) {
                return drawable;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                return drawable;
            }
            if (drawable instanceof LayerDrawable) {
                Drawable.ConstantState constantState = drawable.mutate().getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable.setDrawableByLayerId(layerDrawable.getId(i10), kq(layerDrawable.getDrawable(i10)));
                }
                return layerDrawable;
            }
        }
        Bitmap bitmapOq = oq(drawable);
        return bitmapOq != null ? new oq(bitmapOq) : drawable;
    }

    private void oq(Canvas canvas) {
        float f10;
        float f11;
        if (oq(this.mxq) || this.nze == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.oq;
        float f12 = rectF.left;
        float f13 = rectF.top;
        float fWidth = rectF.width() + f12;
        float fHeight = f13 + this.oq.height();
        float f14 = this.nze;
        float f15 = this.wcx / 2.0f;
        if (this.mxq[0]) {
            f10 = f13;
        } else {
            f10 = f13;
            canvas.drawLine(f12 - f15, f13, f12 + f14, f10, this.dgq);
            canvas.drawLine(f12, f10 - f15, f12, f10 + f14, this.dgq);
        }
        if (!this.mxq[1]) {
            float f16 = f10;
            canvas.drawLine((fWidth - f14) - f15, f16, fWidth, f10, this.dgq);
            canvas.drawLine(fWidth, f16 - f15, fWidth, f16 + f14, this.dgq);
            fWidth = fWidth;
        }
        if (this.mxq[2]) {
            f11 = fHeight;
        } else {
            canvas.drawLine((fWidth - f14) - f15, fHeight, fWidth + f15, fHeight, this.dgq);
            float f17 = fWidth;
            canvas.drawLine(f17, fHeight - f14, fWidth, fHeight, this.dgq);
            f11 = fHeight;
        }
        if (this.mxq[3]) {
            return;
        }
        canvas.drawLine(f12 - f15, f11, f12 + f14, f11, this.dgq);
        canvas.drawLine(f12, f11 - f14, f12, f11, this.dgq);
    }

    private void kq() {
        float fWidth;
        float fHeight;
        int i10 = AnonymousClass1.kq[this.fax.ordinal()];
        if (i10 == 1) {
            this.syt.set(this.kq);
            RectF rectF = this.syt;
            float f10 = this.wcx;
            rectF.inset(f10 / 2.0f, f10 / 2.0f);
            this.nn.reset();
            this.nn.setTranslate((int) (((this.syt.width() - this.rhi) * 0.5f) + 0.5f), (int) (((this.syt.height() - this.rjo) * 0.5f) + 0.5f));
        } else if (i10 == 2) {
            this.syt.set(this.kq);
            RectF rectF2 = this.syt;
            float f11 = this.wcx;
            rectF2.inset(f11 / 2.0f, f11 / 2.0f);
            this.nn.reset();
            float fHeight2 = this.rhi * this.syt.height();
            float fWidth2 = this.syt.width() * this.rjo;
            float fWidth3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (fHeight2 > fWidth2) {
                fWidth = this.syt.height() / this.rjo;
                fHeight = 0.0f;
                fWidth3 = (this.syt.width() - (this.rhi * fWidth)) * 0.5f;
            } else {
                fWidth = this.syt.width() / this.rhi;
                fHeight = (this.syt.height() - (this.rjo * fWidth)) * 0.5f;
            }
            this.nn.setScale(fWidth, fWidth);
            Matrix matrix = this.nn;
            float f12 = this.wcx;
            matrix.postTranslate(((int) (fWidth3 + 0.5f)) + (f12 / 2.0f), ((int) (fHeight + 0.5f)) + (f12 / 2.0f));
        } else if (i10 == 3) {
            this.nn.reset();
            float fMin = (((float) this.rhi) > this.kq.width() || ((float) this.rjo) > this.kq.height()) ? Math.min(this.kq.width() / this.rhi, this.kq.height() / this.rjo) : 1.0f;
            float fWidth4 = (int) (((this.kq.width() - (this.rhi * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.kq.height() - (this.rjo * fMin)) * 0.5f) + 0.5f);
            this.nn.setScale(fMin, fMin);
            this.nn.postTranslate(fWidth4, fHeight3);
            this.syt.set(this.bob);
            this.nn.mapRect(this.syt);
            RectF rectF3 = this.syt;
            float f13 = this.wcx;
            rectF3.inset(f13 / 2.0f, f13 / 2.0f);
            this.nn.setRectToRect(this.bob, this.syt, Matrix.ScaleToFit.FILL);
        } else if (i10 == 5) {
            this.syt.set(this.bob);
            this.nn.setRectToRect(this.bob, this.kq, Matrix.ScaleToFit.END);
            this.nn.mapRect(this.syt);
            RectF rectF4 = this.syt;
            float f14 = this.wcx;
            rectF4.inset(f14 / 2.0f, f14 / 2.0f);
            this.nn.setRectToRect(this.bob, this.syt, Matrix.ScaleToFit.FILL);
        } else if (i10 == 6) {
            this.syt.set(this.bob);
            this.nn.setRectToRect(this.bob, this.kq, Matrix.ScaleToFit.START);
            this.nn.mapRect(this.syt);
            RectF rectF5 = this.syt;
            float f15 = this.wcx;
            rectF5.inset(f15 / 2.0f, f15 / 2.0f);
            this.nn.setRectToRect(this.bob, this.syt, Matrix.ScaleToFit.FILL);
        } else if (i10 != 7) {
            this.syt.set(this.bob);
            this.nn.setRectToRect(this.bob, this.kq, Matrix.ScaleToFit.CENTER);
            this.nn.mapRect(this.syt);
            RectF rectF6 = this.syt;
            float f16 = this.wcx;
            rectF6.inset(f16 / 2.0f, f16 / 2.0f);
            this.nn.setRectToRect(this.bob, this.syt, Matrix.ScaleToFit.FILL);
        } else {
            this.syt.set(this.kq);
            RectF rectF7 = this.syt;
            float f17 = this.wcx;
            rectF7.inset(f17 / 2.0f, f17 / 2.0f);
            this.nn.reset();
            this.nn.setRectToRect(this.bob, this.syt, Matrix.ScaleToFit.FILL);
        }
        this.oq.set(this.syt);
        this.suf = true;
    }

    public oq oq(Shader.TileMode tileMode) {
        if (this.wki != tileMode) {
            this.wki = tileMode;
            this.suf = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean oq(boolean[] zArr) {
        for (boolean z9 : zArr) {
            if (z9) {
                return false;
            }
        }
        return true;
    }

    private void kq(Canvas canvas) {
        if (oq(this.mxq) || this.nze == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        RectF rectF = this.oq;
        float f10 = rectF.left;
        float f11 = rectF.top;
        float fWidth = rectF.width() + f10;
        float fHeight = this.oq.height() + f11;
        float f12 = this.nze;
        if (!this.mxq[0]) {
            this.ubx.set(f10, f11, f10 + f12, f11 + f12);
            canvas.drawRect(this.ubx, this.csi);
        }
        if (!this.mxq[1]) {
            this.ubx.set(fWidth - f12, f11, fWidth, f12);
            canvas.drawRect(this.ubx, this.csi);
        }
        if (!this.mxq[2]) {
            this.ubx.set(fWidth - f12, fHeight - f12, fWidth, fHeight);
            canvas.drawRect(this.ubx, this.csi);
        }
        if (this.mxq[3]) {
            return;
        }
        this.ubx.set(f10, fHeight - f12, f12 + f10, fHeight);
        canvas.drawRect(this.ubx, this.csi);
    }

    public oq kq(float f10, float f11, float f12, float f13) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f10));
        hashSet.add(Float.valueOf(f11));
        hashSet.add(Float.valueOf(f12));
        hashSet.add(Float.valueOf(f13));
        hashSet.remove(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue) && fFloatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.nze = fFloatValue;
                } else {
                    throw new IllegalArgumentException("Invalid radius value: ".concat(String.valueOf(fFloatValue)));
                }
            } else {
                this.nze = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            boolean[] zArr = this.mxq;
            zArr[0] = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[1] = f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[2] = f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            zArr[3] = f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    public oq kq(float f10) {
        this.wcx = f10;
        this.dgq.setStrokeWidth(f10);
        return this;
    }

    public oq kq(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.gm = colorStateList;
        this.dgq.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public oq kq(boolean z9) {
        this.sns = z9;
        return this;
    }

    public oq kq(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.fax != scaleType) {
            this.fax = scaleType;
            kq();
        }
        return this;
    }

    public oq kq(Shader.TileMode tileMode) {
        if (this.vvw != tileMode) {
            this.vvw = tileMode;
            this.suf = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean kq(boolean[] zArr) {
        for (boolean z9 : zArr) {
            if (z9) {
                return true;
            }
        }
        return false;
    }
}
