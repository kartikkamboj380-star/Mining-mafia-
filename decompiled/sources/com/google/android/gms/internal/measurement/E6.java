package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class E6 implements D6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6303q4 f36270b;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c6249k4B.d("measurement.set_default_event_parameters_with_backfill.service", true);
        c6249k4B.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f36269a = c6249k4B.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f36270b = c6249k4B.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c6249k4B.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean zza() {
        return ((Boolean) f36269a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.D6
    public final boolean zzb() {
        return ((Boolean) f36270b.d()).booleanValue();
    }
}
