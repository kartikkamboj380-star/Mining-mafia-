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
public class suf extends FrameLayout {
    private fou bob;
    private boolean csi;
    private AnimatorSet fou;
    private Context kq;
    private ImageView oq;
    private TextView rhi;

    public suf(@NonNull Context context) {
        super(context);
        this.csi = true;
        this.kq = context;
        this.fou = new AnimatorSet();
        bob();
        fou();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.suf.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) suf.this.oq.getLayoutParams();
                layoutParams.topMargin = ((int) ((suf.this.bob.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(suf.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(suf.this.kq, 20.0f));
                layoutParams.leftMargin = ((int) ((suf.this.bob.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(suf.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(suf.this.kq, 20.0f));
                layoutParams.bottomMargin = (int) (((-suf.this.bob.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.fou.rjo.kq(suf.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-suf.this.bob.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.fou.rjo.kq(suf.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                suf.this.oq.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.rhi.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.rhi.setTextColor(i10);
    }

    private void bob() {
        this.bob = new fou(this.kq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 80.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 20.0f);
        int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 20.0f);
        layoutParams.leftMargin = iKq;
        layoutParams.setMarginStart(iKq);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.bob, layoutParams);
        this.bob.kq();
        this.oq = new ImageView(this.kq);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 80.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 80.0f));
        this.oq.setImageResource(com.bytedance.sdk.component.utils.uml.fou(this.kq, "tt_splash_hand"));
        addView(this.oq, layoutParams2);
        TextView textView = new TextView(this.kq);
        this.rhi = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 10.0f);
        addView(this.rhi, layoutParams3);
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.oq, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.suf.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (suf.this.csi) {
                    suf.this.bob.kq();
                    suf.this.bob.setAlpha(1.0f);
                } else {
                    suf.this.bob.oq();
                    suf.this.bob.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                suf sufVar = suf.this;
                sufVar.csi = !sufVar.csi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(suf.this.oq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                suf.this.oq.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.oq, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.fou.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void oq() {
        AnimatorSet animatorSet = this.fou;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fou fouVar = this.bob;
        if (fouVar != null) {
            fouVar.oq();
        }
    }

    public void kq() {
        this.fou.start();
    }
}
