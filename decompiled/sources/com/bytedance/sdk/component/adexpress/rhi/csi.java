package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class csi extends FrameLayout {
    private ImageView kq;
    private AnimatorSet oq;

    public csi(Context context) {
        super(context);
        bob();
        fou();
    }

    private void bob() {
        ImageView imageView = new ImageView(getContext());
        this.kq = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.uml.fou(getContext(), "tt_white_hand"));
        int iKq = (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iKq, iKq);
        layoutParams.gravity = 17;
        addView(this.kq, layoutParams);
    }

    private void fou() {
        this.oq = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.kq, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.kq, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.oq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void kq() {
        AnimatorSet animatorSet = this.oq;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public void oq() {
        AnimatorSet animatorSet = this.oq;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
