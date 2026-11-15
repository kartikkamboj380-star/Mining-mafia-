package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5908yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f35431a;

    static {
        C2449Ti.b("gads:ad_loader:timeout_ms", 60000L);
        f35431a = C2449Ti.b("gads:rendering:timeout_ms", 60000L);
        C2449Ti.b("gads:resolve_future:default_timeout_ms", 30000L);
    }
}
