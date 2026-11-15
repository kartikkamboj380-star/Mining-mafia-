package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4507nb extends UL0 implements InterfaceC5989zM0 {
    private static final C4507nb zzl;
    private static volatile FM0 zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private ZL0 zze = UL0.t();
    private InterfaceC3221dM0 zzh = UL0.x();

    static {
        C4507nb c4507nb = new C4507nb();
        zzl = c4507nb;
        UL0.U(C4507nb.class, c4507nb);
    }

    private C4507nb() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", C5010rb.class, "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new C4507nb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4381mb(bArr);
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
        synchronized (C4507nb.class) {
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
