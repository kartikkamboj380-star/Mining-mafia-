package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3759he extends UL0 implements InterfaceC5989zM0 {
    private static final C3759he zzd;
    private static volatile FM0 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        C3759he c3759he = new C3759he();
        zzd = c3759he;
        UL0.U(C3759he.class, c3759he);
    }

    private C3759he() {
    }

    public static C3759he f0() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C3759he();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3633ge(bArr);
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
        synchronized (C3759he.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final int e0() {
        return this.zzc;
    }
}
