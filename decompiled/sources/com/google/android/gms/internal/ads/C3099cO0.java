package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3099cO0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3099cO0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        C3099cO0 c3099cO0 = new C3099cO0();
        zzf = c3099cO0;
        UL0.U(C3099cO0.class, c3099cO0);
    }

    private C3099cO0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", C2974bO0.f26813a, "zzc", ZN0.f26169a, "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C3099cO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2848aO0(bArr);
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
        synchronized (C3099cO0.class) {
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
