package com.bytedance.sdk.component.adexpress.dynamic.animation.kq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class fou implements xn {
    public View bob;
    private Set<ScheduledFuture<?>> fou = new HashSet();
    public List<ObjectAnimator> kq = kq();
    com.bytedance.sdk.component.adexpress.dynamic.fou.kq oq;

    public class kq implements Runnable {
        ObjectAnimator kq;
        ScheduledFuture<?> oq;

        kq(ObjectAnimator objectAnimator) {
            this.kq = objectAnimator;
        }

        public void kq(ScheduledFuture<?> scheduledFuture) {
            this.oq = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob() != null) {
                com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob().bob().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou.kq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        kq.this.kq.resume();
                    }
                });
                if (this.oq != null) {
                    fou.this.fou.remove(this.oq);
                }
            }
        }
    }

    public fou(View view, com.bytedance.sdk.component.adexpress.dynamic.fou.kq kqVar) {
        this.bob = view;
        this.oq = kqVar;
    }

    public void bob() {
        List<ObjectAnimator> list = this.kq;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.oq.sns() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        kq kqVar = fou.this.new kq(objectAnimator);
                        ScheduledFuture<?> scheduledFutureKq = com.bytedance.sdk.component.adexpress.fou.fou.kq(kqVar, (long) (fou.this.oq.sns() * 1000.0d), TimeUnit.MILLISECONDS);
                        kqVar.kq(scheduledFutureKq);
                        fou.this.fou.add(scheduledFutureKq);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    abstract List<ObjectAnimator> kq();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xn
    public void oq() {
        List<ObjectAnimator> list = this.kq;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.fou.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator kq(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.oq.suf() * 1000.0d));
        if (this.oq.nze() > 0) {
            objectAnimator.setRepeatCount(this.oq.nze() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.oq.mxq())) {
            if ("alternate".equals(this.oq.mxq()) || "alternate-reverse".equals(this.oq.mxq())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.oq.wki())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.oq.mxq())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.oq.mxq())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.kq.fou.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    fou.this.bob.setVisibility(0);
                    if (fou.this.bob.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi) {
                        ((View) fou.this.bob.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
