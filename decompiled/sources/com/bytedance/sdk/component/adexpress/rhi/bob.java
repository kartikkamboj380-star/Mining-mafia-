package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.fgm;

/* JADX INFO: loaded from: classes.dex */
public class bob extends FrameLayout {
    private ImageView bob;
    private sns csi;
    private TextView fou;
    private Context kq;
    private ImageView oq;
    private AnimatorSet rhi;

    public bob(@NonNull Context context) {
        super(context);
        this.rhi = new AnimatorSet();
        this.kq = context;
        csi();
        rhi();
    }

    private void csi() {
        FrameLayout frameLayout = new FrameLayout(this.kq);
        this.csi = new sns(this.kq);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 95.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.csi, layoutParams);
        this.oq = new ImageView(this.kq);
        int iKq = fgm.kq(this.kq, 60.0f);
        this.oq.setImageDrawable(com.bytedance.sdk.component.adexpress.fou.syt.kq(1, null, null, new int[]{iKq, iKq}, Integer.valueOf(fgm.kq(this.kq, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 75.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.oq, layoutParams2);
        this.bob = new ImageView(this.kq);
        int iKq2 = fgm.kq(this.kq, 50.0f);
        this.bob.setImageDrawable(com.bytedance.sdk.component.adexpress.fou.syt.kq(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iKq2, iKq2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 63.0f), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.kq, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.bob, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.kq);
        this.fou = textView;
        textView.setTextColor(-1);
        this.fou.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.fou, layoutParams4);
    }

    private void rhi() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.bob, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.bob, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.rhi.setDuration(800L);
        this.rhi.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void bob() {
        this.csi.kq();
    }

    public void fou() {
        this.csi.oq();
        this.csi.bob();
    }

    public void kq() {
        this.rhi.start();
    }

    public void oq() {
        this.rhi.cancel();
    }

    public void setGuideText(String str) {
        this.fou.setText(str);
    }
}
