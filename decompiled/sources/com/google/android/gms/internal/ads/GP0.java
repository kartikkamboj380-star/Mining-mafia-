package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class GP0 extends UL0 implements InterfaceC5989zM0 {
    private static final GP0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private InterfaceC3221dM0 zze = UL0.x();

    static {
        GP0 gp0 = new GP0();
        zzf = gp0;
        UL0.U(GP0.class, gp0);
    }

    private GP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new GP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new FP0(bArr);
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
        synchronized (GP0.class) {
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
}
