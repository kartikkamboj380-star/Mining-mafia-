package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3962jG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3962jG0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private C2958bG0 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C3962jG0 c3962jG0 = new C3962jG0();
        zzf = c3962jG0;
        UL0.U(C3962jG0.class, c3962jG0);
    }

    private C3962jG0() {
    }

    public static C3838iG0 h0() {
        return (C3838iG0) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C3962jG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3838iG0(bArr);
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
        synchronized (C3962jG0.class) {
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

    public final boolean d0() {
        return (this.zza & 1) != 0;
    }

    public final C2958bG0 e0() {
        C2958bG0 c2958bG0 = this.zzb;
        return c2958bG0 == null ? C2958bG0.h0() : c2958bG0;
    }

    public final int f0() {
        return this.zzd;
    }

    public final EnumC5725xG0 g0() {
        EnumC5725xG0 enumC5725xG0C = EnumC5725xG0.c(this.zze);
        return enumC5725xG0C == null ? EnumC5725xG0.UNRECOGNIZED : enumC5725xG0C;
    }

    final /* synthetic */ void i0(C2958bG0 c2958bG0) {
        c2958bG0.getClass();
        this.zzb = c2958bG0;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(int i10) {
        this.zzd = i10;
    }

    final /* synthetic */ void k0(EnumC5725xG0 enumC5725xG0) {
        this.zze = enumC5725xG0.zza();
    }

    public final int m0() {
        int i10 = this.zzc;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = 3;
            } else if (i10 != 2) {
                i11 = i10 != 3 ? 0 : 5;
            } else {
                i11 = 4;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    final /* synthetic */ void n0(int i10) {
        this.zzc = AbstractC3083cG0.a(i10);
    }
}
