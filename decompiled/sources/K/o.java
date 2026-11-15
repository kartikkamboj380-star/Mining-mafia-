package K;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f2396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f2397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f2398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f2399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f2400e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2396a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f2397b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f2398c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f2399d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f2400e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
