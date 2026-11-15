package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3101cP0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3101cP0 zzh;
    private static volatile FM0 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private ZL0 zzd = UL0.t();
    private InterfaceC3221dM0 zzf = UL0.x();
    private AbstractC5231tL0 zzg = AbstractC5231tL0.f33386b;

    static {
        C3101cP0 c3101cP0 = new C3101cP0();
        zzh = c3101cP0;
        UL0.U(C3101cP0.class, c3101cP0);
    }

    private C3101cP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", C2850aP0.class, "zzg"});
        }
        if (iOrdinal == 3) {
            return new C3101cP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2976bP0(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzi;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3101cP0.class) {
            try {
                rl0 = zzi;
                if (rl0 == null) {
                    rl0 = new RL0(zzh);
                    zzi = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
