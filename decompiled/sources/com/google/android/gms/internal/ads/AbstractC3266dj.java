package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3266dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f27498a;

    static {
        C2449Ti.c("gads:csi_reporting_ratio", 0.05d);
        f27498a = new C2449Ti("gads:sdk_csi_server", "https://csi.gstatic.com/csi", 4);
        C2449Ti.a("gads:enabled_sdk_csi", false);
    }
}
