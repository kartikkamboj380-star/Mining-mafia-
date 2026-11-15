package com.google.firebase.perf.config;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f40388a;

    protected k() {
    }

    protected static synchronized k e() {
        try {
            if (f40388a == null) {
                f40388a = new k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40388a;
    }

    @Override // com.google.firebase.perf.config.v
    protected String a() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    @Override // com.google.firebase.perf.config.v
    protected String c() {
        return "fpr_disabled_android_versions";
    }

    protected String d() {
        return "";
    }
}
