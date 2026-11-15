package com.iab.omid.library.bytedance2.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f41773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f41774c;

    public interface a {
        void a(boolean z9);
    }

    public void a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    ActivityManager.RunningAppProcessInfo b() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean c() {
        return this.f41773b;
    }

    protected boolean d() {
        return false;
    }

    public void e() {
        this.f41772a = true;
        boolean zA = a();
        this.f41773b = zA;
        b(zA);
    }

    public void f() {
        this.f41772a = false;
        this.f41774c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        a(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        a(a());
    }

    public void a(a aVar) {
        this.f41774c = aVar;
    }

    protected void b(boolean z9) {
    }

    private void a(boolean z9) {
        if (this.f41773b != z9) {
            this.f41773b = z9;
            if (this.f41772a) {
                b(z9);
                a aVar = this.f41774c;
                if (aVar != null) {
                    aVar.a(z9);
                }
            }
        }
    }

    private boolean a() {
        return b().importance == 100 || d();
    }
}
