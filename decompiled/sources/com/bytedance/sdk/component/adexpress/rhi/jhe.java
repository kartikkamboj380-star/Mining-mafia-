package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class jhe extends RelativeLayout {
    private ImageView bob;
    private TextView csi;
    private AnimatorSet dgq;
    private TextView fou;
    private ImageView kq;
    private String nn;
    private ImageView oq;
    private AnimatorSet rhi;
    private AnimatorSet rjo;
    private AnimatorSet syt;
    private int ubx;

    public jhe(Context context) {
        super(context);
        this.rhi = new AnimatorSet();
        this.rjo = new AnimatorSet();
        this.syt = new AnimatorSet();
        this.dgq = new AnimatorSet();
        this.ubx = 100;
        kq(context);
    }

    public void bob() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.kq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.kq, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.kq, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), -this.ubx));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), this.ubx));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.jhe.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (jhe.this.bob != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) jhe.this.bob.getLayoutParams();
                    layoutParams.height = num.intValue();
                    jhe.this.bob.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.bob, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.bob, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.oq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.oq, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.oq, "scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.oq, "scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.oq, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), -this.ubx));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f));
        this.rjo.setDuration(50L);
        this.dgq.setDuration(1500L);
        this.syt.setDuration(50L);
        this.rjo.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.syt.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.dgq.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.rhi.playSequentially(this.syt, this.dgq, this.rjo);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.rhi;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oq();
    }

    public void setGuideText(String str) {
        TextView textView = this.fou;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.csi != null) {
            if (TextUtils.isEmpty(str)) {
                this.csi.setText("");
            } else {
                this.csi.setText(str);
            }
        }
    }

    protected void kq(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.fou.kq();
        }
        if ("5".equals(this.nn)) {
            addView(com.bytedance.sdk.component.adexpress.bob.kq.rhi(context));
            this.ubx = (int) (((double) this.ubx) * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.bob.kq.csi(context));
        }
        this.kq = (ImageView) findViewById(2097610734);
        this.oq = (ImageView) findViewById(2097610735);
        this.fou = (TextView) findViewById(2097610730);
        this.bob = (ImageView) findViewById(2097610733);
        this.csi = (TextView) findViewById(2097610731);
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
            AnimatorSet animatorSet3 = this.rjo;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.dgq;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public jhe(Context context, String str) {
        super(context);
        this.rhi = new AnimatorSet();
        this.rjo = new AnimatorSet();
        this.syt = new AnimatorSet();
        this.dgq = new AnimatorSet();
        this.ubx = 100;
        setClipChildren(false);
        this.nn = str;
        kq(context);
    }

    public void kq() {
        bob();
        this.rhi.start();
        this.rhi.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.rhi.jhe.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                jhe.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.jhe.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jhe.this.rhi.start();
                    }
                }, 200L);
            }
        });
    }
}
