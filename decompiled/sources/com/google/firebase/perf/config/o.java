package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f40392a;

    private o() {
    }

    public static synchronized o e() {
        try {
            if (f40392a == null) {
                f40392a = new o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40392a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_max_duration_min";
    }

    protected Long d() {
        return 240L;
    }
}
