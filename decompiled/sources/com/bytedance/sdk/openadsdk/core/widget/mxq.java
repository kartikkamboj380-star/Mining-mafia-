package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class mxq extends View {
    private int bob;
    private Drawable csi;
    private Drawable fou;
    private final Path kq;
    private final boolean oq;
    private float rhi;

    public mxq(Context context) {
        this(context, false);
    }

    private void kq() {
        Context context = getContext();
        this.fou = uml.bob(context, this.oq ? "tt_star_thick_dark" : "tt_star_thick");
        this.csi = uml.bob(context, "tt_star");
    }

    private void oq() {
        int width = getWidth();
        int height = getHeight();
        if (this.rhi <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || width <= 0 || height <= 0) {
            return;
        }
        this.kq.reset();
        this.kq.addRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width * this.rhi, height), Path.Direction.CCW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.bob <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.fou.draw(canvas);
            canvas.translate(this.bob, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.kq);
        for (int i11 = 0; i11 < 5; i11++) {
            this.csi.draw(canvas);
            canvas.translate(this.bob, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.bob * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.bob, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        oq();
    }

    public mxq(Context context, boolean z9) {
        super(context);
        this.kq = new Path();
        this.oq = z9;
        kq();
    }

    public void kq(double d10, int i10) {
        int iKq = (int) bss.kq(getContext(), i10, false);
        this.bob = iKq;
        this.fou.setBounds(0, 0, iKq, iKq);
        Drawable drawable = this.csi;
        int i11 = this.bob;
        drawable.setBounds(0, 0, i11, i11);
        this.rhi = ((float) d10) / 5.0f;
        oq();
        requestLayout();
    }
}
