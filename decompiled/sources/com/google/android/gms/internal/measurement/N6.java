package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class N6 implements M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6303q4 f36428b;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.collection.event_safelist", true);
        f36427a = c6249k4B.d("measurement.service.store_null_safelist", true);
        f36428b = c6249k4B.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zzb() {
        return ((Boolean) f36427a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.M6
    public final boolean zzc() {
        return ((Boolean) f36428b.d()).booleanValue();
    }
}
