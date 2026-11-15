package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC5772xe implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final long f34962G = ((Long) H4.B.c().d(AbstractC3892ii.f29691T1)).longValue();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Application f34964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WindowManager f34965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PowerManager f34966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final KeyguardManager f34967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BroadcastReceiver f34968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference f34969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final WeakReference f34970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1922Je f34971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final K4.X f34972j = new K4.X(f34962G);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34973k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f34974l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final HashSet f34975m = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DisplayMetrics f34976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f34977w;

    public ViewOnAttachStateChangeListenerC5772xe(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f34963a = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f34965c = windowManager;
        this.f34966d = (PowerManager) applicationContext.getSystemService("power");
        this.f34967e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f34964b = (Application) applicationContext;
            this.f34971i = new C1922Je((Application) applicationContext, this);
        }
        this.f34976v = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f34977w = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f34970h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f34970h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void h() {
        K4.F0.f2598l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.we
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34608a.f();
            }
        });
    }

    private final void i(Activity activity, int i10) {
        Window window;
        WeakReference weakReference = this.f34970h;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f34974l = i10;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void j(int i10) {
        WeakReference weakReference;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        View view;
        List arrayList;
        int i11;
        int i12;
        boolean z9;
        if (this.f34975m.isEmpty() || (weakReference = this.f34970h) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e10) {
                int i13 = AbstractC0786o0.f2696b;
                L4.p.d("Failure getting view location.", e10);
            }
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29777b6)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = rect.left + view2.getWidth();
            rect.bottom = rect.top + view2.getHeight();
            view = view2;
        } else {
            globalVisibleRect = false;
            localVisibleRect = false;
            view = null;
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29721W1)).booleanValue() || view == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            try {
                arrayList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        arrayList.add(c(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e11) {
                G4.t.l().j(e11, "PositionWatcher.getParentScrollViewRects");
                arrayList = Collections.EMPTY_LIST;
            }
        }
        List list = arrayList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i14 = this.f34974l;
        if (i14 != -1) {
            windowVisibility = i14;
        }
        G4.t.g();
        long jA = K4.F0.a(view);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.ac)).booleanValue()) {
            if (view2 != null) {
                PowerManager powerManager = this.f34966d;
                KeyguardManager keyguardManager = this.f34967e;
                G4.t.g();
                if (K4.F0.z(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        i11 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i11 = 0;
                        localVisibleRect = false;
                    } else if (jA < ((Integer) H4.B.c().d(AbstractC3892ii.dc)).intValue() || windowVisibility != 0) {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    } else {
                        i11 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    }
                }
            }
            i11 = 0;
        } else {
            if (view2 != null) {
                PowerManager powerManager2 = this.f34966d;
                KeyguardManager keyguardManager2 = this.f34967e;
                G4.t.g();
                if (K4.F0.z(view, powerManager2, keyguardManager2)) {
                    if (!globalVisibleRect) {
                        i11 = 0;
                        globalVisibleRect = false;
                    } else if (!localVisibleRect) {
                        globalVisibleRect = true;
                        i11 = 0;
                        localVisibleRect = false;
                    } else if (windowVisibility == 0) {
                        i11 = 1;
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        windowVisibility = 0;
                    } else {
                        globalVisibleRect = true;
                        localVisibleRect = true;
                    }
                }
            }
            i11 = 0;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.fc)).booleanValue()) {
            PowerManager powerManager3 = this.f34966d;
            KeyguardManager keyguardManager3 = this.f34967e;
            G4.t.g();
            int i15 = true != K4.F0.z(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i16 = true != globalVisibleRect ? 0 : 8;
            int i17 = true != localVisibleRect ? 0 : 16;
            int i18 = windowVisibility == 0 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 0;
            int i19 = jA >= ((long) ((Integer) H4.B.c().d(AbstractC3892ii.dc)).intValue()) ? 32 : 0;
            G4.t.g();
            K4.F0.o(view, i19 | i18 | i15 | i16 | i17 | i11, null);
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (i10 == i12 && !this.f34972j.a() && i11 == this.f34973k) {
            return;
        }
        if (i11 != 0 || this.f34973k) {
            z9 = true;
        } else {
            z9 = true;
            if (i10 == 1) {
                return;
            }
        }
        boolean z10 = i11;
        C5394ue c5394ue = new C5394ue(G4.t.o().elapsedRealtime(), this.f34966d.isScreenOn(), (view == null || !view.isAttachedToWindow()) ? false : z9, view != null ? view.getWindowVisibility() : 8, c(this.f34977w), c(rect), c(rect2), globalVisibleRect, c(rect3), localVisibleRect, jA, c(rect4), this.f34976v.density, z10, list);
        Iterator it = this.f34975m.iterator();
        while (it.hasNext()) {
            ((InterfaceC5520ve) it.next()).s0(c5394ue);
        }
        this.f34973k = z10;
    }

    private final int k(int i10) {
        return (int) (i10 / this.f34976v.density);
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f34969g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f34968f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f34968f = new C5268te(this);
            G4.t.a().b(this.f34963a, this.f34968f, intentFilter);
        }
        Application application = this.f34964b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f34971i);
            } catch (Exception e10) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Error registering activity lifecycle callbacks.", e10);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f34969g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f34969g = null;
            }
        } catch (Exception e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error while unregistering listeners from the last ViewTreeObserver.", e10);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e11) {
            int i11 = AbstractC0786o0.f2696b;
            L4.p.d("Error while unregistering listeners from the ViewTreeObserver.", e11);
        }
        if (this.f34968f != null) {
            try {
                G4.t.a().c(this.f34963a, this.f34968f);
            } catch (IllegalStateException e12) {
                int i12 = AbstractC0786o0.f2696b;
                L4.p.d("Failed trying to unregister the receiver", e12);
            } catch (Exception e13) {
                G4.t.l().j(e13, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f34968f = null;
        }
        Application application = this.f34964b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f34971i);
            } catch (Exception e14) {
                int i13 = AbstractC0786o0.f2696b;
                L4.p.d("Error registering activity lifecycle callbacks.", e14);
            }
        }
    }

    public final void a(InterfaceC5520ve interfaceC5520ve) {
        this.f34975m.add(interfaceC5520ve);
        j(3);
    }

    public final void b(InterfaceC5520ve interfaceC5520ve) {
        this.f34975m.remove(interfaceC5520ve);
    }

    final Rect c(Rect rect) {
        return new Rect(k(rect.left), k(rect.top), k(rect.right), k(rect.bottom));
    }

    public final void d(long j10) {
        this.f34972j.b(j10);
    }

    public final void e() {
        this.f34972j.b(f34962G);
    }

    final /* synthetic */ void f() {
        j(3);
    }

    final /* synthetic */ void g(int i10) {
        j(3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f34974l = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f34974l = -1;
        j(3);
        h();
        m(view);
    }
}
