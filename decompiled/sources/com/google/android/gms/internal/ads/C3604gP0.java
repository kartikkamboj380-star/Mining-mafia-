package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3604gP0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3604gP0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private String zzb = "";

    static {
        C3604gP0 c3604gP0 = new C3604gP0();
        zzc = c3604gP0;
        UL0.U(C3604gP0.class, c3604gP0);
    }

    private C3604gP0() {
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
            return new C3604gP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3478fP0(bArr);
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
        synchronized (C3604gP0.class) {
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
