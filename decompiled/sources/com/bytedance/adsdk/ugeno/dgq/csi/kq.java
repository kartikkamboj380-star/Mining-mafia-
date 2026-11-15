package com.bytedance.adsdk.ugeno.dgq.csi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.fou;
import com.bytedance.adsdk.ugeno.rjo.syt;

/* JADX INFO: loaded from: classes.dex */
public class kq extends FrameLayout {
    private double bob;
    private LinearLayout csi;
    private float fou;
    private float kq;
    private float oq;
    private LinearLayout rhi;
    private Context rjo;
    private fou syt;

    public kq(Context context) {
        super(context);
        this.rjo = context;
        this.csi = new LinearLayout(context);
        this.rhi = new LinearLayout(context);
        this.csi.setOrientation(0);
        this.csi.setGravity(8388611);
        this.rhi.setOrientation(0);
        this.rhi.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.kq, (int) this.oq);
        float f10 = this.fou;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void kq(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.csi.removeAllViews();
        this.rhi.removeAllViews();
        this.kq = (int) syt.kq(this.rjo, f10);
        this.oq = (int) syt.kq(this.rjo, f10);
        this.bob = d10;
        this.fou = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.rjo.fou.oq(this.rjo, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.rhi.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.rjo.fou.oq(this.rjo, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.csi.addView(starImageView2);
        }
        addView(this.csi);
        addView(this.rhi);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fou fouVar = this.syt;
        if (fouVar != null) {
            fouVar.rjo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fou fouVar = this.syt;
        if (fouVar != null) {
            fouVar.syt();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        fou fouVar = this.syt;
        if (fouVar != null) {
            fouVar.kq(i10, i11, i12, i13);
        }
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        fou fouVar = this.syt;
        if (fouVar != null) {
            fouVar.kq(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.csi.measure(i10, i11);
        double dFloor = Math.floor(this.bob);
        float f10 = this.fou;
        float f11 = this.kq;
        this.rhi.measure(View.MeasureSpec.makeMeasureSpec((int) ((((double) (f10 + f10 + f11)) * dFloor) + ((double) f10) + ((this.bob - dFloor) * ((double) f11))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.csi.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        fou fouVar = this.syt;
        if (fouVar != null) {
            fouVar.oq(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
    }

    public void kq(fou fouVar) {
        this.syt = fouVar;
    }
}
