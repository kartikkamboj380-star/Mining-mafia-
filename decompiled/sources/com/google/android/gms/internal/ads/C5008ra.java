package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5008ra extends UL0 implements InterfaceC5989zM0 {
    private static final C5008ra zzd;
    private static volatile FM0 zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        C5008ra c5008ra = new C5008ra();
        zzd = c5008ra;
        UL0.U(C5008ra.class, c5008ra);
    }

    private C5008ra() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C5008ra();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4883qa(bArr);
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
        synchronized (C5008ra.class) {
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
