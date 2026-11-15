package com.google.android.material.appbar;

import O.AbstractC0845c0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes2.dex */
abstract class d extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f38672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f38673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f38678j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f38679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f38680b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f38679a = coordinatorLayout;
            this.f38680b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f38680b == null || (overScroller = d.this.f38673e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.N(this.f38679a, this.f38680b);
                return;
            }
            d dVar = d.this;
            dVar.P(this.f38679a, this.f38680b, dVar.f38673e.getCurrY());
            AbstractC0845c0.e0(this.f38680b, this);
        }
    }

    public d() {
        this.f38675g = -1;
        this.f38677i = -1;
    }

    private void I() {
        if (this.f38678j == null) {
            this.f38678j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f38678j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f38678j.computeCurrentVelocity(1000);
                J(coordinatorLayout, view, -L(view), 0, this.f38678j.getYVelocity(this.f38675g));
                z9 = true;
            }
            this.f38674f = false;
            this.f38675g = -1;
            velocityTracker = this.f38678j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f38678j = null;
            }
            velocityTracker2 = this.f38678j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f38674f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f38675g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f38676h - y9;
            this.f38676h = y9;
            O(coordinatorLayout, view, i10, K(view), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f38675g = motionEvent.getPointerId(i11);
                this.f38676h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z9 = false;
        velocityTracker2 = this.f38678j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f38674f || z9;
        z9 = false;
        this.f38674f = false;
        this.f38675g = -1;
        velocityTracker = this.f38678j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38678j = null;
        }
        velocityTracker2 = this.f38678j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f38674f) {
        }
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f38672d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f38672d = null;
        }
        if (this.f38673e == null) {
            this.f38673e = new OverScroller(view.getContext());
        }
        this.f38673e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f38673e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f38672d = aVar;
        AbstractC0845c0.e0(view, aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, LinearLayoutManager.INVALID_OFFSET, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f38677i < 0) {
            this.f38677i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f38674f) {
            int i10 = this.f38675g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y9 - this.f38676h) > this.f38677i) {
                this.f38676h = y9;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f38675g = -1;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            boolean z9 = H(view) && coordinatorLayout.C(view, x10, y10);
            this.f38674f = z9;
            if (z9) {
                this.f38676h = y10;
                this.f38675g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f38673e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f38673e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f38678j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38675g = -1;
        this.f38677i = -1;
    }
}
