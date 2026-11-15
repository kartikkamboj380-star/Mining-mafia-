package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6270m7 implements InterfaceC6261l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6303q4 f36775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC6303q4 f36776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC6303q4 f36777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC6303q4 f36778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC6303q4 f36779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC6303q4 f36780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC6303q4 f36781h;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        c6249k4B.d("measurement.rb.attribution.ad_campaign_info", true);
        c6249k4B.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f36774a = c6249k4B.d("measurement.rb.attribution.client2", true);
        f36775b = c6249k4B.d("measurement.rb.attribution.followup1.service", false);
        c6249k4B.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f36776c = c6249k4B.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c6249k4B.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f36777d = c6249k4B.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f36778e = c6249k4B.d("measurement.rb.attribution.retry_disposition", false);
        f36779f = c6249k4B.d("measurement.rb.attribution.service", true);
        f36780g = c6249k4B.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f36781h = c6249k4B.d("measurement.rb.attribution.uuid_generation", true);
        c6249k4B.c("measurement.id.rb.attribution.retry_disposition", 0L);
        c6249k4B.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean b() {
        return ((Boolean) f36778e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean c() {
        return ((Boolean) f36780g.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zzb() {
        return ((Boolean) f36774a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zzc() {
        return ((Boolean) f36775b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zzd() {
        return ((Boolean) f36776c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zze() {
        return ((Boolean) f36777d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zzg() {
        return ((Boolean) f36779f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6261l7
    public final boolean zzi() {
        return ((Boolean) f36781h.d()).booleanValue();
    }
}
