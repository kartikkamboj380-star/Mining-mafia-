package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class JP0 extends UL0 implements InterfaceC5989zM0 {
    private static final JP0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        JP0 jp0 = new JP0();
        zze = jp0;
        UL0.U(JP0.class, jp0);
    }

    private JP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", MP0.f20825a, "zzd"});
        }
        if (iOrdinal == 3) {
            return new JP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new IP0(bArr);
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
        synchronized (JP0.class) {
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
