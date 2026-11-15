package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6297p7 implements InterfaceC6288o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36836a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f36836a = c6249k4B.d("measurement.add_first_launch_logging_timestamp.service", false);
        c6249k4B.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6288o7
    public final boolean zza() {
        return ((Boolean) f36836a.d()).booleanValue();
    }
}
