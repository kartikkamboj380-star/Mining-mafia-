package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: loaded from: classes2.dex */
public final class O1 implements M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f35950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f35951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f35952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f35953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f35954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f35955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M f35956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final M f35957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final M f35958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final M f35959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M f35960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M f35961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final M f35962m;

    static {
        I iA = new I(A.a("com.google.android.gms.auth_account")).b().a();
        f35950a = iA.c("getTokenRefactor__account_data_service_sample_percentage", 0.0d);
        f35951b = iA.e("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        f35952c = iA.d("getTokenRefactor__account_manager_timeout_seconds", 20L);
        f35953d = iA.d("getTokenRefactor__android_id_shift", 0L);
        try {
            f35954e = iA.f("getTokenRefactor__blocked_packages", H1.p(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), N1.f35949a);
            f35955f = iA.e("getTokenRefactor__chimera_get_token_evolved", true);
            f35956g = iA.d("getTokenRefactor__clear_token_timeout_seconds", 20L);
            f35957h = iA.d("getTokenRefactor__default_task_timeout_seconds", 20L);
            f35958i = iA.e("getTokenRefactor__gaul_accounts_api_evolved", false);
            f35959j = iA.e("getTokenRefactor__gaul_token_api_evolved", false);
            f35960k = iA.d("getTokenRefactor__get_token_timeout_seconds", 120L);
            f35961l = iA.e("getTokenRefactor__gms_account_authenticator_evolved", true);
            f35962m = iA.c("getTokenRefactor__gms_account_authenticator_sample_percentage", 0.0d);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.android.gms.internal.auth.M1
    public final H1 zza() {
        return (H1) f35954e.b();
    }

    @Override // com.google.android.gms.internal.auth.M1
    public final boolean zzc() {
        return ((Boolean) f35959j.b()).booleanValue();
    }
}
