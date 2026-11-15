package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class HN0 extends UL0 implements InterfaceC5989zM0 {
    private static final HN0 zzb;
    private static volatile FM0 zzc;
    private InterfaceC3221dM0 zza = UL0.x();

    static {
        HN0 hn0 = new HN0();
        zzb = hn0;
        UL0.U(HN0.class, hn0);
    }

    private HN0() {
    }

    public static GN0 d0() {
        return (GN0) zzb.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", FN0.class});
        }
        if (iOrdinal == 3) {
            return new HN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new GN0(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzc;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (HN0.class) {
            try {
                rl0 = zzc;
                if (rl0 == null) {
                    rl0 = new RL0(zzb);
                    zzc = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void e0(FN0 fn0) {
        fn0.getClass();
        InterfaceC3221dM0 interfaceC3221dM0 = this.zza;
        if (!interfaceC3221dM0.zza()) {
            this.zza = UL0.y(interfaceC3221dM0);
        }
        this.zza.add(fn0);
    }
}
