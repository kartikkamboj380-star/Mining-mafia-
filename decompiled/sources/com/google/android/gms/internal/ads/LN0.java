package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class LN0 extends UL0 implements InterfaceC5989zM0 {
    private static final LN0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private AbstractC5231tL0 zzd = AbstractC5231tL0.f33386b;

    static {
        LN0 ln0 = new LN0();
        zze = ln0;
        UL0.U(LN0.class, ln0);
    }

    private LN0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", KN0.f20191a, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new LN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new JN0(bArr);
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
        synchronized (LN0.class) {
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
}
