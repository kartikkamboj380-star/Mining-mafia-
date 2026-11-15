package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0 f15327a = new F0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f15328b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final PointF f15329c = new PointF();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float[] f15330d = new float[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Matrix f15331e = new Matrix();

    private enum a {
        SELF,
        CHILD;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f15335d = p189s8.a.a(c());
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f15337b;

        public b(int i10, View view) {
            this.f15336a = i10;
            this.f15337b = view;
        }

        public final View a() {
            return this.f15337b;
        }

        public final int b() {
            return this.f15336a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).b() == this.f15336a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15336a);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15338a;

        static {
            int[] iArr = new int[EnumC1358g0.values().length];
            try {
                iArr[EnumC1358g0.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1358g0.BOX_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1358g0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1358g0.BOX_NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15338a = iArr;
        }
    }

    private F0() {
    }

    private final View a(View view) {
        while (view != null && view.getId() <= 0) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view;
    }

    public static final List b(float f10, float f11, ViewGroup viewGroup, float[] viewCoords) {
        int iH;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        viewCoords[0] = f10;
        viewCoords[1] = f11;
        ArrayList arrayList = new ArrayList();
        View viewF = f15327a.f(viewCoords, viewGroup, arrayList);
        if (viewF != null) {
            int i10 = 0;
            while (viewF != null && viewF.getId() <= 0) {
                Object parent = viewF.getParent();
                viewF = parent instanceof View ? (View) parent : null;
                i10++;
            }
            if (i10 > 0 && i10 <= arrayList.size()) {
                arrayList.subList(i10, arrayList.size());
            }
            if (viewF != null && (iH = f15327a.h(viewF, viewCoords[0], viewCoords[1])) != viewF.getId()) {
                arrayList.add(0, new b(iH, null));
            }
        }
        return arrayList;
    }

    public static final int c(float f10, float f11, ViewGroup viewGroup, float[] viewCoords, int[] iArr) {
        View viewA;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        viewCoords[0] = f10;
        viewCoords[1] = f11;
        F0 f12 = f15327a;
        View viewF = f12.f(viewCoords, viewGroup, null);
        if (viewF == null || (viewA = f12.a(viewF)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = viewA.getId();
        }
        return f12.h(viewA, viewCoords[0], viewCoords[1]);
    }

    public static final int d(float f10, float f11, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return c(f10, f11, viewGroup, f15328b, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View e(float[] fArr, View view, EnumSet enumSet, List list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            if (!i(fArr[0], fArr[1], view)) {
                if (view instanceof InterfaceC1374o0) {
                    if (P3.a.a(view.getId()) == 2 && !j(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((InterfaceC1372n0) view).getOverflow();
                    if (Intrinsics.b("hidden", overflow) || Intrinsics.b("scroll", overflow)) {
                        return null;
                    }
                }
                if (((ViewGroup) view).getClipChildren()) {
                    return null;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            InterfaceC1391x0 interfaceC1391x0 = view instanceof InterfaceC1391x0 ? (InterfaceC1391x0) view : null;
            for (int i10 = childCount - 1; -1 < i10; i10--) {
                View childAt = viewGroup.getChildAt(interfaceC1391x0 != null ? interfaceC1391x0.getZIndexMappedChildIndex(i10) : i10);
                PointF pointF = f15329c;
                float f10 = fArr[0];
                float f11 = fArr[1];
                Intrinsics.c(childAt);
                g(f10, f11, viewGroup, childAt, pointF);
                float f12 = fArr[0];
                float f13 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewF = f(fArr, childAt, list);
                if (viewF != null) {
                    return viewF;
                }
                fArr[0] = f12;
                fArr[1] = f13;
            }
        }
        if (enumSet.contains(a.SELF) && i(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View f(float[] fArr, View view, List list) {
        EnumC1358g0 pointerEvents = view instanceof InterfaceC1376p0 ? ((InterfaceC1376p0) view).getPointerEvents() : EnumC1358g0.AUTO;
        if (!view.isEnabled()) {
            int i10 = c.f15338a[pointerEvents.ordinal()];
            if (i10 == 1) {
                pointerEvents = EnumC1358g0.BOX_NONE;
            } else if (i10 == 2) {
                pointerEvents = EnumC1358g0.NONE;
            }
        }
        int i11 = c.f15338a[pointerEvents.ordinal()];
        if (i11 == 2) {
            EnumSet enumSetOf = EnumSet.of(a.SELF);
            Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
            View viewE = e(fArr, view, enumSetOf, list);
            if (viewE != null && list != null) {
                list.add(new b(view.getId(), view));
            }
            return viewE;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (pointerEvents != EnumC1358g0.AUTO) {
                    Z1.a.I("ReactNative", "Unknown pointer event type: " + pointerEvents);
                }
                if (!(view instanceof InterfaceC1370m0) || !i(fArr[0], fArr[1], view) || !((InterfaceC1370m0) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                    EnumSet enumSetOf2 = EnumSet.of(a.SELF, a.CHILD);
                    Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                    View viewE2 = e(fArr, view, enumSetOf2, list);
                    if (viewE2 != null && list != null) {
                        list.add(new b(view.getId(), view));
                    }
                    return viewE2;
                }
                if (list != null) {
                    list.add(new b(view.getId(), view));
                    return view;
                }
            } else {
                EnumSet enumSetOf3 = EnumSet.of(a.CHILD);
                Intrinsics.checkNotNullExpressionValue(enumSetOf3, "of(...)");
                View viewE3 = e(fArr, view, enumSetOf3, list);
                if (viewE3 != null) {
                    if (list != null) {
                        list.add(new b(view.getId(), view));
                    }
                    return viewE3;
                }
                if ((view instanceof InterfaceC1368l0) && i(fArr[0], fArr[1], view) && ((InterfaceC1368l0) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                    if (list != null) {
                        list.add(new b(view.getId(), view));
                    }
                }
            }
            return view;
        }
        return null;
    }

    private final void g(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f15330d;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f15331e;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f12 = fArr[0];
            scrollY = fArr[1];
            scrollX = f12;
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int h(View view, float f10, float f11) {
        return view instanceof InterfaceC1368l0 ? ((InterfaceC1368l0) view).reactTagForTouch(f10, f11) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i(float f10, float f11, View view) {
        N3.c cVar = view instanceof N3.c ? (N3.c) view : null;
        Rect hitSlopRect = cVar != null ? cVar.getHitSlopRect() : null;
        if (hitSlopRect != null) {
            return f10 >= ((float) (-hitSlopRect.left)) && f10 < ((float) (view.getWidth() + hitSlopRect.right)) && f11 >= ((float) (-hitSlopRect.top)) && f11 < ((float) (view.getHeight() + hitSlopRect.bottom));
        }
        return f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < ((float) view.getWidth()) && f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j(float f10, float f11, View view) {
        if (!(view instanceof InterfaceC1374o0)) {
            return false;
        }
        Rect overflowInset = ((InterfaceC1374o0) view).getOverflowInset();
        return f10 >= ((float) overflowInset.left) && f10 < ((float) (view.getWidth() - overflowInset.right)) && f11 >= ((float) overflowInset.top) && f11 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
