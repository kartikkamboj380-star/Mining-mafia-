package com.google.android.material.appbar;

import O.AbstractC0845c0;
import O.C0;
import O.C0840a;
import O.E;
import O.J;
import P.A;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.m;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p070h.w;
import p186s5.j;
import p186s5.k;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final int f38610Q = j.f48838h;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ValueAnimator f38611G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f38612H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final List f38613I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final long f38614J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final TimeInterpolator f38615K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int[] f38616L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Drawable f38617M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Integer f38618N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float f38619O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Behavior f38620P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0 f38627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f38628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f38632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38633m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private WeakReference f38634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f38635w;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f38636k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f38637l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f38638m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private c f38639n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference f38640o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f38641a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f38642b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f38641a = coordinatorLayout;
                this.f38642b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f38641a, this.f38642b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C0840a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f38644d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f38645e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f38644d = appBarLayout;
                this.f38645e = coordinatorLayout;
            }

            @Override // O.C0840a
            public void g(View view, A a10) {
                View viewF0;
                super.g(view, a10);
                a10.q0(ScrollView.class.getName());
                if (this.f38644d.getTotalScrollRange() == 0 || (viewF0 = BaseBehavior.this.f0(this.f38645e)) == null || !BaseBehavior.this.b0(this.f38644d)) {
                    return;
                }
                if (BaseBehavior.this.M() != (-this.f38644d.getTotalScrollRange())) {
                    a10.b(A.a.f4622q);
                    a10.L0(true);
                }
                if (BaseBehavior.this.M() != 0) {
                    if (!viewF0.canScrollVertically(-1)) {
                        a10.b(A.a.f4623r);
                        a10.L0(true);
                    } else if ((-this.f38644d.getDownNestedPreScrollRange()) != 0) {
                        a10.b(A.a.f4623r);
                        a10.L0(true);
                    }
                }
            }

            @Override // O.C0840a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f38644d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.M() != 0) {
                    View viewF0 = BaseBehavior.this.f0(this.f38645e);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f38644d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f38644d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.q(this.f38645e, this.f38644d, viewF0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (AbstractC0845c0.M(coordinatorLayout)) {
                return;
            }
            AbstractC0845c0.m0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(M() - i10);
            float fAbs = Math.abs(f10);
            W(coordinatorLayout, appBarLayout, i10, fAbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iM = M();
            if (iM == i10) {
                ValueAnimator valueAnimator = this.f38638m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f38638m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f38638m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f38638m = valueAnimator3;
                valueAnimator3.setInterpolator(p196t5.a.f49674e);
                this.f38638m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f38638m.setDuration(Math.min(i11, 600));
            this.f38638m.setIntValues(iM, i10);
            this.f38638m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f38655a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof E) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    if (interpolatorD == null) {
                        break;
                    }
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= AbstractC0845c0.A(childAt);
                        }
                    }
                    if (AbstractC0845c0.w(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset <= 0) {
                        break;
                    }
                    float f10 = topInset;
                    return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listT = coordinatorLayout.t(appBarLayout);
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) ((View) listT.get(i10)).getLayoutParams()).e();
                if (cVarE instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarE).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iA = -childAt.getBottom();
                    if (iE0 == 0 && AbstractC0845c0.w(appBarLayout) && AbstractC0845c0.w(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iA += AbstractC0845c0.A(childAt);
                    } else if (a0(iC, 5)) {
                        int iA2 = AbstractC0845c0.A(childAt) + iA;
                        if (iM < iA2) {
                            topInset2 = iA2;
                        } else {
                            iA = iA2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        iA -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, I.a.b(X(iM, iA, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z9) {
            View viewD0 = d0(appBarLayout, i10);
            boolean z10 = false;
            if (viewD0 != null) {
                int iC = ((d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iA = AbstractC0845c0.A(viewD0);
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewD0.getBottom() - iA) - appBarLayout.getTopInset()) : (-i10) >= (viewD0.getBottom() - iA) - appBarLayout.getTopInset()) {
                        z10 = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                z10 = appBarLayout.z(c0(coordinatorLayout));
            }
            boolean zW = appBarLayout.w(z10);
            if (z9 || (zW && v0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        int M() {
            return E() + this.f38636k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f38640o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.w(appBarLayout.z(c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zL = super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            c cVar = this.f38639n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z9 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z9) {
                            V(coordinatorLayout, appBarLayout, i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            P(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z9) {
                            V(coordinatorLayout, appBarLayout, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cVar.f38647c) {
                P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (cVar.f38648d) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(cVar.f38649e);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f38639n.f38651g ? AbstractC0845c0.A(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f38639n.f38650f)));
            }
            appBarLayout.s();
            this.f38639n = null;
            G(I.a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            x0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.q(E());
            U(coordinatorLayout, appBarLayout);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.L(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            AppBarLayout appBarLayout2;
            int i13;
            int downNestedPreScrollRange;
            if (i11 == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i11 < 0) {
                    i13 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i13 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i14 = i13;
                int i15 = downNestedPreScrollRange;
                if (i14 != i15) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = O(coordinatorLayout, appBarLayout2, i11, i14, i15);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.o()) {
                appBarLayout2.w(appBarLayout2.z(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = O(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                U(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof c) {
                s0((c) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f38639n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f38639n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            c cVarT0 = t0(parcelableY, appBarLayout);
            return cVarT0 == null ? parcelableY : cVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z9 = (i10 & 2) != 0 && (appBarLayout.o() || Z(coordinatorLayout, appBarLayout, view));
            if (z9 && (valueAnimator = this.f38638m) != null) {
                valueAnimator.cancel();
            }
            this.f38640o = null;
            this.f38637l = i11;
            return z9;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f38637l == 0 || i10 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.w(appBarLayout.z(view));
                }
            }
            this.f38640o = new WeakReference(view);
        }

        void s0(c cVar, boolean z9) {
            if (this.f38639n == null || z9) {
                this.f38639n = cVar;
            }
        }

        c t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = T.a.f5539b;
                    }
                    c cVar = new c(parcelable);
                    boolean z9 = iE == 0;
                    cVar.f38648d = z9;
                    cVar.f38647c = !z9 && (-iE) >= appBarLayout.getTotalScrollRange();
                    cVar.f38649e = i10;
                    cVar.f38651g = bottom == AbstractC0845c0.A(childAt) + appBarLayout.getTopInset();
                    cVar.f38650f = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iM = M();
            int i13 = 0;
            if (i11 == 0 || iM < i11 || iM > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f38636k = 0;
            } else {
                int iB = I.a.b(i10, i11, i12);
                if (iM != iB) {
                    int iI0 = appBarLayout.i() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i14 = iM - iB;
                    this.f38636k = iB - iI0;
                    if (zG) {
                        while (i13 < appBarLayout.getChildCount()) {
                            d dVar = (d) appBarLayout.getChildAt(i13).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!zG && appBarLayout.i()) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.q(E());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    x0(coordinatorLayout2, appBarLayout2, iB, iB < iM ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            U(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends T.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            boolean f38647c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f38648d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f38649e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            float f38650f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            boolean f38651g;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f38647c = parcel.readByte() != 0;
                this.f38648d = parcel.readByte() != 0;
                this.f38649e = parcel.readInt();
                this.f38650f = parcel.readFloat();
                this.f38651g = parcel.readByte() != 0;
            }

            @Override // T.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f38647c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f38648d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f38649e);
                parcel.writeFloat(this.f38650f);
                parcel.writeByte(this.f38651g ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.f
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends e {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                return ((BaseBehavior) cVarE).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                AbstractC0845c0.X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarE).f38636k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.w(appBarLayout.z(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.e
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i10) + 1.0f;
                }
            }
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // com.google.android.material.appbar.e
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.e
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC0845c0.m0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.f, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.s(view));
            if (appBarLayoutH != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f38682d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.t(false, !z9);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f49235p5);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f49244q5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements J {
        a() {
        }

        @Override // O.J
        public C0 a(View view, C0 c10) {
            return AppBarLayout.this.r(c10);
        }
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f38653a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f38654b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f38653a, appBarLayout, view);
            float fAbs = this.f38653a.top - Math.abs(f10);
            if (fAbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                AbstractC0845c0.t0(view, null);
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setVisibility(0);
                return;
            }
            float fA = 1.0f - I.a.a(Math.abs(fAbs / this.f38653a.height()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            float fHeight = (-fAbs) - ((this.f38653a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f38654b);
            this.f38654b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f38654b.height()) {
                view.setVisibility(4);
            } else {
                view.setVisibility(0);
            }
            AbstractC0845c0.t0(view, this.f38654b);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private boolean A() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !AbstractC0845c0.w(childAt)) {
                return true;
            }
        }
        return false;
    }

    private void B(float f10, float f11) {
        ValueAnimator valueAnimator = this.f38611G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f38611G = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.f38614J);
        this.f38611G.setInterpolator(this.f38615K);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f38612H;
        if (animatorUpdateListener != null) {
            this.f38611G.addUpdateListener(animatorUpdateListener);
        }
        this.f38611G.start();
    }

    private void C() {
        setWillNotDraw(!y());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, K5.g gVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gVar.V(fFloatValue);
        Drawable drawable = appBarLayout.f38617M;
        if (drawable instanceof K5.g) {
            ((K5.g) drawable).V(fFloatValue);
        }
        Iterator it = appBarLayout.f38613I.iterator();
        if (it.hasNext()) {
            w.a(it.next());
            gVar.y();
            throw null;
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, ColorStateList colorStateList2, K5.g gVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iJ = p256z5.a.j(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        gVar.W(ColorStateList.valueOf(iJ));
        if (appBarLayout.f38617M != null && (num2 = appBarLayout.f38618N) != null && num2.equals(num)) {
            G.a.n(appBarLayout.f38617M, iJ);
        }
        if (appBarLayout.f38613I.isEmpty()) {
            return;
        }
        Iterator it = appBarLayout.f38613I.iterator();
        while (it.hasNext()) {
            w.a(it.next());
            if (gVar.v() != null) {
                throw null;
            }
        }
    }

    private void c() {
        WeakReference weakReference = this.f38634v;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f38634v = null;
    }

    private Integer d() {
        Drawable drawable = this.f38617M;
        if (drawable instanceof K5.g) {
            return Integer.valueOf(((K5.g) drawable).y());
        }
        ColorStateList colorStateListF = B5.d.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f38634v == null && (i10 = this.f38633m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f38633m);
            }
            if (viewFindViewById != null) {
                this.f38634v = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f38634v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(final K5.g gVar, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numF = p256z5.a.f(getContext(), p186s5.a.f48637s);
        this.f38612H = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f38665a, colorStateList, colorStateList2, gVar, numF, valueAnimator);
            }
        };
        AbstractC0845c0.q0(this, gVar);
    }

    private void m(Context context, final K5.g gVar) {
        gVar.L(context);
        this.f38612H = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f38670a, gVar, valueAnimator);
            }
        };
        AbstractC0845c0.q0(this, gVar);
    }

    private void n() {
        Behavior behavior = this.f38620P;
        BaseBehavior.c cVarT0 = (behavior == null || this.f38622b == -1 || this.f38626f != 0) ? null : behavior.t0(T.a.f5539b, this);
        this.f38622b = -1;
        this.f38623c = -1;
        this.f38624d = -1;
        if (cVarT0 != null) {
            this.f38620P.s0(cVarT0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof K5.g;
    }

    private void u(boolean z9, boolean z10, boolean z11) {
        this.f38626f = (z9 ? 1 : 2) | (z10 ? 4 : 0) | (z11 ? 8 : 0);
        requestLayout();
    }

    private boolean v(boolean z9) {
        if (this.f38630j == z9) {
            return false;
        }
        this.f38630j = z9;
        refreshDrawableState();
        return true;
    }

    private boolean y() {
        return this.f38617M != null && getTopInset() > 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (y()) {
            int iSave = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.f38621a);
            this.f38617M.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f38617M;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f38620P = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iA;
        int i10 = this.f38623c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f38655a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        iA = AbstractC0845c0.A(childAt);
                    } else {
                        if ((i12 & 2) != 0) {
                            iA = measuredHeight - AbstractC0845c0.A(childAt);
                        } else {
                            iMin = i13 + measuredHeight;
                        }
                        if (childCount == 0 && AbstractC0845c0.w(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + iA;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f38623c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f38624d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i12 = dVar.f38655a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight;
                if ((i12 & 2) != 0) {
                    iA -= AbstractC0845c0.A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iA);
        this.f38624d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f38633m;
    }

    public K5.g getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof K5.g) {
            return (K5.g) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iA = AbstractC0845c0.A(this);
        if (iA == 0) {
            int childCount = getChildCount();
            iA = childCount >= 1 ? AbstractC0845c0.A(getChildAt(childCount - 1)) : 0;
            if (iA == 0) {
                return getHeight() / 3;
            }
        }
        return (iA * 2) + topInset;
    }

    int getPendingAction() {
        return this.f38626f;
    }

    public Drawable getStatusBarForeground() {
        return this.f38617M;
    }

    @Deprecated
    public float getTargetElevation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    final int getTopInset() {
        C0 c10 = this.f38627g;
        if (c10 != null) {
            return c10.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f38622b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int iA = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f38655a;
                if ((i12 & 1) == 0) {
                    break;
                }
                iA += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i11 == 0 && AbstractC0845c0.w(childAt)) {
                    iA -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    iA -= AbstractC0845c0.A(childAt);
                    break;
                }
            }
        }
        int iMax = Math.max(0, iA);
        this.f38622b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean i() {
        return this.f38625e;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f38632l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        K5.h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.f38616L == null) {
            this.f38616L = new int[4];
        }
        int[] iArr = this.f38616L;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z9 = this.f38630j;
        int i11 = p186s5.a.f48613Z;
        if (!z9) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z9 && this.f38631k) ? p186s5.a.f48615a0 : -p186s5.a.f48615a0;
        int i12 = p186s5.a.f48610W;
        if (!z9) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z9 && this.f38631k) ? p186s5.a.f48609V : -p186s5.a.f48609V;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        boolean z10 = true;
        if (AbstractC0845c0.w(this) && A()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC0845c0.X(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f38625e = false;
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f38625e = true;
                break;
            }
        }
        Drawable drawable = this.f38617M;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f38629i) {
            return;
        }
        if (!this.f38632l && !j()) {
            z10 = false;
        }
        v(z10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && AbstractC0845c0.w(this) && A()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = I.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    void q(int i10) {
        this.f38621a = i10;
        if (!willNotDraw()) {
            AbstractC0845c0.d0(this);
        }
        List list = this.f38628h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                w.a(this.f38628h.get(i11));
            }
        }
    }

    C0 r(C0 c10) {
        C0 c11 = AbstractC0845c0.w(this) ? c10 : null;
        if (!N.b.a(this.f38627g, c11)) {
            this.f38627g = c11;
            C();
            requestLayout();
        }
        return c10;
    }

    void s() {
        this.f38626f = 0;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        K5.h.d(this, f10);
    }

    public void setExpanded(boolean z9) {
        t(z9, AbstractC0845c0.R(this));
    }

    public void setLiftOnScroll(boolean z9) {
        this.f38632l = z9;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f38633m = -1;
        if (view == null) {
            c();
        } else {
            this.f38634v = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f38633m = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z9) {
        this.f38629i = z9;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f38617M;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f38617M = drawable != null ? drawable.mutate() : null;
            this.f38618N = d();
            Drawable drawable3 = this.f38617M;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f38617M.setState(getDrawableState());
                }
                G.a.m(this.f38617M, AbstractC0845c0.z(this));
                this.f38617M.setVisible(getVisibility() == 0, false);
                this.f38617M.setCallback(this);
            }
            C();
            AbstractC0845c0.d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(p080i.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        h.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f38617M;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
    }

    public void t(boolean z9, boolean z10) {
        u(z9, z10, true);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f38617M;
    }

    boolean w(boolean z9) {
        return x(z9, !this.f38629i);
    }

    boolean x(boolean z9, boolean z10) {
        if (!z10 || this.f38631k == z9) {
            return false;
        }
        this.f38631k = z9;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        boolean z11 = this.f38635w;
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z11) {
            float f11 = z9 ? 0.0f : 1.0f;
            if (z9) {
                f10 = 1.0f;
            }
            B(f11, f10);
            return true;
        }
        if (!this.f38632l) {
            return true;
        }
        float f12 = z9 ? 0.0f : this.f38619O;
        if (z9) {
            f10 = this.f38619O;
        }
        B(f12, f10);
        return true;
    }

    boolean z(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p186s5.a.f48614a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f38610Q;
        super(N5.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f38622b = -1;
        this.f38623c = -1;
        this.f38624d = -1;
        this.f38626f = 0;
        this.f38613I = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i12 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            h.a(this);
        }
        h.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = m.i(context2, attributeSet, k.f49184k, i10, i11, new int[0]);
        AbstractC0845c0.q0(this, typedArrayI.getDrawable(k.f49193l));
        ColorStateList colorStateListA = H5.c.a(context2, typedArrayI, k.f49247r);
        this.f38635w = colorStateListA != null;
        ColorStateList colorStateListF = B5.d.f(getBackground());
        if (colorStateListF != null) {
            K5.g gVar = new K5.g();
            gVar.W(colorStateListF);
            if (colorStateListA != null) {
                l(gVar, colorStateListF, colorStateListA);
            } else {
                m(context2, gVar);
            }
        }
        this.f38614J = F5.d.f(context2, p186s5.a.f48595H, getResources().getInteger(p186s5.f.f48780a));
        this.f38615K = F5.d.g(context2, p186s5.a.f48605R, p196t5.a.f49670a);
        if (typedArrayI.hasValue(k.f49229p)) {
            u(typedArrayI.getBoolean(k.f49229p, false), false, false);
        }
        if (typedArrayI.hasValue(k.f49220o)) {
            h.b(this, typedArrayI.getDimensionPixelSize(k.f49220o, 0));
        }
        if (i12 >= 26) {
            if (typedArrayI.hasValue(k.f49211n)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(k.f49211n, false));
            }
            if (typedArrayI.hasValue(k.f49202m)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(k.f49202m, false));
            }
        }
        this.f38619O = getResources().getDimension(p186s5.c.f48678a);
        this.f38632l = typedArrayI.getBoolean(k.f49238q, false);
        this.f38633m = typedArrayI.getResourceId(k.f49256s, -1);
        setStatusBarForeground(typedArrayI.getDrawable(k.f49265t));
        typedArrayI.recycle();
        AbstractC0845c0.A0(this, new a());
    }

    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f38656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f38657c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f38655a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f49283v);
            this.f38655a = typedArrayObtainStyledAttributes.getInt(k.f49301x, 0);
            f(typedArrayObtainStyledAttributes.getInt(k.f49292w, 0));
            if (typedArrayObtainStyledAttributes.hasValue(k.f49310y)) {
                this.f38657c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(k.f49310y, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f38656b;
        }

        public int c() {
            return this.f38655a;
        }

        public Interpolator d() {
            return this.f38657c;
        }

        boolean e() {
            int i10 = this.f38655a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f38656b = a(i10);
        }

        public void g(int i10) {
            this.f38655a = i10;
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f38655a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f38655a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f38655a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f38655a = 1;
        }
    }
}
