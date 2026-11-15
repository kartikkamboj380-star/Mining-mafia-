package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class LG0 extends UL0 implements InterfaceC5989zM0 {
    private static final LG0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        LG0 lg0 = new LG0();
        zzd = lg0;
        UL0.U(LG0.class, lg0);
    }

    private LG0() {
    }

    public static KG0 g0() {
        return (KG0) zzd.P();
    }

    public static LG0 h0() {
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
            return UL0.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new LG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new KG0(bArr);
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
        synchronized (LG0.class) {
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

    public final RF0 d0() {
        RF0 rf0C = RF0.c(this.zza);
        return rf0C == null ? RF0.UNRECOGNIZED : rf0C;
    }

    public final RF0 e0() {
        RF0 rf0C = RF0.c(this.zzb);
        return rf0C == null ? RF0.UNRECOGNIZED : rf0C;
    }

    public final int f0() {
        return this.zzc;
    }

    final /* synthetic */ void i0(RF0 rf0) {
        this.zza = rf0.zza();
    }

    final /* synthetic */ void j0(RF0 rf0) {
        this.zzb = rf0.zza();
    }

    final /* synthetic */ void k0(int i10) {
        this.zzc = i10;
    }
}
