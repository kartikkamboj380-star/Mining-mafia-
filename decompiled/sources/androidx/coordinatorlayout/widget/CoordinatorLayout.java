package androidx.coordinatorlayout.widget;

import O.AbstractC0845c0;
import O.AbstractC0875s;
import O.C0;
import O.G;
import O.H;
import O.I;
import O.J;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements G, H {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    static final String f9053K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    static final Class[] f9054L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final ThreadLocal f9055M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    static final Comparator f9056N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final N.d f9057O;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Drawable f9058G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f9059H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private J f9060I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final I f9061J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f9063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f9065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f9066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f9067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f9068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f9070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f9071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f9072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private g f9073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f9074m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C0 f9075v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9076w;

    class a implements J {
        a() {
        }

        @Override // O.J
        public C0 a(View view, C0 c10) {
            return CoordinatorLayout.this.Z(c10);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return z(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z9) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                p(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                r(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            s(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                u(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public C0 f(CoordinatorLayout coordinatorLayout, View view, C0 c10) {
            return c10;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f9059H;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f9059H;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fL = AbstractC0845c0.L(view);
            float fL2 = AbstractC0845c0.L(view2);
            if (fL > fL2) {
                return -1;
            }
            return fL < fL2 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f9053K = r10 != null ? r10.getName() : null;
        f9056N = new i();
        f9054L = new Class[]{Context.class, AttributeSet.class};
        f9055M = new ThreadLocal();
        f9057O = new N.e(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void A(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f9056N;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f9063b.k(view);
    }

    private void D(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f9075v != null && AbstractC0845c0.w(this) && !AbstractC0845c0.w(view)) {
            rectA.left += this.f9075v.k();
            rectA.top += this.f9075v.m();
            rectA.right -= this.f9075v.l();
            rectA.bottom -= this.f9075v.j();
        }
        Rect rectA2 = a();
        AbstractC0875s.a(V(fVar.f9081c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        R(rectA);
        R(rectA2);
    }

    private void E(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            u(view2, rectA);
            v(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            R(rectA);
            R(rectA2);
        }
    }

    private void F(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC0875s.b(W(fVar.f9081c), i11);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iX = x(i10) - measuredWidth;
        if (i13 == 1) {
            iX += measuredWidth / 2;
        } else if (i13 == 5) {
            iX += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent G(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void H(View view, Rect rect, int i10) {
        boolean z9;
        boolean z10;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (AbstractC0845c0.R(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            R(rectA2);
            if (rectA.isEmpty()) {
                R(rectA);
                return;
            }
            int iB = AbstractC0875s.b(fVar.f9086h, i10);
            boolean z11 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f9088j) >= (i16 = rect.top)) {
                z9 = false;
            } else {
                Y(view, i16 - i15);
                z9 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f9088j) < (i14 = rect.bottom)) {
                Y(view, height - i14);
                z9 = true;
            }
            if (!z9) {
                Y(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f9087i) >= (i13 = rect.left)) {
                z10 = false;
            } else {
                X(view, i13 - i12);
                z10 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f9087i) >= (i11 = rect.right)) {
                z11 = z10;
            } else {
                X(view, width - i11);
            }
            if (!z11) {
                X(view, 0);
            }
            R(rectA);
        }
    }

    static c M(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f9053K;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f9055M;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f9054L);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean N(c cVar, View view, MotionEvent motionEvent, int i10) {
        if (i10 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i10 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean O(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f9064c;
        A(list);
        int size = list.size();
        MotionEvent motionEventG = null;
        boolean zN = false;
        boolean z9 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zN || z9) || actionMasked == 0) {
                if (!z9 && !zN && cVarE != null && (zN = N(cVarE, view, motionEvent, i10))) {
                    this.f9071j = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            View view2 = (View) list.get(i12);
                            c cVarE2 = ((f) view2.getLayoutParams()).e();
                            if (cVarE2 != null) {
                                if (motionEventG == null) {
                                    motionEventG = G(motionEvent);
                                }
                                N(cVarE2, view2, motionEventG, i10);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z9 = zH && !zC;
                if (zH && !z9) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventG == null) {
                    motionEventG = G(motionEvent);
                }
                N(cVarE, view, motionEventG, i10);
            }
        }
        list.clear();
        if (motionEventG != null) {
            motionEventG.recycle();
        }
        return zN;
    }

    private void P() {
        this.f9062a.clear();
        this.f9063b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f9063b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f9063b.d(childAt2)) {
                            this.f9063b.b(childAt2);
                        }
                        this.f9063b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f9062a.addAll(this.f9063b.j());
        Collections.reverse(this.f9062a);
    }

    private static void R(Rect rect) {
        rect.setEmpty();
        f9057O.a(rect);
    }

    private void T() {
        View view = this.f9071j;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                cVarE.D(this, this.f9071j, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f9071j = null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).l();
        }
        this.f9068g = false;
    }

    private static int U(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int V(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & 112) == 0 ? i10 | 48 : i10;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void X(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f9087i;
        if (i11 != i10) {
            AbstractC0845c0.W(view, i10 - i11);
            fVar.f9087i = i10;
        }
    }

    private void Y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f9088j;
        if (i11 != i10) {
            AbstractC0845c0.X(view, i10 - i11);
            fVar.f9088j = i10;
        }
    }

    private static Rect a() {
        Rect rect = (Rect) f9057O.b();
        return rect == null ? new Rect() : rect;
    }

    private void a0() {
        if (!AbstractC0845c0.w(this)) {
            AbstractC0845c0.A0(this, null);
            return;
        }
        if (this.f9060I == null) {
            this.f9060I = new a();
        }
        AbstractC0845c0.A0(this, this.f9060I);
        setSystemUiVisibility(1280);
    }

    private void c() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                }
                cVarE.k(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int d(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void e(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private C0 f(C0 c10) {
        c cVarE;
        if (c10.p()) {
            return c10;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (AbstractC0845c0.w(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                c10 = cVarE.f(this, childAt, c10);
                if (c10.p()) {
                    return c10;
                }
            }
        }
        return c10;
    }

    private void w(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iB = AbstractC0875s.b(U(fVar.f9081c), i10);
        int iB2 = AbstractC0875s.b(V(fVar.f9082d), i10);
        int i13 = iB & 7;
        int i14 = iB & 112;
        int i15 = iB2 & 7;
        int i16 = iB2 & 112;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int x(int i10) {
        int[] iArr = this.f9070i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    public boolean C(View view, int i10, int i11) {
        Rect rectA = a();
        u(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            R(rectA);
        }
    }

    void I(View view, int i10) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f9089k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            u(fVar.f9089k, rectA);
            r(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z9 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            e(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                AbstractC0845c0.W(view, i11);
            }
            if (i12 != 0) {
                AbstractC0845c0.X(view, i12);
            }
            if (z9 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f9089k);
            }
            R(rectA);
            R(rectA2);
            R(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void J(int i10) {
        int i11;
        c cVarE;
        boolean zH;
        int iZ = AbstractC0845c0.z(this);
        int size = this.f9062a.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f9062a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f9090l == ((View) this.f9062a.get(i13))) {
                        I(view, iZ);
                    }
                }
                r(view, true, rectA2);
                if (fVar.f9085g != 0 && !rectA2.isEmpty()) {
                    int iB = AbstractC0875s.b(fVar.f9085g, iZ);
                    int i14 = iB & 112;
                    if (i14 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i14 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i15 = iB & 7;
                    if (i15 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i15 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f9086h != 0 && view.getVisibility() == 0) {
                    H(view, rectA, iZ);
                }
                if (i10 != 2) {
                    y(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        Q(view, rectA2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = (View) this.f9062a.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarE = fVar2.e();
                            if (cVarE == null && cVarE.e(this, view2, view)) {
                                if (i10 == 0 && fVar2.f()) {
                                    fVar2.j();
                                } else {
                                    if (i10 != 2) {
                                        zH = cVarE.h(this, view2, view);
                                    } else {
                                        cVarE.i(this, view2, view);
                                        zH = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.o(zH);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = (View) this.f9062a.get(i11);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarE = fVar3.e();
                        if (cVarE == null) {
                        }
                    }
                }
            }
        }
        R(rectA);
        R(rectA2);
        R(rectA3);
    }

    public void K(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f9089k;
        if (view2 != null) {
            E(view, view2, i10);
            return;
        }
        int i11 = fVar.f9083e;
        if (i11 >= 0) {
            F(view, i11, i10);
        } else {
            D(view, i10);
        }
    }

    public void L(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void S() {
        if (this.f9069h && this.f9073l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9073l);
        }
        this.f9074m = false;
    }

    final C0 Z(C0 c10) {
        if (N.b.a(this.f9075v, c10)) {
            return c10;
        }
        this.f9075v = c10;
        boolean z9 = false;
        boolean z10 = c10 != null && c10.m() > 0;
        this.f9076w = z10;
        if (!z10 && getBackground() == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        C0 c0F = f(c10);
        requestLayout();
        return c0F;
    }

    void b() {
        if (this.f9069h) {
            if (this.f9073l == null) {
                this.f9073l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9073l);
        }
        this.f9074m = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f9079a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.f9065d == null) {
                    this.f9065d = new Paint();
                }
                this.f9065d.setColor(fVar.f9079a.c(this, view));
                this.f9065d.setAlpha(d(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f9065d);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9058G;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void g(View view) {
        ArrayList arrayListH = this.f9063b.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayListH.size(); i10++) {
            View view2 = (View) arrayListH.get(i10);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f9062a);
    }

    public final C0 getLastWindowInsets() {
        return this.f9075v;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9061J.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f9058G;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    void h() {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (B(getChildAt(i10))) {
                z9 = true;
                break;
            }
        }
        if (z9 != this.f9074m) {
            if (z9) {
                b();
            } else {
                S();
            }
        }
    }

    @Override // O.G
    public void i(View view, View view2, int i10, int i11) {
        c cVarE;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f9061J.c(view, view2, i10, i11);
        this.f9072k = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarE.v(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // O.G
    public void j(View view, int i10) {
        this.f9061J.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i10)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i10);
                }
                fVar.k(i10);
                fVar.j();
            }
        }
        this.f9072k = null;
    }

    @Override // O.G
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarE;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i12) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f9066e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i10, i11, iArr2, i12);
                    iMax = i10 > 0 ? Math.max(iMax, this.f9066e[0]) : Math.min(iMax, this.f9066e[0]);
                    iMax2 = i11 > 0 ? Math.max(iMax2, this.f9066e[1]) : Math.min(iMax2, this.f9066e[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z9) {
            J(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // O.H
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarE;
        int childCount = getChildCount();
        boolean z9 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i14) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f9066e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    iMax = i12 > 0 ? Math.max(iMax, this.f9066e[0]) : Math.min(iMax, this.f9066e[0]);
                    iMax2 = i13 > 0 ? Math.max(iMax2, this.f9066e[1]) : Math.min(iMax2, this.f9066e[1]);
                    z9 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z9) {
            J(1);
        }
    }

    @Override // O.G
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f9067f);
    }

    @Override // O.G
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z9 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i10, i11);
                    z9 |= zA;
                    fVar.q(i11, zA);
                } else {
                    fVar.q(i11, false);
                }
            }
        }
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
        if (this.f9074m) {
            if (this.f9073l == null) {
                this.f9073l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9073l);
        }
        if (this.f9075v == null && AbstractC0845c0.w(this)) {
            AbstractC0845c0.j0(this);
        }
        this.f9069h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T();
        if (this.f9074m && this.f9073l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9073l);
        }
        View view = this.f9072k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f9069h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9076w || this.f9058G == null) {
            return;
        }
        C0 c10 = this.f9075v;
        int iM = c10 != null ? c10.m() : 0;
        if (iM > 0) {
            this.f9058G.setBounds(0, 0, getWidth(), iM);
            this.f9058G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        boolean zO = O(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zO;
        }
        this.f9071j = null;
        T();
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        c cVarE;
        int iZ = AbstractC0845c0.z(this);
        int size = this.f9062a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f9062a.get(i14);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iZ))) {
                K(view, iZ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarE;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.P();
        coordinatorLayout.h();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iZ = AbstractC0845c0.z(coordinatorLayout);
        boolean z9 = iZ == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z10 = coordinatorLayout.f9075v != null && AbstractC0845c0.w(coordinatorLayout);
        int size3 = coordinatorLayout.f9062a.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = (View) coordinatorLayout.f9062a.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iZ;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i28 = fVar.f9083e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iX = coordinatorLayout.x(i28);
                    int iB = AbstractC0875s.b(W(fVar.f9081c), iZ) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iB != 3 || z9) && !(iB == 5 && z9)) {
                        if ((iB == 5 && !z9) || (iB == 3 && z9)) {
                            iMax = Math.max(0, iX - paddingLeft);
                        }
                        if (z10 || AbstractC0845c0.w(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iK = coordinatorLayout.f9075v.k() + coordinatorLayout.f9075v.l();
                            int iM = coordinatorLayout.f9075v.m() + coordinatorLayout.f9075v.j();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iK, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iM, mode2);
                        }
                        cVarE = fVar.e();
                        if (cVarE != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iZ;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zM = cVarE.m(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iZ;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.L(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iX);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z10) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarE = fVar.e();
                    if (cVarE != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iZ;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zM = cVarE.m(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iZ;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.L(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z10) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarE = fVar.e();
                if (cVarE != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iZ;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zM = cVarE.m(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iZ;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.L(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iZ = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        c cVarE;
        View view2;
        float f12;
        float f13;
        boolean z10;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zN = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z10 = z9;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z10 = z9;
                    zN |= cVarE.n(this, childAt, view2, f12, f13, z10);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z10 = z9;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z9 = z10;
        }
        if (zN) {
            J(1);
        }
        return zN;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarE;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zO = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zO |= cVarE.o(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f9098c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = z(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f9098c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zO;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f9071j;
        boolean z9 = false;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            zO = cVarE != null ? cVarE.D(this, this.f9071j, motionEvent) : false;
        } else {
            zO = O(motionEvent, 1);
            if (actionMasked != 0 && zO) {
                z9 = true;
            }
        }
        if (this.f9071j == null || actionMasked == 3) {
            zO |= super.onTouchEvent(motionEvent);
        } else if (z9) {
            MotionEvent motionEventG = G(motionEvent);
            super.onTouchEvent(motionEventG);
            motionEventG.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zO;
        }
        this.f9071j = null;
        T();
        return zO;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void r(View view, boolean z9, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z9) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z9)) {
            return super.requestChildRectangleOnScreen(view, rect, z9);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        if (!z9 || this.f9068g) {
            return;
        }
        if (this.f9071j == null) {
            c();
        }
        T();
        this.f9068g = true;
    }

    public List s(View view) {
        List listI = this.f9063b.i(view);
        return listI == null ? Collections.EMPTY_LIST : listI;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z9) {
        super.setFitsSystemWindows(z9);
        a0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9059H = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f9058G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f9058G = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f9058G.setState(getDrawableState());
                }
                G.a.m(this.f9058G, AbstractC0845c0.z(this));
                this.f9058G.setVisible(getVisibility() == 0, false);
                this.f9058G.setCallback(this);
            }
            AbstractC0845c0.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? C.b.e(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f9058G;
        if (drawable == null || drawable.isVisible() == z9) {
            return;
        }
        this.f9058G.setVisible(z9, false);
    }

    public List t(View view) {
        List listG = this.f9063b.g(view);
        return listG == null ? Collections.EMPTY_LIST : listG;
    }

    void u(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void v(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9058G;
    }

    void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f9080b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
                fVar.f9080b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.n((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f9080b = true;
        }
        return fVar;
    }

    public CoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A.a.f1a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i10);
        this.f9062a = new ArrayList();
        this.f9063b = new androidx.coordinatorlayout.widget.a();
        this.f9064c = new ArrayList();
        this.f9066e = new int[2];
        this.f9067f = new int[2];
        this.f9061J = new I(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.c.f3a, 0, A.b.f2a);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.c.f3a, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            AbstractC0845c0.k0(coordinatorLayout, context2, A.c.f3a, attributeSet, typedArray, 0, A.b.f2a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            AbstractC0845c0.k0(coordinatorLayout, context2, A.c.f3a, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(A.c.f4b, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f9070i = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f9070i.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f9070i;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f9058G = typedArray.getDrawable(A.c.f5c);
        typedArray.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (AbstractC0845c0.x(this) == 0) {
            AbstractC0845c0.v0(this, 1);
        }
    }

    protected static class h extends T.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray f9098c;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f9098c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f9098c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // T.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f9098c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f9098c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f9098c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f9079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f9080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f9084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9086h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f9087i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f9088j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f9089k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f9090l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f9091m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f9092n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f9093o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f9094p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f9095q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f9096r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f9080b = false;
            this.f9081c = 0;
            this.f9082d = 0;
            this.f9083e = -1;
            this.f9084f = -1;
            this.f9085g = 0;
            this.f9086h = 0;
            this.f9095q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f9084f);
            this.f9089k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f9090l = null;
                    this.f9089k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f9084f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f9090l = null;
                this.f9089k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f9090l = null;
                    this.f9089k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f9090l = viewFindViewById;
        }

        private boolean r(View view, int i10) {
            int iB = AbstractC0875s.b(((f) view.getLayoutParams()).f9085g, i10);
            return iB != 0 && (AbstractC0875s.b(this.f9086h, i10) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f9089k.getId() != this.f9084f) {
                return false;
            }
            View view2 = this.f9089k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f9090l = null;
                    this.f9089k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f9090l = view2;
            return true;
        }

        boolean a() {
            return this.f9089k == null && this.f9084f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f9090l || r(view2, AbstractC0845c0.z(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f9079a;
            return cVar != null && cVar.e(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f9079a == null) {
                this.f9091m = false;
            }
            return this.f9091m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f9084f == -1) {
                this.f9090l = null;
                this.f9089k = null;
                return null;
            }
            if (this.f9089k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f9089k;
        }

        public c e() {
            return this.f9079a;
        }

        boolean f() {
            return this.f9094p;
        }

        Rect g() {
            return this.f9095q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z9 = this.f9091m;
            if (z9) {
                return true;
            }
            c cVar = this.f9079a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z9;
            this.f9091m = zA;
            return zA;
        }

        boolean i(int i10) {
            if (i10 == 0) {
                return this.f9092n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f9093o;
        }

        void j() {
            this.f9094p = false;
        }

        void k(int i10) {
            q(i10, false);
        }

        void l() {
            this.f9091m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f9079a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f9079a = cVar;
                this.f9096r = null;
                this.f9080b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z9) {
            this.f9094p = z9;
        }

        void p(Rect rect) {
            this.f9095q.set(rect);
        }

        void q(int i10, boolean z9) {
            if (i10 == 0) {
                this.f9092n = z9;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f9093o = z9;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9080b = false;
            this.f9081c = 0;
            this.f9082d = 0;
            this.f9083e = -1;
            this.f9084f = -1;
            this.f9085g = 0;
            this.f9086h = 0;
            this.f9095q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A.c.f6d);
            this.f9081c = typedArrayObtainStyledAttributes.getInteger(A.c.f7e, 0);
            this.f9084f = typedArrayObtainStyledAttributes.getResourceId(A.c.f8f, -1);
            this.f9082d = typedArrayObtainStyledAttributes.getInteger(A.c.f9g, 0);
            this.f9083e = typedArrayObtainStyledAttributes.getInteger(A.c.f13k, -1);
            this.f9085g = typedArrayObtainStyledAttributes.getInt(A.c.f12j, 0);
            this.f9086h = typedArrayObtainStyledAttributes.getInt(A.c.f11i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(A.c.f10h);
            this.f9080b = zHasValue;
            if (zHasValue) {
                this.f9079a = CoordinatorLayout.M(context, attributeSet, typedArrayObtainStyledAttributes.getString(A.c.f10h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f9079a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f9080b = false;
            this.f9081c = 0;
            this.f9082d = 0;
            this.f9083e = -1;
            this.f9084f = -1;
            this.f9085g = 0;
            this.f9086h = 0;
            this.f9095q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9080b = false;
            this.f9081c = 0;
            this.f9082d = 0;
            this.f9083e = -1;
            this.f9084f = -1;
            this.f9085g = 0;
            this.f9086h = 0;
            this.f9095q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9080b = false;
            this.f9081c = 0;
            this.f9082d = 0;
            this.f9083e = -1;
            this.f9084f = -1;
            this.f9085g = 0;
            this.f9086h = 0;
            this.f9095q = new Rect();
        }
    }
}
