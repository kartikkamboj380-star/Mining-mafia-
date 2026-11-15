package com.bytedance.sdk.component.adexpress.rhi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class nb extends FrameLayout {
    private static final int dgq = (com.bytedance.sdk.component.adexpress.dynamic.csi.ubx.oq("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 1;
    private static final int nn = (com.bytedance.sdk.component.adexpress.dynamic.csi.ubx.oq("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 3;
    private float bob;
    private Drawable csi;
    private float fou;
    LinearLayout kq;
    LinearLayout oq;
    private Drawable rhi;
    private double rjo;
    private float syt;

    public nb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.kq = new LinearLayout(getContext());
        this.oq = new LinearLayout(getContext());
        this.kq.setOrientation(0);
        this.kq.setGravity(8388611);
        this.oq.setOrientation(0);
        this.oq.setGravity(8388611);
        this.csi = com.bytedance.sdk.component.utils.uml.bob(context, "tt_star_thick");
        this.rhi = com.bytedance.sdk.component.utils.uml.bob(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.bob, (int) this.fou));
        imageView.setPadding(1, dgq, 1, nn);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.csi;
    }

    public Drawable getStarFillDrawable() {
        return this.rhi;
    }

    public void kq(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.bob = (int) com.bytedance.sdk.component.adexpress.fou.rjo.bob(getContext(), f10);
        this.fou = (int) com.bytedance.sdk.component.adexpress.fou.rjo.bob(getContext(), f10);
        this.rjo = d10;
        this.syt = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.oq.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.kq.addView(starImageView2);
        }
        addView(this.kq);
        addView(this.oq);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.kq.measure(i10, i11);
        double d10 = this.rjo;
        float f10 = this.bob;
        this.oq.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((int) d10) * f10) + 1.0f)) + (((double) (f10 - 2.0f)) * (d10 - ((double) ((int) d10))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.kq.getMeasuredHeight(), 1073741824));
        if (this.syt > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            LinearLayout linearLayout = this.kq;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.syt)) / 2, 0, 0);
            this.oq.setPadding(0, ((int) (this.kq.getMeasuredHeight() - this.syt)) / 2, 0, 0);
        }
    }
}
