package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1922Je implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f19951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f19952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19953c = false;

    public C1922Je(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f19952b = new WeakReference(activityLifecycleCallbacks);
        this.f19951a = application;
    }

    protected final void a(InterfaceC1870Ie interfaceC1870Ie) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f19952b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC1870Ie.a(activityLifecycleCallbacks);
            } else {
                if (this.f19953c) {
                    return;
                }
                this.f19951a.unregisterActivityLifecycleCallbacks(this);
                this.f19953c = true;
            }
        } catch (Exception e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C1506Be(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C1818He(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C1662Ee(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C1610De(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C1766Ge(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C1558Ce(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C1714Fe(this, activity));
    }
}
