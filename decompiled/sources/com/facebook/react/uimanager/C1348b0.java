package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.react.uimanager.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1348b0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f15537l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f15538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f15539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f15540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f15541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c1 f15542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final N3.a f15543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RootViewManager f15544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final T3.f f15545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f15546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f15547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashMap f15548k;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.b0$a */
    class a implements T3.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f15549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f15550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f15551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f15552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f15553e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i10) {
            this.f15549a = viewGroupManager;
            this.f15550b = viewGroup;
            this.f15551c = view;
            this.f15552d = set;
            this.f15553e = i10;
        }

        @Override // T3.g
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f15549a.removeView(this.f15550b, this.f15551c);
            C1348b0.this.m(this.f15551c);
            this.f15552d.remove(Integer.valueOf(this.f15551c.getId()));
            if (this.f15552d.isEmpty()) {
                C1348b0.this.f15548k.remove(Integer.valueOf(this.f15553e));
            }
        }
    }

    static {
        p064g3.b.a("NativeViewHierarchyManager", p064g3.a.ERROR);
        f15537l = C1348b0.class.getSimpleName();
    }

    public C1348b0(c1 c1Var) {
        this(c1Var, new RootViewManager());
    }

    private void B(View view, int i10, int i11, int i12, int i13) {
        if (this.f15547j && this.f15545h.j(view)) {
            this.f15545h.c(view, i10, i11, i12, i13);
        } else {
            view.layout(i10, i11, i10 + i12, i11 + i13);
        }
    }

    private boolean d(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void g(View view, int[] iArr) {
        this.f15546i.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
        r(view, this.f15546i);
        iArr[0] = Math.round(this.f15546i.left);
        iArr[1] = Math.round(this.f15546i.top);
        RectF rectF = this.f15546i;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.f15546i;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String i(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, Q0[] q0Arr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  children(");
            sb2.append(viewGroupManager.getChildCount(viewGroup));
            sb2.append("): [\n");
            sb.append(sb2.toString());
            for (int i10 = 0; viewGroupManager.getChildAt(viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt(viewGroup, i12) == null || i11 >= 16) {
                        break;
                    }
                    sb.append(viewGroupManager.getChildAt(viewGroup, i12).getId() + ",");
                    i11++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 >= iArr.length || i14 >= 16) {
                        break;
                    }
                    sb.append(iArr[i15] + ",");
                    i14++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (q0Arr != null) {
            sb.append("  viewsToAdd(" + q0Arr.length + "): [\n");
            for (int i16 = 0; i16 < q0Arr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 >= q0Arr.length || i17 >= 16) {
                        break;
                    }
                    sb.append("[" + q0Arr[i18].f15473b + "," + q0Arr[i18].f15472a + "],");
                    i17++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 >= iArr2.length || i20 >= 16) {
                        break;
                    }
                    sb.append(iArr2[i21] + ",");
                    i20++;
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    private Set o(int i10) {
        if (this.f15548k == null) {
            this.f15548k = new HashMap();
        }
        if (!this.f15548k.containsKey(Integer.valueOf(i10))) {
            this.f15548k.put(Integer.valueOf(i10), new HashSet());
        }
        return (Set) this.f15548k.get(Integer.valueOf(i10));
    }

    private void r(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void A(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) {
        Throwable th;
        Throwable th2;
        try {
            try {
                if (this.f15538a) {
                    try {
                        Z1.a.h(f15537l, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                p065g4.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i11).c();
                try {
                    View viewV = v(i11);
                    viewV.setLayoutDirection(T.a(hVar));
                    viewV.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                    ViewParent parent = viewV.getParent();
                    if (parent instanceof InterfaceC1395z0) {
                        try {
                            parent.requestLayout();
                        } catch (Throwable th4) {
                            th2 = th4;
                            p065g4.a.i(0L);
                            throw th2;
                        }
                    }
                    if (this.f15541d.get(i10)) {
                        try {
                            B(viewV, i12, i13, i14, i15);
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            p065g4.a.i(0L);
                            throw th2;
                        }
                    } else {
                        NativeModule nativeModule = (ViewManager) this.f15540c.get(i10);
                        if (!(nativeModule instanceof O)) {
                            throw new P("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                        }
                        O o10 = (O) nativeModule;
                        if (o10 != null && !o10.needsCustomLayoutForChildren()) {
                            B(viewV, i12, i13, i14, i15);
                        }
                    }
                    p065g4.a.i(0L);
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                th = th;
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public synchronized void C(int i10, C1385u0 c1385u0) {
        try {
            if (this.f15538a) {
                Z1.a.d(f15537l, "updateProperties[%d]: %s", Integer.valueOf(i10), c1385u0.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager viewManagerW = w(i10);
                View viewV = v(i10);
                if (c1385u0 != null) {
                    viewManagerW.updateProperties(viewV, c1385u0);
                }
            } catch (P e10) {
                Z1.a.n(f15537l, "Unable to update properties for view tag " + i10, e10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void D(int i10, Object obj) {
        try {
            if (this.f15538a) {
                Z1.a.d(f15537l, "updateViewExtraData[%d]: %s", Integer.valueOf(i10), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            w(i10).updateExtraData(v(i10), obj);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(int i10, View view) {
        c(i10, view);
    }

    protected final synchronized void c(int i10, View view) {
        try {
            if (this.f15538a) {
                Z1.a.d(f15537l, "addRootViewGroup[%d]: %s", Integer.valueOf(i10), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                Z1.a.m(f15537l, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.f15539b.put(i10, view);
            this.f15540c.put(i10, this.f15544g);
            this.f15541d.put(i10, true);
            view.setId(i10);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void e() {
        this.f15543f.b();
    }

    synchronized void f() {
        this.f15545h.h();
    }

    synchronized void h(ReadableMap readableMap, Callback callback) {
        this.f15545h.f(readableMap, callback);
    }

    public synchronized void j(E0 e10, int i10, String str, C1385u0 c1385u0) {
        try {
            if (this.f15538a) {
                Z1.a.e(f15537l, "createView[%d]: %s %s", Integer.valueOf(i10), str, c1385u0 != null ? c1385u0.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            p065g4.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
            try {
                ViewManager viewManagerG = this.f15542e.g(str);
                this.f15539b.put(i10, viewManagerG.createView(i10, e10, c1385u0, null, this.f15543f));
                this.f15540c.put(i10, viewManagerG);
                p065g4.a.i(0L);
            } catch (Throwable th) {
                p065g4.a.i(0L);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k(int i10, int i11, ReadableArray readableArray) {
        try {
            if (this.f15538a) {
                Z1.a.e(f15537l, "dispatchCommand[%d]: %d %s", Integer.valueOf(i10), Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f15539b.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
            }
            w(i10).receiveCommand(view, i11, readableArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l(int i10, String str, ReadableArray readableArray) {
        try {
            if (this.f15538a) {
                Z1.a.e(f15537l, "dispatchCommand[%d]: %s %s", Integer.valueOf(i10), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f15539b.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
            }
            w(i10).receiveCommand(view, str, readableArray);
        } catch (Throwable th) {
            throw th;
        }
    }

    protected synchronized void m(View view) {
        try {
            if (this.f15538a) {
                Z1.a.c(f15537l, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.f15540c.get(view.getId()) == null) {
                return;
            }
            if (!this.f15541d.get(view.getId())) {
                w(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = (ViewManager) this.f15540c.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        Z1.a.m(f15537l, "Unable to drop null child view");
                    } else if (this.f15539b.get(childAt.getId()) != null) {
                        m(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.f15539b.remove(view.getId());
            this.f15540c.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int n(int i10, float f10, float f11) {
        View view;
        try {
            if (this.f15538a) {
                Z1.a.e(f15537l, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = (View) this.f15539b.get(i10);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return F0.d(f10, f11, (ViewGroup) view);
    }

    public synchronized int p() {
        return this.f15541d.size();
    }

    public synchronized void q(int i10, int[] iArr, Q0[] q0Arr, int[] iArr2) {
        Throwable th;
        int i11;
        try {
            try {
                if (this.f15538a) {
                    try {
                        Z1.a.f(f15537l, "createView[%d]: %s %s %s", Integer.valueOf(i10), iArr != null ? iArr.toString() : "<null>", q0Arr != null ? q0Arr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                UiThreadUtil.assertOnUiThread();
                Set setO = o(i10);
                ViewGroup viewGroup = (ViewGroup) this.f15539b.get(i10);
                ViewGroupManager viewGroupManager = (ViewGroupManager) w(i10);
                if (viewGroup == null) {
                    throw new P("Trying to manageChildren view with tag " + i10 + " which doesn't exist\n detail: " + i(viewGroup, viewGroupManager, iArr, q0Arr, iArr2));
                }
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr != null) {
                    int length = iArr.length - 1;
                    while (length >= 0) {
                        int i12 = iArr[length];
                        if (i12 < 0) {
                            throw new P("Trying to remove a negative view index:" + i12 + " view tag: " + i10 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, q0Arr, iArr2));
                        }
                        if (viewGroupManager.getChildAt(viewGroup, i12) == null) {
                            if (this.f15541d.get(i10) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                return;
                            }
                            throw new P("Trying to remove a view index above child count " + i12 + " view tag: " + i10 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, q0Arr, iArr2));
                        }
                        if (i12 >= childCount) {
                            throw new P("Trying to remove an out of order view index:" + i12 + " view tag: " + i10 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, q0Arr, iArr2));
                        }
                        View childAt = viewGroupManager.getChildAt(viewGroup, i12);
                        if (!this.f15547j || !this.f15545h.j(childAt) || !d(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, i12);
                        }
                        length--;
                        childCount = i12;
                    }
                }
                if (iArr2 != null) {
                    int i13 = 0;
                    while (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        View view = (View) this.f15539b.get(i14);
                        if (view == null) {
                            throw new P("Trying to destroy unknown view tag: " + i14 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, q0Arr, iArr2));
                        }
                        if (this.f15547j && this.f15545h.j(view)) {
                            setO.add(Integer.valueOf(i14));
                            i11 = i10;
                            this.f15545h.d(view, new a(viewGroupManager, viewGroup, view, setO, i11));
                        } else {
                            i11 = i10;
                            m(view);
                        }
                        i13++;
                        i10 = i11;
                    }
                }
                int i15 = i10;
                if (q0Arr != null) {
                    for (Q0 q10 : q0Arr) {
                        View view2 = (View) this.f15539b.get(q10.f15472a);
                        if (view2 == null) {
                            throw new P("Trying to add unknown view tag: " + q10.f15472a + "\n detail: " + i(viewGroup, viewGroupManager, iArr, q0Arr, iArr2));
                        }
                        int i16 = q10.f15473b;
                        if (!setO.isEmpty()) {
                            i16 = 0;
                            int i17 = 0;
                            while (i16 < viewGroup.getChildCount() && i17 != q10.f15473b) {
                                if (!setO.contains(Integer.valueOf(viewGroup.getChildAt(i16).getId()))) {
                                    i17++;
                                }
                                i16++;
                            }
                        }
                        viewGroupManager.addView(viewGroup, view2, i16);
                    }
                }
                if (setO.isEmpty()) {
                    this.f15548k.remove(Integer.valueOf(i15));
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        throw th;
    }

    public synchronized void s(int i10, int[] iArr) {
        try {
            if (this.f15538a) {
                Z1.a.c(f15537l, "measure[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f15539b.get(i10);
            if (view == null) {
                throw new C1352d0("No native view for " + i10 + " currently exists");
            }
            View view2 = (View) A0.a(view);
            if (view2 == null) {
                throw new C1352d0("Native view " + i10 + " is no longer on screen");
            }
            g(view2, iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            g(view, iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(int i10, int[] iArr) {
        try {
            if (this.f15538a) {
                Z1.a.c(f15537l, "measureInWindow[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f15539b.get(i10);
            if (view == null) {
                throw new C1352d0("No native view for " + i10 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(int i10) {
        try {
            if (this.f15538a) {
                Z1.a.c(f15537l, "removeRootView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.f15541d.get(i10)) {
                SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
            }
            View view = (View) this.f15539b.get(i10);
            m(view);
            this.f15541d.delete(i10);
            if (view != null) {
                view.setId(-1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View v(int i10) {
        View view;
        view = (View) this.f15539b.get(i10);
        if (view == null) {
            throw new P("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager w(int i10) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.f15540c.get(i10);
        if (viewManager == null) {
            throw new P("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void x(int i10, int i11) {
        View view = (View) this.f15539b.get(i10);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i10);
        }
        view.sendAccessibilityEvent(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void y(int i10, int i11, boolean z9) {
        try {
            if (!z9) {
                this.f15543f.d(i11, null);
                return;
            }
            View view = (View) this.f15539b.get(i10);
            if (i11 != i10 && (view instanceof ViewParent)) {
                this.f15543f.d(i11, (ViewParent) view);
                return;
            }
            if (this.f15541d.get(i10)) {
                SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
            }
            this.f15543f.d(i11, view.getParent());
        } catch (Throwable th) {
            throw th;
        }
    }

    public void z(boolean z9) {
        this.f15547j = z9;
    }

    public C1348b0(c1 c1Var, RootViewManager rootViewManager) {
        p084i3.a aVar = p084i3.a.f45065a;
        this.f15538a = false;
        this.f15543f = new N3.a();
        this.f15545h = new T3.f();
        this.f15546i = new RectF();
        this.f15542e = c1Var;
        this.f15539b = new SparseArray();
        this.f15540c = new SparseArray();
        this.f15541d = new SparseBooleanArray();
        this.f15544g = rootViewManager;
    }
}
