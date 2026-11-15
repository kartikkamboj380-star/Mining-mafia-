package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f40378a;

    private b() {
    }

    protected static synchronized b e() {
        try {
            if (f40378a == null) {
                f40378a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40378a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_deactivated";
    }

    protected Boolean d() {
        return Boolean.FALSE;
    }
}
