package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1914Ja extends UL0 implements InterfaceC5989zM0 {
    private static final C1914Ja zzg;
    private static volatile FM0 zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        C1914Ja c1914Ja = new C1914Ja();
        zzg = c1914Ja;
        UL0.U(C1914Ja.class, c1914Ja);
    }

    private C1914Ja() {
    }

    public static C1914Ja d0() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new C1914Ja();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1862Ia(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzh;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C1914Ja.class) {
            try {
                rl0 = zzh;
                if (rl0 == null) {
                    rl0 = new RL0(zzg);
                    zzh = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
