package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5363uO0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5363uO0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        C5363uO0 c5363uO0 = new C5363uO0();
        zzf = c5363uO0;
        UL0.U(C5363uO0.class, c5363uO0);
    }

    private C5363uO0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", C5237tO0.f33395a, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C5363uO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5111sO0(bArr);
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
        synchronized (C5363uO0.class) {
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
