package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6034zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f35833a = C2449Ti.a("gads:trustless_token_for_decagon:enabled", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2449Ti f35834b;

    static {
        C2449Ti.a("gads:invalidate_token_at_refresh_start", true);
        C2449Ti.a("gms:expose_token_for_gma:enabled", true);
        C2449Ti.a("gads:referesh_rate_limit", false);
        f35834b = C2449Ti.b("gads:timeout_for_trustless_token:millis", 2000L);
        C2449Ti.a("gads:token_anonymization:enabled", true);
        C2449Ti.b("gads:cached_token:ttl_millis", 10800000L);
    }
}
