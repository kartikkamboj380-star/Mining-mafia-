package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Se0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2390Se0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2390Se0 zzd;
    private static volatile FM0 zze;
    private long zza;
    private long zzb;
    private InterfaceC3221dM0 zzc = UL0.x();

    static {
        C2390Se0 c2390Se0 = new C2390Se0();
        zzd = c2390Se0;
        UL0.U(C2390Se0.class, c2390Se0);
    }

    private C2390Se0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C2390Se0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2338Re0(bArr);
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
        synchronized (C2390Se0.class) {
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
