package com.zoontek.rnbootsplash;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C1356f0;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f42840a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v f42841b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f42842c = a.HIDDEN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f42843d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f42844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static g f42845f;

    private enum a {
        HIDDEN,
        HIDING,
        INITIALIZING,
        VISIBLE;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42851f = p189s8.a.a(c());
    }

    public static final class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Timer f42852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f42853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f42854c;

        b(Timer timer, ReactApplicationContext reactApplicationContext, boolean z9) {
            this.f42852a = timer;
            this.f42853b = reactApplicationContext;
            this.f42854c = z9;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f42852a.cancel();
            s.f42840a.m(this.f42853b, this.f42854c);
        }
    }

    public static final class c implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f42855a;

        c(View view) {
            this.f42855a = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (s.f42842c == a.INITIALIZING) {
                return false;
            }
            this.f42855a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    private s() {
    }

    private final void j() {
        while (true) {
            v vVar = f42841b;
            if (vVar.isEmpty()) {
                return;
            }
            Promise promise = (Promise) vVar.e();
            if (promise != null) {
                promise.resolve(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(final ReactApplicationContext reactApplicationContext, final boolean z9) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zoontek.rnbootsplash.m
            @Override // java.lang.Runnable
            public final void run() {
                s.n(reactApplicationContext, z9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ReactApplicationContext reactApplicationContext, boolean z9) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (f42842c == a.INITIALIZING || currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            Timer timer = new Timer();
            timer.schedule(new b(timer, reactApplicationContext, z9), 100L);
            return;
        }
        a aVar = f42842c;
        a aVar2 = a.HIDING;
        if (aVar == aVar2) {
            return;
        }
        if (f42842c == a.HIDDEN) {
            f42840a.j();
            return;
        }
        f42842c = aVar2;
        Function0 function0 = new Function0() { // from class: com.zoontek.rnbootsplash.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.o();
            }
        };
        if (z9) {
            g gVar = new g(currentActivity, f42843d, true);
            f42845f = gVar;
            gVar.e(function0);
        } else {
            g gVar2 = f42844e;
            if (gVar2 != null) {
                gVar2.c(function0);
            } else {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o() {
        final Function0 function0 = new Function0() { // from class: com.zoontek.rnbootsplash.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.p();
            }
        };
        Function0 function1 = new Function0() { // from class: com.zoontek.rnbootsplash.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.q(function0);
            }
        };
        g gVar = f42844e;
        if (gVar != null) {
            gVar.c(function1);
        } else {
            function1.invoke();
        }
        return Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p() {
        f42845f = null;
        f42842c = a.HIDDEN;
        f42840a.j();
        return Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function0 function0) {
        f42844e = null;
        g gVar = f42845f;
        if (gVar != null) {
            gVar.c(function0);
        } else {
            function0.invoke();
        }
        return Unit.f45918a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Activity activity, SplashScreenView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.remove();
        activity.getSplashScreen().clearOnExitAnimationListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s() {
        g gVar = f42844e;
        if (gVar != null) {
            gVar.e(new Function0() { // from class: com.zoontek.rnbootsplash.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.t();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t() {
        f42842c = a.VISIBLE;
        return Unit.f45918a;
    }

    public final Map k(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Resources resources = reactContext.getResources();
        HashMap map = new HashMap();
        int i10 = reactContext.getResources().getConfiguration().uiMode & 48;
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        int identifier2 = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        float fG = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fG2 = identifier > 0 ? C1356f0.g(resources.getDimensionPixelSize(identifier)) : 0.0f;
        if (identifier2 > 0 && !ViewConfiguration.get(reactContext).hasPermanentMenuKey()) {
            fG = C1356f0.g(resources.getDimensionPixelSize(identifier2));
        }
        map.put("darkModeEnabled", Boolean.valueOf(i10 == 32));
        map.put("logoSizeRatio", Double.valueOf(v() ? 0.5d : 1.0d));
        map.put("navigationBarHeight", Float.valueOf(fG));
        map.put("statusBarHeight", Float.valueOf(fG2));
        return map;
    }

    public final void l(ReactApplicationContext reactContext, boolean z9, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        f42841b.push(promise);
        m(reactContext, z9);
    }

    public final void u(final Activity activity, int i10) {
        int i11;
        if (f42843d != -1) {
            Z1.a.I("ReactNative", "RNBootSplash: Ignored initialization, module is already initialized.");
            return;
        }
        f42843d = i10;
        if (activity == null) {
            Z1.a.I("ReactNative", "RNBootSplash: Ignored initialization, current activity is null.");
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (activity.getTheme().resolveAttribute(com.zoontek.rnbootsplash.a.f42828a, typedValue, true) && (i11 = typedValue.resourceId) != 0) {
            activity.setTheme(i11);
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        f42842c = a.INITIALIZING;
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new c(viewFindViewById));
        if (Build.VERSION.SDK_INT >= 31) {
            activity.getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: com.zoontek.rnbootsplash.n
                @Override // android.window.SplashScreen.OnExitAnimationListener
                public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                    s.r(activity, splashScreenView);
                }
            });
        }
        f42844e = new g(activity, f42843d, false);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.zoontek.rnbootsplash.o
            @Override // java.lang.Runnable
            public final void run() {
                s.s();
            }
        });
    }

    public final boolean v() {
        Object objB;
        try {
            m8.m.a aVar = p129m8.m.f46450b;
            objB = p129m8.m.b(Boolean.valueOf((Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT").getInt(null) - 90000) / UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS == 4));
        } catch (Throwable th) {
            m8.m.a aVar2 = p129m8.m.f46450b;
            objB = p129m8.m.b(p129m8.n.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (p129m8.m.f(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final void w(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(Boolean.valueOf(f42842c != a.HIDDEN));
    }

    public final void x() {
        f42842c = a.HIDDEN;
        f42843d = -1;
        j();
        g gVar = f42844e;
        if (gVar != null) {
            gVar.dismiss();
            f42844e = null;
        }
        g gVar2 = f42845f;
        if (gVar2 != null) {
            gVar2.dismiss();
            f42845f = null;
        }
    }
}
