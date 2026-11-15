package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5512va extends UL0 implements InterfaceC5989zM0 {
    private static final C5512va zzd;
    private static volatile FM0 zze;
    private int zza;
    private C5764xa zzb;
    private C1446Aa zzc;

    static {
        C5512va c5512va = new C5512va();
        zzd = c5512va;
        UL0.U(C5512va.class, c5512va);
    }

    private C5512va() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C5512va();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5386ua(bArr);
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
        synchronized (C5512va.class) {
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
