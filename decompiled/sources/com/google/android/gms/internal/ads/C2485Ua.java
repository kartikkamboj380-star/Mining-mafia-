package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2485Ua extends UL0 implements InterfaceC5989zM0 {
    private static final C2485Ua zze;
    private static volatile FM0 zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;
    private int zzd = 1000;

    static {
        C2485Ua c2485Ua = new C2485Ua();
        zze = c2485Ua;
        UL0.U(C2485Ua.class, c2485Ua);
    }

    private C2485Ua() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            YL0 yl0 = C5262tb.f33428a;
            return UL0.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", yl0, "zzd", yl0});
        }
        if (iOrdinal == 3) {
            return new C2485Ua();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2433Ta(bArr);
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
        synchronized (C2485Ua.class) {
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
