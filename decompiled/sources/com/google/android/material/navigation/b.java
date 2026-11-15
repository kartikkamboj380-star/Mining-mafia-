package com.google.android.material.navigation;

import O.AbstractC0845c0;
import O.N;
import P.A;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.m0;
import androidx.core.widget.i;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.reactnativesystemnavigationbar.SystemNavigationBarModule;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends FrameLayout implements k.a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int[] f39334a0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d f39335b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d f39336c0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final TextView f39337G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final TextView f39338H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f39339I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f39340J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private g f39341K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ColorStateList f39342L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Drawable f39343M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Drawable f39344N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ValueAnimator f39345O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private d f39346P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f39347Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f39348R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f39349S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f39350T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f39351U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f39352V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private p206u5.a f39353W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f39355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f39356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f39360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f39361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f39362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f39363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f39364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f39365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f39366m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ImageView f39367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ViewGroup f39368w;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (b.this.f39367v.getVisibility() == 0) {
                b bVar = b.this;
                bVar.w(bVar.f39367v);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.b$b, reason: collision with other inner class name */
    class RunnableC0362b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f39370a;

        RunnableC0362b(int i10) {
            this.f39370a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.x(this.f39370a);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f39372a;

        c(float f10) {
            this.f39372a = f10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f39372a);
        }
    }

    private static class d {
        private d() {
        }

        protected float a(float f10, float f11) {
            return p196t5.a.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.8f : 0.0f, f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : 0.2f, f10);
        }

        protected float b(float f10, float f11) {
            return p196t5.a.a(0.4f, 1.0f, f10);
        }

        protected float c(float f10, float f11) {
            return 1.0f;
        }

        public void d(float f10, float f11, View view) {
            view.setScaleX(b(f10, f11));
            view.setScaleY(c(f10, f11));
            view.setAlpha(a(f10, f11));
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static class e extends d {
        private e() {
            super(null);
        }

        @Override // com.google.android.material.navigation.b.d
        protected float c(float f10, float f11) {
            return b(f10, f11);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f39335b0 = new d(aVar);
        f39336c0 = new e(aVar);
    }

    public b(Context context) {
        super(context);
        this.f39354a = false;
        this.f39339I = -1;
        this.f39340J = 0;
        this.f39346P = f39335b0;
        this.f39347Q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f39348R = false;
        this.f39349S = 0;
        this.f39350T = 0;
        this.f39351U = false;
        this.f39352V = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f39365l = (FrameLayout) findViewById(p186s5.e.f48737G);
        this.f39366m = findViewById(p186s5.e.f48736F);
        ImageView imageView = (ImageView) findViewById(p186s5.e.f48738H);
        this.f39367v = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(p186s5.e.f48739I);
        this.f39368w = viewGroup;
        TextView textView = (TextView) findViewById(p186s5.e.f48741K);
        this.f39337G = textView;
        TextView textView2 = (TextView) findViewById(p186s5.e.f48740J);
        this.f39338H = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f39357d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f39358e = viewGroup.getPaddingBottom();
        this.f39359f = getResources().getDimensionPixelSize(p186s5.c.f48652A);
        AbstractC0845c0.v0(textView, 2);
        AbstractC0845c0.v0(textView2, 2);
        setFocusable(true);
        e(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    private void e(float f10, float f11) {
        this.f39360g = f10 - f11;
        this.f39361h = (f11 * 1.0f) / f10;
        this.f39362i = (f10 * 1.0f) / f11;
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f39365l;
        return frameLayout != null ? frameLayout : this.f39367v;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof b) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        return ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin + getIconOrContainer().getMeasuredHeight();
    }

    private int getSuggestedIconWidth() {
        p206u5.a aVar = this.f39353W;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f39353W.n();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f39367v.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    private static Drawable i(ColorStateList colorStateList) {
        return new RippleDrawable(I5.b.a(colorStateList), null, null);
    }

    private FrameLayout j(View view) {
        ImageView imageView = this.f39367v;
        if (view == imageView && p206u5.c.f49985a) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private boolean k() {
        return this.f39353W != null;
    }

    private boolean l() {
        return this.f39351U && this.f39363j == 2;
    }

    private void m(float f10) {
        if (!this.f39348R || !this.f39354a || !AbstractC0845c0.Q(this)) {
            q(f10, f10);
            return;
        }
        ValueAnimator valueAnimator = this.f39345O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f39345O = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f39347Q, f10);
        this.f39345O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new c(f10));
        this.f39345O.setInterpolator(F5.d.g(getContext(), p186s5.a.f48601N, p196t5.a.f49671b));
        this.f39345O.setDuration(F5.d.f(getContext(), p186s5.a.f48594G, getResources().getInteger(p186s5.f.f48781b)));
        this.f39345O.start();
    }

    private void n() {
        g gVar = this.f39341K;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    private void o() {
        Drawable drawableI = this.f39356c;
        RippleDrawable rippleDrawable = null;
        boolean z9 = true;
        if (this.f39355b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f39348R && getActiveIndicatorDrawable() != null && this.f39365l != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(I5.b.d(this.f39355b), null, activeIndicatorDrawable);
                z9 = false;
            } else if (drawableI == null) {
                drawableI = i(this.f39355b);
            }
        }
        FrameLayout frameLayout = this.f39365l;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.f39365l.setForeground(rippleDrawable);
        }
        AbstractC0845c0.q0(this, drawableI);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(float f10, float f11) {
        View view = this.f39366m;
        if (view != null) {
            this.f39346P.d(f10, f11, view);
        }
        this.f39347Q = f10;
    }

    private static void r(TextView textView, int i10) {
        i.o(textView, i10);
        int i11 = H5.c.i(textView.getContext(), i10, 0);
        if (i11 != 0) {
            textView.setTextSize(0, i11);
        }
    }

    private static void s(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    private static void t(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private void u(View view) {
        if (k() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            p206u5.c.a(this.f39353W, view, j(view));
        }
    }

    private void v(View view) {
        if (k()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                p206u5.c.d(this.f39353W, view);
            }
            this.f39353W = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(View view) {
        if (k()) {
            p206u5.c.e(this.f39353W, view, j(view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(int i10) {
        if (this.f39366m == null || i10 <= 0) {
            return;
        }
        int iMin = Math.min(this.f39349S, i10 - (this.f39352V * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39366m.getLayoutParams();
        layoutParams.height = l() ? iMin : this.f39350T;
        layoutParams.width = iMin;
        this.f39366m.setLayoutParams(layoutParams);
    }

    private void y() {
        if (l()) {
            this.f39346P = f39336c0;
        } else {
            this.f39346P = f39335b0;
        }
    }

    private static void z(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f39365l;
        if (frameLayout != null && this.f39348R) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void f(g gVar, int i10) {
        this.f39341K = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        m0.a(this, !TextUtils.isEmpty(gVar.getTooltipText()) ? gVar.getTooltipText() : gVar.getTitle());
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f39354a = true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean g() {
        return false;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f39366m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public p206u5.a getBadge() {
        return this.f39353W;
    }

    protected int getItemBackgroundResId() {
        return p186s5.d.f48729j;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f39341K;
    }

    protected int getItemDefaultMarginResId() {
        return p186s5.c.f48697j0;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f39339I;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39368w.getLayoutParams();
        return getSuggestedIconHeight() + (this.f39368w.getVisibility() == 0 ? this.f39359f : 0) + layoutParams.topMargin + this.f39368w.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39368w.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f39368w.getMeasuredWidth() + layoutParams.rightMargin);
    }

    void h() {
        p();
        this.f39341K = null;
        this.f39347Q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f39354a = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.f39341K;
        if (gVar != null && gVar.isCheckable() && this.f39341K.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f39334a0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p206u5.a aVar = this.f39353W;
        if (aVar != null && aVar.isVisible()) {
            CharSequence title = this.f39341K.getTitle();
            if (!TextUtils.isEmpty(this.f39341K.getContentDescription())) {
                title = this.f39341K.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f39353W.k()));
        }
        A aX0 = A.X0(accessibilityNodeInfo);
        aX0.t0(A.f.b(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            aX0.r0(false);
            aX0.i0(A.a.f4614i);
        }
        aX0.J0(getResources().getString(p186s5.i.f48812h));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new RunnableC0362b(i10));
    }

    void p() {
        v(this.f39367v);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f39366m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        o();
    }

    public void setActiveIndicatorEnabled(boolean z9) {
        this.f39348R = z9;
        o();
        View view = this.f39366m;
        if (view != null) {
            view.setVisibility(z9 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f39350T = i10;
        x(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        if (this.f39359f != i10) {
            this.f39359f = i10;
            n();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f39352V = i10;
        x(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z9) {
        this.f39351U = z9;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f39349S = i10;
        x(getWidth());
    }

    void setBadge(@NonNull p206u5.a aVar) {
        if (this.f39353W == aVar) {
            return;
        }
        if (k() && this.f39367v != null) {
            Log.w(SystemNavigationBarModule.NAME, "Multiple badges shouldn't be attached to one item.");
            v(this.f39367v);
        }
        this.f39353W = aVar;
        ImageView imageView = this.f39367v;
        if (imageView != null) {
            u(imageView);
        }
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
    }

    public void setChecked(boolean z9) {
        TextView textView = this.f39338H;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f39338H;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f39337G;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f39337G;
        textView4.setPivotY(textView4.getBaseline());
        m(z9 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i10 = this.f39363j;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z9) {
                    t(getIconOrContainer(), this.f39357d, 49);
                    z(this.f39368w, this.f39358e);
                    this.f39338H.setVisibility(0);
                } else {
                    t(getIconOrContainer(), this.f39357d, 17);
                    z(this.f39368w, 0);
                    this.f39338H.setVisibility(4);
                }
                this.f39337G.setVisibility(4);
            } else if (i10 == 1) {
                z(this.f39368w, this.f39358e);
                if (z9) {
                    t(getIconOrContainer(), (int) (this.f39357d + this.f39360g), 49);
                    s(this.f39338H, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f39337G;
                    float f10 = this.f39361h;
                    s(textView5, f10, f10, 4);
                } else {
                    t(getIconOrContainer(), this.f39357d, 49);
                    TextView textView6 = this.f39338H;
                    float f11 = this.f39362i;
                    s(textView6, f11, f11, 4);
                    s(this.f39337G, 1.0f, 1.0f, 0);
                }
            } else if (i10 == 2) {
                t(getIconOrContainer(), this.f39357d, 17);
                this.f39338H.setVisibility(8);
                this.f39337G.setVisibility(8);
            }
        } else if (this.f39364k) {
            if (z9) {
                t(getIconOrContainer(), this.f39357d, 49);
                z(this.f39368w, this.f39358e);
                this.f39338H.setVisibility(0);
            } else {
                t(getIconOrContainer(), this.f39357d, 17);
                z(this.f39368w, 0);
                this.f39338H.setVisibility(4);
            }
            this.f39337G.setVisibility(4);
        } else {
            z(this.f39368w, this.f39358e);
            if (z9) {
                t(getIconOrContainer(), (int) (this.f39357d + this.f39360g), 49);
                s(this.f39338H, 1.0f, 1.0f, 0);
                TextView textView7 = this.f39337G;
                float f12 = this.f39361h;
                s(textView7, f12, f12, 4);
            } else {
                t(getIconOrContainer(), this.f39357d, 49);
                TextView textView8 = this.f39338H;
                float f13 = this.f39362i;
                s(textView8, f13, f13, 4);
                s(this.f39337G, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z9);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f39337G.setEnabled(z9);
        this.f39338H.setEnabled(z9);
        this.f39367v.setEnabled(z9);
        if (z9) {
            AbstractC0845c0.C0(this, N.b(getContext(), BackupConstant.SCENE_BACKUP_RENDER_FAIL));
        } else {
            AbstractC0845c0.C0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f39343M) {
            return;
        }
        this.f39343M = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = G.a.r(drawable).mutate();
            this.f39344N = drawable;
            ColorStateList colorStateList = this.f39342L;
            if (colorStateList != null) {
                G.a.o(drawable, colorStateList);
            }
        }
        this.f39367v.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39367v.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.f39367v.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f39342L = colorStateList;
        if (this.f39341K == null || (drawable = this.f39344N) == null) {
            return;
        }
        G.a.o(drawable, colorStateList);
        this.f39344N.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        setItemBackground(i10 == 0 ? null : C.b.e(getContext(), i10));
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f39358e != i10) {
            this.f39358e = i10;
            n();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f39357d != i10) {
            this.f39357d = i10;
            n();
        }
    }

    public void setItemPosition(int i10) {
        this.f39339I = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f39355b = colorStateList;
        o();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f39363j != i10) {
            this.f39363j = i10;
            y();
            x(getWidth());
            n();
        }
    }

    public void setShifting(boolean z9) {
        if (this.f39364k != z9) {
            this.f39364k = z9;
            n();
        }
    }

    public void setTextAppearanceActive(int i10) {
        this.f39340J = i10;
        r(this.f39338H, i10);
        e(this.f39337G.getTextSize(), this.f39338H.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z9) {
        setTextAppearanceActive(this.f39340J);
        TextView textView = this.f39338H;
        textView.setTypeface(textView.getTypeface(), z9 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i10) {
        r(this.f39337G, i10);
        e(this.f39337G.getTextSize(), this.f39338H.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f39337G.setTextColor(colorStateList);
            this.f39338H.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f39337G.setText(charSequence);
        this.f39338H.setText(charSequence);
        g gVar = this.f39341K;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        g gVar2 = this.f39341K;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f39341K.getTooltipText();
        }
        m0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f39356c = drawable;
        o();
    }
}
