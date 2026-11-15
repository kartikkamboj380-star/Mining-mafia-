package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1614Dg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1614Dg zzh;
    private static volatile FM0 zzi;
    private int zzd;
    private String zze = "";
    private int zzf;
    private C1718Fg zzg;

    static {
        C1614Dg c1614Dg = new C1614Dg();
        zzh = c1614Dg;
        UL0.U(C1614Dg.class, c1614Dg);
    }

    private C1614Dg() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", EnumC1668Eh.d(), "zzg"});
        }
        if (iOrdinal == 3) {
            return new C1614Dg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1562Cg(bArr);
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
        synchronized (C1614Dg.class) {
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
