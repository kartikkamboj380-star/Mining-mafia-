package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5278tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f33461a = C2449Ti.b("gads:dynamite_load:fail:sample_rate", 10000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2449Ti f33462b = C2449Ti.a("gads:report_dynamite_crash_in_background_thread", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2449Ti f33463c = new C2449Ti("gads:public_beta:traffic_multiplier", "1.0", 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2449Ti f33464d = new C2449Ti("gads:sdk_crash_report_class_prefix", "com.google.", 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2449Ti f33465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2449Ti f33466f;

    static {
        C2449Ti.a("gads:sdk_crash_report_enabled", false);
        f33465e = C2449Ti.a("gads:sdk_crash_report_full_stacktrace", false);
        f33466f = C2449Ti.c("gads:trapped_exception_sample_rate", 0.01d);
    }
}
