package androidx.swiperefreshlayout.widget;

import O.AbstractC0845c0;
import O.E;
import O.F;
import O.G;
import O.H;
import O.I;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ViewGroup implements H, G, E {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f10988j0 = "c";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int[] f10989k0 = {R.attr.enabled};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f10990G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f10991H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f10992I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f10993J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f10994K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final DecelerateInterpolator f10995L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f10996M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f10997N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected int f10998O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    float f10999P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected int f11000Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    int f11001R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f11002S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f11003T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Animation f11004U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Animation f11005V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Animation f11006W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f11007a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Animation f11008a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f11009b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Animation f11010b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f11011c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f11012c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11013d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f11014d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11015e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    boolean f11016e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f11017f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f11018f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final I f11019g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Animation.AnimationListener f11020g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f11021h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Animation f11022h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f11023i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Animation f11024i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f11025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f11026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11028m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f11029v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f11030w;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f11011c) {
                cVar.r();
                return;
            }
            cVar.f11003T.setAlpha(255);
            c.this.f11003T.start();
            c cVar2 = c.this;
            if (cVar2.f11012c0 && (jVar = cVar2.f11009b) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.f11029v = cVar3.f10996M.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    class C0177c extends Animation {
        C0177c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11035b;

        d(int i10, int i11) {
            this.f11034a = i10;
            this.f11035b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = c.this.f11003T;
            int i10 = this.f11034a;
            bVar.setAlpha((int) (i10 + ((this.f11035b - i10) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f10993J) {
                return;
            }
            cVar.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            int iAbs = !cVar.f11016e0 ? cVar.f11001R - Math.abs(cVar.f11000Q) : cVar.f11001R;
            c cVar2 = c.this;
            int i10 = cVar2.f10998O;
            c.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - cVar2.f10996M.getTop());
            c.this.f11003T.e(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c.this.p(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            c cVar = c.this;
            float f11 = cVar.f10999P;
            cVar.setAnimationProgress(f11 + ((-f11) * f10));
            c.this.p(f10);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public c(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f10996M.setVisibility(0);
        this.f11003T.setAlpha(255);
        b bVar = new b();
        this.f11004U = bVar;
        bVar.setDuration(this.f11028m);
        if (animationListener != null) {
            this.f10996M.b(animationListener);
        }
        this.f10996M.clearAnimation();
        this.f10996M.startAnimation(this.f11004U);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f10998O = i10;
        this.f11022h0.reset();
        this.f11022h0.setDuration(200L);
        this.f11022h0.setInterpolator(this.f10995L);
        if (animationListener != null) {
            this.f10996M.b(animationListener);
        }
        this.f10996M.clearAnimation();
        this.f10996M.startAnimation(this.f11022h0);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f10993J) {
            z(i10, animationListener);
            return;
        }
        this.f10998O = i10;
        this.f11024i0.reset();
        this.f11024i0.setDuration(200L);
        this.f11024i0.setInterpolator(this.f10995L);
        if (animationListener != null) {
            this.f10996M.b(animationListener);
        }
        this.f10996M.clearAnimation();
        this.f10996M.startAnimation(this.f11024i0);
    }

    private void d() {
        this.f10996M = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f11003T = bVar;
        bVar.l(1);
        this.f10996M.setImageDrawable(this.f11003T);
        this.f10996M.setVisibility(8);
        addView(this.f10996M);
    }

    private void f() {
        if (this.f11007a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f10996M)) {
                    this.f11007a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f10) {
        if (f10 > this.f11015e) {
            t(true, true);
            return;
        }
        this.f11011c = false;
        this.f11003T.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b(this.f11029v, !this.f10993J ? new e() : null);
        this.f11003T.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f10) {
        this.f11003T.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f11015e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f11015e;
        int i10 = this.f11002S;
        if (i10 <= 0) {
            i10 = this.f11016e0 ? this.f11001R - this.f11000Q : this.f11001R;
        }
        float f11 = i10;
        double dMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f11000Q + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f10996M.getVisibility() != 0) {
            this.f10996M.setVisibility(0);
        }
        if (!this.f10993J) {
            this.f10996M.setScaleX(1.0f);
            this.f10996M.setScaleY(1.0f);
        }
        if (this.f10993J) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f11015e));
        }
        if (f10 < this.f11015e) {
            if (this.f11003T.getAlpha() > 76 && !h(this.f11006W)) {
                x();
            }
        } else if (this.f11003T.getAlpha() < 255 && !h(this.f11008a0)) {
            w();
        }
        this.f11003T.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(0.8f, fMax * 0.8f));
        this.f11003T.e(Math.min(1.0f, fMax));
        this.f11003T.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f11029v);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10992I) {
            this.f10992I = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i10) {
        this.f10996M.getBackground().setAlpha(i10);
        this.f11003T.setAlpha(i10);
    }

    private void t(boolean z9, boolean z10) {
        if (this.f11011c != z9) {
            this.f11012c0 = z10;
            f();
            this.f11011c = z9;
            if (z9) {
                a(this.f11029v, this.f11020g0);
            } else {
                y(this.f11020g0);
            }
        }
    }

    private Animation u(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f10996M.b(null);
        this.f10996M.clearAnimation();
        this.f10996M.startAnimation(dVar);
        return dVar;
    }

    private void v(float f10) {
        float f11 = this.f10990G;
        float f12 = f10 - f11;
        int i10 = this.f11013d;
        if (f12 <= i10 || this.f10991H) {
            return;
        }
        this.f11030w = f11 + i10;
        this.f10991H = true;
        this.f11003T.setAlpha(76);
    }

    private void w() {
        this.f11008a0 = u(this.f11003T.getAlpha(), 255);
    }

    private void x() {
        this.f11006W = u(this.f11003T.getAlpha(), 76);
    }

    private void z(int i10, Animation.AnimationListener animationListener) {
        this.f10998O = i10;
        this.f10999P = this.f10996M.getScaleX();
        h hVar = new h();
        this.f11010b0 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f10996M.b(animationListener);
        }
        this.f10996M.clearAnimation();
        this.f10996M.startAnimation(this.f11010b0);
    }

    public boolean c() {
        View view = this.f11007a;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.f11021h.a(f10, f11, z9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f11021h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f11021h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f11021h.f(i10, i11, i12, i13, iArr);
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        if (i14 == 0) {
            this.f11021h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f10997N;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f11019g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f11014d0;
    }

    public int getProgressViewEndOffset() {
        return this.f11001R;
    }

    public int getProgressViewStartOffset() {
        return this.f11000Q;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f11021h.j();
    }

    @Override // O.G
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f11021h.l();
    }

    @Override // O.G
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // O.G
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // O.H
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        e(i10, i11, i12, i13, this.f11025j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f11025j[1] : i16;
        if (i17 >= 0 || c()) {
            return;
        }
        float fAbs = this.f11017f + Math.abs(i17);
        this.f11017f = fAbs;
        l(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // O.G
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, i14, this.f11026k);
    }

    @Override // O.G
    public boolean o(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10994K && actionMasked == 0) {
            this.f10994K = false;
        }
        if (!isEnabled() || this.f10994K || c() || this.f11011c || this.f11027l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f11000Q - this.f10996M.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f10992I = pointerId;
            this.f10991H = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f10990G = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f10991H = false;
            this.f10992I = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f10992I;
            if (i10 == -1) {
                Log.e(f10988j0, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            v(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f10991H = false;
            this.f10992I = -1;
        } else if (actionMasked == 6) {
            q(motionEvent);
        }
        return this.f10991H;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f11007a == null) {
            f();
        }
        View view = this.f11007a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f10996M.getMeasuredWidth();
        int measuredHeight2 = this.f10996M.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f11029v;
        this.f10996M.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f11007a == null) {
            f();
        }
        View view = this.f11007a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f10996M.measure(View.MeasureSpec.makeMeasureSpec(this.f11014d0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11014d0, 1073741824));
        this.f10997N = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f10996M) {
                this.f10997N = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        return dispatchNestedFling(f10, f11, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f11017f;
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f11017f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    this.f11017f = f10 - f11;
                    iArr[1] = i11;
                }
                l(this.f11017f);
            }
        }
        if (this.f11016e0 && i11 > 0 && this.f11017f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(i11 - iArr[1]) > 0) {
            this.f10996M.setVisibility(8);
        }
        int[] iArr2 = this.f11023i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f11026k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f11019g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f11017f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f11027l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f11041a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f11011c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f10994K || this.f11011c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f11019g.d(view);
        this.f11027l = false;
        float f10 = this.f11017f;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            g(f10);
            this.f11017f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f10994K && actionMasked == 0) {
            this.f10994K = false;
        }
        if (!isEnabled() || this.f10994K || c() || this.f11011c || this.f11027l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f10992I = motionEvent.getPointerId(0);
            this.f10991H = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f10992I);
                if (iFindPointerIndex < 0) {
                    Log.e(f10988j0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f10991H) {
                    float y9 = (motionEvent.getY(iFindPointerIndex) - this.f11030w) * 0.5f;
                    this.f10991H = false;
                    g(y9);
                }
                this.f10992I = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f10992I);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f10988j0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y10 = motionEvent.getY(iFindPointerIndex2);
                v(y10);
                if (this.f10991H) {
                    float f10 = (y10 - this.f11030w) * 0.5f;
                    if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    l(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f10988j0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f10992I = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    void p(float f10) {
        int i10 = this.f10998O;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f11000Q - i10) * f10))) - this.f10996M.getTop());
    }

    void r() {
        this.f10996M.clearAnimation();
        this.f11003T.stop();
        this.f10996M.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f10993J) {
            setAnimationProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            setTargetOffsetTopAndBottom(this.f11000Q - this.f11029v);
        }
        this.f11029v = this.f10996M.getTop();
    }

    public void s(boolean z9, int i10, int i11) {
        this.f10993J = z9;
        this.f11000Q = i10;
        this.f11001R = i11;
        this.f11016e0 = true;
        r();
        this.f11011c = false;
    }

    void setAnimationProgress(float f10) {
        this.f10996M.setScaleX(f10);
        this.f10996M.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.f11003T.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = C.b.c(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f11015e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (z9) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z9) {
        this.f11018f0 = z9;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        this.f11021h.m(z9);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f11009b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f10996M.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(C.b.c(getContext(), i10));
    }

    public void setRefreshing(boolean z9) {
        if (!z9 || this.f11011c == z9) {
            t(z9, false);
            return;
        }
        this.f11011c = z9;
        setTargetOffsetTopAndBottom((!this.f11016e0 ? this.f11001R + this.f11000Q : this.f11001R) - this.f11029v);
        this.f11012c0 = false;
        A(this.f11020g0);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f11014d0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f11014d0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f10996M.setImageDrawable(null);
            this.f11003T.l(i10);
            this.f10996M.setImageDrawable(this.f11003T);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.f11002S = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f10996M.bringToFront();
        AbstractC0845c0.X(this.f10996M, i10);
        this.f11029v = this.f10996M.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f11021h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f11021h.q();
    }

    void y(Animation.AnimationListener animationListener) {
        C0177c c0177c = new C0177c();
        this.f11005V = c0177c;
        c0177c.setDuration(150L);
        this.f10996M.b(animationListener);
        this.f10996M.clearAnimation();
        this.f10996M.startAnimation(this.f11005V);
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f11041a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(Parcelable parcelable, boolean z9) {
            super(parcelable);
            this.f11041a = z9;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f11041a ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f11041a = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11011c = false;
        this.f11015e = -1.0f;
        this.f11023i = new int[2];
        this.f11025j = new int[2];
        this.f11026k = new int[2];
        this.f10992I = -1;
        this.f10997N = -1;
        this.f11020g0 = new a();
        this.f11022h0 = new f();
        this.f11024i0 = new g();
        this.f11013d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f11028m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f10995L = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f11014d0 = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f11001R = i10;
        this.f11015e = i10;
        this.f11019g = new I(this);
        this.f11021h = new F(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f11014d0;
        this.f11029v = i11;
        this.f11000Q = i11;
        p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10989k0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
