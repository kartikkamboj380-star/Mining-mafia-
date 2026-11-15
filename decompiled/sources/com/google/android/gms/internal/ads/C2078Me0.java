package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Me0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2078Me0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2078Me0 zzb;
    private static volatile FM0 zzc;
    private InterfaceC3221dM0 zza = UL0.x();

    static {
        C2078Me0 c2078Me0 = new C2078Me0();
        zzb = c2078Me0;
        UL0.U(C2078Me0.class, c2078Me0);
    }

    private C2078Me0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C1975Ke0.class});
        }
        if (iOrdinal == 3) {
            return new C2078Me0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2027Le0(bArr);
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
        synchronized (C2078Me0.class) {
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
}
