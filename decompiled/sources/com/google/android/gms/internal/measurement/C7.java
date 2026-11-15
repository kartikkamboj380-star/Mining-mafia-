package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class C7 implements B7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36260a;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f36260a = c6249k4B.d("measurement.client.sessions.enable_fix_background_engagement", false);
        c6249k4B.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c6249k4B.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean zza() {
        return ((Boolean) f36260a.d()).booleanValue();
    }
}
