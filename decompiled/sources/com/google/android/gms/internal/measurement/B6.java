package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class B6 implements A6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36256a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.client.3p_consent_state_v1", true);
        f36256a = c6249k4B.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.A6
    public final long zza() {
        return ((Long) f36256a.d()).longValue();
    }
}
