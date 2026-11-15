package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f40393a;

    private p() {
    }

    public static synchronized p e() {
        try {
            if (f40393a == null) {
                f40393a = new p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40393a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }
}
