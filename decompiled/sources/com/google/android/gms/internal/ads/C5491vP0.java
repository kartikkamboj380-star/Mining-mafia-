package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5491vP0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5491vP0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private C5239tP0 zzb;

    static {
        C5491vP0 c5491vP0 = new C5491vP0();
        zzc = c5491vP0;
        UL0.U(C5491vP0.class, c5491vP0);
    }

    private C5491vP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new C5491vP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5365uP0(bArr);
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
        synchronized (C5491vP0.class) {
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
