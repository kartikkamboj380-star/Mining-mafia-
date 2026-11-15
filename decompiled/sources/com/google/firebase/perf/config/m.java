package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f40390a;

    private m() {
    }

    public static synchronized m e() {
        try {
            if (f40390a == null) {
                f40390a = new m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40390a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    protected Long d() {
        return 0L;
    }
}
