package com.swmansion.rnscreens;

import O.AbstractC0855h0;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC1144o;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.I0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.swmansion.rnscreens.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6814s extends AbstractC6803g implements C6817v.a, K7.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final b f42513e0 = new b(null);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Boolean f42514G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f42515H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f42516I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f42517J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float f42518K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f42519L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private List f42520M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f42521N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f42522O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f42523P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f42524Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f42525R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private C6819x f42526S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f42527T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Boolean f42528U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Boolean f42529V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Integer f42530W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Integer f42531a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Boolean f42532b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Boolean f42533c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f42534d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final E0 f42535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private A f42536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C6816u f42537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f42538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f42540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c f42541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f42542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f42543m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f42544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f42545w;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$a */
    public enum a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42550e = p189s8.a.a(c());
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$c */
    public enum c {
        PUSH,
        POP;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42554d = p189s8.a.a(c());
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$d */
    public enum d {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM,
        IOS_FROM_RIGHT,
        IOS_FROM_LEFT;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42565k = p189s8.a.a(c());
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$e */
    public enum e {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL,
        FORM_SHEET;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42571f = p189s8.a.a(c());
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$f */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42572a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.TRANSPARENT_MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.FORM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42572a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.s$g */
    public enum g {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_COLOR,
        NAVIGATION_BAR_TRANSLUCENT,
        NAVIGATION_BAR_HIDDEN;


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42583k = p189s8.a.a(c());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6814s(E0 reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f42535e = reactContext;
        this.f42540j = e.PUSH;
        this.f42541k = c.POP;
        this.f42542l = d.DEFAULT;
        this.f42543m = true;
        this.f42519L = true;
        this.f42520M = CollectionsKt.n(Double.valueOf(1.0d));
        this.f42521N = -1;
        this.f42523P = true;
        this.f42524Q = 24.0f;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f42534d0 = true;
    }

    private final void e(int i10, int i11, int i12) {
        b(i10, i11, i12);
    }

    private final void f(int i10, boolean z9) {
        int iE = I0.e(this.f42535e);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.c(new H7.s(iE, getId(), i10, z9));
        }
    }

    public static /* synthetic */ void getNavigationBarColor$annotations() {
    }

    public static /* synthetic */ void getStatusBarColor$annotations() {
    }

    private final void h(ViewGroup viewGroup) {
        for (View view : AbstractC0855h0.a(viewGroup)) {
            viewGroup.endViewTransition(view);
            if (view instanceof W) {
                h(((W) view).getToolbar());
            }
            if (view instanceof ViewGroup) {
                h((ViewGroup) view);
            }
        }
    }

    private final boolean i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && i((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final boolean k() {
        return this.f42537g instanceof L;
    }

    private final void r(int i10) {
        Context context = getContext();
        Intrinsics.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = I0.e(reactContext);
        EventDispatcher eventDispatcherC = I0.c(reactContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.c(new H7.d(iE, getId(), i10));
        }
    }

    private final void y(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((viewGroup instanceof androidx.swiperefreshlayout.widget.c) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i10);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof W) {
                    y(((W) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    y((ViewGroup) childAt);
                }
            }
        }
    }

    @Override // com.swmansion.rnscreens.C6817v.a
    public void a(boolean z9, int i10, int i11, int i12, int i13) {
        BottomSheetBehavior<C6814s> sheetBehavior;
        int i14 = i13 - i11;
        if (G7.j.d(this) && G7.j.b(this) && (sheetBehavior = getSheetBehavior()) != null) {
            G7.a.b(sheetBehavior, Integer.valueOf(i14), false, 2, null);
        }
    }

    public final void d(int i10) {
        C6800d toolbar;
        setImportantForAccessibility(i10);
        W headerConfig = getHeaderConfig();
        if (headerConfig == null || (toolbar = headerConfig.getToolbar()) == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public final void g() {
        if (this.f42515H) {
            this.f42515H = false;
            h(this);
        }
    }

    @Nullable
    public final a getActivityState() {
        return this.f42538h;
    }

    @Override // K7.b
    @Nullable
    public ComponentCallbacksC1144o getAssociatedFragment() {
        return getFragment();
    }

    @Nullable
    public final C6816u getContainer() {
        return this.f42537g;
    }

    @Nullable
    public final C6817v getContentWrapper() {
        Object next;
        Iterator it = AbstractC0855h0.a(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next) instanceof C6817v));
        if (next instanceof C6817v) {
            return (C6817v) next;
        }
        return null;
    }

    @Nullable
    public final C6819x getFooter() {
        return this.f42526S;
    }

    @Nullable
    public final ComponentCallbacksC1144o getFragment() {
        A a10 = this.f42536f;
        if (a10 != null) {
            return a10.c();
        }
        return null;
    }

    @Nullable
    public final A getFragmentWrapper() {
        return this.f42536f;
    }

    @Nullable
    public final W getHeaderConfig() {
        Object next;
        Iterator it = AbstractC0855h0.a(this).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next) instanceof W));
        if (next instanceof W) {
            return (W) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f42534d0;
    }

    @Nullable
    public final Integer getNavigationBarColor() {
        return this.f42531a0;
    }

    @NotNull
    public final E0 getReactContext() {
        return this.f42535e;
    }

    @Nullable
    public final EventDispatcher getReactEventDispatcher() {
        return I0.c(this.f42535e, getId());
    }

    @NotNull
    public final c getReplaceAnimation() {
        return this.f42541k;
    }

    @Nullable
    public final String getScreenId() {
        return this.f42545w;
    }

    @Nullable
    public final Integer getScreenOrientation() {
        return this.f42544v;
    }

    @Nullable
    public final BottomSheetBehavior<C6814s> getSheetBehavior() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        CoordinatorLayout.c cVarE = fVar != null ? fVar.e() : null;
        if (cVarE instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarE;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f42523P;
    }

    public final float getSheetCornerRadius() {
        return this.f42518K;
    }

    @NotNull
    public final List<Double> getSheetDetents() {
        return this.f42520M;
    }

    public final float getSheetElevation() {
        return this.f42524Q;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f42519L;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f42522O;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f42521N;
    }

    public final boolean getShouldTriggerPostponedTransitionAfterLayout() {
        return this.f42525R;
    }

    @NotNull
    public final d getStackAnimation() {
        return this.f42542l;
    }

    @NotNull
    public final e getStackPresentation() {
        return this.f42540j;
    }

    @Nullable
    public final Integer getStatusBarColor() {
        return this.f42530W;
    }

    @Nullable
    public final String getStatusBarStyle() {
        return this.f42527T;
    }

    public final boolean j() {
        return this.f42515H;
    }

    public final Boolean l() {
        return this.f42533c0;
    }

    public final Boolean m() {
        return this.f42532b0;
    }

    public final Boolean n() {
        return this.f42514G;
    }

    public final Boolean o() {
        return this.f42528U;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ComponentCallbacksC1144o fragment;
        T tA;
        G7.h hVarW;
        super.onAttachedToWindow();
        if (!G7.j.d(this) || (fragment = getFragment()) == null || (tA = I7.a.a(fragment)) == null || (hVarW = tA.W()) == null) {
            return;
        }
        C6806j.f42443a.b(hVarW);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        if (z9 && k() && !G7.j.d(this)) {
            e(i12 - i10, i13 - i11, i11);
            r(i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (G7.j.d(this)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final Boolean p() {
        return this.f42529V;
    }

    public final boolean q() {
        int i10 = f.f42572a[this.f42540j.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public final void s(boolean z9) {
        if (G7.j.d(this) && k()) {
            if (z9) {
                e(getWidth(), getHeight(), getTop());
            }
            C6819x c6819x = this.f42526S;
            if (c6819x != null) {
                int left = getLeft();
                int top = getTop();
                int right = getRight();
                int bottom = getBottom();
                C6816u c6816u = this.f42537g;
                Intrinsics.c(c6816u);
                c6819x.I(z9, left, top, right, bottom, c6816u.getHeight());
            }
        }
    }

    public final void setActivityState(@NotNull a activityState) {
        Intrinsics.checkNotNullParameter(activityState, "activityState");
        a aVar = this.f42538h;
        if (activityState == aVar) {
            return;
        }
        if ((this.f42537g instanceof L) && aVar != null) {
            Intrinsics.c(aVar);
            if (activityState.compareTo(aVar) < 0) {
                throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
            }
        }
        this.f42538h = activityState;
        C6816u c6816u = this.f42537g;
        if (c6816u != null) {
            c6816u.q();
        }
    }

    public final void setBeingRemoved(boolean z9) {
        this.f42515H = z9;
    }

    public final void setContainer(@Nullable C6816u c6816u) {
        this.f42537g = c6816u;
    }

    public final void setFooter(@Nullable C6819x c6819x) {
        BottomSheetBehavior<C6814s> sheetBehavior;
        if (c6819x == null && this.f42526S != null) {
            BottomSheetBehavior<C6814s> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                C6819x c6819x2 = this.f42526S;
                Intrinsics.c(c6819x2);
                c6819x2.O(sheetBehavior2);
            }
        } else if (c6819x != null && (sheetBehavior = getSheetBehavior()) != null) {
            c6819x.J(sheetBehavior);
        }
        this.f42526S = c6819x;
    }

    public final void setFragmentWrapper(@Nullable A a10) {
        this.f42536f = a10;
    }

    public final void setGestureEnabled(boolean z9) {
        this.f42543m = z9;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z9) {
        this.f42534d0 = z9;
    }

    public final void setNavigationBarColor(@Nullable Integer num) {
        if (num != null) {
            d0.f42321a.e();
        }
        this.f42531a0 = num;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.q(this, a10.b());
        }
    }

    public final void setNavigationBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            d0.f42321a.e();
        }
        this.f42533c0 = bool;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.r(this, a10.b());
        }
    }

    public final void setNavigationBarTranslucent(@Nullable Boolean bool) {
        if (bool != null) {
            d0.f42321a.e();
        }
        this.f42532b0 = bool;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.s(this, a10.b());
        }
    }

    public final void setReplaceAnimation(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f42541k = cVar;
    }

    public final void setScreenId(@Nullable String str) {
        this.f42545w = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    public final void setScreenOrientation(@Nullable String str) {
        int i10;
        if (str == null) {
            this.f42544v = null;
            return;
        }
        d0 d0Var = d0.f42321a;
        d0Var.f();
        switch (str) {
            case "portrait_down":
                i10 = 9;
                break;
            case "all":
                i10 = 10;
                break;
            case "portrait":
                i10 = 7;
                break;
            case "landscape":
                i10 = 6;
                break;
            case "portrait_up":
                i10 = 1;
                break;
            case "landscape_left":
                i10 = 8;
                break;
            case "landscape_right":
                i10 = 0;
                break;
            default:
                i10 = -1;
                break;
        }
        this.f42544v = Integer.valueOf(i10);
        A a10 = this.f42536f;
        if (a10 != null) {
            d0Var.t(this, a10.b());
        }
    }

    public final void setSheetClosesOnTouchOutside(boolean z9) {
        this.f42523P = z9;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.f42518K == f10) {
            return;
        }
        this.f42518K = f10;
        this.f42517J = true;
    }

    public final void setSheetDetents(@NotNull List<Double> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f42520M = list;
    }

    public final void setSheetElevation(float f10) {
        this.f42524Q = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z9) {
        this.f42519L = z9;
    }

    public final void setSheetGrabberVisible(boolean z9) {
        this.f42516I = z9;
    }

    public final void setSheetInitialDetentIndex(int i10) {
        this.f42522O = i10;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i10) {
        this.f42521N = i10;
    }

    public final void setShouldTriggerPostponedTransitionAfterLayout(boolean z9) {
        this.f42525R = z9;
    }

    public final void setStackAnimation(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f42542l = dVar;
    }

    public final void setStackPresentation(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f42540j = eVar;
    }

    public final void setStatusBarAnimated(@Nullable Boolean bool) {
        this.f42514G = bool;
    }

    public final void setStatusBarColor(@Nullable Integer num) {
        if (num != null) {
            d0.f42321a.g();
        }
        this.f42530W = num;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.m(this, a10.b(), a10.k());
        }
    }

    public final void setStatusBarHidden(@Nullable Boolean bool) {
        if (bool != null) {
            d0.f42321a.g();
        }
        this.f42528U = bool;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.o(this, a10.b());
        }
    }

    public final void setStatusBarStyle(@Nullable String str) {
        if (str != null) {
            d0.f42321a.g();
        }
        this.f42527T = str;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.v(this, a10.b(), a10.k());
        }
    }

    public final void setStatusBarTranslucent(@Nullable Boolean bool) {
        if (bool != null) {
            d0.f42321a.g();
        }
        this.f42529V = bool;
        A a10 = this.f42536f;
        if (a10 != null) {
            d0.f42321a.w(this, a10.b(), a10.k());
        }
    }

    public final void setTransitioning(boolean z9) {
        if (this.f42539i == z9) {
            return;
        }
        this.f42539i = z9;
        boolean zI = i(this);
        if (!zI || getLayerType() == 2) {
            super.setLayerType((!z9 || zI) ? 0 : 2, null);
        }
    }

    public final void t() {
        if (this.f42517J) {
            this.f42517J = false;
            u();
        }
    }

    public final void u() {
        if (this.f42540j != e.FORM_SHEET || getBackground() == null) {
            return;
        }
        Drawable background = getBackground();
        K5.g gVar = background instanceof K5.g ? (K5.g) background : null;
        if (gVar != null) {
            float fG = C1356f0.g(this.f42518K);
            K5.k.b bVar = new K5.k.b();
            bVar.y(0, fG);
            bVar.D(0, fG);
            gVar.setShapeAppearanceModel(bVar.m());
        }
    }

    public final void v(int i10, boolean z9) {
        f(i10, z9);
        if (z9) {
            b(getWidth(), getHeight(), getTop());
        }
    }

    public final void w(C6817v wrapper) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        wrapper.setDelegate$react_native_screens_release(this);
    }

    public final void x() {
        if (this.f42515H) {
            return;
        }
        this.f42515H = true;
        y(this);
    }
}
