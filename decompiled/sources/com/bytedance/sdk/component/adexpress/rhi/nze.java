package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class nze extends FrameLayout {
    private uml bob;
    private boolean csi;
    private AnimatorSet fou;
    private Context kq;
    private ImageView oq;

    public nze(@NonNull Context context) {
        super(context);
        this.csi = true;
        this.kq = context;
        this.fou = new AnimatorSet();
        bob();
        fou();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.rhi.nze.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nze.this.oq.getLayoutParams();
                layoutParams.topMargin = (int) ((nze.this.bob.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(nze.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((nze.this.bob.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.fou.rjo.kq(nze.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (((-nze.this.bob.getMeasuredHeight()) / 2.0f) + com.bytedance.sdk.component.adexpress.fou.rjo.kq(nze.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) (((-nze.this.bob.getMeasuredWidth()) / 2.0f) + com.bytedance.sdk.component.adexpress.fou.rjo.kq(nze.this.getContext(), 5.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                nze.this.oq.setLayoutParams(layoutParams);
            }
        });
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.oq, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.rhi.nze.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (nze.this.csi) {
                    nze.this.bob.kq();
                }
                nze nzeVar = nze.this;
                nzeVar.csi = !nzeVar.csi;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(nze.this.oq, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                nze.this.oq.setVisibility(0);
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.oq, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.fou.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void bob() {
        this.bob = new uml(this.kq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 40.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.bob, layoutParams);
        this.oq = new ImageView(this.kq);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 62.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 62.0f));
        layoutParams2.gravity = 16;
        this.oq.setImageResource(com.bytedance.sdk.component.utils.uml.fou(this.kq, "tt_splash_hand"));
        addView(this.oq, layoutParams2);
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
