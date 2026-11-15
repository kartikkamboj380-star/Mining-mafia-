package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static i f40386a;

    private i() {
    }

    protected static synchronized i f() {
        try {
            if (f40386a == null) {
                f40386a = new i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40386a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_vc_network_request_sampling_rate";
    }

    protected Double d() {
        return Double.valueOf(1.0d);
    }

    protected Double e() {
        return Double.valueOf(d().doubleValue() / 1000.0d);
    }
}
