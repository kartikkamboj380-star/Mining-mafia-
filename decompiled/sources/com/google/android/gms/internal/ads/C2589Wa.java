package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2589Wa extends UL0 implements InterfaceC5989zM0 {
    private static final C2589Wa zzc;
    private static volatile FM0 zzd;
    private int zza;
    private long zzb = -1;

    static {
        C2589Wa c2589Wa = new C2589Wa();
        zzc = c2589Wa;
        UL0.U(C2589Wa.class, c2589Wa);
    }

    private C2589Wa() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new C2589Wa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2537Va(bArr);
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
        synchronized (C2589Wa.class) {
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
