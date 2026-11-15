package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1823Hg0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f19365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1771Gg0 f19366c;

    private final boolean a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || b();
    }

    private final void h(boolean z9) {
        if (this.f19365b != z9) {
            this.f19365b = z9;
            if (this.f19364a) {
                c(z9);
                InterfaceC1771Gg0 interfaceC1771Gg0 = this.f19366c;
                if (interfaceC1771Gg0 != null) {
                    interfaceC1771Gg0.N(z9);
                }
            }
        }
    }

    protected boolean b() {
        return false;
    }

    protected void c(boolean z9) {
    }

    public final void d(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void e() {
        this.f19364a = true;
        boolean zA = a();
        this.f19365b = zA;
        c(zA);
    }

    public final void f() {
        this.f19364a = false;
        this.f19366c = null;
    }

    public final void g(InterfaceC1771Gg0 interfaceC1771Gg0) {
        this.f19366c = interfaceC1771Gg0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        h(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        h(a());
    }
}
