package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class AO0 extends UL0 implements InterfaceC5989zM0 {
    private static final AO0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        AO0 ao0 = new AO0();
        zzf = ao0;
        UL0.U(AO0.class, ao0);
    }

    private AO0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", C5993zO0.f35718a, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new AO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5867yO0(bArr);
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
        synchronized (AO0.class) {
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
