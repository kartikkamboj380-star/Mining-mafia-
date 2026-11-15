package com.bytedance.sdk.component.adexpress.rhi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends jhe {
    private AnimatorSet bob;
    private TextView kq;
    private View oq;

    public rjo(Context context) {
        super(context);
        this.bob = new AnimatorSet();
        oq(context);
    }

    private void fou() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.oq, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.sdk.component.adexpress.fou.rjo.kq(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.oq, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.bob.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.bob.setDuration(1000L);
        this.bob.start();
    }

    private void oq(Context context) {
        View viewKq = com.bytedance.sdk.component.adexpress.bob.kq.kq(context);
        this.oq = viewKq;
        addView(viewKq);
        setClipChildren(false);
        this.kq = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.jhe
    protected void kq(Context context) {
    }

    public void setButtonText(String str) {
        if (this.kq == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.kq.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.jhe
    public void kq() {
        fou();
    }

    @Override // com.bytedance.sdk.component.adexpress.rhi.jhe
    public void oq() {
        this.bob.cancel();
    }
}
