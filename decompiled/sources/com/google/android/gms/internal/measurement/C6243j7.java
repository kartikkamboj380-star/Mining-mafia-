package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6243j7 implements InterfaceC6234i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC6303q4 f36724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6303q4 f36725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC6303q4 f36726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC6303q4 f36727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC6303q4 f36728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC6303q4 f36729f;

    static {
        C6249k4 c6249k4B = new C6249k4(AbstractC6204f4.a("com.google.android.gms.measurement")).a().b();
        f36724a = c6249k4B.d("measurement.test.boolean_flag", false);
        f36725b = c6249k4B.c("measurement.test.cached_long_flag", -1L);
        f36726c = c6249k4B.e("measurement.test.double_flag", -3.0d);
        f36727d = c6249k4B.c("measurement.test.int_flag", -2L);
        f36728e = c6249k4B.c("measurement.test.long_flag", -1L);
        f36729f = c6249k4B.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6234i7
    public final String b() {
        return (String) f36729f.d();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6234i7
    public final boolean zza() {
        return ((Boolean) f36724a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6234i7
    public final long zzb() {
        return ((Long) f36725b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6234i7
    public final double zzc() {
        return ((Double) f36726c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6234i7
    public final long zzd() {
        return ((Long) f36727d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6234i7
    public final long zze() {
        return ((Long) f36728e.d()).longValue();
    }
}
