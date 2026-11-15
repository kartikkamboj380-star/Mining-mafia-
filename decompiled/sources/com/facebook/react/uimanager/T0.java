package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f15483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f15485c;

    public T0(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        this.f15483a = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(View view, View view2) {
        ViewGroupManager.a aVar = ViewGroupManager.Companion;
        Integer numA = aVar.a(view);
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = aVar.a(view2);
        return iIntValue - (numA2 != null ? numA2.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public final int c(int i10, int i11) {
        int[] iArr = this.f15485c;
        if (iArr != null && (i11 >= iArr.length || iArr[i11] >= i10)) {
            Z1.a.K("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i10), Integer.valueOf(i11));
            i();
        }
        if (iArr == null) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(this.f15483a.getChildAt(i12));
            }
            final Function2 function2 = new Function2() { // from class: com.facebook.react.uimanager.R0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(T0.d((View) obj, (View) obj2));
                }
            };
            CollectionsKt.v(arrayList, new Comparator() { // from class: com.facebook.react.uimanager.S0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return T0.e(function2, obj, obj2);
                }
            });
            int[] iArr2 = new int[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                Object obj = arrayList.get(i13);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                iArr2[i13] = this.f15483a.indexOfChild((View) obj);
            }
            this.f15485c = iArr2;
            iArr = iArr2;
        }
        return iArr[i11];
    }

    public final void f(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewGroupManager.Companion.a(view) != null) {
            this.f15484b++;
        }
        this.f15485c = null;
    }

    public final void g(View view) {
        if (ViewGroupManager.Companion.a(view) != null) {
            this.f15484b--;
        }
        this.f15485c = null;
    }

    public final boolean h() {
        return this.f15484b > 0;
    }

    public final void i() {
        this.f15484b = 0;
        int childCount = this.f15483a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (ViewGroupManager.Companion.a(this.f15483a.getChildAt(i10)) != null) {
                this.f15484b++;
            }
        }
        this.f15485c = null;
    }
}
