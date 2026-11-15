package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6162a7 implements Z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36625a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.gbraid_campaign.gbraid.client", true);
        f36625a = c6249k4B.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.Z6
    public final boolean zza() {
        return ((Boolean) f36625a.d()).booleanValue();
    }
}
