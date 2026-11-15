package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5764xa extends UL0 implements InterfaceC5989zM0 {
    private static final C5764xa zzc;
    private static volatile FM0 zzd;
    private int zza;
    private int zzb = 2;

    static {
        C5764xa c5764xa = new C5764xa();
        zzc = c5764xa;
        UL0.U(C5764xa.class, c5764xa);
    }

    private C5764xa() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zza", "zzb", C5890ya.f35395a});
        }
        if (iOrdinal == 3) {
            return new C5764xa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5638wa(bArr);
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
        synchronized (C5764xa.class) {
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
