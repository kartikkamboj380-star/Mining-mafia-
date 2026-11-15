package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class mq extends FrameLayout {
    private ImageView bob;
    private TextView csi;
    private AnimatorSet dgq;
    private ImageView fou;
    private Context kq;
    private ImageView oq;
    private AnimatorSet rhi;
    private AnimatorSet rjo;
    private AnimatorSet syt;

    public mq(@NonNull Context context) {
        super(context);
        this.rhi = new AnimatorSet();
        this.rjo = new AnimatorSet();
        this.syt = new AnimatorSet();
        this.dgq = new AnimatorSet();
        this.kq = context;
        bob();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.csi.setText(str);
    }

    private void bob() {
        ImageView imageView = new ImageView(this.kq);
        this.fou = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.uml.fou(this.kq, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 30.0f);
        addView(this.fou, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.kq);
        this.bob = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.uml.fou(this.kq, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 50.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 30.0f);
        addView(this.bob, layoutParams2);
        ImageView imageView3 = new ImageView(this.kq);
        this.oq = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.uml.fou(this.kq, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 80.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 30.0f);
        addView(this.oq, layoutParams3);
        TextView textView = new TextView(this.kq);
        this.csi = textView;
        textView.setTextColor(-1);
        this.csi.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.csi, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.mq.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) mq.this.oq.getLayoutParams();
                layoutParams5.topMargin = (int) ((mq.this.bob.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(mq.this.getContext(), 7.0f));
                int iKq = (-mq.this.bob.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(mq.this.kq, 30.0f));
                layoutParams5.leftMargin = iKq;
                layoutParams5.setMarginStart(iKq);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                mq.this.oq.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) mq.this.fou.getLayoutParams();
                layoutParams6.topMargin = (int) ((mq.this.bob.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(mq.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((mq.this.bob.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(mq.this.kq, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                mq.this.fou.setLayoutParams(layoutParams6);
            }
        });
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.oq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.bob, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.bob, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.fou, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.syt.setDuration(300L);
        this.syt.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.oq, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.mq.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mq.this.fou.getLayoutParams();
                layoutParams.width = num.intValue();
                mq.this.fou.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.bob, "translationX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.dgq.setDuration(1500L);
        this.dgq.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.oq, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.fou, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.bob, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.rjo.setDuration(50L);
        this.rjo.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.rhi.playSequentially(this.syt, this.dgq, this.rjo);
    }

    public void kq() {
        fou();
        this.rhi.start();
        this.rhi.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.rhi.mq.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                mq.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.mq.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        mq.this.rhi.start();
                    }
                }, 200L);
            }
        });
    }

    public void oq() {
        try {
            AnimatorSet animatorSet = this.rhi;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.syt;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.dgq;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.rjo;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }
}
