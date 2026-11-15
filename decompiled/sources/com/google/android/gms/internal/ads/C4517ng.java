package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4517ng extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C4517ng zzf;
    private static volatile FM0 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        C4517ng c4517ng = new C4517ng();
        zzf = c4517ng;
        UL0.U(C4517ng.class, c4517ng);
    }

    private C4517ng() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void g0(EnumC4013jg enumC4013jg) {
        this.zze = enumC4013jg.zza();
        this.zzc |= 2;
    }

    public static C3888ig e0() {
        return (C3888ig) zzf.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void f0(EnumC4265lg enumC4265lg) {
        this.zzd = enumC4265lg.zza();
        this.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", EnumC4265lg.d(), "zze", EnumC4013jg.d()});
        }
        if (iOrdinal == 3) {
            return new C4517ng();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3888ig(bArr);
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
        synchronized (C4517ng.class) {
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
