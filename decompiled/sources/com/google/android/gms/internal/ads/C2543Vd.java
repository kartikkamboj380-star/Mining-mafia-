package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2543Vd extends UL0 implements InterfaceC5989zM0 {
    private static final C2543Vd zzc;
    private static volatile FM0 zzd;
    private int zza;
    private C3005be zzb;

    static {
        C2543Vd c2543Vd = new C2543Vd();
        zzc = c2543Vd;
        UL0.U(C2543Vd.class, c2543Vd);
    }

    private C2543Vd() {
    }

    public static C2543Vd e0(byte[] bArr, HL0 hl0) {
        return (C2543Vd) UL0.D(zzc, bArr, hl0);
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new C2543Vd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2491Ud(bArr);
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
        synchronized (C2543Vd.class) {
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

    public final C3005be d0() {
        C3005be c3005be = this.zzb;
        return c3005be == null ? C3005be.h0() : c3005be;
    }
}
