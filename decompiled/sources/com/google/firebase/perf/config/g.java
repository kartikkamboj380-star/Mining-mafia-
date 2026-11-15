package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f40384a;

    private g() {
    }

    public static synchronized g e() {
        try {
            if (f40384a == null) {
                f40384a = new g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40384a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_rl_network_event_count_bg";
    }

    protected Long d() {
        return 70L;
    }
}
