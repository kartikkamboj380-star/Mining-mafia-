package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1871Ie0 extends UL0 implements InterfaceC5989zM0 {
    private static final C1871Ie0 zzg;
    private static volatile FM0 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        C1871Ie0 c1871Ie0 = new C1871Ie0();
        zzg = c1871Ie0;
        UL0.U(C1871Ie0.class, c1871Ie0);
    }

    private C1871Ie0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new C1871Ie0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1819He0(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzh;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C1871Ie0.class) {
            try {
                rl0 = zzh;
                if (rl0 == null) {
                    rl0 = new RL0(zzg);
                    zzh = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
