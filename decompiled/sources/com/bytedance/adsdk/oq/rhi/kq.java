package com.bytedance.adsdk.oq.rhi;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> kq = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> oq = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> bob = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.oq.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.bob.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.kq.add(animatorUpdateListener);
    }

    void bob() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.kq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    void csi() {
        Iterator<Animator.AnimatorPauseListener> it = this.bob.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    void fou() {
        Iterator<Animator.AnimatorPauseListener> it = this.bob.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void kq(boolean z9) {
        for (Animator.AnimatorListener animatorListener : this.oq) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z9);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    void oq(boolean z9) {
        for (Animator.AnimatorListener animatorListener : this.oq) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z9);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.oq.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.kq.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.oq.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.bob.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.kq.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    void kq() {
        Iterator<Animator.AnimatorListener> it = this.oq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void oq() {
        Iterator<Animator.AnimatorListener> it = this.oq.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }
}
