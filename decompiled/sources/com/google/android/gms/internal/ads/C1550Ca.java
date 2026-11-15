package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1550Ca extends UL0 implements InterfaceC5989zM0 {
    private static final C1550Ca zzg;
    private static volatile FM0 zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C1550Ca c1550Ca = new C1550Ca();
        zzg = c1550Ca;
        UL0.U(C1550Ca.class, c1550Ca);
    }

    private C1550Ca() {
    }

    public static C1550Ca i0() {
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
            return UL0.V(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new C1550Ca();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1498Ba(bArr);
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
        synchronized (C1550Ca.class) {
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

    public final boolean d0() {
        return this.zzb;
    }

    public final int e0() {
        return this.zzc;
    }

    public final boolean f0() {
        return this.zzd;
    }

    public final boolean g0() {
        return this.zze;
    }

    public final boolean h0() {
        return this.zzf;
    }
}
