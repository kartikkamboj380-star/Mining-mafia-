package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class WO0 extends UL0 implements InterfaceC5989zM0 {
    private static final WO0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        WO0 wo0 = new WO0();
        zzd = wo0;
        UL0.U(WO0.class, wo0);
    }

    private WO0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", VO0.f24258a, "zzc"});
        }
        if (iOrdinal == 3) {
            return new WO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new UO0(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zze;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (WO0.class) {
            try {
                rl0 = zze;
                if (rl0 == null) {
                    rl0 = new RL0(zzd);
                    zze = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
