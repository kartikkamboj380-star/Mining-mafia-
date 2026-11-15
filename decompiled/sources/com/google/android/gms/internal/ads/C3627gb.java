package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3627gb extends UL0 implements InterfaceC5989zM0 {
    private static final C3627gb zzd;
    private static volatile FM0 zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        C3627gb c3627gb = new C3627gb();
        zzd = c3627gb;
        UL0.U(C3627gb.class, c3627gb);
    }

    private C3627gb() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", C5262tb.f33428a});
        }
        if (iOrdinal == 3) {
            return new C3627gb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3501fb(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zze;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3627gb.class) {
            try {
                rl0 = zze;
                if (rl0 == null) {
                    rl0 = new RL0(zzd);
                    zze = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
