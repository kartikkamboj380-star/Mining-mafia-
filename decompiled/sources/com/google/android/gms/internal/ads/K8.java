package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20108a = "Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f20109b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f20110c = K8.class.getName();

    public static void a(String str, Object... objArr) {
        if (f20109b) {
            Log.v(f20108a, e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d(f20108a, e(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f20108a, e(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(f20108a, e(str, objArr), th);
    }

    private static String e(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f20110c)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(strSubstring2);
                sb.append(".");
                sb.append(methodName);
                string = sb.toString();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str2);
            }
        }
        string = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str2);
    }
}
