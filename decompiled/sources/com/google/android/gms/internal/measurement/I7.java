package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class I7 implements H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36305a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f36305a = c6249k4B.d("measurement.tcf.consent_fix", true);
        c6249k4B.d("measurement.tcf.client", true);
        c6249k4B.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.H7
    public final boolean zza() {
        return ((Boolean) f36305a.d()).booleanValue();
    }
}
