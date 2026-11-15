package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final c a(ViewGroup rootView, View view) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static final a b(View view) {
        return Build.VERSION.SDK_INT >= 30 ? d(view) : c(view);
    }

    private static final a c(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new a(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
    }

    private static final a d(View view) {
        Insets insets;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar())) == null) {
            return null;
        }
        return new a(insets.top, insets.right, insets.bottom, insets.left);
    }

    public static final a e(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        Intrinsics.c(rootView);
        a aVarB = b(rootView);
        if (aVarB == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new a(Math.max(aVarB.d() - rect.top, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Math.max(Math.min((rect.left + view.getWidth()) - width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + aVarB.c(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Math.max(Math.min((rect.top + view.getHeight()) - height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + aVarB.a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Math.max(aVarB.b() - rect.left, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
