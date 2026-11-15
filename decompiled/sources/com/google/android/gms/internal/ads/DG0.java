package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class DG0 extends UL0 implements InterfaceC5989zM0 {
    private static final DG0 zzb;
    private static volatile FM0 zzc;
    private int zza;

    static {
        DG0 dg0 = new DG0();
        zzb = dg0;
        UL0.U(DG0.class, dg0);
    }

    private DG0() {
    }

    public static CG0 e0() {
        return (CG0) zzb.P();
    }

    public static DG0 f0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new DG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new CG0(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzc;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (DG0.class) {
            try {
                rl0 = zzc;
                if (rl0 == null) {
                    rl0 = new RL0(zzb);
                    zzc = rl0;
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
}
