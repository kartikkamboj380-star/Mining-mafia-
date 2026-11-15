package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5778xh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final C5778xh zzn;
    private static volatile FM0 zzo;
    private int zzg;
    private int zzh;
    private C1718Fg zzi;
    private C1718Fg zzj;
    private C1718Fg zzk;
    private InterfaceC3221dM0 zzl = UL0.x();
    private int zzm;

    static {
        C5778xh c5778xh = new C5778xh();
        zzn = c5778xh;
        UL0.U(C5778xh.class, c5778xh);
    }

    private C5778xh() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C1718Fg.class, "zzm"});
        }
        if (iOrdinal == 3) {
            return new C5778xh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5652wh(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzo;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5778xh.class) {
            try {
                rl0 = zzo;
                if (rl0 == null) {
                    rl0 = new RL0(zzn);
                    zzo = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
