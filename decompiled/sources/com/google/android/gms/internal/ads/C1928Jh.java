package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1928Jh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final C1928Jh zzj;
    private static volatile FM0 zzk;
    private int zze;
    private int zzg;
    private C1718Fg zzi;
    private String zzf = "";
    private ZL0 zzh = UL0.t();

    static {
        C1928Jh c1928Jh = new C1928Jh();
        zzj = c1928Jh;
        UL0.U(C1928Jh.class, c1928Jh);
    }

    private C1928Jh() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", EnumC1668Eh.d(), "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new C1928Jh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1876Ih(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzk;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C1928Jh.class) {
            try {
                rl0 = zzk;
                if (rl0 == null) {
                    rl0 = new RL0(zzj);
                    zzk = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
