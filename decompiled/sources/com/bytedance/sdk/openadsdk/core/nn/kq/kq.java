package com.bytedance.sdk.openadsdk.core.nn.kq;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class kq implements Application.ActivityLifecycleCallbacks {
    private static volatile kq kq;
    private final oq oq;

    private kq(Application application) {
        this.oq = oq.kq(application);
    }

    public static kq kq(Application application) {
        if (kq == null) {
            synchronized (kq.class) {
                try {
                    if (kq == null) {
                        kq = new kq(application);
                        application.registerActivityLifecycleCallbacks(kq);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kq;
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
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        oq oqVar = this.oq;
        if (oqVar != null) {
            oqVar.kq(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        oq oqVar = this.oq;
        if (oqVar != null) {
            oqVar.oq(activity);
        }
    }

    public String kq(String str, long j10, int i10) {
        oq oqVar = this.oq;
        if (oqVar != null) {
            return oqVar.kq(str, j10, i10);
        }
        return "null";
    }
}
