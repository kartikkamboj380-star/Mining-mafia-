package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f40385a;

    private h() {
    }

    public static synchronized h e() {
        try {
            if (f40385a == null) {
                f40385a = new h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40385a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_fg";
    }

    protected Long d() {
        return 700L;
    }
}
