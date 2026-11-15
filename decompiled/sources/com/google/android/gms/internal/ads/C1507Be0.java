package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Be0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1507Be0 extends UL0 implements InterfaceC5989zM0 {
    private static final C1507Be0 zzb;
    private static volatile FM0 zzc;
    private String zza = "";

    static {
        C1507Be0 c1507Be0 = new C1507Be0();
        zzb = c1507Be0;
        UL0.U(C1507Be0.class, c1507Be0);
    }

    private C1507Be0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new C1507Be0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1455Ae0(bArr);
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
        synchronized (C1507Be0.class) {
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
