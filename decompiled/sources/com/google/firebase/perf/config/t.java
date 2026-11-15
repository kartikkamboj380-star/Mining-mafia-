package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static t f40397a;

    private t() {
    }

    public static synchronized t e() {
        try {
            if (f40397a == null) {
                f40397a = new t();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40397a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_fg";
    }

    protected Long d() {
        return 300L;
    }
}
