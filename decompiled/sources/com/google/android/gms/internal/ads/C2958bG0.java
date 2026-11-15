package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2958bG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2958bG0 zzd;
    private static volatile FM0 zze;
    private String zza = "";
    private AbstractC5231tL0 zzb = AbstractC5231tL0.f33386b;
    private int zzc;

    static {
        C2958bG0 c2958bG0 = new C2958bG0();
        zzd = c2958bG0;
        UL0.U(C2958bG0.class, c2958bG0);
    }

    private C2958bG0() {
    }

    public static ZF0 g0() {
        return (ZF0) zzd.P();
    }

    public static C2958bG0 h0() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C2958bG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ZF0(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zze;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C2958bG0.class) {
            try {
                rl0 = zze;
                if (rl0 == null) {
                    rl0 = new RL0(zzd);
                    zze = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final String d0() {
        return this.zza;
    }

    public final AbstractC5231tL0 e0() {
        return this.zzb;
    }

    public final EnumC2832aG0 f0() {
        EnumC2832aG0 enumC2832aG0;
        int i10 = this.zzc;
        if (i10 == 0) {
            enumC2832aG0 = EnumC2832aG0.UNKNOWN_KEYMATERIAL;
        } else if (i10 == 1) {
            enumC2832aG0 = EnumC2832aG0.SYMMETRIC;
        } else if (i10 == 2) {
            enumC2832aG0 = EnumC2832aG0.ASYMMETRIC_PRIVATE;
        } else if (i10 != 3) {
            enumC2832aG0 = i10 != 4 ? null : EnumC2832aG0.REMOTE;
        } else {
            enumC2832aG0 = EnumC2832aG0.ASYMMETRIC_PUBLIC;
        }
        return enumC2832aG0 == null ? EnumC2832aG0.UNRECOGNIZED : enumC2832aG0;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void j0(AbstractC5231tL0 abstractC5231tL0) {
        abstractC5231tL0.getClass();
        this.zzb = abstractC5231tL0;
    }

    final /* synthetic */ void k0(EnumC2832aG0 enumC2832aG0) {
        this.zzc = enumC2832aG0.zza();
    }
}
