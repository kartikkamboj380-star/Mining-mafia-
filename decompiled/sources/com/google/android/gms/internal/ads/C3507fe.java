package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3507fe extends UL0 implements InterfaceC5989zM0 {
    private static final C3507fe zzg;
    private static volatile FM0 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        C3507fe c3507fe = new C3507fe();
        zzg = c3507fe;
        UL0.U(C3507fe.class, c3507fe);
    }

    private C3507fe() {
    }

    public static C3507fe i0(AbstractC5231tL0 abstractC5231tL0) {
        return (C3507fe) UL0.A(zzg, abstractC5231tL0);
    }

    public static C3507fe j0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (C3507fe) UL0.B(zzg, abstractC5231tL0, hl0);
    }

    public static C3381ee k0() {
        return (C3381ee) zzg.P();
    }

    public static C3507fe l0() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new C3507fe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3381ee(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzh;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3507fe.class) {
            try {
                rl0 = zzh;
                if (rl0 == null) {
                    rl0 = new RL0(zzg);
                    zzh = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final String d0() {
        return this.zzb;
    }

    public final String e0() {
        return this.zzc;
    }

    public final long f0() {
        return this.zzd;
    }

    public final long g0() {
        return this.zze;
    }

    public final long h0() {
        return this.zzf;
    }

    final /* synthetic */ void m0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void n0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void o0(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    final /* synthetic */ void p0(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    final /* synthetic */ void q0(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }
}
