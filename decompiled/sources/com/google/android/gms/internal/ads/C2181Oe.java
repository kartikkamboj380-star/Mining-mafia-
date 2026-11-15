package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2181Oe implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f21616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21617b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f21623h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f21625j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21618c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f21619d = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21620e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f21621f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f21622g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21624i = false;

    C2181Oe() {
    }

    private final void k(Activity activity) {
        synchronized (this.f21618c) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.f21616a = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Application application, Context context) {
        if (this.f21624i) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f21617b = application;
        this.f21625j = ((Long) H4.B.c().d(AbstractC3892ii.f29501A1)).longValue();
        this.f21624i = true;
    }

    public final void b(InterfaceC2233Pe interfaceC2233Pe) {
        synchronized (this.f21618c) {
            this.f21621f.add(interfaceC2233Pe);
        }
    }

    public final void c(InterfaceC2233Pe interfaceC2233Pe) {
        synchronized (this.f21618c) {
            this.f21621f.remove(interfaceC2233Pe);
        }
    }

    public final Activity d() {
        return this.f21616a;
    }

    public final Context e() {
        return this.f21617b;
    }

    final /* synthetic */ Object f() {
        return this.f21618c;
    }

    final /* synthetic */ AtomicBoolean g() {
        return this.f21619d;
    }

    final /* synthetic */ boolean h() {
        return this.f21620e;
    }

    final /* synthetic */ List i() {
        return this.f21621f;
    }

    public final void j(C5492vQ c5492vQ) {
        synchronized (this.f21618c) {
            this.f21622g.add(c5492vQ);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f21618c) {
            try {
                Activity activity2 = this.f21616a;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f21616a = null;
                }
                Iterator it = this.f21622g.iterator();
                while (it.hasNext()) {
                    try {
                        ((C5492vQ) it.next()).g(activity);
                    } catch (Exception e10) {
                        G4.t.l().j(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.d("", e10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f21618c) {
            Iterator it = this.f21622g.iterator();
            while (it.hasNext()) {
                try {
                    ((C5492vQ) it.next()).f(activity);
                } catch (Exception e10) {
                    G4.t.l().j(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.d("", e10);
                }
            }
        }
        this.f21620e = true;
        Runnable runnable = this.f21623h;
        if (runnable != null) {
            K4.F0.f2598l.removeCallbacks(runnable);
        }
        HandlerC3644gj0 handlerC3644gj0 = K4.F0.f2598l;
        RunnableC2129Ne runnableC2129Ne = new RunnableC2129Ne(this);
        this.f21623h = runnableC2129Ne;
        handlerC3644gj0.postDelayed(runnableC2129Ne, this.f21625j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f21620e = false;
        boolean andSet = this.f21619d.getAndSet(true);
        Runnable runnable = this.f21623h;
        if (runnable != null) {
            K4.F0.f2598l.removeCallbacks(runnable);
        }
        synchronized (this.f21618c) {
            Iterator it = this.f21622g.iterator();
            while (it.hasNext()) {
                try {
                    ((C5492vQ) it.next()).e(activity);
                } catch (Exception e10) {
                    G4.t.l().j(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.d("", e10);
                }
            }
            if (andSet) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.a("App is still foreground.");
            } else {
                Iterator it2 = this.f21621f.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC2233Pe) it2.next()).h0(true);
                    } catch (Exception e11) {
                        int i12 = AbstractC0786o0.f2696b;
                        L4.p.d("", e11);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
