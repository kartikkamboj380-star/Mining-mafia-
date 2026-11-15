package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class Q6 implements P6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6303q4 f36474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC6303q4 f36475c;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f36473a = c6249k4B.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f36474b = c6249k4B.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f36475c = c6249k4B.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean zzb() {
        return ((Boolean) f36473a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean zzc() {
        return ((Boolean) f36474b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean zzd() {
        return ((Boolean) f36475c.d()).booleanValue();
    }
}
