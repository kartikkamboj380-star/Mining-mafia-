package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4267lh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C4267lh zzf;
    private static volatile FM0 zzg;
    private int zzc;
    private int zzd = 1000;
    private C2237Pg zze;

    static {
        C4267lh c4267lh = new C4267lh();
        zzf = c4267lh;
        UL0.U(C4267lh.class, c4267lh);
    }

    private C4267lh() {
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
            return new C4267lh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4141kh(bArr);
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
        synchronized (C4267lh.class) {
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
