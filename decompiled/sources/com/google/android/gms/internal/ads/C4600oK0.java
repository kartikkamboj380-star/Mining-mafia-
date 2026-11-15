package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4600oK0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4600oK0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private AbstractC5231tL0 zzb = AbstractC5231tL0.f33386b;
    private String zzc = "";
    private InterfaceC3221dM0 zzd = UL0.x();
    private boolean zze;

    static {
        C4600oK0 c4600oK0 = new C4600oK0();
        zzf = c4600oK0;
        UL0.U(C4600oK0.class, c4600oK0);
    }

    private C4600oK0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C4600oK0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4474nK0(bArr);
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
        synchronized (C4600oK0.class) {
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
