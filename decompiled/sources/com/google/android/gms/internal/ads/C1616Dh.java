package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1616Dh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final C1616Dh zzj;
    private static volatile FM0 zzk;
    private int zze;
    private int zzf;
    private C1822Hg zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        C1616Dh c1616Dh = new C1616Dh();
        zzj = c1616Dh;
        UL0.U(C1616Dh.class, c1616Dh);
    }

    private C1616Dh() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", EnumC1512Bh.d(), "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new C1616Dh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1460Ah(bArr);
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
        synchronized (C1616Dh.class) {
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
