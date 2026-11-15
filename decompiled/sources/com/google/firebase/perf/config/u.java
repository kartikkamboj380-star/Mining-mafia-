package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static u f40398a;

    private u() {
    }

    protected static synchronized u f() {
        try {
            if (f40398a == null) {
                f40398a = new u();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40398a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_trace_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
