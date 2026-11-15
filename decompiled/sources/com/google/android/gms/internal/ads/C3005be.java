package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3005be extends UL0 implements InterfaceC5989zM0 {
    private static final C3005be zzd;
    private static volatile FM0 zze;
    private int zza;
    private C3256de zzb;
    private AbstractC5231tL0 zzc = AbstractC5231tL0.f33386b;

    static {
        C3005be c3005be = new C3005be();
        zzd = c3005be;
        UL0.U(C3005be.class, c3005be);
    }

    private C3005be() {
    }

    public static C3005be h0() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C3005be();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2879ae(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zze;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3005be.class) {
            try {
                rl0 = zze;
                if (rl0 == null) {
                    rl0 = new RL0(zzd);
                    zze = rl0;
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

    public final C3256de e0() {
        C3256de c3256de = this.zzb;
        return c3256de == null ? C3256de.g0() : c3256de;
    }

    public final boolean f0() {
        return (this.zza & 2) != 0;
    }

    public final AbstractC5231tL0 g0() {
        return this.zzc;
    }
}
