package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1169o;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2521Us {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f24112a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f24113b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24114c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicBoolean f24115d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f24116e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f24117f = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f24118g = new AtomicReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f24119h = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f24120i = new Object();

    public static final Bundle q(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean r(Context context) {
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29690T0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) H4.B.c().d(AbstractC3892ii.f29700U0)).intValue()) {
            return false;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29710V0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass(Constants.FID_CLASS);
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void s(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String strValueOf = String.valueOf(str2);
                int i10 = AbstractC0786o0.f2696b;
                L4.p.d("Invalid event ID: ".concat(strValueOf), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f24117f, true)) {
                ConcurrentMap concurrentMap = this.f24119h;
                Method declaredMethod = (Method) concurrentMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        w("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f24117f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final Method t(Context context, String str) {
        ConcurrentMap concurrentMap = this.f24119h;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final void u(Context context, String str, String str2) {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f24117f, true)) {
            ConcurrentMap concurrentMap = this.f24119h;
            Method declaredMethod = (Method) concurrentMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    w(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f24117f.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                AbstractC0786o0.k(sb.toString());
            } catch (Exception unused2) {
                w(str2, false);
            }
        }
    }

    private final Object v(String str, Context context) {
        AtomicReference atomicReference = this.f24117f;
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final void w(String str, boolean z9) {
        AtomicBoolean atomicBoolean = this.f24115d;
        if (atomicBoolean.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        String string = sb.toString();
        int i10 = AbstractC0786o0.f2696b;
        L4.p.f(string);
        if (z9) {
            L4.p.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean x(Context context, String str, AtomicReference atomicReference, boolean z9) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            AbstractC1169o.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            w(Constants.GET_INSTANCE, z9);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean a(Context context) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29610L0)).booleanValue() && !this.f24115d.get()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29720W0)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.f24116e;
            if (atomicInteger.get() == -1) {
                C0654z.a();
                if (L4.g.E(context, 12451000)) {
                    atomicInteger.set(1);
                } else {
                    C0654z.a();
                    if (L4.g.F(context)) {
                        int i10 = AbstractC0786o0.f2696b;
                        L4.p.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context, H4.U1 u10) {
        AbstractC2573Vs.b(context).a().c(u10);
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29740Y0)).booleanValue() && a(context) && r(context)) {
            synchronized (this.f24120i) {
            }
        }
    }

    public final void c(Context context, H4.h2 h2Var) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29740Y0)).booleanValue() && a(context) && r(context)) {
            synchronized (this.f24120i) {
            }
        }
    }

    public final void d(Context context, String str) {
        if (a(context)) {
            u(context, str, "beginAdUnitExposure");
        }
    }

    public final void e(Context context, String str) {
        if (a(context)) {
            u(context, str, "endAdUnitExposure");
        }
    }

    public final String f(Context context) {
        if (a(context)) {
            AtomicReference atomicReference = this.f24117f;
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) t(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str == null) {
                        str = (String) t(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    w("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    public final void g(Context context, String str) {
        if (a(context) && (context instanceof Activity) && x(context, Constants.FID_CLASS, this.f24118g, false)) {
            ConcurrentMap concurrentMap = this.f24119h;
            Method declaredMethod = (Method) concurrentMap.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f24118g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                w("setCurrentScreen", false);
            }
        }
    }

    public final String h(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f24113b) {
            try {
                String str = this.f24114c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) v("getGmpAppId", context);
                this.f24114c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String i(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!a(context)) {
            return null;
        }
        long jLongValue = ((Long) H4.B.c().d(AbstractC3892ii.f29670R0)).longValue();
        if (jLongValue < 0) {
            return (String) v(Constants.GET_APP_INSTANCE_ID, context);
        }
        AtomicReference atomicReference = this.f24112a;
        if (atomicReference.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = AbstractC3518fj0.a().c(((Integer) H4.B.c().d(AbstractC3892ii.f29680S0)).intValue(), new ThreadFactoryC2417Ss(this), 2);
            } else {
                AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29680S0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) H4.B.c().d(abstractC2759Zh)).intValue(), ((Integer) H4.B.c().d(abstractC2759Zh)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC2417Ss(this));
            }
            AbstractC1169o.a(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.Ts
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f23623a.p(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String j(Context context) {
        Object objV;
        if (a(context) && (objV = v("generateEventId", context)) != null) {
            return objV.toString();
        }
        return null;
    }

    public final void k(Context context, String str, Map map) {
        s(context, "_ac", str, q(map));
    }

    public final void l(Context context, String str, Map map) {
        s(context, "_ai", str, q(map));
    }

    public final void m(Context context, String str) {
        s(context, "_aq", str, null);
    }

    public final void n(Context context, String str) {
        s(context, "_aa", str, null);
    }

    public final void o(Context context, String str, String str2, String str3, int i10) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            s(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i10).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i10);
            AbstractC0786o0.k(sb.toString());
        }
    }

    final /* synthetic */ String p(Context context) {
        return (String) v(Constants.GET_APP_INSTANCE_ID, context);
    }
}
