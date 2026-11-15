package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class PF0 extends UL0 implements InterfaceC5989zM0 {
    private static final PF0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private AbstractC5231tL0 zzb = AbstractC5231tL0.f33386b;

    static {
        PF0 pf0 = new PF0();
        zzc = pf0;
        UL0.U(PF0.class, pf0);
    }

    private PF0() {
    }

    public static PF0 f0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (PF0) UL0.B(zzc, abstractC5231tL0, hl0);
    }

    public static OF0 g0() {
        return (OF0) zzc.P();
    }

    public static PF0 h0() {
        return zzc;
    }

    public static FM0 i0() {
        return zzc.h();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new PF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new OF0(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzd;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (PF0.class) {
            try {
                rl0 = zzd;
                if (rl0 == null) {
                    rl0 = new RL0(zzc);
                    zzd = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final int d0() {
        return this.zza;
    }

    public final AbstractC5231tL0 e0() {
        return this.zzb;
    }

    final /* synthetic */ void j0(AbstractC5231tL0 abstractC5231tL0) {
        this.zzb = abstractC5231tL0;
    }
}
