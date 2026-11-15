package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class VF0 extends UL0 implements InterfaceC5989zM0 {
    private static final VF0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private XF0 zzb;
    private int zzc;
    private int zzd;

    static {
        VF0 vf0 = new VF0();
        zze = vf0;
        UL0.U(VF0.class, vf0);
    }

    private VF0() {
    }

    public static VF0 g0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (VF0) UL0.B(zze, abstractC5231tL0, hl0);
    }

    public static UF0 h0() {
        return (UF0) zze.P();
    }

    public static VF0 i0() {
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
            return UL0.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new VF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new UF0(bArr);
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
        synchronized (VF0.class) {
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

    public final XF0 d0() {
        XF0 xf0 = this.zzb;
        return xf0 == null ? XF0.g0() : xf0;
    }

    public final int e0() {
        return this.zzc;
    }

    public final int f0() {
        return this.zzd;
    }

    final /* synthetic */ void j0(XF0 xf0) {
        xf0.getClass();
        this.zzb = xf0;
        this.zza |= 1;
    }

    final /* synthetic */ void k0(int i10) {
        this.zzc = i10;
    }
}
