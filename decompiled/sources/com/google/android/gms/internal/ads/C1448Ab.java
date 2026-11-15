package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1448Ab extends UL0 implements InterfaceC5989zM0 {
    private static final C1448Ab zzc;
    private static volatile FM0 zzd;
    private int zza;
    private String zzb = "";

    static {
        C1448Ab c1448Ab = new C1448Ab();
        zzc = c1448Ab;
        UL0.U(C1448Ab.class, c1448Ab);
    }

    private C1448Ab() {
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
            return new C1448Ab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C6018zb(bArr);
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
        synchronized (C1448Ab.class) {
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
