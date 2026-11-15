package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class TF0 extends UL0 implements InterfaceC5989zM0 {
    private static final TF0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private int zzb;
    private XF0 zzc;
    private AbstractC5231tL0 zzd = AbstractC5231tL0.f33386b;

    static {
        TF0 tf0 = new TF0();
        zze = tf0;
        UL0.U(TF0.class, tf0);
    }

    private TF0() {
    }

    public static TF0 g0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (TF0) UL0.B(zze, abstractC5231tL0, hl0);
    }

    public static SF0 h0() {
        return (SF0) zze.P();
    }

    public static TF0 i0() {
        return zze;
    }

    public static FM0 j0() {
        return zze.h();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new TF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new SF0(bArr);
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
        synchronized (TF0.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final XF0 e0() {
        XF0 xf0 = this.zzc;
        return xf0 == null ? XF0.g0() : xf0;
    }

    public final AbstractC5231tL0 f0() {
        return this.zzd;
    }

    final /* synthetic */ void k0(XF0 xf0) {
        xf0.getClass();
        this.zzc = xf0;
        this.zza |= 1;
    }

    final /* synthetic */ void l0(AbstractC5231tL0 abstractC5231tL0) {
        this.zzd = abstractC5231tL0;
    }
}
