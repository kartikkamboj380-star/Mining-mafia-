package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class BN0 extends UL0 implements InterfaceC5989zM0 {
    private static final BN0 zzc;
    private static volatile FM0 zzd;
    private ZL0 zza = UL0.t();
    private ZL0 zzb = UL0.t();

    static {
        BN0 bn0 = new BN0();
        zzc = bn0;
        UL0.U(BN0.class, bn0);
    }

    private BN0() {
    }

    public static BN0 d0(byte[] bArr, HL0 hl0) {
        return (BN0) UL0.D(zzc, bArr, hl0);
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new BN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new AN0(bArr);
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
        synchronized (BN0.class) {
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
}
