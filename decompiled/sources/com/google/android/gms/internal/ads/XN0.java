package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class XN0 extends UL0 implements InterfaceC5989zM0 {
    private static final XN0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private AbstractC5231tL0 zzb = AbstractC5231tL0.f33386b;

    static {
        XN0 xn0 = new XN0();
        zzc = xn0;
        UL0.U(XN0.class, xn0);
    }

    private XN0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new XN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new VN0(bArr);
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
        synchronized (XN0.class) {
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
}
