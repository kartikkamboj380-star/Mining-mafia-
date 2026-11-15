package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6313r6 implements InterfaceC6305q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36877a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f36877a = c6249k4B.d("measurement.service.ad_impression.convert_value_to_double", true);
        c6249k4B.d("measurement.service.separate_public_internal_event_blacklisting", true);
        c6249k4B.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6305q6
    public final boolean zza() {
        return ((Boolean) f36877a.d()).booleanValue();
    }
}
