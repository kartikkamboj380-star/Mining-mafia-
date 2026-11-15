package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f9113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f9114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f9115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f9116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f9117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f9118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f9119g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0144d f9120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f9121b;

        a(C0144d c0144d, Object obj) {
            this.f9120a = c0144d;
            this.f9121b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9120a.f9126a = this.f9121b;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f9122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0144d f9123b;

        b(Application application, C0144d c0144d) {
            this.f9122a = application;
            this.f9123b = c0144d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9122a.unregisterActivityLifecycleCallbacks(this.f9123b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f9124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f9125b;

        c(Object obj, Object obj2) {
            this.f9124a = obj;
            this.f9125b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f9116d;
                if (method != null) {
                    method.invoke(this.f9124a, this.f9125b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f9117e.invoke(this.f9124a, this.f9125b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0144d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f9127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9129d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9130e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9131f = false;

        C0144d(Activity activity) {
            this.f9127b = activity;
            this.f9128c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f9127b == activity) {
                this.f9127b = null;
                this.f9130e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f9130e || this.f9131f || this.f9129d || !d.h(this.f9126a, this.f9128c, activity)) {
                return;
            }
            this.f9131f = true;
            this.f9126a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f9127b == activity) {
                this.f9129d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f9113a = clsA;
        f9114b = b();
        f9115c = f();
        f9116d = d(clsA);
        f9117e = c(clsA);
        f9118f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f9115c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f9119g.postAtFrontOfQueue(new c(f9114b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f9118f == null) {
            return false;
        }
        if (f9117e == null && f9116d == null) {
            return false;
        }
        try {
            Object obj2 = f9115c.get(activity);
            if (obj2 == null || (obj = f9114b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0144d c0144d = new C0144d(activity);
            application.registerActivityLifecycleCallbacks(c0144d);
            f9119g.post(new a(c0144d, obj2));
            try {
                if (g()) {
                    Method method = f9118f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f9119g.post(new b(application, c0144d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
