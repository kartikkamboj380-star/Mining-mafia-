package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class NO0 extends UL0 implements InterfaceC5989zM0 {
    private static final NO0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private String zzb = "";
    private InterfaceC3221dM0 zzc = UL0.x();
    private InterfaceC3221dM0 zzd = UL0.x();
    private String zze = "";

    static {
        NO0 no0 = new NO0();
        zzf = no0;
        UL0.U(NO0.class, no0);
    }

    private NO0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new NO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new MO0(bArr);
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
        synchronized (NO0.class) {
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
