package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1366k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1366k0 f15829a = new C1366k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Rect f15830b = new Rect();

    private C1366k0() {
    }

    public static final void a(View view, Rect outputRect) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outputRect, "outputRect");
        ViewParent parent = view.getParent();
        if (parent == null) {
            outputRect.setEmpty();
            return;
        }
        if (parent instanceof InterfaceC1364j0) {
            InterfaceC1364j0 interfaceC1364j0 = (InterfaceC1364j0) parent;
            if (interfaceC1364j0.getRemoveClippedSubviews()) {
                Rect rect = f15830b;
                interfaceC1364j0.getClippingRect(rect);
                if (!rect.intersect(view.getLeft(), view.getTop() + ((int) view.getTranslationY()), view.getRight(), view.getBottom() + ((int) view.getTranslationY()))) {
                    outputRect.setEmpty();
                    return;
                }
                rect.offset(-view.getLeft(), -view.getTop());
                rect.offset(-((int) view.getTranslationX()), -((int) view.getTranslationY()));
                rect.offset(view.getScrollX(), view.getScrollY());
                outputRect.set(rect);
                return;
            }
        }
        view.getDrawingRect(outputRect);
    }
}
