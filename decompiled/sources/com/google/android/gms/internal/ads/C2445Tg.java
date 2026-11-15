package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2445Tg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final C2445Tg zzh;
    private static volatile FM0 zzi;
    private int zzd;
    private int zze;
    private C2705Yg zzf;
    private C2885ah zzg;

    static {
        C2445Tg c2445Tg = new C2445Tg();
        zzh = c2445Tg;
        UL0.U(C2445Tg.class, c2445Tg);
    }

    private C2445Tg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void j0(EnumC2549Vg enumC2549Vg) {
        this.zze = enumC2549Vg.zza();
        this.zzd |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void k0(C2705Yg c2705Yg) {
        c2705Yg.getClass();
        this.zzf = c2705Yg;
        this.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d0(C2885ah c2885ah) {
        c2885ah.getClass();
        this.zzg = c2885ah;
        this.zzd |= 4;
    }

    public static C2393Sg i0() {
        return (C2393Sg) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", EnumC2549Vg.d(), "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new C2445Tg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2393Sg(bArr);
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
        synchronized (C2445Tg.class) {
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
