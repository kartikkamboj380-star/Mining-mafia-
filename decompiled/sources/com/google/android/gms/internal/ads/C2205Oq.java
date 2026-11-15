package com.google.android.gms.internal.ads;

import H4.C0654z;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2205Oq implements InterfaceC2309Qq {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f21677l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static InterfaceC2309Qq f21678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static InterfaceC2309Qq f21679n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static InterfaceC2309Qq f21680o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static Boolean f21681p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f21684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f21685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L4.a f21686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PackageInfo f21687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f21689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f21690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f21692k;

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    protected C2205Oq(Context context, L4.a aVar) {
        PackageInfo packageInfo;
        String country;
        this.f21682a = new Object();
        this.f21684c = new WeakHashMap();
        AbstractC3518fj0.a();
        this.f21685d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f21690i = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f21683b = context;
        this.f21686e = aVar;
        String string = null;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29758Z8)).booleanValue()) {
            Handler handler = L4.g.f3110b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfo = null;
            } else {
                try {
                    packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
            }
        } else {
            packageInfo = null;
        }
        this.f21687f = packageInfo;
        AbstractC2759Zh abstractC2759Zh = AbstractC3892ii.f29638N8;
        if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue()) {
            Handler handler2 = L4.g.f3110b;
            country = Locale.getDefault().getCountry();
        } else {
            country = "unknown";
        }
        this.f21688g = country;
        if (((Boolean) H4.B.c().d(abstractC2759Zh)).booleanValue()) {
            Context context2 = this.f21683b;
            Handler handler3 = L4.g.f3110b;
            if (context2 != null) {
                try {
                    PackageInfo packageInfo2 = Wrappers.packageManager(context2).getPackageInfo("com.android.vending", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                    if (packageInfo2 != null) {
                        string = Integer.toString(packageInfo2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = "unknown";
        }
        this.f21689h = string;
        if (((Integer) H4.B.c().d(AbstractC3892ii.f29598J8)).intValue() > 0) {
            this.f21692k = new HashSet();
        }
    }

    public static InterfaceC2309Qq c(Context context) {
        synchronized (f21677l) {
            try {
                if (f21678m == null) {
                    if (j(context)) {
                        f21678m = new C2205Oq(context, L4.a.a());
                    } else {
                        f21678m = new C2257Pq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21678m;
    }

    public static InterfaceC2309Qq d(Context context, L4.a aVar) {
        synchronized (f21677l) {
            try {
                if (f21680o == null) {
                    boolean z9 = false;
                    if (((Boolean) AbstractC3015bj.f26898c.e()).booleanValue()) {
                        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29578H8)).booleanValue() || ((Boolean) AbstractC3015bj.f26896a.e()).booleanValue()) {
                            z9 = true;
                        }
                    }
                    if (j(context)) {
                        C2205Oq c2205Oq = new C2205Oq(context, aVar);
                        c2205Oq.l();
                        c2205Oq.k();
                        f21680o = c2205Oq;
                    } else if (!z9 || context == null) {
                        f21680o = new C2257Pq();
                    } else {
                        C2205Oq c2205Oq2 = new C2205Oq(context, aVar, true);
                        c2205Oq2.l();
                        c2205Oq2.k();
                        f21680o = c2205Oq2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21680o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002d, B:14:0x003b, B:15:0x0042), top: B:20:0x0003 }] */
    public static InterfaceC2309Qq e(Context context) {
        synchronized (f21677l) {
            try {
                if (f21679n == null) {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f29588I8)).booleanValue()) {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29578H8)).booleanValue() || context == null) {
                            f21679n = new C2257Pq();
                        } else {
                            f21679n = new C2205Oq(context, L4.a.a());
                        }
                    } else {
                        f21679n = new C2257Pq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21679n;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    public static InterfaceC2309Qq f(Context context, L4.a aVar) {
        synchronized (f21677l) {
            try {
                if (f21679n == null) {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f29588I8)).booleanValue()) {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29578H8)).booleanValue()) {
                            f21679n = new C2257Pq();
                        } else {
                            f21679n = new C2205Oq(context, aVar);
                        }
                    } else {
                        f21679n = new C2257Pq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f21679n;
    }

    public static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String h(Throwable th) {
        return AbstractC4040jt0.a(L4.g.p(g(th)));
    }

    private static boolean j(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (f21677l) {
            try {
                if (f21681p == null) {
                    f21681p = Boolean.valueOf(C0654z.h().nextInt(100) < ((Integer) H4.B.c().d(AbstractC3892ii.ie)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f21681p.booleanValue()) {
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29578H8)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void k() {
        Thread.setDefaultUncaughtExceptionHandler(new C2050Lq(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void l() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f21682a) {
            this.f21684c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new C2101Mq(this, thread.getUncaughtExceptionHandler()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309Qq
    public final void a(Throwable th, String str, float f10) {
        Throwable th2;
        boolean zIsCallerInstantApp;
        String packageName;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo memoryInfoN;
        if (this.f21691j) {
            return;
        }
        Handler handler = L4.g.f3110b;
        int i10 = 0;
        if (((Boolean) AbstractC5278tj.f33465e.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z9 = ((Boolean) H4.B.c().d(AbstractC3892ii.f29722W2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && L4.g.x(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (L4.g.x(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z9 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z9) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strG = g(th);
            String strH = ((Boolean) H4.B.c().d(AbstractC3892ii.ga)).booleanValue() ? h(th) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i11 = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zIsCallerInstantApp = Wrappers.packageManager(this.f21683b).isCallerInstantApp();
                } catch (Throwable th4) {
                    L4.p.d("Error fetching instant app info", th4);
                    zIsCallerInstantApp = false;
                }
                try {
                    packageName = this.f21683b.getPackageName();
                } catch (Throwable unused) {
                    L4.p.f("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i12 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i12));
                String str2 = Build.MANUFACTURER;
                String string = Build.MODEL;
                if (!string.startsWith(str2)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + string.length());
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(string);
                    string = sb.toString();
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", string);
                L4.a aVar = this.f21686e;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", aVar.f3097a).appendQueryParameter(AppsFlyerProperties.APP_ID, packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strG).appendQueryParameter("eids", TextUtils.join(",", H4.B.b().e())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(AbstractC5278tj.f33463c.e()));
                Context context = this.f21683b;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context)));
                boolean z10 = aVar.f3101e;
                String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("lite", true != z10 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                if (!TextUtils.isEmpty(strH)) {
                    builderAppendQueryParameter6.appendQueryParameter("hash", strH);
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29648O8)).booleanValue() && (memoryInfoN = L4.g.n(context)) != null) {
                    builderAppendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfoN.availMem));
                    builderAppendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfoN.totalMem));
                    if (true != memoryInfoN.lowMemory) {
                        str3 = "0";
                    }
                    builderAppendQueryParameter6.appendQueryParameter("is_low_memory", str3);
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29638N8)).booleanValue()) {
                    String str4 = this.f21688g;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter6.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.f21689h;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter6.appendQueryParameter("psv", str5);
                    }
                    if (i12 >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfo = null;
                        }
                    }
                    if (packageInfo != null) {
                        builderAppendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        builderAppendQueryParameter6.appendQueryParameter("wvvn", packageInfo.versionName);
                        builderAppendQueryParameter6.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.f21687f;
                if (packageInfo2 != null) {
                    builderAppendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    builderAppendQueryParameter6.appendQueryParameter("appvn", packageInfo2.versionName);
                }
                arrayList2.add(builderAppendQueryParameter6.toString());
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    final String str6 = (String) obj;
                    final L4.v vVar = new L4.v(this.f21683b, null);
                    this.f21685d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Nq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            vVar.b(str6, null);
                        }
                    });
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309Qq
    public final void b(Throwable th, String str) {
        if (this.f21691j) {
            return;
        }
        a(th, str, 1.0f);
    }

    protected final void i(Thread thread, Throwable th) {
        if (th != null) {
            boolean zX = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zX |= L4.g.x(stackTraceElement.getClassName());
                    zEquals |= C2205Oq.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) H4.B.c().d(AbstractC3892ii.f29598J8)).intValue();
            if (iIntValue > 0) {
                if (this.f21692k.size() >= iIntValue) {
                    return;
                }
                String strH = h(th);
                if (this.f21692k.contains(strH)) {
                    return;
                } else {
                    this.f21692k.add(strH);
                }
            }
            if (!zX || zEquals) {
                return;
            }
            if (!this.f21691j) {
                b(th, "");
            }
            if (this.f21690i.getAndSet(true) || !((Boolean) AbstractC3015bj.f26898c.e()).booleanValue()) {
                return;
            }
            AbstractC2447Th.b(this.f21683b);
        }
    }

    protected C2205Oq(Context context, L4.a aVar, boolean z9) {
        this(context, aVar);
        this.f21691j = true;
    }
}
