package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6028zg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C6028zg zzf;
    private static volatile FM0 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C6028zg c6028zg = new C6028zg();
        zzf = c6028zg;
        UL0.U(C6028zg.class, c6028zg);
    }

    private C6028zg() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C6028zg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5902yg(bArr);
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
        synchronized (C6028zg.class) {
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
