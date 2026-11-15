package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2705Yg extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C2705Yg zzf;
    private static volatile FM0 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        C2705Yg c2705Yg = new C2705Yg();
        zzf = c2705Yg;
        UL0.U(C2705Yg.class, c2705Yg);
    }

    private C2705Yg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void h0(int i10) {
        this.zzc |= 2;
        this.zze = i10;
    }

    public static C2653Xg e0() {
        return (C2653Xg) zzf.P();
    }

    public static C2705Yg f0() {
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void g0(boolean z9) {
        this.zzc |= 1;
        this.zzd = z9;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C2705Yg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2653Xg(bArr);
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
        synchronized (C2705Yg.class) {
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
