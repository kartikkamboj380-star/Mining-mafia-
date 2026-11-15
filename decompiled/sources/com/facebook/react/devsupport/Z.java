package com.facebook.react.devsupport;

import O.AbstractC0845c0;
import O.C0;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f14660a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Activity context, View view) {
        super(context, com.facebook.react.r.f15119b);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14660a = view;
        requestWindowFeature(1);
        if (view != null) {
            setContentView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 c(int i10, View view, C0 windowInsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        F.b bVarF = windowInsets.f(i10);
        Intrinsics.checkNotNullExpressionValue(bVarF, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).setMargins(bVarF.f650a, bVarF.f651b, bVarF.f652c, bVarF.f653d);
        return C0.f3738b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 d(Function2 function2, View p10, C0 p11) {
        Intrinsics.checkNotNullParameter(p10, "p0");
        Intrinsics.checkNotNullParameter(p11, "p1");
        return (C0) function2.invoke(p10, p11);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(-16777216));
        }
        View view = this.f14660a;
        if (view != null) {
            final int iG = C0.l.g() | C0.l.a();
            final Function2 function2 = new Function2() { // from class: com.facebook.react.devsupport.X
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z.c(iG, (View) obj, (C0) obj2);
                }
            };
            AbstractC0845c0.A0(view, new O.J() { // from class: com.facebook.react.devsupport.Y
                @Override // O.J
                public final C0 a(View view2, C0 c10) {
                    return Z.d(function2, view2, c10);
                }
            });
        }
    }
}
