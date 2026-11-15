package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3379ed implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Handler f28012m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f28014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PowerManager f28015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final KeyguardManager f28016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f28017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2281Qc f28018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f28019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference f28020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1970Kc f28021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f28022j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28023k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f28024l = -3;

    public ViewOnAttachStateChangeListenerC3379ed(Context context, C2281Qc c2281Qc) {
        Context applicationContext = context.getApplicationContext();
        this.f28013a = applicationContext;
        this.f28018f = c2281Qc;
        this.f28015c = (PowerManager) applicationContext.getSystemService("power");
        this.f28016d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f28014b = (Application) applicationContext;
            this.f28021i = new C1970Kc((Application) applicationContext, this);
        }
        a(null);
    }

    private final void e() {
        f28012m.post(new RunnableC3128cd(this));
    }

    private final void f(Activity activity, int i10) {
        Window window;
        if (this.f28020h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f28023k = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void d() {
        Activity activity;
        if (this.f28020h == null) {
            return;
        }
        View viewB = b();
        if (viewB == null) {
            this.f28024l = -3L;
            this.f28022j = (byte) -1;
            return;
        }
        int i10 = 0;
        int i11 = viewB.getVisibility() != 0 ? 1 : 0;
        if (!viewB.isShown()) {
            i11 |= 2;
        }
        PowerManager powerManager = this.f28015c;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i11 |= 4;
        }
        if (!this.f28018f.a()) {
            KeyguardManager keyguardManager = this.f28016d;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i11 |= 8;
            } else {
                int i12 = AbstractC2877ad.f26568b;
                View rootView = viewB.getRootView();
                if (rootView == null) {
                    rootView = viewB;
                }
                Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper) || i10 >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i10++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i11 |= 8;
                    }
                } else {
                    i11 |= 8;
                }
            }
        }
        if (!viewB.getGlobalVisibleRect(new Rect())) {
            i11 |= 16;
        }
        if (!viewB.getLocalVisibleRect(new Rect())) {
            i11 |= 32;
        }
        int windowVisibility = viewB.getWindowVisibility();
        int i13 = this.f28023k;
        if (i13 != -1) {
            windowVisibility = i13;
        }
        if (windowVisibility != 0) {
            i11 |= 64;
        }
        if (this.f28022j != i11) {
            this.f28022j = (byte) i11;
            this.f28024l = i11 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i11);
        }
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f28019g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f28017e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C3254dd c3254dd = new C3254dd(this);
            this.f28017e = c3254dd;
            this.f28013a.registerReceiver(c3254dd, intentFilter);
        }
        Application application = this.f28014b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f28021i);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference weakReference = this.f28019g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f28019g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f28017e;
        if (broadcastReceiver != null) {
            try {
                this.f28013a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f28017e = null;
        }
        Application application = this.f28014b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f28021i);
            } catch (Exception unused4) {
            }
        }
    }

    final void a(View view) {
        long j10;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f28020h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j10 = -2;
        } else {
            j10 = -3;
        }
        this.f28024l = j10;
    }

    final View b() {
        WeakReference weakReference = this.f28020h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final long c() {
        if (this.f28024l <= -2 && b() == null) {
            this.f28024l = -3L;
        }
        return this.f28024l;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f(activity, 4);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f(activity, 0);
        d();
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(activity, 0);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f28023k = -1;
        h(view);
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f28023k = -1;
        d();
        e();
        i(view);
    }
}
