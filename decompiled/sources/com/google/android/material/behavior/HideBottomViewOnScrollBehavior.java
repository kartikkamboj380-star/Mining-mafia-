package com.google.android.material.behavior;

import F5.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p070h.w;

/* JADX INFO: loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f38697j = p186s5.a.f48594G;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f38698k = p186s5.a.f48596I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f38699l = p186s5.a.f48601N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f38700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f38703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f38704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewPropertyAnimator f38708i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f38708i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f38700a = new LinkedHashSet();
        this.f38705f = 0;
        this.f38706g = 2;
        this.f38707h = 0;
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f38708i = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void M(View view, int i10) {
        this.f38706g = i10;
        Iterator it = this.f38700a.iterator();
        if (it.hasNext()) {
            w.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f38706g == 1;
    }

    public boolean H() {
        return this.f38706g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z9) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f38708i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i10 = this.f38705f + this.f38707h;
        if (z9) {
            F(view, i10, this.f38702c, this.f38704e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z9) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f38708i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z9) {
            F(view, 0, this.f38701b, this.f38703d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f38705f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f38701b = d.f(view.getContext(), f38697j, 225);
        this.f38702c = d.f(view.getContext(), f38698k, 175);
        Context context = view.getContext();
        int i11 = f38699l;
        this.f38703d = d.g(context, i11, p196t5.a.f49673d);
        this.f38704e = d.g(view.getContext(), i11, p196t5.a.f49672c);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38700a = new LinkedHashSet();
        this.f38705f = 0;
        this.f38706g = 2;
        this.f38707h = 0;
    }
}
