package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class AF0 extends UL0 implements InterfaceC5989zM0 {
    private static final AF0 zza;
    private static volatile FM0 zzb;

    static {
        AF0 af0 = new AF0();
        zza = af0;
        UL0.U(AF0.class, af0);
    }

    private AF0() {
    }

    public static AF0 d0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (AF0) UL0.B(zza, abstractC5231tL0, hl0);
    }

    public static AF0 e0() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return UL0.V(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new AF0();
        }
        if (iOrdinal == 4) {
            return new C5975zF0(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzb;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (AF0.class) {
            try {
                rl0 = zzb;
                if (rl0 == null) {
                    rl0 = new RL0(zza);
                    zzb = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
