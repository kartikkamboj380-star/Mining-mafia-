package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2885ah extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C2885ah zzh;
    private static volatile FM0 zzi;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C2885ah c2885ah = new C2885ah();
        zzh = c2885ah;
        UL0.U(C2885ah.class, c2885ah);
    }

    private C2885ah() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void j0(boolean z9) {
        this.zzd |= 1;
        this.zze = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void k0(boolean z9) {
        this.zzd |= 2;
        this.zzf = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d0(int i10) {
        this.zzd |= 4;
        this.zzg = i10;
    }

    public static C2757Zg i0() {
        return (C2757Zg) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new C2885ah();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2757Zg(bArr);
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
        synchronized (C2885ah.class) {
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
