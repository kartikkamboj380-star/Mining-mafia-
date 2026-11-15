package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class fou extends View {
    private float bob;
    private float csi;
    private List<Integer> dgq;
    private int fou;
    private int kq;
    private Paint nn;
    private int oq;
    private int rhi;
    private boolean rjo;
    private int suf;
    private List<Integer> syt;
    private Paint ubx;
    private float vvw;
    private float wki;

    public fou(Context context) {
        this(context, null);
    }

    private void bob() {
        Paint paint = new Paint();
        this.nn = paint;
        paint.setAntiAlias(true);
        this.nn.setStrokeWidth(this.suf);
        this.syt.add(255);
        this.dgq.add(0);
        Paint paint2 = new Paint();
        this.ubx = paint2;
        paint2.setAntiAlias(true);
        this.ubx.setColor(Color.parseColor("#0FFFFFFF"));
        this.ubx.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void kq() {
        this.rjo = true;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.nn.setShader(new LinearGradient(this.vvw, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.wki, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.syt.size()) {
                break;
            }
            Integer num = this.syt.get(i10);
            this.nn.setAlpha(num.intValue());
            Integer num2 = this.dgq.get(i10);
            if (this.bob + num2.intValue() < this.csi) {
                canvas.drawCircle(this.vvw, this.wki, this.bob + num2.intValue(), this.nn);
            }
            if (num.intValue() > 0 && num2.intValue() < this.csi) {
                this.syt.set(i10, Integer.valueOf(num.intValue() - this.rhi > 0 ? num.intValue() - (this.rhi * 3) : 1));
                this.dgq.set(i10, Integer.valueOf(num2.intValue() + this.rhi));
            }
            i10++;
        }
        List<Integer> list = this.dgq;
        if (list.get(list.size() - 1).intValue() >= this.csi / this.fou) {
            this.syt.add(255);
            this.dgq.add(0);
        }
        if (this.dgq.size() >= 3) {
            this.dgq.remove(0);
            this.syt.remove(0);
        }
        this.nn.setAlpha(255);
        this.nn.setColor(this.oq);
        canvas.drawCircle(this.vvw, this.wki, this.bob, this.ubx);
        if (this.rjo) {
            invalidate();
        }
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
        float f10 = i10 / 2.0f;
        this.vvw = f10;
        this.wki = i11 / 2.0f;
        float f11 = f10 - (this.suf / 2.0f);
        this.csi = f11;
        this.bob = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            invalidate();
        }
    }

    public void oq() {
        this.rjo = false;
        this.dgq.clear();
        this.syt.clear();
        this.syt.add(255);
        this.dgq.add(0);
        invalidate();
    }

    public void setColor(int i10) {
        this.kq = i10;
    }

    public void setCoreColor(int i10) {
        this.oq = i10;
    }

    public void setCoreRadius(int i10) {
        this.bob = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.rhi = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.fou = i10;
    }

    public void setMaxWidth(int i10) {
        this.csi = i10;
    }

    public fou(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public fou(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.kq = -1;
        this.oq = -65536;
        this.bob = 18.0f;
        this.fou = 3;
        this.csi = 50.0f;
        this.rhi = 2;
        this.rjo = false;
        this.syt = new ArrayList();
        this.dgq = new ArrayList();
        this.suf = 24;
        bob();
    }
}
