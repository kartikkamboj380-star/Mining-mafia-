package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class dgq extends View {
    private final RectF bob;
    private Paint csi;
    private Paint fou;
    private int kq;
    private int oq;
    private int rhi;
    private Paint rjo;
    private int syt;

    public dgq(Context context) {
        super(context);
        this.bob = new RectF();
        kq();
    }

    private void kq() {
        Paint paint = new Paint();
        this.fou = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.rjo = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.csi = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.bob;
        int i10 = this.rhi;
        canvas.drawRoundRect(rectF, i10, i10, this.csi);
        RectF rectF2 = this.bob;
        int i11 = this.rhi;
        canvas.drawRoundRect(rectF2, i11, i11, this.fou);
        int i12 = this.kq;
        int i13 = this.oq;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.rjo);
        int i14 = this.kq;
        int i15 = this.oq;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.rjo);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.kq = i10;
        this.oq = i11;
        RectF rectF = this.bob;
        int i14 = this.syt;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.csi.setStyle(Paint.Style.FILL);
        this.csi.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.rjo.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.rjo.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.rhi = i10;
    }

    public void setStrokeColor(int i10) {
        this.fou.setStyle(Paint.Style.STROKE);
        this.fou.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.fou.setStrokeWidth(i10);
        this.syt = i10;
    }
}
