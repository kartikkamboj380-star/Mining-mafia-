package com.bytedance.adsdk.ugeno.dgq.rhi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.fou;
import com.bytedance.adsdk.ugeno.kq.rjo;
import com.bytedance.adsdk.ugeno.kq.syt;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class kq extends TextView implements IAnimation, rjo {
    private syt bob;
    private float csi;
    private float fou;
    private fou kq;
    private float oq;
    private float rhi;
    private float rjo;

    public kq(Context context) {
        super(context);
        this.fou = -1.0f;
        this.rhi = 1.0f;
        this.rjo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bob = new syt(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.oq(canvas);
        }
    }

    public float getBorderRadius() {
        return this.bob.kq();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.kq.rjo
    public float getRipple() {
        return this.oq;
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getRubIn() {
        return this.bob.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getShine() {
        return this.bob.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.kq.rjo
    public float getStretch() {
        return this.bob.getStretch();
    }

    public void kq(fou fouVar) {
        this.kq = fouVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.kq(canvas, this);
            this.kq.kq(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.kq(i10, i11, i12, i13);
        }
        if (z9 && this.fou > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kq(((i12 - i10) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i13 - i11) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        fou fouVar = this.kq;
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
        fou fouVar = this.kq;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.bob.kq(i10);
    }

    public void setBorderRadius(float f10) {
        syt sytVar = this.bob;
        if (sytVar != null) {
            sytVar.kq(f10);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f10, float f11) {
        super.setLineSpacing(f10, f11);
        this.rhi = f11;
        this.rjo = f10;
    }

    public void setMinTextSize(float f10) {
        this.fou = f10;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.oq = f10;
        syt sytVar = this.bob;
        if (sytVar != null) {
            sytVar.oq(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        syt sytVar = this.bob;
        if (sytVar != null) {
            sytVar.csi(f10);
        }
    }

    public void setShine(float f10) {
        syt sytVar = this.bob;
        if (sytVar != null) {
            sytVar.bob(f10);
        }
    }

    public void setStretch(float f10) {
        syt sytVar = this.bob;
        if (sytVar != null) {
            sytVar.fou(f10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        this.csi = getTextSize();
    }

    private void kq(int i10, int i11) {
        CharSequence text = getText();
        if (text == null || text.length() == 0 || i11 <= 0 || i10 <= 0 || this.csi == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        TextPaint paint = getPaint();
        float fMax = this.csi;
        int iKq = kq(text, paint, i10, fMax);
        while (iKq > i11 && fMax > this.fou) {
            Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.fou);
            fMax = Math.max(fMax - 1.0f, this.fou);
            iKq = kq(text, paint, i10, fMax);
        }
        Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
        setTextSize(0, fMax);
        setLineSpacing(this.rjo, this.rhi);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        this.csi = getTextSize();
    }

    private int kq(CharSequence charSequence, TextPaint textPaint, int i10, float f10) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f10);
        return new StaticLayout(charSequence, textPaint2, i10, Layout.Alignment.ALIGN_NORMAL, this.rhi, this.rjo, true).getHeight();
    }
}
