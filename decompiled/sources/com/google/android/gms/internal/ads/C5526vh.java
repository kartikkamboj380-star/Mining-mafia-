package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5526vh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final C5526vh zzl;
    private static volatile FM0 zzm;
    private int zzf;
    private String zzg = "";
    private InterfaceC3221dM0 zzh = UL0.x();
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        C5526vh c5526vh = new C5526vh();
        zzl = c5526vh;
        UL0.U(C5526vh.class, c5526vh);
    }

    private C5526vh() {
    }

    public static C5526vh d0() {
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void e0(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", C5022rh.class, "zzi", EnumC1668Eh.d(), "zzj", EnumC1668Eh.d(), "zzk", EnumC1668Eh.d()});
        }
        if (iOrdinal == 3) {
            return new C5526vh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5400uh(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzm;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5526vh.class) {
            try {
                rl0 = zzm;
                if (rl0 == null) {
                    rl0 = new RL0(zzl);
                    zzm = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
