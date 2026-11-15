package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6189d7 implements InterfaceC6180c7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36664a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.gmscore_feature_tracking", true);
        f36664a = c6249k4B.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6180c7
    public final boolean zza() {
        return ((Boolean) f36664a.d()).booleanValue();
    }
}
