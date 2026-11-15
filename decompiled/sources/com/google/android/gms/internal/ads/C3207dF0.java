package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3207dF0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3207dF0 zze;
    private static volatile FM0 zzf;
    private int zza;
    private int zzb;
    private C3710hF0 zzc;
    private AbstractC5231tL0 zzd = AbstractC5231tL0.f33386b;

    static {
        C3207dF0 c3207dF0 = new C3207dF0();
        zze = c3207dF0;
        UL0.U(C3207dF0.class, c3207dF0);
    }

    private C3207dF0() {
    }

    public static C3081cF0 g0() {
        return (C3081cF0) zze.P();
    }

    public static C3207dF0 h0() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new C3207dF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3081cF0(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzf;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3207dF0.class) {
            try {
                rl0 = zzf;
                if (rl0 == null) {
                    rl0 = new RL0(zze);
                    zzf = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final int d0() {
        return this.zzb;
    }

    public final C3710hF0 e0() {
        C3710hF0 c3710hF0 = this.zzc;
        return c3710hF0 == null ? C3710hF0.f0() : c3710hF0;
    }

    public final AbstractC5231tL0 f0() {
        return this.zzd;
    }

    final /* synthetic */ void i0(C3710hF0 c3710hF0) {
        c3710hF0.getClass();
        this.zzc = c3710hF0;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(AbstractC5231tL0 abstractC5231tL0) {
        this.zzd = abstractC5231tL0;
    }
}
