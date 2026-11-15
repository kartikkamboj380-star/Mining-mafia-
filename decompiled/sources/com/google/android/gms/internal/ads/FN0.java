package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class FN0 extends UL0 implements InterfaceC5989zM0 {
    private static final FN0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        FN0 fn0 = new FN0();
        zzd = fn0;
        UL0.U(FN0.class, fn0);
    }

    private FN0() {
    }

    public static EN0 d0() {
        return (EN0) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new FN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new EN0(bArr);
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
        synchronized (FN0.class) {
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

    final /* synthetic */ void e0(int i10) {
        this.zza = i10;
    }

    final /* synthetic */ void f0(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void g0(long j10) {
        this.zzc = j10;
    }
}
