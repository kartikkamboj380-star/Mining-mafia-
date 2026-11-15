package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class z7 implements y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f37044a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f37044a = c6249k4B.d("measurement.session_stitching_token_enabled", false);
        c6249k4B.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.y7
    public final boolean zzb() {
        return ((Boolean) f37044a.d()).booleanValue();
    }
}
