package com.google.android.material.internal;

import O.AbstractC0869o0;
import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static void a(Window window, boolean z9, Integer num, Integer num2) {
        boolean z10 = num == null || num.intValue() == 0;
        boolean z11 = num2 == null || num2.intValue() == 0;
        if (z10 || z11) {
            int iB = p256z5.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z10) {
                num = Integer.valueOf(iB);
            }
            if (z11) {
                num2 = Integer.valueOf(iB);
            }
        }
        AbstractC0869o0.b(window, !z9);
        int iC = c(window.getContext(), z9);
        int iB2 = b(window.getContext(), z9);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, p256z5.a.h(num.intValue())));
        e(window, d(iB2, p256z5.a.h(num2.intValue())));
    }

    private static int b(Context context, boolean z9) {
        if (z9 && Build.VERSION.SDK_INT < 27) {
            return F.a.k(p256z5.a.b(context, R.attr.navigationBarColor, -16777216), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        }
        if (z9) {
            return 0;
        }
        return p256z5.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z9) {
        if (z9) {
            return 0;
        }
        return p256z5.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i10, boolean z9) {
        if (p256z5.a.h(i10)) {
            return true;
        }
        return i10 == 0 && z9;
    }

    public static void e(Window window, boolean z9) {
        AbstractC0869o0.a(window, window.getDecorView()).c(z9);
    }

    public static void f(Window window, boolean z9) {
        AbstractC0869o0.a(window, window.getDecorView()).d(z9);
    }
}
