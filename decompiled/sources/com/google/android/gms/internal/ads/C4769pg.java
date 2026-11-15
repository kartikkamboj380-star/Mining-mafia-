package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4769pg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C4769pg zzf;
    private static volatile FM0 zzg;
    private int zzc;
    private int zzd;
    private C1718Fg zze;

    static {
        C4769pg c4769pg = new C4769pg();
        zzf = c4769pg;
        UL0.U(C4769pg.class, c4769pg);
    }

    private C4769pg() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", EnumC1668Eh.d(), "zze"});
        }
        if (iOrdinal == 3) {
            return new C4769pg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4643og(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzg;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C4769pg.class) {
            try {
                rl0 = zzg;
                if (rl0 == null) {
                    rl0 = new RL0(zzf);
                    zzg = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
