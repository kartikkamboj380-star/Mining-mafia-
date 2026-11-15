package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f40381a;

    private e() {
    }

    protected static synchronized e e() {
        try {
            if (f40381a == null) {
                f40381a = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40381a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "fragment_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_fragment_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(0.0d);
    }
}
