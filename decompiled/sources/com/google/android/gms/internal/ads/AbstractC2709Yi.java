package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.services.core.di.ServiceProvider;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2709Yi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2449Ti f25685a = C2449Ti.b("gads:app_permissions_caching_expiry_ms:expiry", 60000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2449Ti f25686b = C2449Ti.b("gads:audio_caching_expiry_ms:expiry", ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2449Ti f25687c = C2449Ti.b("gads:battery_caching_expiry_ms:expiry", 10000);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2449Ti f25688d = C2449Ti.b("gads:device_info_caching_expiry_ms:expiry", 300000);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2449Ti f25689e = C2449Ti.b("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2449Ti f25690f = C2449Ti.b("gads:memory_caching_expiry_ms:expiry", ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2449Ti f25691g = C2449Ti.b("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2449Ti f25692h = C2449Ti.b("gads:telephony_caching_expiry_ms:expiry", ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT);
}
