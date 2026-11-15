package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5010rb extends UL0 implements InterfaceC5989zM0 {
    private static final C5010rb zze;
    private static volatile FM0 zzf;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;

    static {
        C5010rb c5010rb = new C5010rb();
        zze = c5010rb;
        UL0.U(C5010rb.class, c5010rb);
    }

    private C5010rb() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new C5010rb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4885qb(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzf;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5010rb.class) {
            try {
                rl0 = zzf;
                if (rl0 == null) {
                    rl0 = new RL0(zze);
                    zzf = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
