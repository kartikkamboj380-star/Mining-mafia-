package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements p044e3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p124m3.e f14661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f14662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Z f14663c;

    public a0(p124m3.e devSupportManager) {
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.f14661a = devSupportManager;
    }

    @Override // p044e3.h
    public boolean a() {
        Z z9 = this.f14663c;
        if (z9 != null) {
            return z9.isShowing();
        }
        return false;
    }

    @Override // p044e3.h
    public void c() {
        if (a() || !e()) {
            return;
        }
        Activity activityH = this.f14661a.h();
        if (activityH == null || activityH.isFinishing()) {
            W3.d.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        Z z9 = new Z(activityH, this.f14662b);
        this.f14663c = z9;
        z9.setCancelable(false);
        z9.show();
    }

    @Override // p044e3.h
    public void d() {
        Z z9;
        if (a() && (z9 = this.f14663c) != null) {
            z9.dismiss();
        }
        View view = this.f14662b;
        ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(this.f14662b);
        }
        this.f14663c = null;
    }

    @Override // p044e3.h
    public boolean e() {
        return this.f14662b != null;
    }

    @Override // p044e3.h
    public void f(String appKey) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        p004a3.a.b(Intrinsics.b(appKey, "LogBox"), "This surface manager can only create LogBox React application");
        View viewA = this.f14661a.a("LogBox");
        this.f14662b = viewA;
        if (viewA == null) {
            W3.d.a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    @Override // p044e3.h
    public void g() {
        View view = this.f14662b;
        if (view != null) {
            this.f14661a.d(view);
            this.f14662b = null;
        }
    }
}
