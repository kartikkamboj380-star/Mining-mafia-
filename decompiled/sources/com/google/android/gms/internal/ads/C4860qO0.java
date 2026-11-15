package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4860qO0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4860qO0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        C4860qO0 c4860qO0 = new C4860qO0();
        zze = c4860qO0;
        UL0.U(C4860qO0.class, c4860qO0);
    }

    private C4860qO0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            YL0 yl0 = C4608oO0.f32066a;
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", yl0, "zzc", "zzd", yl0});
        }
        if (iOrdinal == 3) {
            return new C4860qO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4734pO0(bArr);
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
        synchronized (C4860qO0.class) {
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
