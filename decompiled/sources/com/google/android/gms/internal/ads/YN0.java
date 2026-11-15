package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class YN0 extends UL0 implements InterfaceC5989zM0 {
    private static final YN0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private XN0 zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        YN0 yn0 = new YN0();
        zzf = yn0;
        UL0.U(YN0.class, yn0);
    }

    private YN0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new YN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new UN0(bArr);
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
        synchronized (YN0.class) {
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
