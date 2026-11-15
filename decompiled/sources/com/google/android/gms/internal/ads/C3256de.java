package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3256de extends UL0 implements InterfaceC5989zM0 {
    private static final C3256de zzf;
    private static volatile FM0 zzg;
    private int zza;
    private C3759he zzb;
    private AbstractC5231tL0 zzc = AbstractC5231tL0.f33386b;
    private long zzd;
    private long zze;

    static {
        C3256de c3256de = new C3256de();
        zzf = c3256de;
        UL0.U(C3256de.class, c3256de);
    }

    private C3256de() {
    }

    public static C3256de g0() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C3256de();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3130ce(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzg;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3256de.class) {
            try {
                rl0 = zzg;
                if (rl0 == null) {
                    rl0 = new RL0(zzf);
                    zzg = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final C3759he d0() {
        C3759he c3759he = this.zzb;
        return c3759he == null ? C3759he.f0() : c3759he;
    }

    public final AbstractC5231tL0 e0() {
        return this.zzc;
    }

    public final long f0() {
        return this.zze;
    }
}
