package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1970Kc implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f20244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f20245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20246c = false;

    public C1970Kc(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20245b = new WeakReference(activityLifecycleCallbacks);
        this.f20244a = application;
    }

    protected final void a(InterfaceC1918Jc interfaceC1918Jc) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f20245b.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC1918Jc.a(activityLifecycleCallbacks);
            } else {
                if (this.f20246c) {
                    return;
                }
                this.f20244a.unregisterActivityLifecycleCallbacks(this);
                this.f20246c = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C1554Cc(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C1866Ic(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C1710Fc(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C1658Ec(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C1814Hc(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C1606Dc(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C1762Gc(this, activity));
    }
}
