package com.facebook.react.uimanager;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f15481a = new T();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15482a;

        static {
            int[] iArr = new int[com.facebook.yoga.h.values().length];
            try {
                iArr[com.facebook.yoga.h.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.yoga.h.RTL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15482a = iArr;
        }
    }

    static {
        p064g3.b.a("LayoutDirectionUtil", p064g3.a.ERROR);
    }

    private T() {
    }

    public static final int a(com.facebook.yoga.h direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        int i10 = a.f15482a[direction.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? 2 : 1;
        }
        return 0;
    }
}
