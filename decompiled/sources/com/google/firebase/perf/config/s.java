package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static s f40396a;

    private s() {
    }

    public static synchronized s e() {
        try {
            if (f40396a == null) {
                f40396a = new s();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40396a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_trace_event_count_bg";
    }

    protected Long d() {
        return 30L;
    }
}
