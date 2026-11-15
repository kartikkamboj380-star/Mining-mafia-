package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class EF0 extends UL0 implements InterfaceC5989zM0 {
    private static final EF0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        EF0 ef0 = new EF0();
        zzd = ef0;
        UL0.U(EF0.class, ef0);
    }

    private EF0() {
    }

    public static DF0 e0() {
        return (DF0) zzd.P();
    }

    public static EF0 f0() {
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
            return UL0.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new EF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new DF0(bArr);
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
        synchronized (EF0.class) {
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

    final /* synthetic */ void g0(RF0 rf0) {
        this.zza = rf0.zza();
    }

    public final int i0() {
        int i10 = this.zzb;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 3) {
                i11 = 5;
            } else if (i10 != 4) {
                i11 = i10 != 5 ? 0 : 7;
            } else {
                i11 = 6;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int j0() {
        int i10 = this.zzc;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = i10 != 2 ? 0 : 4;
            } else {
                i11 = 3;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    final /* synthetic */ void k0(int i10) {
        this.zzb = QF0.a(i10);
    }

    final /* synthetic */ void l0(int i10) {
        this.zzc = JF0.a(i10);
    }
}
