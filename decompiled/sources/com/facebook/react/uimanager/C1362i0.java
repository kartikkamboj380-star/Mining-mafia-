package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.AbstractC1313n;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1362i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1362i0 f15826a = new C1362i0();

    private C1362i0() {
    }

    public static final void b(ViewGroup host) {
        Intrinsics.checkNotNullParameter(host, "host");
        int childCount = host.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = host.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            c(childAt);
        }
    }

    private static final void c(View view) {
        Boolean bool = (Boolean) view.getTag(AbstractC1313n.f15060t);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (((View) view.getTag(AbstractC1313n.f15047g)) != null) {
            view.setTag(AbstractC1313n.f15047g, null);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                c(childAt);
            }
        }
    }

    private static final void e(List list, View view) {
        if (!CollectionsKt.P(list, view.getTag(AbstractC1313n.f15040G))) {
            if (view.getTag(AbstractC1313n.f15060t) == null) {
                view.setTag(AbstractC1313n.f15060t, Boolean.valueOf(view.isFocusable()));
            }
            view.setFocusable(false);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                e(list, childAt);
            }
        }
    }

    public static final void f(ViewGroup host) {
        Intrinsics.checkNotNullParameter(host, "host");
        int childCount = host.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = host.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            g(childAt);
        }
    }

    private static final void g(View view) {
        Boolean bool = (Boolean) view.getTag(AbstractC1313n.f15060t);
        if (bool != null) {
            view.setFocusable(bool.booleanValue());
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                g(childAt);
            }
        }
    }

    public final void a(View view, List axOrderList, View[] result) {
        int iA0;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(axOrderList, "axOrderList");
        Intrinsics.checkNotNullParameter(result, "result");
        Object tag = view.getTag(AbstractC1313n.f15040G);
        view.setTag(AbstractC1313n.f15047g, this);
        if (CollectionsKt.P(axOrderList, tag) && (iA0 = CollectionsKt.a0(axOrderList, tag)) != -1) {
            result[iA0] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                a(childAt, axOrderList, result);
            }
        }
    }

    public final void d(ViewGroup view, List axOrderList) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(axOrderList, "axOrderList");
        int childCount = view.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = view.getChildAt(i10);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            e(axOrderList, childAt);
        }
    }
}
