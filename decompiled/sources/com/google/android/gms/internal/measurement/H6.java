package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class H6 implements G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6303q4 f36289b;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f36288a = c6249k4B.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        f36289b = c6249k4B.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.G6
    public final boolean zza() {
        return ((Boolean) f36288a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.G6
    public final boolean zzb() {
        return ((Boolean) f36289b.d()).booleanValue();
    }
}
