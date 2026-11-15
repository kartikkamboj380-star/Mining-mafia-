package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f40387a;

    private j() {
    }

    public static synchronized j e() {
        try {
            if (f40387a == null) {
                f40387a = new j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40387a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_time_limit_sec";
    }

    protected Long d() {
        return 600L;
    }
}
