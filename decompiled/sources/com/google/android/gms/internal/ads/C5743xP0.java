package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5743xP0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5743xP0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private String zzb = "";
    private ZL0 zzc = UL0.t();

    static {
        C5743xP0 c5743xP0 = new C5743xP0();
        zzd = c5743xP0;
        UL0.U(C5743xP0.class, c5743xP0);
    }

    private C5743xP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C5743xP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5617wP0(bArr);
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
        synchronized (C5743xP0.class) {
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
