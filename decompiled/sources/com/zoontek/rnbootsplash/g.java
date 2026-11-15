package com.zoontek.rnbootsplash;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Activity activity, int i10, boolean z9) {
        super(activity, i10);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f42835a = z9;
        setOwnerActivity(activity);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    public final void c(final Function0 callback) {
        Object objB;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isShowing()) {
            callback.invoke();
            return;
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.zoontek.rnbootsplash.e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                g.d(callback, dialogInterface);
            }
        });
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            super.dismiss();
            objB = p129m8.m.b(Unit.f45918a);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        if (p129m8.m.d(objB) != null) {
            callback.invoke();
        }
        p129m8.m.a(objB);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isShowing()) {
            try {
                m8.m.a aVar = p129m8.m.f46450b;
                super.dismiss();
                p129m8.m.b(Unit.f45918a);
            } catch (Throwable th) {
                m8.m.a aVar2 = p129m8.m.f46450b;
                p129m8.m.b(p129m8.n.a(th));
            }
        }
    }

    public final void e(final Function0 callback) {
        Object objB;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isShowing()) {
            callback.invoke();
            return;
        }
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.zoontek.rnbootsplash.f
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                g.f(callback, dialogInterface);
            }
        });
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            super.show();
            objB = p129m8.m.b(Unit.f45918a);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        if (p129m8.m.d(objB) != null) {
            callback.invoke();
        }
        p129m8.m.a(objB);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null) {
            ownerActivity.moveTaskToBack(true);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setWindowAnimations(this.f42835a ? c.f42830a : c.f42831b);
            if (s.f42840a.v()) {
                window.setBackgroundDrawableResource(b.f42829a);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public void show() {
        if (isShowing()) {
            return;
        }
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            super.show();
            p129m8.m.b(Unit.f45918a);
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            p129m8.m.b(p129m8.n.a(th));
        }
    }
}
