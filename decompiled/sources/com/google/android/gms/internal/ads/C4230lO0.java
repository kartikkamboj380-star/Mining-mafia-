package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4230lO0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4230lO0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private int zzb;
    private AbstractC5231tL0 zzc;
    private AbstractC5231tL0 zzd;

    static {
        C4230lO0 c4230lO0 = new C4230lO0();
        zze = c4230lO0;
        UL0.U(C4230lO0.class, c4230lO0);
    }

    private C4230lO0() {
        AbstractC5231tL0 abstractC5231tL0 = AbstractC5231tL0.f33386b;
        this.zzc = abstractC5231tL0;
        this.zzd = abstractC5231tL0;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new C4230lO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4104kO0(bArr);
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
        synchronized (C4230lO0.class) {
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
