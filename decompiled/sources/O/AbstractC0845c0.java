package O;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: O.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0845c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f3797a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f3798b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f3799c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f3800d = {B.c.f77b, B.c.f78c, B.c.f89n, B.c.f100y, B.c.f58B, B.c.f59C, B.c.f60D, B.c.f61E, B.c.f62F, B.c.f63G, B.c.f79d, B.c.f80e, B.c.f81f, B.c.f82g, B.c.f83h, B.c.f84i, B.c.f85j, B.c.f86k, B.c.f87l, B.c.f88m, B.c.f90o, B.c.f91p, B.c.f92q, B.c.f93r, B.c.f94s, B.c.f95t, B.c.f96u, B.c.f97v, B.c.f98w, B.c.f99x, B.c.f101z, B.c.f57A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final L f3801e = new L() { // from class: O.b0
        @Override // O.L
        public final C0846d a(C0846d c0846d) {
            return AbstractC0845c0.a(c0846d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f3802f = new e();

    /* JADX INFO: renamed from: O.c0$a */
    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: O.c0$b */
    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: O.c0$c */
    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.c(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: O.c0$d */
    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // O.AbstractC0845c0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: O.c0$f */
    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f3805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3807d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f3806c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f3804a);
            if (this.f3805b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC0845c0.j(view);
                view.setTag(this.f3804a, obj);
                AbstractC0845c0.V(view, this.f3807d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f3804a = i10;
            this.f3805b = cls;
            this.f3807d = i11;
            this.f3806c = i12;
        }
    }

    /* JADX INFO: renamed from: O.c0$g */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: O.c0$h */
    private static class h {

        /* JADX INFO: renamed from: O.c0$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            C0 f3808a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f3809b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ J f3810c;

            a(View view, J j10) {
                this.f3809b = view;
                this.f3810c = j10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0 c0Y = C0.y(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f3809b);
                    if (c0Y.equals(this.f3808a)) {
                        return this.f3810c.a(view, c0Y).w();
                    }
                }
                this.f3808a = c0Y;
                C0 c0A = this.f3810c.a(view, c0Y);
                if (i10 >= 30) {
                    return c0A.w();
                }
                AbstractC0845c0.j0(view);
                return c0A.w();
            }
        }

        static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(B.c.f75S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static C0 b(@NonNull View view, @NonNull C0 c10, @NonNull Rect rect) {
            WindowInsets windowInsetsW = c10.w();
            if (windowInsetsW != null) {
                return C0.y(view.computeSystemWindowInsets(windowInsetsW, rect), view);
            }
            rect.setEmpty();
            return c10;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(@NonNull View view) {
            return view.getZ();
        }

        static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void k(View view, float f10) {
            view.setElevation(f10);
        }

        static void l(View view, boolean z9) {
            view.setNestedScrollingEnabled(z9);
        }

        static void m(@NonNull View view, J j10) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(B.c.f68L, j10);
            }
            if (j10 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(B.c.f75S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, j10));
            }
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: O.c0$i */
    private static class i {
        public static C0 a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0 c0X = C0.x(rootWindowInsets);
            c0X.u(c0X);
            c0X.d(view.getRootView());
            return c0X;
        }

        static void b(@NonNull View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: renamed from: O.c0$j */
    static class j {
        static void a(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: renamed from: O.c0$k */
    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* JADX INFO: renamed from: O.c0$l */
    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z9) {
            view.setAccessibilityHeading(z9);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z9) {
            view.setScreenReaderFocusable(z9);
        }
    }

    /* JADX INFO: renamed from: O.c0$m */
    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX INFO: renamed from: O.c0$n */
    private static class n {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static d1 b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return d1.g(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: O.c0$o */
    private static final class o {
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0846d b(@NonNull View view, @NonNull C0846d c0846d) {
            ContentInfo contentInfoF = c0846d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c0846d : C0846d.g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: renamed from: O.c0$p */
    static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f3811d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f3812a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f3813b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f3814c = null;

        p() {
        }

        static p a(View view) {
            p pVar = (p) view.getTag(B.c.f73Q);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(B.c.f73Q, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f3812a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f3813b == null) {
                this.f3813b = new SparseArray();
            }
            return this.f3813b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(B.c.f74R);
            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
                return false;
            }
            p070h.w.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f3812a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f3811d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f3812a == null) {
                        this.f3812a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f3811d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f3812a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3812a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f3814c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f3814c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static void A0(View view, J j10) {
        h.m(view, j10);
    }

    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(B.c.f70N);
    }

    public static void C0(View view, N n10) {
        j.a(view, (PointerIcon) (n10 != null ? n10.a() : null));
    }

    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, boolean z9) {
        l0().f(view, Boolean.valueOf(z9));
    }

    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view, CharSequence charSequence) {
        I0().f(view, charSequence);
    }

    public static C0 G(View view) {
        return i.a(view);
    }

    public static void G0(View view, String str) {
        h.n(view, str);
    }

    public static CharSequence H(View view) {
        return (CharSequence) I0().e(view);
    }

    public static void H0(View view, C0871p0.b bVar) {
        C0871p0.d(view, bVar);
    }

    public static String I(View view) {
        return h.f(view);
    }

    private static f I0() {
        return new c(B.c.f72P, CharSequence.class, 64, 30);
    }

    public static d1 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC0869o0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void J0(View view) {
        h.o(view);
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(View view) {
        return h.g(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.h(view);
    }

    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(View view) {
        Boolean bool = (Boolean) l0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void V(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z9 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z9) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z9 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z9) {
                    accessibilityEventObtain.getText().add(o(view));
                    w0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void W(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void X(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static C0 Y(View view, C0 c10) {
        WindowInsets windowInsetsW = c10.w();
        if (windowInsetsW != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsW);
            if (!windowInsetsB.equals(windowInsetsW)) {
                return C0.y(windowInsetsB, view);
            }
        }
        return c10;
    }

    public static void Z(View view, P.A a10) {
        view.onInitializeAccessibilityNodeInfo(a10.W0());
    }

    public static /* synthetic */ C0846d a(C0846d c0846d) {
        return c0846d;
    }

    private static f a0() {
        return new b(B.c.f67K, CharSequence.class, 8, 28);
    }

    private static f b() {
        return new d(B.c.f66J, Boolean.class, 28);
    }

    public static boolean b0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static int c(View view, CharSequence charSequence, P.D d10) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new P.A.a(iQ, charSequence, d10));
        }
        return iQ;
    }

    public static C0846d c0(View view, C0846d c0846d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0846d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c0846d);
        }
        K k10 = (K) view.getTag(B.c.f69M);
        if (k10 == null) {
            return v(view).a(c0846d);
        }
        C0846d c0846dA = k10.a(view, c0846d);
        if (c0846dA == null) {
            return null;
        }
        return v(view).a(c0846dA);
    }

    private static void d(View view, P.A.a aVar) {
        j(view);
        h0(aVar.b(), view);
        p(view).add(aVar);
        V(view, 0);
    }

    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static C0861k0 e(View view) {
        if (f3797a == null) {
            f3797a = new WeakHashMap();
        }
        C0861k0 c0861k0 = (C0861k0) f3797a.get(view);
        if (c0861k0 != null) {
            return c0861k0;
        }
        C0861k0 c0861k1 = new C0861k0(view);
        f3797a.put(view, c0861k1);
        return c0861k1;
    }

    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static C0 f(View view, C0 c10, Rect rect) {
        return h.b(view, c10, rect);
    }

    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static C0 g(View view, C0 c10) {
        WindowInsets windowInsetsW = c10.w();
        if (windowInsetsW != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsW);
            if (!windowInsetsA.equals(windowInsetsW)) {
                return C0.y(windowInsetsA, view);
            }
        }
        return c10;
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        V(view, 0);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    private static void h0(int i10, View view) {
        List listP = p(view);
        for (int i11 = 0; i11 < listP.size(); i11++) {
            if (((P.A.a) listP.get(i11)).b() == i10) {
                listP.remove(i11);
                return;
            }
        }
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    public static void i0(View view, P.A.a aVar, CharSequence charSequence, P.D d10) {
        if (d10 == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, d10));
        }
    }

    static void j(View view) {
        C0840a c0840aL = l(view);
        if (c0840aL == null) {
            c0840aL = new C0840a();
        }
        m0(view, c0840aL);
    }

    public static void j0(View view) {
        g.c(view);
    }

    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static C0840a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof C0840a.C0065a ? ((C0840a.C0065a) accessibilityDelegateM).f3788a : new C0840a(accessibilityDelegateM);
    }

    private static f l0() {
        return new a(B.c.f71O, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : n(view);
    }

    public static void m0(View view, C0840a c0840a) {
        if (c0840a == null && (m(view) instanceof C0840a.C0065a)) {
            c0840a = new C0840a();
        }
        w0(view);
        view.setAccessibilityDelegate(c0840a == null ? null : c0840a.d());
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f3799c) {
            return null;
        }
        if (f3798b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3798b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3799c = true;
                return null;
            }
        }
        try {
            Object obj = f3798b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3799c = true;
            return null;
        }
    }

    public static void n0(View view, boolean z9) {
        b().f(view, Boolean.valueOf(z9));
    }

    public static CharSequence o(View view) {
        return (CharSequence) a0().e(view);
    }

    public static void o0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    private static List p(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(B.c.f64H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(B.c.f64H, arrayList2);
        return arrayList2;
    }

    public static void p0(View view, CharSequence charSequence) {
        a0().f(view, charSequence);
        if (charSequence != null) {
            f3802f.a(view);
        } else {
            f3802f.d(view);
        }
    }

    private static int q(View view, CharSequence charSequence) {
        List listP = p(view);
        for (int i10 = 0; i10 < listP.size(); i10++) {
            if (TextUtils.equals(charSequence, ((P.A.a) listP.get(i10)).c())) {
                return ((P.A.a) listP.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f3800d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z9 = true;
            for (int i14 = 0; i14 < listP.size(); i14++) {
                z9 &= ((P.A.a) listP.get(i14)).b() != i13;
            }
            if (z9) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    public static void r0(View view, ColorStateList colorStateList) {
        h.i(view, colorStateList);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, PorterDuff.Mode mode) {
        h.j(view, mode);
    }

    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static float u(View view) {
        return h.e(view);
    }

    public static void u0(View view, float f10) {
        h.k(view, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static L v(View view) {
        return view instanceof L ? (L) view : f3801e;
    }

    public static void v0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    private static void w0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    public static void x0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i10);
        }
    }

    public static int y(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void y0(View view, int i10) {
        view.setLabelFor(i10);
    }

    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, boolean z9) {
        h.l(view, z9);
    }

    /* JADX INFO: renamed from: O.c0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap f3803a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z9 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z9) {
                AbstractC0845c0.V(view, z9 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z9));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f3803a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f3803a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f3803a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
