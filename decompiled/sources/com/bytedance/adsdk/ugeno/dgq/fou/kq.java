package com.bytedance.adsdk.ugeno.dgq.fou;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.fou;
import com.bytedance.adsdk.ugeno.kq.rjo;
import com.bytedance.adsdk.ugeno.kq.syt;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq extends ImageView implements IAnimation, rjo {
    static final /* synthetic */ boolean oq = true;
    private float bob;
    private final float[] csi;
    private ColorFilter dgq;
    private fou fax;
    private Shader.TileMode gm;
    private syt mq;
    private int mxq;
    private boolean nn;
    private int nze;
    private Drawable rhi;
    private ColorStateList rjo;
    private ImageView.ScaleType sns;
    private boolean suf;
    private float syt;
    private Drawable ubx;
    private boolean vvw;
    private Shader.TileMode wcx;
    private boolean wki;
    public static final Shader.TileMode kq = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] fou = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.dgq.fou.kq$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            kq = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kq[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kq[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kq[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kq[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public kq(Context context) {
        super(context);
        this.csi = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.rjo = ColorStateList.valueOf(-16777216);
        this.syt = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.dgq = null;
        this.nn = false;
        this.vvw = false;
        this.wki = false;
        this.suf = false;
        Shader.TileMode tileMode = kq;
        this.wcx = tileMode;
        this.gm = tileMode;
        this.mq = new syt(this);
    }

    private void bob() {
        kq(this.ubx, this.sns);
    }

    private void fou() {
        Drawable drawable = this.ubx;
        if (drawable == null || !this.nn) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.ubx = drawableMutate;
        if (this.vvw) {
            drawableMutate.setColorFilter(this.dgq);
        }
    }

    private Drawable kq() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.nze;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.nze, e10);
                this.nze = 0;
            }
        }
        return oq.kq(drawable);
    }

    private Drawable oq() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i10 = this.mxq;
        if (i10 != 0) {
            try {
                drawable = resources.getDrawable(i10);
            } catch (Exception e10) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.mxq, e10);
                this.mxq = 0;
            }
        }
        return oq.kq(drawable);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fou fouVar = this.fax;
        if (fouVar != null) {
            fouVar.oq(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.rjo.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.rjo;
    }

    public float getBorderRadius() {
        return this.mq.kq();
    }

    public float getBorderWidth() {
        return this.syt;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float[] fArr = this.csi;
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (float f10 : fArr) {
            fMax = Math.max(f10, fMax);
        }
        return fMax;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.kq.rjo
    public float getRipple() {
        return this.bob;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getRubIn() {
        return this.mq.getRubIn();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.sns;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getShine() {
        return this.mq.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getStretch() {
        return this.mq.getStretch();
    }

    public Shader.TileMode getTileModeX() {
        return this.wcx;
    }

    public Shader.TileMode getTileModeY() {
        return this.gm;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fou fouVar = this.fax;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fou fouVar = this.fax;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fou fouVar = this.fax;
        if (fouVar != null) {
            fouVar.kq(canvas, this);
            this.fax.kq(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        fou fouVar = this.fax;
        if (fouVar != null) {
            fouVar.kq(i10, i11, i12, i13);
        }
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        fou fouVar = this.fax;
        if (fouVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrKq = fouVar.kq(i10, i11);
            super.onMeasure(iArrKq[0], iArrKq[1]);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        fou fouVar = this.fax;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i12);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        ColorDrawable colorDrawable = new ColorDrawable(i10);
        this.rhi = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.rhi = drawable;
        kq(true);
        super.setBackgroundDrawable(this.rhi);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (this.mxq != i10) {
            this.mxq = i10;
            Drawable drawableOq = oq();
            this.rhi = drawableOq;
            setBackgroundDrawable(drawableOq);
        }
    }

    public void setBorderColor(int i10) {
        setBorderColor(ColorStateList.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        syt sytVar = this.mq;
        if (sytVar != null) {
            sytVar.kq(f10);
        }
    }

    public void setBorderWidth(int i10) {
        setBorderWidth(getResources().getDimension(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.dgq != colorFilter) {
            this.dgq = colorFilter;
            this.vvw = true;
            this.nn = true;
            fou();
            invalidate();
        }
    }

    public void setCornerRadius(float f10) {
        kq(f10, f10, f10, f10);
    }

    public void setCornerRadiusDimen(int i10) {
        float dimension = getResources().getDimension(i10);
        kq(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.nze = 0;
        this.ubx = oq.kq(bitmap);
        bob();
        super.setImageDrawable(this.ubx);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.nze = 0;
        this.ubx = oq.kq(drawable);
        bob();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (this.nze != i10) {
            this.nze = i10;
            this.ubx = kq();
            bob();
            super.setImageDrawable(this.ubx);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z9) {
        this.wki = z9;
        bob();
        kq(false);
        invalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.bob = f10;
        syt sytVar = this.mq;
        if (sytVar != null) {
            sytVar.oq(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        syt sytVar = this.mq;
        if (sytVar != null) {
            sytVar.csi(f10);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!oq && scaleType == null) {
            throw new AssertionError();
        }
        if (this.sns != scaleType) {
            this.sns = scaleType;
            int i10 = AnonymousClass1.kq[scaleType.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                super.setScaleType(scaleType);
            } else {
                super.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            bob();
            kq(false);
            invalidate();
        }
    }

    public void setShine(float f10) {
        syt sytVar = this.mq;
        if (sytVar != null) {
            sytVar.bob(f10);
        }
    }

    public void setStretch(float f10) {
        syt sytVar = this.mq;
        if (sytVar != null) {
            sytVar.fou(f10);
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.wcx == tileMode) {
            return;
        }
        this.wcx = tileMode;
        bob();
        kq(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.gm == tileMode) {
            return;
        }
        this.gm = tileMode;
        bob();
        kq(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.rjo.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.rjo = colorStateList;
        bob();
        kq(false);
        if (this.syt > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            invalidate();
        }
    }

    public void setBorderWidth(float f10) {
        if (this.syt == f10) {
            return;
        }
        this.syt = f10;
        bob();
        kq(false);
        invalidate();
    }

    private void kq(boolean z9) {
        if (this.suf) {
            if (z9) {
                this.rhi = oq.kq(this.rhi);
            }
            kq(this.rhi, ImageView.ScaleType.FIT_XY);
        }
    }

    private void kq(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof oq) {
            oq oqVar = (oq) drawable;
            oqVar.kq(scaleType).kq(this.syt).kq(this.rjo).kq(this.wki).kq(this.wcx).oq(this.gm);
            float[] fArr = this.csi;
            if (fArr != null) {
                oqVar.kq(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            fou();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                kq(layerDrawable.getDrawable(i10), scaleType);
            }
        }
    }

    public void kq(float f10, float f11, float f12, float f13) {
        float[] fArr = this.csi;
        if (fArr[0] == f10 && fArr[1] == f11 && fArr[2] == f13 && fArr[3] == f12) {
            return;
        }
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[3] = f12;
        fArr[2] = f13;
        bob();
        kq(false);
        invalidate();
    }

    public void kq(fou fouVar) {
        this.fax = fouVar;
    }
}
