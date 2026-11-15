package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f40379a;

    private c() {
    }

    protected static synchronized c d() {
        try {
            if (f40379a == null) {
                f40379a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40379a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "isEnabled";
    }

    @Override // com.google.firebase.perf.config.v
    protected String b() {
        return "firebase_performance_collection_enabled";
    }
}
