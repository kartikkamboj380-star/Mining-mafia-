package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class csi extends fou {
    public csi(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        super(view, kqVar);
    }

    private void bob(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), this.oq.fax())).setDuration((int) (this.oq.nn() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kq.csi.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                csi.this.bob.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(kq(duration));
    }

    private void fou(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), this.oq.fax())).setDuration((int) (this.oq.nn() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(kq(duration));
    }

    private void oq(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), this.oq.fax())).setDuration((int) (this.oq.nn() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kq.csi.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                csi.this.bob.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(kq(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou
    List<ObjectAnimator> kq() {
        byte b10;
        ArrayList arrayList = new ArrayList();
        switch (this.oq.mq()) {
            case "both":
                b10 = 0;
                break;
            case "none":
                b10 = 3;
                break;
            case "forwards":
                b10 = 1;
                break;
            case "backwards":
                b10 = 2;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            kq(arrayList);
            return arrayList;
        }
        if (b10 == 1) {
            fou(arrayList);
            return arrayList;
        }
        if (b10 != 2) {
            bob(arrayList);
            return arrayList;
        }
        oq(arrayList);
        return arrayList;
    }

    private void kq(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.bob, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -com.bytedance.sdk.component.adexpress.fou.rjo.kq(com.bytedance.sdk.component.adexpress.fou.kq(), this.oq.fax())).setDuration(((int) (this.oq.nn() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar = this.oq;
        kqVar.rhi(kqVar.nze() * 2);
        list.add(kq(duration));
    }
}
