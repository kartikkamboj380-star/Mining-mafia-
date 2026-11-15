package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.react.AbstractC1312m;
import com.facebook.react.AbstractC1313n;
import com.facebook.react.AbstractC1315p;
import com.facebook.react.bridge.UiThreadUtil;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements p124m3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N.h f14708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f14709b;

    public j0(N.h contextSupplier) {
        Intrinsics.checkNotNullParameter(contextSupplier, "contextSupplier");
        this.f14708a = contextSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(j0 j0Var) {
        Dialog dialog = j0Var.f14709b;
        if (dialog != null) {
            dialog.dismiss();
        }
        j0Var.f14709b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(j0 j0Var, String str, final m3.e.a aVar) {
        Dialog dialog = j0Var.f14709b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) j0Var.f14708a.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC1315p.f15071d, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.findViewById(AbstractC1313n.f15053m).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j0.h(aVar, view);
            }
        });
        ((TextView) viewInflate.findViewById(AbstractC1313n.f15054n)).setText(str);
        Dialog dialog2 = new Dialog(context, com.facebook.react.r.f15118a);
        dialog2.setContentView(viewInflate);
        dialog2.setCancelable(false);
        j0Var.f14709b = dialog2;
        Window window = dialog2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
            attributes.dimAmount = 0.2f;
            window.setAttributes(attributes);
            window.addFlags(2);
            window.setGravity(48);
            window.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setBackgroundDrawableResource(AbstractC1312m.f14873a);
        }
        Dialog dialog3 = j0Var.f14709b;
        if (dialog3 != null) {
            dialog3.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(m3.e.a aVar, View view) {
        aVar.onResume();
    }

    @Override // p124m3.h
    public void e() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.h0
            @Override // java.lang.Runnable
            public final void run() {
                j0.d(this.f14704a);
            }
        });
    }

    @Override // p124m3.h
    public void g(final String message, final m3.e.a listener) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(listener, "listener");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.g0
            @Override // java.lang.Runnable
            public final void run() {
                j0.f(this.f14699a, message, listener);
            }
        });
    }
}
