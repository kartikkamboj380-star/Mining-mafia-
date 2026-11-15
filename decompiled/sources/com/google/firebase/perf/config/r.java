package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static r f40395a;

    private r() {
    }

    public static synchronized r f() {
        try {
            if (f40395a == null) {
                f40395a = new r();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40395a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "sessions_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_session_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.01d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
