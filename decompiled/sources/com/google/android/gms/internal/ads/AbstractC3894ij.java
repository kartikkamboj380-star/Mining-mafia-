package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3894ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f30044a = C2449Ti.a("gads:init:init_on_bg_thread", true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2449Ti f30045b = C2449Ti.a("gads:init:init_on_single_bg_thread", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2449Ti f30046c = C2449Ti.a("gads:adloader_load_bg_thread", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2449Ti f30047d = C2449Ti.a("gads:appopen_load_on_bg_thread", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2449Ti f30048e = C2449Ti.a("gads:banner_destroy_bg_thread", false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2449Ti f30049f = C2449Ti.a("gads:banner_load_bg_thread", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2449Ti f30050g = C2449Ti.a("gads:banner_pause_bg_thread", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2449Ti f30051h = C2449Ti.a("gads:banner_resume_bg_thread", false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2449Ti f30052i = C2449Ti.a("gads:interstitial_load_on_bg_thread", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2449Ti f30053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C2449Ti f30054k;

    static {
        C2449Ti.a("gads:persist_flags_on_bg_thread", true);
        f30053j = C2449Ti.a("gads:query_info_bg_thread", true);
        f30054k = C2449Ti.a("gads:rewarded_load_bg_thread", true);
    }
}
