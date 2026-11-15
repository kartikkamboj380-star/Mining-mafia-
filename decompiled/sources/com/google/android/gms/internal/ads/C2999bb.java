package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2999bb extends UL0 implements InterfaceC5989zM0 {
    private static final C2999bb zzd;
    private static volatile FM0 zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        C2999bb c2999bb = new C2999bb();
        zzd = c2999bb;
        UL0.U(C2999bb.class, c2999bb);
    }

    private C2999bb() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", C2173Oa.f21597a, "zzc"});
        }
        if (iOrdinal == 3) {
            return new C2999bb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2873ab(bArr);
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
        synchronized (C2999bb.class) {
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
