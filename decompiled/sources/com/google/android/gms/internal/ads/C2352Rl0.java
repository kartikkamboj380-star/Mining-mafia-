package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2352Rl0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2352Rl0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private C2456Tl0 zzb;
    private AbstractC5231tL0 zzc;
    private AbstractC5231tL0 zzd;
    private int zze;

    static {
        C2352Rl0 c2352Rl0 = new C2352Rl0();
        zzf = c2352Rl0;
        UL0.U(C2352Rl0.class, c2352Rl0);
    }

    private C2352Rl0() {
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        this.zzc = abstractC5231tL0;
        this.zzd = abstractC5231tL0;
    }

    public static C2300Ql0 g0() {
        return (C2300Ql0) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", C3901im0.f30062a});
        }
        if (iOrdinal == 3) {
            return new C2352Rl0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2300Ql0(bArr);
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
        synchronized (C2352Rl0.class) {
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

    public final C2456Tl0 d0() {
        C2456Tl0 c2456Tl0 = this.zzb;
        return c2456Tl0 == null ? C2456Tl0.i0() : c2456Tl0;
    }

    public final AbstractC5231tL0 e0() {
        return this.zzc;
    }

    public final AbstractC5231tL0 f0() {
        return this.zzd;
    }

    final /* synthetic */ void h0(C2456Tl0 c2456Tl0) {
        c2456Tl0.getClass();
        this.zzb = c2456Tl0;
        this.zza |= 1;
    }

    final /* synthetic */ void i0(AbstractC5231tL0 abstractC5231tL0) {
        abstractC5231tL0.getClass();
        this.zza |= 2;
        this.zzc = abstractC5231tL0;
    }

    final /* synthetic */ void j0(AbstractC5231tL0 abstractC5231tL0) {
        abstractC5231tL0.getClass();
        this.zza |= 4;
        this.zzd = abstractC5231tL0;
    }

    public final int l0() {
        int iA = AbstractC4026jm0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void m0(int i10) {
        this.zze = i10 - 1;
        this.zza |= 8;
    }
}
