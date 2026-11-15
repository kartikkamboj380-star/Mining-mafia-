package com.google.android.material.bottomsheet;

import K5.k;
import O.AbstractC0845c0;
import O.C0;
import P.A;
import P.D;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.internal.p;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p186s5.i;
import p186s5.j;

/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f38742i0 = j.f48840j;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f38743A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final h f38744B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f38745C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f38746D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f38747E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f38748F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    float f38749G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    int f38750H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    float f38751I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f38752J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f38753K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f38754L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f38755M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f38756N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    U.c f38757O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f38758P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f38759Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f38760R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f38761S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f38762T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f38763U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f38764V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    WeakReference f38765W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    WeakReference f38766X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    WeakReference f38767Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final ArrayList f38768Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38769a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private VelocityTracker f38770a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38771b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    F5.b f38772b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38773c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    int f38774c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38775d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f38776d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38777e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    boolean f38778e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38779f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private Map f38780f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38781g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    final SparseIntArray f38782g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38783h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final U.c.AbstractC0088c f38784h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private K5.g f38786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f38787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f38792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f38793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f38794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f38797u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f38798v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f38799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f38800x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f38801y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private k f38802z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f38803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38804b;

        a(View view, int i10) {
            this.f38803a = view;
            this.f38804b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.a1(this.f38803a, this.f38804b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f38786j != null) {
                BottomSheetBehavior.this.f38786j.X(fFloatValue);
            }
        }
    }

    class c implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f38807a;

        c(boolean z9) {
            this.f38807a = z9;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.p.c
        public C0 a(View view, C0 c10, p.d dVar) {
            boolean z9;
            F.b bVarF = c10.f(C0.l.g());
            F.b bVarF2 = c10.f(C0.l.d());
            BottomSheetBehavior.this.f38800x = bVarF.f651b;
            boolean zG = p.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f38792p) {
                BottomSheetBehavior.this.f38799w = c10.j();
                paddingBottom = dVar.f39333d + BottomSheetBehavior.this.f38799w;
            }
            if (BottomSheetBehavior.this.f38793q) {
                paddingLeft = (zG ? dVar.f39332c : dVar.f39330a) + bVarF.f650a;
            }
            if (BottomSheetBehavior.this.f38794r) {
                paddingRight = (zG ? dVar.f39330a : dVar.f39332c) + bVarF.f652c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z10 = true;
            if (BottomSheetBehavior.this.f38796t) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = bVarF.f650a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z9 = true;
                } else {
                    z9 = false;
                }
            } else {
                z9 = false;
            }
            if (BottomSheetBehavior.this.f38797u) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = bVarF.f652c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z9 = true;
                }
            }
            if (BottomSheetBehavior.this.f38798v) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = bVarF.f651b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z10 = z9;
                }
            } else {
                z10 = z9;
            }
            if (z10) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f38807a) {
                BottomSheetBehavior.this.f38790n = bVarF2.f653d;
            }
            if (!BottomSheetBehavior.this.f38792p && !this.f38807a) {
                return c10;
            }
            BottomSheetBehavior.this.f1(false);
            return c10;
        }
    }

    class d extends U.c.AbstractC0088c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f38809a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f38764V + bottomSheetBehavior.n0()) / 2;
        }

        @Override // U.c.AbstractC0088c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // U.c.AbstractC0088c
        public int b(View view, int i10, int i11) {
            return I.a.b(i10, BottomSheetBehavior.this.n0(), e(view));
        }

        @Override // U.c.AbstractC0088c
        public int e(View view) {
            return BottomSheetBehavior.this.f0() ? BottomSheetBehavior.this.f38764V : BottomSheetBehavior.this.f38750H;
        }

        @Override // U.c.AbstractC0088c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f38754L) {
                BottomSheetBehavior.this.T0(1);
            }
        }

        @Override // U.c.AbstractC0088c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.k0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        @Override // U.c.AbstractC0088c
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f38752J && bottomSheetBehavior.X0(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f38777e) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f38771b || Math.abs(view.getTop() - BottomSheetBehavior.this.n0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f38748F)) {
                        i10 = 3;
                    }
                } else if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f38771b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f38748F;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f38750H)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.Y0()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.f38750H) || BottomSheetBehavior.this.Y0()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f38747E) < Math.abs(top - BottomSheetBehavior.this.f38750H)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f38771b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f38748F) >= Math.abs(top2 - BottomSheetBehavior.this.f38750H) || BottomSheetBehavior.this.Y0()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f38771b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f38809a;
                if (BottomSheetBehavior.this.Y0()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.V0(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.f38764V)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f38748F) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.a1(view, i10, bottomSheetBehavior4.Z0());
        }

        @Override // U.c.AbstractC0088c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f38755M;
            if (i11 == 1 || bottomSheetBehavior.f38778e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f38774c0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f38767Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f38809a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f38765W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f38811a;

        e(int i10) {
            this.f38811a = i10;
        }

        @Override // P.D
        public boolean a(View view, D.a aVar) {
            BottomSheetBehavior.this.S0(this.f38811a);
            return true;
        }
    }

    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f38769a = 0;
        this.f38771b = true;
        this.f38773c = false;
        this.f38788l = -1;
        this.f38789m = -1;
        this.f38744B = new h(this, null);
        this.f38749G = 0.5f;
        this.f38751I = -1.0f;
        this.f38754L = true;
        this.f38755M = 4;
        this.f38756N = 4;
        this.f38761S = 0.1f;
        this.f38768Z = new ArrayList();
        this.f38776d0 = -1;
        this.f38782g0 = new SparseIntArray();
        this.f38784h0 = new d();
    }

    private void B0(View view, A.a aVar, int i10) {
        AbstractC0845c0.i0(view, aVar, null, h0(i10));
    }

    private void C0() {
        this.f38774c0 = -1;
        this.f38776d0 = -1;
        VelocityTracker velocityTracker = this.f38770a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38770a0 = null;
        }
    }

    private void D0(g gVar) {
        int i10 = this.f38769a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f38779f = gVar.f38814d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f38771b = gVar.f38815e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f38752J = gVar.f38816f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f38753K = gVar.f38817g;
        }
    }

    private void E0(View view, Runnable runnable) {
        if (y0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void U0(View view) {
        boolean z9 = (Build.VERSION.SDK_INT < 29 || v0() || this.f38781g) ? false : true;
        if (this.f38792p || this.f38793q || this.f38794r || this.f38796t || this.f38797u || this.f38798v || z9) {
            p.b(view, new c(z9));
        }
    }

    private boolean W0() {
        if (this.f38757O != null) {
            return this.f38754L || this.f38755M == 1;
        }
        return false;
    }

    private int X(View view, int i10, int i11) {
        return AbstractC0845c0.c(view, view.getResources().getString(i10), h0(i11));
    }

    private void Z() {
        int iD0 = d0();
        if (this.f38771b) {
            this.f38750H = Math.max(this.f38764V - iD0, this.f38747E);
        } else {
            this.f38750H = this.f38764V - iD0;
        }
    }

    private float a0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return radius / f10;
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(View view, int i10, boolean z9) {
        int iR0 = r0(i10);
        U.c cVar = this.f38757O;
        if (cVar == null || (!z9 ? cVar.Q(view, view.getLeft(), iR0) : cVar.O(view.getLeft(), iR0))) {
            T0(i10);
            return;
        }
        T0(2);
        d1(i10, true);
        this.f38744B.c(i10);
    }

    private void b0() {
        this.f38748F = (int) (this.f38764V * (1.0f - this.f38749G));
    }

    private void b1() {
        WeakReference weakReference = this.f38765W;
        if (weakReference != null) {
            c1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f38766X;
        if (weakReference2 != null) {
            c1((View) weakReference2.get(), 1);
        }
    }

    private float c0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f38786j == null || (weakReference = this.f38765W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (!t0() || (rootWindowInsets = ((View) this.f38765W.get()).getRootWindowInsets()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.max(a0(this.f38786j.E(), rootWindowInsets.getRoundedCorner(0)), a0(this.f38786j.F(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void c1(View view, int i10) {
        if (view == null) {
            return;
        }
        g0(view, i10);
        if (!this.f38771b && this.f38755M != 6) {
            this.f38782g0.put(i10, X(view, i.f48805a, 6));
        }
        if (this.f38752J && x0() && this.f38755M != 5) {
            B0(view, A.a.f4630y, 5);
        }
        int i11 = this.f38755M;
        if (i11 == 3) {
            B0(view, A.a.f4629x, this.f38771b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            B0(view, A.a.f4628w, this.f38771b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            B0(view, A.a.f4629x, 4);
            B0(view, A.a.f4628w, 3);
        }
    }

    private int d0() {
        int i10;
        if (this.f38781g) {
            return Math.min(Math.max(this.f38783h, this.f38764V - ((this.f38763U * 9) / 16)), this.f38762T) + this.f38799w;
        }
        return (this.f38791o || this.f38792p || (i10 = this.f38790n) <= 0) ? this.f38779f + this.f38799w : Math.max(this.f38779f, i10 + this.f38785i);
    }

    private void d1(int i10, boolean z9) {
        boolean zU0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f38743A == (zU0 = u0()) || this.f38786j == null) {
            return;
        }
        this.f38743A = zU0;
        if (!z9 || (valueAnimator = this.f38745C) == null) {
            ValueAnimator valueAnimator2 = this.f38745C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f38745C.cancel();
            }
            this.f38786j.X(this.f38743A ? c0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f38745C.reverse();
        } else {
            this.f38745C.setFloatValues(this.f38786j.w(), zU0 ? c0() : 1.0f);
            this.f38745C.start();
        }
    }

    private float e0(int i10) {
        float f10;
        float fN0;
        int i11 = this.f38750H;
        if (i10 > i11 || i11 == n0()) {
            int i12 = this.f38750H;
            f10 = i12 - i10;
            fN0 = this.f38764V - i12;
        } else {
            int i13 = this.f38750H;
            f10 = i13 - i10;
            fN0 = i13 - n0();
        }
        return f10 / fN0;
    }

    private void e1(boolean z9) {
        Map map;
        WeakReference weakReference = this.f38765W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z9) {
                if (this.f38780f0 != null) {
                    return;
                } else {
                    this.f38780f0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f38765W.get()) {
                    if (z9) {
                        this.f38780f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f38773c) {
                            AbstractC0845c0.v0(childAt, 4);
                        }
                    } else if (this.f38773c && (map = this.f38780f0) != null && map.containsKey(childAt)) {
                        AbstractC0845c0.v0(childAt, ((Integer) this.f38780f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z9) {
                this.f38780f0 = null;
            } else if (this.f38773c) {
                ((View) this.f38765W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        return w0() && x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(boolean z9) {
        View view;
        if (this.f38765W != null) {
            Z();
            if (this.f38755M != 4 || (view = (View) this.f38765W.get()) == null) {
                return;
            }
            if (z9) {
                S0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private void g0(View view, int i10) {
        if (view == null) {
            return;
        }
        AbstractC0845c0.g0(view, 524288);
        AbstractC0845c0.g0(view, 262144);
        AbstractC0845c0.g0(view, 1048576);
        int i11 = this.f38782g0.get(i10, -1);
        if (i11 != -1) {
            AbstractC0845c0.g0(view, i11);
            this.f38782g0.delete(i10);
        }
    }

    private D h0(int i10) {
        return new e(i10);
    }

    private void i0(Context context) {
        if (this.f38802z == null) {
            return;
        }
        K5.g gVar = new K5.g(this.f38802z);
        this.f38786j = gVar;
        gVar.L(context);
        ColorStateList colorStateList = this.f38787k;
        if (colorStateList != null) {
            this.f38786j.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f38786j.setTint(typedValue.data);
    }

    private void j0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0(), 1.0f);
        this.f38745C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f38745C.addUpdateListener(new b());
    }

    private int m0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, LinearLayoutManager.INVALID_OFFSET);
    }

    private int r0(int i10) {
        if (i10 == 3) {
            return n0();
        }
        if (i10 == 4) {
            return this.f38750H;
        }
        if (i10 == 5) {
            return this.f38764V;
        }
        if (i10 == 6) {
            return this.f38748F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float s0() {
        VelocityTracker velocityTracker = this.f38770a0;
        if (velocityTracker == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f38775d);
        return this.f38770a0.getYVelocity(this.f38774c0);
    }

    private boolean t0() {
        WeakReference weakReference = this.f38765W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f38765W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean u0() {
        if (this.f38755M == 3) {
            return this.f38801y || t0();
        }
        return false;
    }

    private boolean y0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && AbstractC0845c0.Q(view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f38759Q = 0;
        this.f38760R = false;
        return (i10 & 2) != 0;
    }

    public void A0(f fVar) {
        this.f38768Z.remove(fVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        WeakReference weakReference;
        int i11 = 3;
        if (view.getTop() == n0()) {
            T0(3);
            return;
        }
        if (!z0() || ((weakReference = this.f38767Y) != null && view2 == weakReference.get() && this.f38760R)) {
            if (this.f38759Q > 0) {
                if (!this.f38771b && view.getTop() > this.f38748F) {
                    i11 = 6;
                }
            } else if (this.f38752J && X0(view, s0())) {
                i11 = 5;
            } else if (this.f38759Q == 0) {
                int top = view.getTop();
                if (!this.f38771b) {
                    int i12 = this.f38748F;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f38750H)) {
                            if (Y0()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.f38750H)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.f38747E) >= Math.abs(top - this.f38750H)) {
                    i11 = 4;
                }
            } else {
                if (!this.f38771b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f38748F) < Math.abs(top2 - this.f38750H)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            a1(view, i11, false);
            this.f38760R = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f38755M == 1 && actionMasked == 0) {
            return true;
        }
        if (W0()) {
            this.f38757O.F(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.f38770a0 == null) {
            this.f38770a0 = VelocityTracker.obtain();
        }
        this.f38770a0.addMovement(motionEvent);
        if (W0() && actionMasked == 2 && !this.f38758P && Math.abs(this.f38776d0 - motionEvent.getY()) > this.f38757O.z()) {
            this.f38757O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f38758P;
    }

    public void F0(boolean z9) {
        this.f38754L = z9;
    }

    public void G0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f38746D = i10;
        d1(this.f38755M, true);
    }

    public void H0(boolean z9) {
        if (this.f38771b == z9) {
            return;
        }
        this.f38771b = z9;
        if (this.f38765W != null) {
            Z();
        }
        T0((this.f38771b && this.f38755M == 6) ? 3 : this.f38755M);
        d1(this.f38755M, true);
        b1();
    }

    public void I0(boolean z9) {
        this.f38791o = z9;
    }

    public void J0(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f38749G = f10;
        if (this.f38765W != null) {
            b0();
        }
    }

    public void K0(boolean z9) {
        if (this.f38752J != z9) {
            this.f38752J = z9;
            if (!z9 && this.f38755M == 5) {
                S0(4);
            }
            b1();
        }
    }

    public void L0(int i10) {
        this.f38789m = i10;
    }

    public void M0(int i10) {
        this.f38788l = i10;
    }

    public void N0(int i10) {
        O0(i10, false);
    }

    public final void O0(int i10, boolean z9) {
        if (i10 == -1) {
            if (this.f38781g) {
                return;
            } else {
                this.f38781g = true;
            }
        } else {
            if (!this.f38781g && this.f38779f == i10) {
                return;
            }
            this.f38781g = false;
            this.f38779f = Math.max(0, i10);
        }
        f1(z9);
    }

    public void P0(int i10) {
        this.f38769a = i10;
    }

    public void Q0(int i10) {
        this.f38777e = i10;
    }

    public void R0(boolean z9) {
        this.f38753K = z9;
    }

    public void S0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f38752J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f38771b && r0(i10) <= this.f38747E) ? 3 : i10;
        WeakReference weakReference = this.f38765W;
        if (weakReference == null || weakReference.get() == null) {
            T0(i10);
        } else {
            View view = (View) this.f38765W.get();
            E0(view, new a(view, i11));
        }
    }

    void T0(int i10) {
        View view;
        if (this.f38755M == i10) {
            return;
        }
        this.f38755M = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f38752J && i10 == 5)) {
            this.f38756N = i10;
        }
        WeakReference weakReference = this.f38765W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            e1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            e1(false);
        }
        d1(i10, true);
        for (int i11 = 0; i11 < this.f38768Z.size(); i11++) {
            ((f) this.f38768Z.get(i11)).c(view, i10);
        }
        b1();
    }

    public boolean V0(long j10, float f10) {
        return false;
    }

    boolean X0(View view, float f10) {
        if (this.f38753K) {
            return true;
        }
        if (x0() && view.getTop() >= this.f38750H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f38761S)) - ((float) this.f38750H)) / ((float) d0()) > 0.5f;
        }
        return false;
    }

    public void Y(f fVar) {
        if (this.f38768Z.contains(fVar)) {
            return;
        }
        this.f38768Z.add(fVar);
    }

    public boolean Y0() {
        return false;
    }

    public boolean Z0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f38765W = null;
        this.f38757O = null;
        this.f38772b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f38765W = null;
        this.f38757O = null;
        this.f38772b0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        U.c cVar;
        if (!view.isShown() || !this.f38754L) {
            this.f38758P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C0();
        }
        if (this.f38770a0 == null) {
            this.f38770a0 = VelocityTracker.obtain();
        }
        this.f38770a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.f38776d0 = (int) motionEvent.getY();
            if (this.f38755M != 2) {
                WeakReference weakReference = this.f38767Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.C(view2, x10, this.f38776d0)) {
                    this.f38774c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f38778e0 = true;
                }
            }
            this.f38758P = this.f38774c0 == -1 && !coordinatorLayout.C(view, x10, this.f38776d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f38778e0 = false;
            this.f38774c0 = -1;
            if (this.f38758P) {
                this.f38758P = false;
                return false;
            }
        }
        if (!this.f38758P && (cVar = this.f38757O) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f38767Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f38758P || this.f38755M == 1 || coordinatorLayout.C(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f38757O == null || (i10 = this.f38776d0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f38757O.z())) ? false : true;
    }

    void k0(int i10) {
        View view = (View) this.f38765W.get();
        if (view == null || this.f38768Z.isEmpty()) {
            return;
        }
        float fE0 = e0(i10);
        for (int i11 = 0; i11 < this.f38768Z.size(); i11++) {
            ((f) this.f38768Z.get(i11)).b(view, fE0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (AbstractC0845c0.w(coordinatorLayout) && !AbstractC0845c0.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f38765W == null) {
            this.f38783h = coordinatorLayout.getResources().getDimensionPixelSize(p186s5.c.f48694i);
            U0(view);
            AbstractC0845c0.H0(view, new com.google.android.material.bottomsheet.a(view));
            this.f38765W = new WeakReference(view);
            this.f38772b0 = new F5.b(view);
            K5.g gVar = this.f38786j;
            if (gVar != null) {
                AbstractC0845c0.q0(view, gVar);
                K5.g gVar2 = this.f38786j;
                float fU = this.f38751I;
                if (fU == -1.0f) {
                    fU = AbstractC0845c0.u(view);
                }
                gVar2.V(fU);
            } else {
                ColorStateList colorStateList = this.f38787k;
                if (colorStateList != null) {
                    AbstractC0845c0.r0(view, colorStateList);
                }
            }
            b1();
            if (AbstractC0845c0.x(view) == 0) {
                AbstractC0845c0.v0(view, 1);
            }
        }
        if (this.f38757O == null) {
            this.f38757O = U.c.o(coordinatorLayout, this.f38784h0);
        }
        int top = view.getTop();
        coordinatorLayout.K(view, i10);
        this.f38763U = coordinatorLayout.getWidth();
        this.f38764V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f38762T = height;
        int iMin = this.f38764V;
        int i11 = iMin - height;
        int i12 = this.f38800x;
        if (i11 < i12) {
            if (this.f38795s) {
                int i13 = this.f38789m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f38762T = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f38789m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f38762T = iMin2;
            }
        }
        this.f38747E = Math.max(0, this.f38764V - this.f38762T);
        b0();
        Z();
        int i15 = this.f38755M;
        if (i15 == 3) {
            AbstractC0845c0.X(view, n0());
        } else if (i15 == 6) {
            AbstractC0845c0.X(view, this.f38748F);
        } else if (this.f38752J && i15 == 5) {
            AbstractC0845c0.X(view, this.f38764V);
        } else if (i15 == 4) {
            AbstractC0845c0.X(view, this.f38750H);
        } else if (i15 == 1 || i15 == 2) {
            AbstractC0845c0.X(view, top - view.getTop());
        }
        d1(this.f38755M, false);
        this.f38767Y = new WeakReference(l0(view));
        for (int i16 = 0; i16 < this.f38768Z.size(); i16++) {
            ((f) this.f38768Z.get(i16)).a(view);
        }
        return true;
    }

    View l0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (AbstractC0845c0.S(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewL0 = l0(viewGroup.getChildAt(i10));
                if (viewL0 != null) {
                    return viewL0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f38788l, marginLayoutParams.width), m0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f38789m, marginLayoutParams.height));
        return true;
    }

    public int n0() {
        if (this.f38771b) {
            return this.f38747E;
        }
        return Math.max(this.f38746D, this.f38795s ? 0 : this.f38800x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return z0() && (weakReference = this.f38767Y) != null && view2 == weakReference.get() && (this.f38755M != 3 || super.o(coordinatorLayout, view, view2, f10, f11));
    }

    public float o0() {
        return this.f38749G;
    }

    public int p0() {
        if (this.f38781g) {
            return -1;
        }
        return this.f38779f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f38767Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!z0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < n0()) {
                    int iN0 = top - n0();
                    iArr[1] = iN0;
                    AbstractC0845c0.X(view, -iN0);
                    T0(3);
                } else {
                    if (!this.f38754L) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC0845c0.X(view, -i11);
                    T0(1);
                }
            } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
                if (i13 > this.f38750H && !f0()) {
                    int i14 = top - this.f38750H;
                    iArr[1] = i14;
                    AbstractC0845c0.X(view, -i14);
                    T0(4);
                } else {
                    if (!this.f38754L) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC0845c0.X(view, -i11);
                    T0(1);
                }
            }
            k0(view.getTop());
            this.f38759Q = i11;
            this.f38760R = true;
        }
    }

    public int q0() {
        return this.f38755M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean v0() {
        return this.f38791o;
    }

    public boolean w0() {
        return this.f38752J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.a());
        D0(gVar);
        int i10 = gVar.f38813c;
        if (i10 == 1 || i10 == 2) {
            this.f38755M = 4;
            this.f38756N = 4;
        } else {
            this.f38755M = i10;
            this.f38756N = i10;
        }
    }

    public boolean x0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public boolean z0() {
        return true;
    }

    private class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f38818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f38819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f38820c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f38819b = false;
                U.c cVar = BottomSheetBehavior.this.f38757O;
                if (cVar != null && cVar.m(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f38818a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f38755M == 2) {
                    bottomSheetBehavior.T0(hVar2.f38818a);
                }
            }
        }

        private h() {
            this.f38820c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f38765W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f38818a = i10;
            if (this.f38819b) {
                return;
            }
            AbstractC0845c0.e0((View) BottomSheetBehavior.this.f38765W.get(), this.f38820c);
            this.f38819b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class g extends T.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f38813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f38815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f38816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f38817g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f38813c = parcel.readInt();
            this.f38814d = parcel.readInt();
            this.f38815e = parcel.readInt() == 1;
            this.f38816f = parcel.readInt() == 1;
            this.f38817g = parcel.readInt() == 1;
        }

        @Override // T.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f38813c);
            parcel.writeInt(this.f38814d);
            parcel.writeInt(this.f38815e ? 1 : 0);
            parcel.writeInt(this.f38816f ? 1 : 0);
            parcel.writeInt(this.f38817g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f38813c = bottomSheetBehavior.f38755M;
            this.f38814d = bottomSheetBehavior.f38779f;
            this.f38815e = bottomSheetBehavior.f38771b;
            this.f38816f = bottomSheetBehavior.f38752J;
            this.f38817g = bottomSheetBehavior.f38753K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f38769a = 0;
        this.f38771b = true;
        this.f38773c = false;
        this.f38788l = -1;
        this.f38789m = -1;
        this.f38744B = new h(this, null);
        this.f38749G = 0.5f;
        this.f38751I = -1.0f;
        this.f38754L = true;
        this.f38755M = 4;
        this.f38756N = 4;
        this.f38761S = 0.1f;
        this.f38768Z = new ArrayList();
        this.f38776d0 = -1;
        this.f38782g0 = new SparseIntArray();
        this.f38784h0 = new d();
        this.f38785i = context.getResources().getDimensionPixelSize(p186s5.c.f48693h0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p186s5.k.f49212n0);
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f49248r0)) {
            this.f38787k = H5.c.a(context, typedArrayObtainStyledAttributes, p186s5.k.f49248r0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f48937J0)) {
            this.f38802z = k.e(context, attributeSet, p186s5.a.f48622e, f38742i0).m();
        }
        i0(context);
        j0();
        this.f38751I = typedArrayObtainStyledAttributes.getDimension(p186s5.k.f49239q0, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f49221o0)) {
            M0(typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f49221o0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f49230p0)) {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f49230p0, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(p186s5.k.f49302x0);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            N0(i10);
        } else {
            N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(p186s5.k.f49302x0, -1));
        }
        K0(typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f49293w0, false));
        I0(typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48865B0, false));
        H0(typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f49275u0, true));
        R0(typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48856A0, false));
        F0(typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f49257s0, true));
        P0(typedArrayObtainStyledAttributes.getInt(p186s5.k.f49311y0, 0));
        J0(typedArrayObtainStyledAttributes.getFloat(p186s5.k.f49284v0, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(p186s5.k.f49266t0);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            G0(typedValuePeekValue2.data);
        } else {
            G0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(p186s5.k.f49266t0, 0));
        }
        Q0(typedArrayObtainStyledAttributes.getInt(p186s5.k.f49320z0, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE));
        this.f38792p = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48901F0, false);
        this.f38793q = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48910G0, false);
        this.f38794r = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48919H0, false);
        this.f38795s = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48928I0, true);
        this.f38796t = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48874C0, false);
        this.f38797u = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48883D0, false);
        this.f38798v = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48892E0, false);
        this.f38801y = typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48946K0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f38775d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
