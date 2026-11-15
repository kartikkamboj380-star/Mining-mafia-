package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5892yb extends UL0 implements InterfaceC5989zM0 {
    private static final C5892yb zze;
    private static volatile FM0 zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private AbstractC5231tL0 zzd = AbstractC5231tL0.f33386b;

    static {
        C5892yb c5892yb = new C5892yb();
        zze = c5892yb;
        UL0.U(C5892yb.class, c5892yb);
    }

    private C5892yb() {
    }

    public static C5892yb h0() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new C5892yb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5766xb(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzf;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5892yb.class) {
            try {
                rl0 = zzf;
                if (rl0 == null) {
                    rl0 = new RL0(zze);
                    zzf = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final boolean d0() {
        return (this.zza & 1) != 0;
    }

    public final long e0() {
        return this.zzb;
    }

    public final String f0() {
        return this.zzc;
    }

    public final AbstractC5231tL0 g0() {
        return this.zzd;
    }
}
