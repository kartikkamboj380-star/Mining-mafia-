package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f40380a;

    private d() {
    }

    protected static synchronized d e() {
        try {
            if (f40380a == null) {
                f40380a = new d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40380a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_experiment_app_start_ttid";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
