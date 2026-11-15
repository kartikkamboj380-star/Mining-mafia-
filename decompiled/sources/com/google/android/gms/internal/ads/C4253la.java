package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4253la extends UL0 implements InterfaceC5989zM0 {
    private static final C4253la zzj;
    private static volatile FM0 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private C1550Ca zzg;
    private C1914Ja zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        C4253la c4253la = new C4253la();
        zzj = c4253la;
        UL0.U(C4253la.class, c4253la);
    }

    private C4253la() {
    }

    public static C4127ka h0() {
        return (C4127ka) zzj.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", C4631oa.f32115a, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new C4253la();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4127ka(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzk;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C4253la.class) {
            try {
                rl0 = zzk;
                if (rl0 == null) {
                    rl0 = new RL0(zzj);
                    zzk = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final String d0() {
        return this.zzd;
    }

    public final boolean e0() {
        return this.zze;
    }

    public final C1550Ca f0() {
        C1550Ca c1550Ca = this.zzg;
        return c1550Ca == null ? C1550Ca.i0() : c1550Ca;
    }

    public final C1914Ja g0() {
        C1914Ja c1914Ja = this.zzh;
        return c1914Ja == null ? C1914Ja.d0() : c1914Ja;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void j0(boolean z9) {
        this.zza |= 8;
        this.zze = z9;
    }
}
