package com.facebook.react.views.view;

import O.AbstractC0845c0;
import O.AbstractC0869o0;
import O.C0;
import O.d1;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f16457a = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f16458b = Color.argb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 27, 27, 27);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f16459c;

    public static final void b(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        AbstractC0869o0.b(window, true);
    }

    public static final void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        int i10 = 0;
        AbstractC0869o0.b(window, false);
        Context context = window.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean zA = Y3.b.a(context);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        if (i11 < 29) {
            i10 = (i11 < 26 || zA) ? f16458b : f16457a;
        }
        window.setNavigationBarColor(i10);
        new d1(window, window.getDecorView()).c(!zA);
        if (i11 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i11 >= 30 ? 3 : 1;
        }
    }

    public static final boolean d() {
        return f16459c;
    }

    public static final void e(Window window, boolean z9) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z9) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.view.p
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return q.f(view, windowInsets);
                }
            });
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        AbstractC0845c0.j0(window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets f(View v10, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = v10.onApplyWindowInsets(insets);
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void g(Window window, boolean z9) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (z9) {
            h(window);
        } else {
            i(window);
        }
    }

    private static final void h(Window window) {
        if (f16459c) {
            d1 d1Var = new d1(window, window.getDecorView());
            d1Var.e(2);
            d1Var.a(C0.l.f());
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setDecorFitsSystemWindows(false);
            }
            window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            window.clearFlags(2048);
        }
    }

    private static final void i(Window window) {
        if (f16459c) {
            d1 d1Var = new d1(window, window.getDecorView());
            d1Var.e(2);
            d1Var.f(C0.l.f());
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
                window.setDecorFitsSystemWindows(true);
            }
            window.addFlags(2048);
            window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
    }
}
