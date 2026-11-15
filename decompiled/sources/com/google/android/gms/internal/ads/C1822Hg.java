package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Hg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1822Hg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C1822Hg zzh;
    private static volatile FM0 zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C1822Hg c1822Hg = new C1822Hg();
        zzh = c1822Hg;
        UL0.U(C1822Hg.class, c1822Hg);
    }

    private C1822Hg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void j0(int i10) {
        this.zzd |= 1;
        this.zze = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void k0(int i10) {
        this.zzd |= 2;
        this.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d0(int i10) {
        this.zzd |= 4;
        this.zzg = i10;
    }

    public static C1770Gg i0() {
        return (C1770Gg) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new C1822Hg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1770Gg(bArr);
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
        synchronized (C1822Hg.class) {
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
