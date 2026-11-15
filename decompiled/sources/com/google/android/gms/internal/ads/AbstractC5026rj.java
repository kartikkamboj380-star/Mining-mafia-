package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5026rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f33004a = C2449Ti.a("gads:separate_url_generation:enabled", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2449Ti f33005b = C2449Ti.b("gads:url_cache:max_size", 200);

    static {
        C2449Ti.a("gads:use_request_id_as_url_cache_key:enabled", true);
    }
}
