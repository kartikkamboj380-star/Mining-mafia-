package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class mxq extends FrameLayout {
    private uml bob;
    private boolean csi;
    private AnimatorSet fou;
    private Context kq;
    private ImageView oq;
    private TextView rhi;

    public mxq(@NonNull Context context) {
        super(context);
        this.csi = true;
        this.kq = context;
        this.fou = new AnimatorSet();
        bob();
        fou();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.mxq.1
            @Override // java.lang.Runnable
            public void run() {
                int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.kq, 50.0f);
                int iKq2 = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.kq, 50.0f);
                if (mxq.this.bob.getMeasuredHeight() > 0) {
                    iKq = mxq.this.bob.getMeasuredHeight();
                }
                if (mxq.this.bob.getMeasuredWidth() > 0) {
                    iKq2 = mxq.this.bob.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mxq.this.oq.getLayoutParams();
                layoutParams.topMargin = ((int) ((iKq / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.kq, 40.0f));
                layoutParams.leftMargin = ((int) ((iKq2 / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.kq, 20.0f));
                layoutParams.bottomMargin = (int) (((-iKq) / 2.0f) + com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-iKq2) / 2.0f) + com.bytedance.sdk.component.adexpress.fou.rjo.kq(mxq.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                mxq.this.oq.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.rhi.setVisibility(0);
        this.rhi.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.rhi.setTextColor(i10);
    }

    private void bob() {
        this.bob = new uml(this.kq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 50.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 40.0f);
        int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 20.0f);
        layoutParams.leftMargin = iKq;
        layoutParams.setMarginStart(iKq);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.bob, layoutParams);
        this.oq = new ImageView(this.kq);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 78.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 78.0f));
        this.oq.setImageResource(com.bytedance.sdk.component.utils.uml.fou(this.kq, "tt_splash_hand"));
        addView(this.oq, layoutParams2);
        TextView textView = new TextView(this.kq);
        this.rhi = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 10.0f);
        addView(this.rhi, layoutParams3);
        this.rhi.setVisibility(8);
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.oq, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.mxq.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (mxq.this.csi) {
                    mxq.this.bob.kq();
                }
                mxq mxqVar = mxq.this;
                mxqVar.csi = !mxqVar.csi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mxq.this.oq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                mxq.this.oq.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.oq, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.fou.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void oq() {
        AnimatorSet animatorSet = this.fou;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        uml umlVar = this.bob;
        if (umlVar != null) {
            umlVar.oq();
        }
        ImageView imageView = this.oq;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void kq() {
        this.fou.start();
    }
}
