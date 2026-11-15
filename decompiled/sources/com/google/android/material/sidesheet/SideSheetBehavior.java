package com.google.android.material.sidesheet;

import K5.g;
import K5.k;
import O.AbstractC0845c0;
import O.AbstractC0875s;
import P.A;
import P.D;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p070h.w;
import p186s5.i;
import p186s5.j;

/* JADX INFO: loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f39426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f39427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f39428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f39429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f39430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f39431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f39432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f39433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private U.c f39436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f39438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f39440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f39443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f39444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f39445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f39446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private F5.c f39447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f39448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f39449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final U.c.AbstractC0088c f39450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f39425z = i.f48804B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f39424A = j.f48843m;

    class a extends U.c.AbstractC0088c {
        a() {
        }

        @Override // U.c.AbstractC0088c
        public int a(View view, int i10, int i11) {
            return I.a.b(i10, SideSheetBehavior.this.f39426a.f(), SideSheetBehavior.this.f39426a.e());
        }

        @Override // U.c.AbstractC0088c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // U.c.AbstractC0088c
        public int d(View view) {
            return SideSheetBehavior.this.f39439n + SideSheetBehavior.this.d0();
        }

        @Override // U.c.AbstractC0088c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f39433h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // U.c.AbstractC0088c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f39426a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        @Override // U.c.AbstractC0088c
        public void l(View view, float f10, float f11) {
            int iR = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, iR, sideSheetBehavior.D0());
        }

        @Override // U.c.AbstractC0088c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f39434i == 1 || SideSheetBehavior.this.f39443r == null || SideSheetBehavior.this.f39443r.get() != view) ? false : true;
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f39453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f39454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f39455c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f39459a);
            }
        };

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f39454b = false;
            if (SideSheetBehavior.this.f39436k != null && SideSheetBehavior.this.f39436k.m(true)) {
                cVar.b(cVar.f39453a);
            } else if (SideSheetBehavior.this.f39434i == 2) {
                SideSheetBehavior.this.z0(cVar.f39453a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f39443r == null || SideSheetBehavior.this.f39443r.get() == null) {
                return;
            }
            this.f39453a = i10;
            if (this.f39454b) {
                return;
            }
            AbstractC0845c0.e0((View) SideSheetBehavior.this.f39443r.get(), this.f39455c);
            this.f39454b = true;
        }
    }

    public SideSheetBehavior() {
        this.f39431f = new c();
        this.f39433h = true;
        this.f39434i = 5;
        this.f39435j = 5;
        this.f39438m = 0.1f;
        this.f39445t = -1;
        this.f39449x = new LinkedHashSet();
        this.f39450y = new a();
    }

    private boolean A0() {
        if (this.f39436k != null) {
            return this.f39433h || this.f39434i == 1;
        }
        return false;
    }

    private boolean C0(View view) {
        return (view.isShown() || AbstractC0845c0.o(view) != null) && this.f39433h;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i10, View view, D.a aVar) {
        sideSheetBehavior.y0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i10, boolean z9) {
        if (!p0(view, i10, z9)) {
            z0(i10);
        } else {
            z0(2);
            this.f39431f.b(i10);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f39443r.get();
        if (view != null) {
            sideSheetBehavior.E0(view, i10, false);
        }
    }

    private void F0() {
        View view;
        WeakReference weakReference = this.f39443r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0845c0.g0(view, 262144);
        AbstractC0845c0.g0(view, 1048576);
        if (this.f39434i != 5) {
            r0(view, A.a.f4630y, 5);
        }
        if (this.f39434i != 3) {
            r0(view, A.a.f4628w, 3);
        }
    }

    private void G0(k kVar) {
        g gVar = this.f39428c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void H0(View view) {
        int i10 = this.f39434i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f39434i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f39426a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f39426a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f39434i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (B0(view, f10)) {
            return (this.f39426a.l(f10, f11) || this.f39426a.k(view)) ? 5 : 3;
        }
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f39426a.d()) ? 3 : 5;
    }

    private void S() {
        WeakReference weakReference = this.f39444s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f39444s = null;
    }

    private D T(final int i10) {
        return new D() { // from class: L5.a
            @Override // P.D
            public final boolean a(View view, D.a aVar) {
                return SideSheetBehavior.E(this.f3150a, i10, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f39430e == null) {
            return;
        }
        g gVar = new g(this.f39430e);
        this.f39428c = gVar;
        gVar.L(context);
        ColorStateList colorStateList = this.f39429d;
        if (colorStateList != null) {
            this.f39428c.W(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f39428c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10) {
        if (this.f39449x.isEmpty()) {
            return;
        }
        this.f39426a.b(i10);
        Iterator it = this.f39449x.iterator();
        if (it.hasNext()) {
            w.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (AbstractC0845c0.o(view) == null) {
            AbstractC0845c0.p0(view, view.getResources().getString(f39425z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
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

    private CoordinatorLayout.f j0() {
        View view;
        WeakReference weakReference = this.f39443r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f39448w, motionEvent.getX()) > ((float) this.f39436k.z());
    }

    private boolean n0(float f10) {
        return this.f39426a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && AbstractC0845c0.Q(view);
    }

    private boolean p0(View view, int i10, boolean z9) {
        int iE0 = e0(i10);
        U.c cVarI0 = i0();
        if (cVarI0 == null) {
            return false;
        }
        if (z9) {
            return cVarI0.O(iE0, view.getTop());
        }
        return cVarI0.Q(view, iE0, view.getTop());
    }

    private void q0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f39444s != null || (i10 = this.f39445t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f39444s = new WeakReference(viewFindViewById);
    }

    private void r0(View view, A.a aVar, int i10) {
        AbstractC0845c0.i0(view, aVar, null, T(i10));
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f39446u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f39446u = null;
        }
    }

    private void t0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void w0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f39426a;
        if (cVar == null || cVar.i() != i10) {
            if (i10 == 0) {
                this.f39426a = new com.google.android.material.sidesheet.b(this);
                if (this.f39430e == null || l0()) {
                    return;
                }
                k.b bVarV = this.f39430e.v();
                bVarV.G(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).w(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                G0(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f39426a = new com.google.android.material.sidesheet.a(this);
                if (this.f39430e == null || k0()) {
                    return;
                }
                k.b bVarV2 = this.f39430e.v();
                bVarV2.B(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).s(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                G0(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void x0(View view, int i10) {
        w0(AbstractC0875s.b(((CoordinatorLayout.f) view.getLayoutParams()).f9081c, i10) == 3 ? 1 : 0);
    }

    boolean B0(View view, float f10) {
        return this.f39426a.m(view, f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f39434i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f39436k.F(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f39446u == null) {
            this.f39446u = VelocityTracker.obtain();
        }
        this.f39446u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f39437l && m0(motionEvent)) {
            this.f39436k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f39437l;
    }

    public boolean D0() {
        return true;
    }

    int Y() {
        return this.f39439n;
    }

    public View Z() {
        WeakReference weakReference = this.f39444s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f39426a.c();
    }

    public float b0() {
        return this.f39438m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f39442q;
    }

    int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f39426a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int f0() {
        return this.f39441p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f39443r = null;
        this.f39436k = null;
        this.f39447v = null;
    }

    int g0() {
        return this.f39440o;
    }

    int h0() {
        return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
    }

    U.c i0() {
        return this.f39436k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f39443r = null;
        this.f39436k = null;
        this.f39447v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        U.c cVar;
        if (!C0(view)) {
            this.f39437l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f39446u == null) {
            this.f39446u = VelocityTracker.obtain();
        }
        this.f39446u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f39448w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f39437l) {
            this.f39437l = false;
            return false;
        }
        return (this.f39437l || (cVar = this.f39436k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (AbstractC0845c0.w(coordinatorLayout) && !AbstractC0845c0.w(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f39443r == null) {
            this.f39443r = new WeakReference(view);
            this.f39447v = new F5.c(view);
            g gVar = this.f39428c;
            if (gVar != null) {
                AbstractC0845c0.q0(view, gVar);
                g gVar2 = this.f39428c;
                float fU = this.f39432g;
                if (fU == -1.0f) {
                    fU = AbstractC0845c0.u(view);
                }
                gVar2.V(fU);
            } else {
                ColorStateList colorStateList = this.f39429d;
                if (colorStateList != null) {
                    AbstractC0845c0.r0(view, colorStateList);
                }
            }
            H0(view);
            F0();
            if (AbstractC0845c0.x(view) == 0) {
                AbstractC0845c0.v0(view, 1);
            }
            W(view);
        }
        x0(view, i10);
        if (this.f39436k == null) {
            this.f39436k = U.c.o(coordinatorLayout, this.f39450y);
        }
        int iG = this.f39426a.g(view);
        coordinatorLayout.K(view, i10);
        this.f39440o = coordinatorLayout.getWidth();
        this.f39441p = this.f39426a.h(coordinatorLayout);
        this.f39439n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f39442q = marginLayoutParams != null ? this.f39426a.a(marginLayoutParams) : 0;
        AbstractC0845c0.W(view, P(iG, view));
        q0(coordinatorLayout);
        Iterator it = this.f39449x.iterator();
        while (it.hasNext()) {
            w.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void u0(int i10) {
        this.f39445t = i10;
        S();
        WeakReference weakReference = this.f39443r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !AbstractC0845c0.R(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public void v0(boolean z9) {
        this.f39433h = z9;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i10 = bVar.f39452c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f39434i = i10;
        this.f39435j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public void y0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f39443r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i10);
        } else {
            t0((View) this.f39443r.get(), new Runnable() { // from class: L5.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(this.f3152a, i10);
                }
            });
        }
    }

    void z0(int i10) {
        View view;
        if (this.f39434i == i10) {
            return;
        }
        this.f39434i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f39435j = i10;
        }
        WeakReference weakReference = this.f39443r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H0(view);
        Iterator it = this.f39449x.iterator();
        if (it.hasNext()) {
            w.a(it.next());
            throw null;
        }
        F0();
    }

    protected static class b extends T.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f39452c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f39452c = parcel.readInt();
        }

        @Override // T.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f39452c);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f39452c = sideSheetBehavior.f39434i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39431f = new c();
        this.f39433h = true;
        this.f39434i = 5;
        this.f39435j = 5;
        this.f39438m = 0.1f;
        this.f39445t = -1;
        this.f39449x = new LinkedHashSet();
        this.f39450y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p186s5.k.f48906F5);
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f48924H5)) {
            this.f39429d = H5.c.a(context, typedArrayObtainStyledAttributes, p186s5.k.f48924H5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f48951K5)) {
            this.f39430e = k.e(context, attributeSet, 0, f39424A).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(p186s5.k.f48942J5)) {
            u0(typedArrayObtainStyledAttributes.getResourceId(p186s5.k.f48942J5, -1));
        }
        U(context);
        this.f39432g = typedArrayObtainStyledAttributes.getDimension(p186s5.k.f48915G5, -1.0f);
        v0(typedArrayObtainStyledAttributes.getBoolean(p186s5.k.f48933I5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f39427b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
