package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3262dh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C3262dh zzl;
    private static volatile FM0 zzm;
    private int zzf;
    private int zzg = 1000;
    private C2237Pg zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        C3262dh c3262dh = new C3262dh();
        zzl = c3262dh;
        UL0.U(C3262dh.class, c3262dh);
    }

    private C3262dh() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", EnumC1668Eh.d(), "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new C3262dh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3136ch(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzm;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3262dh.class) {
            try {
                rl0 = zzm;
                if (rl0 == null) {
                    rl0 = new RL0(zzl);
                    zzm = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
