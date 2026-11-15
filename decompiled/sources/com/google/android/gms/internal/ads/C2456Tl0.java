package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2456Tl0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2456Tl0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        C2456Tl0 c2456Tl0 = new C2456Tl0();
        zze = c2456Tl0;
        UL0.U(C2456Tl0.class, c2456Tl0);
    }

    private C2456Tl0() {
    }

    public static C2456Tl0 g0(AbstractC5231tL0 abstractC5231tL0) {
        return (C2456Tl0) UL0.A(zze, abstractC5231tL0);
    }

    public static C2404Sl0 h0() {
        return (C2404Sl0) zze.P();
    }

    public static C2456Tl0 i0() {
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
            return UL0.V(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", C3507fe.class, C3256de.class, "zzd", EnumC2647Xd.d()});
        }
        if (iOrdinal == 3) {
            return new C2456Tl0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2404Sl0(bArr);
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
        synchronized (C2456Tl0.class) {
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

    public final C3507fe d0() {
        return this.zzb == 1 ? (C3507fe) this.zzc : C3507fe.l0();
    }

    public final C3256de e0() {
        return this.zzb == 2 ? (C3256de) this.zzc : C3256de.g0();
    }

    public final EnumC2647Xd f0() {
        EnumC2647Xd enumC2647XdC = EnumC2647Xd.c(this.zzd);
        return enumC2647XdC == null ? EnumC2647Xd.UNSUPPORTED : enumC2647XdC;
    }

    final /* synthetic */ void j0(C3507fe c3507fe) {
        c3507fe.getClass();
        this.zzc = c3507fe;
        this.zzb = 1;
    }

    final /* synthetic */ void k0(C3256de c3256de) {
        c3256de.getClass();
        this.zzc = c3256de;
        this.zzb = 2;
    }

    final /* synthetic */ void l0(EnumC2647Xd enumC2647Xd) {
        this.zzd = enumC2647Xd.zza();
        this.zza |= 1;
    }
}
