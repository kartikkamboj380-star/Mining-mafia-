package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5274th extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C5274th zzh;
    private static volatile FM0 zzi;
    private int zzd;
    private String zze = "";
    private InterfaceC3221dM0 zzf = UL0.x();
    private int zzg;

    static {
        C5274th c5274th = new C5274th();
        zzh = c5274th;
        UL0.U(C5274th.class, c5274th);
    }

    private C5274th() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", C5022rh.class, "zzg", EnumC1668Eh.d()});
        }
        if (iOrdinal == 3) {
            return new C5274th();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5148sh(bArr);
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
        synchronized (C5274th.class) {
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
