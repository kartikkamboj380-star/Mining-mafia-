package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class TN0 extends UL0 implements InterfaceC5989zM0 {
    private static final TN0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private String zzb = "";

    static {
        TN0 tn0 = new TN0();
        zzc = tn0;
        UL0.U(TN0.class, tn0);
    }

    private TN0() {
    }

    public static SN0 d0() {
        return (SN0) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new TN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new SN0(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzd;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (TN0.class) {
            try {
                rl0 = zzd;
                if (rl0 == null) {
                    rl0 = new RL0(zzc);
                    zzd = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void e0(String str) {
        this.zza |= 1;
        this.zzb = str;
    }
}
