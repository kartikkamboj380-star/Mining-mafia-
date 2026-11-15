package F0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f684e;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(str, i10);
        } else {
            b(str, i10);
        }
    }

    private static void b(String str, int i10) {
        try {
            if (f682c == null) {
                f682c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f682c.invoke(null, Long.valueOf(f680a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        b.a(str);
    }

    public static void d(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(str, i10);
        } else {
            e(str, i10);
        }
    }

    private static void e(String str, int i10) {
        try {
            if (f683d == null) {
                f683d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f683d.invoke(null, Long.valueOf(f680a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    private static boolean i() {
        try {
            if (f681b == null) {
                f680a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f681b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f681b.invoke(null, Long.valueOf(f680a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(str, i10);
        } else {
            k(str, i10);
        }
    }

    private static void k(String str, int i10) {
        try {
            if (f684e == null) {
                f684e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f684e.invoke(null, Long.valueOf(f680a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }
}
