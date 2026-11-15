package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2237Pg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    private static final C2237Pg zzd;
    private static volatile FM0 zze;
    private int zzb;
    private int zzc;

    static {
        C2237Pg c2237Pg = new C2237Pg();
        zzd = c2237Pg;
        UL0.U(C2237Pg.class, c2237Pg);
    }

    private C2237Pg() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", EnumC2133Ng.d()});
        }
        if (iOrdinal == 3) {
            return new C2237Pg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2081Mg(bArr);
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
        synchronized (C2237Pg.class) {
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
