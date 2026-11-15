package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class oq extends FrameLayout {
    private boolean bob;
    private View csi;
    private int dgq;
    private View fou;
    private AnimatorSet kq;
    private Context nn;
    private ObjectAnimator oq;
    private View rhi;
    private ImageView rjo;
    private int syt;

    public oq(Context context, int i10, int i11) {
        super(context);
        this.bob = false;
        this.kq = new AnimatorSet();
        this.syt = i10;
        this.dgq = i11;
        this.nn = context;
        bob();
        fou();
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.fou, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.fou, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.csi, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.csi, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.rhi, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.rhi, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.rjo, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.oq = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.kq.setDuration(1500L);
        this.kq.setInterpolator(new AccelerateDecelerateInterpolator());
        this.kq.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.kq.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.oq.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                oq.this.bob = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (oq.this.bob) {
                    return;
                }
                oq.this.oq.start();
                oq.this.kq.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void bob() {
        View view = new View(this.nn);
        this.fou = view;
        view.setBackground(kq("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (((double) this.syt) * 0.45d), (int) (((double) this.dgq) * 0.45d));
        layoutParams.gravity = 17;
        this.fou.setLayoutParams(layoutParams);
        addView(this.fou);
        View view2 = new View(this.nn);
        this.csi = view2;
        view2.setBackground(kq("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) this.syt) * 0.25d), (int) (((double) this.dgq) * 0.25d));
        layoutParams2.gravity = 17;
        this.csi.setLayoutParams(layoutParams2);
        addView(this.csi);
        View view3 = new View(this.nn);
        this.rhi = view3;
        view3.setBackground(kq("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.syt;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (((double) i10) * 0.25d), (int) (((double) i10) * 0.25d));
        layoutParams3.gravity = 17;
        this.rhi.setLayoutParams(layoutParams3);
        addView(this.rhi);
        ImageView imageView = new ImageView(this.nn);
        this.rjo = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.uml.fou(getContext(), "tt_blue_hand"));
        this.rjo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (((double) this.syt) * 0.62d), (int) (((double) this.dgq) * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.rjo.setLayoutParams(layoutParams4);
        addView(this.rjo);
    }

    public void oq() {
        this.bob = true;
        ObjectAnimator objectAnimator = this.oq;
        if (objectAnimator == null || this.kq == null) {
            return;
        }
        objectAnimator.cancel();
        this.kq.cancel();
    }

    private GradientDrawable kq(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void kq() {
        this.bob = false;
        ObjectAnimator objectAnimator = this.oq;
        if (objectAnimator == null || this.kq == null) {
            return;
        }
        objectAnimator.start();
        this.kq.start();
    }
}
