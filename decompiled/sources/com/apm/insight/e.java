package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f12845a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f12846b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f12847c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f12848d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f12849e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f12850f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f12853i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f12858n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f12851g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f12852h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static g f12854j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f12855k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f12856l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f12857m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f12859o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f12860p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f12861q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f12862r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f12863s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f12864t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f12865u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f12850f == null) {
            f12850f = g.a(f12845a);
        }
        return f12850f;
    }

    public static a b() {
        return f12852h;
    }

    public static g c() {
        if (f12854j == null) {
            synchronized (e.class) {
                f12854j = new g();
            }
        }
        return f12854j;
    }

    public static void d(boolean z9) {
        f12863s = z9;
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    public static String f() {
        if (f12855k == null) {
            synchronized (f12856l) {
                try {
                    if (f12855k == null) {
                        f12855k = Long.toHexString(new Random().nextLong()) + "U";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12855k;
    }

    public static Context g() {
        return f12845a;
    }

    public static Application h() {
        return f12846b;
    }

    public static ConfigManager i() {
        return f12851g;
    }

    public static long j() {
        return f12847c;
    }

    public static String k() {
        return f12848d;
    }

    public static void l() {
        f12859o = 1;
    }

    public static int m() {
        return f12859o;
    }

    public static boolean n() {
        return f12849e;
    }

    static void o() {
        f12849e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f12853i;
    }

    public static int q() {
        return f12857m;
    }

    public static String r() {
        return f12858n;
    }

    public static boolean s() {
        return f12860p;
    }

    public static boolean t() {
        return f12861q;
    }

    public static boolean u() {
        return f12862r;
    }

    public static boolean v() {
        return f12863s;
    }

    public static boolean w() {
        return f12865u;
    }

    public static boolean x() {
        return f12864t;
    }

    static void b(int i10, String str) {
        f12857m = i10;
        f12858n = str;
    }

    public static boolean d() {
        if (!f12851g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static void e(boolean z9) {
        f12865u = z9;
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f12850f = bVar;
    }

    public static void b(boolean z9) {
        f12861q = z9;
    }

    public static void a(Application application) {
        if (application != null) {
            f12846b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f12846b == null) {
            f12847c = System.currentTimeMillis();
            f12845a = context;
            f12846b = application;
            f12855k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    public static void c(boolean z9) {
        f12862r = z9;
    }

    public static void f(boolean z9) {
        f12864t = z9;
    }

    static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f12850f = new com.apm.insight.nativecrash.b(f12845a, iCommonParams, a());
    }

    public static String a(long j10, CrashType crashType, boolean z9, boolean z10) {
        StringBuilder sb = new StringBuilder();
        sb.append(j10);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(f());
        sb.append('_');
        sb.append(z9 ? "oom_" : "normal_");
        sb.append(f12847c);
        sb.append('_');
        sb.append(z10 ? "ignore_" : "normal_");
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }

    static void a(String str) {
        f12848d = str;
    }

    static void a(int i10, String str) {
        if (f12853i == null) {
            synchronized (e.class) {
                try {
                    if (f12853i == null) {
                        f12853i = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f12853i.put(Integer.valueOf(i10), str);
    }

    public static void a(boolean z9) {
        f12860p = z9;
    }
}
