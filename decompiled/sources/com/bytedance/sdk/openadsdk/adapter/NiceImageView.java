package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.sdk.openadsdk.core.rhi.fou;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class NiceImageView extends fou {
    private boolean bob;
    private int csi;
    private int dgq;
    private RectF fax;
    private int fou;
    private final float[] gm;
    private final Paint jhe;
    private final Context kq;
    private final RectF mq;
    private int mxq;
    private Path nb;
    private int nn;
    private int nze;
    private boolean oq;
    private int rhi;
    private int rjo;
    private float sns;
    private final Xfermode suf;
    private int syt;
    private int ubx;
    private final Path uml;
    private int vvw;
    private final float[] wcx;
    private int wki;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void bob() {
        if (this.oq) {
            return;
        }
        int i10 = 0;
        if (this.syt <= 0) {
            float[] fArr = this.wcx;
            int i11 = this.dgq;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.nn;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.vvw;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.ubx;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.gm;
            int i15 = this.fou;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.wcx;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.syt;
            fArr3[i10] = i16;
            this.gm[i10] = i16 - (this.fou / 2.0f);
            i10++;
        }
    }

    private void fou() {
        if (this.oq) {
            return;
        }
        this.rhi = 0;
    }

    private void kq(Canvas canvas) {
        if (!this.oq) {
            int i10 = this.fou;
            if (i10 > 0) {
                kq(canvas, i10, this.csi, this.mq, this.wcx);
                return;
            }
            return;
        }
        int i11 = this.fou;
        if (i11 > 0) {
            kq(canvas, i11, this.csi, this.sns - (i11 / 2.0f));
        }
        int i12 = this.rhi;
        if (i12 > 0) {
            kq(canvas, i12, this.rjo, (this.sns - this.fou) - (i12 / 2.0f));
        }
    }

    private void oq() {
        if (!this.oq) {
            this.fax.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.nze, this.mxq);
            if (this.bob) {
                this.fax = this.mq;
                return;
            }
            return;
        }
        float fMin = Math.min(this.nze, this.mxq) / 2.0f;
        this.sns = fMin;
        RectF rectF = this.fax;
        int i10 = this.nze;
        int i11 = this.mxq;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    public void isCircle(boolean z9) {
        this.oq = z9;
        fou();
        oq();
        invalidate();
    }

    public void isCoverSrc(boolean z9) {
        this.bob = z9;
        oq();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.saveLayer(this.fax, null, 31);
        if (!this.bob) {
            int i10 = this.nze;
            int i11 = this.fou;
            int i12 = this.rhi;
            int i13 = this.mxq;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.jhe.reset();
        this.uml.reset();
        if (this.oq) {
            this.uml.addCircle(this.nze / 2.0f, this.mxq / 2.0f, this.sns, Path.Direction.CCW);
        } else {
            this.uml.addRoundRect(this.fax, this.gm, Path.Direction.CCW);
        }
        this.jhe.setAntiAlias(true);
        this.jhe.setStyle(Paint.Style.FILL);
        this.jhe.setXfermode(this.suf);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.uml, this.jhe);
        } else {
            this.nb.addRect(this.fax, Path.Direction.CCW);
            this.nb.op(this.uml, Path.Op.DIFFERENCE);
            canvas.drawPath(this.nb, this.jhe);
        }
        this.jhe.setXfermode(null);
        int i14 = this.wki;
        if (i14 != 0) {
            this.jhe.setColor(i14);
            canvas.drawPath(this.uml, this.jhe);
        }
        canvas.restore();
        kq(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.nze = i10;
        this.mxq = i11;
        kq();
        oq();
    }

    public void setBorderColor(int i10) {
        this.csi = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.fou = bss.oq(this.kq, i10);
        kq(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.ubx = bss.oq(this.kq, i10);
        kq(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.vvw = bss.oq(this.kq, i10);
        kq(true);
    }

    public void setCornerRadius(int i10) {
        this.syt = bss.oq(this.kq, i10);
        kq(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.dgq = bss.oq(this.kq, i10);
        kq(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.nn = bss.oq(this.kq, i10);
        kq(true);
    }

    public void setInnerBorderColor(int i10) {
        this.rjo = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.rhi = bss.oq(this.kq, i10);
        fou();
        invalidate();
    }

    public void setMaskColor(int i10) {
        this.wki = i10;
        invalidate();
    }

    public NiceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.csi = -1;
        this.rjo = -1;
        this.kq = context;
        this.syt = bss.oq(context, 10.0f);
        this.wcx = new float[8];
        this.gm = new float[8];
        this.mq = new RectF();
        this.fax = new RectF();
        this.jhe = new Paint();
        this.uml = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.suf = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.suf = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.nb = new Path();
        }
        bob();
        fou();
    }

    private void kq(Canvas canvas, int i10, int i11, float f10) {
        kq(i10, i11);
        this.uml.addCircle(this.nze / 2.0f, this.mxq / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.uml, this.jhe);
    }

    private void kq(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        kq(i10, i11);
        this.uml.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.uml, this.jhe);
    }

    private void kq(int i10, int i11) {
        this.uml.reset();
        this.jhe.setStrokeWidth(i10);
        this.jhe.setColor(i11);
        this.jhe.setStyle(Paint.Style.STROKE);
    }

    private void kq() {
        if (this.oq) {
            return;
        }
        RectF rectF = this.mq;
        int i10 = this.fou;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.nze - (i10 / 2.0f), this.mxq - (i10 / 2.0f));
    }

    private void kq(boolean z9) {
        if (z9) {
            this.syt = 0;
        }
        bob();
        kq();
        invalidate();
    }
}
