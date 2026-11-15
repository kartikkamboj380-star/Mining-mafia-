package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class HG0 extends UL0 implements InterfaceC5989zM0 {
    private static final HG0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private int zzb;
    private DG0 zzc;
    private AbstractC5231tL0 zzd;
    private AbstractC5231tL0 zze;

    static {
        HG0 hg0 = new HG0();
        zzf = hg0;
        UL0.U(HG0.class, hg0);
    }

    private HG0() {
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        this.zzd = abstractC5231tL0;
        this.zze = abstractC5231tL0;
    }

    public static HG0 h0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (HG0) UL0.B(zzf, abstractC5231tL0, hl0);
    }

    public static GG0 i0() {
        return (GG0) zzf.P();
    }

    public static HG0 j0() {
        return zzf;
    }

    public static FM0 k0() {
        return zzf.h();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new HG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new GG0(bArr);
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
        synchronized (HG0.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final DG0 e0() {
        DG0 dg0 = this.zzc;
        return dg0 == null ? DG0.f0() : dg0;
    }

    public final AbstractC5231tL0 f0() {
        return this.zzd;
    }

    public final AbstractC5231tL0 g0() {
        return this.zze;
    }

    final /* synthetic */ void l0(DG0 dg0) {
        dg0.getClass();
        this.zzc = dg0;
        this.zza |= 1;
    }

    final /* synthetic */ void m0(AbstractC5231tL0 abstractC5231tL0) {
        this.zzd = abstractC5231tL0;
    }

    final /* synthetic */ void n0(AbstractC5231tL0 abstractC5231tL0) {
        this.zze = abstractC5231tL0;
    }
}
