package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static f f40382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f40383b = Collections.unmodifiableMap(new a());

    class a extends HashMap {
        a() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    private f() {
    }

    public static synchronized f e() {
        try {
            if (f40382a == null) {
                f40382a = new f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40382a;
    }

    protected static String f(long j10) {
        return (String) f40383b.get(Long.valueOf(j10));
    }

    protected static boolean g(long j10) {
        return f40383b.containsKey(Long.valueOf(j10));
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_log_source";
    }

    protected String d() {
        return O6.a.f4559c;
    }
}
