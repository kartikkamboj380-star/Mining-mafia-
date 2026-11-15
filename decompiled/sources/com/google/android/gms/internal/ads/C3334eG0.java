package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3334eG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3334eG0 zzd;
    private static volatile FM0 zze;
    private String zza = "";
    private AbstractC5231tL0 zzb = AbstractC5231tL0.f33386b;
    private int zzc;

    static {
        C3334eG0 c3334eG0 = new C3334eG0();
        zzd = c3334eG0;
        UL0.U(C3334eG0.class, c3334eG0);
    }

    private C3334eG0() {
    }

    public static C3334eG0 g0(byte[] bArr, HL0 hl0) {
        return (C3334eG0) UL0.D(zzd, bArr, hl0);
    }

    public static C3209dG0 h0() {
        return (C3209dG0) zzd.P();
    }

    public static C3334eG0 i0() {
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
            return new C3334eG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3209dG0(bArr);
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
        synchronized (C3334eG0.class) {
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

    public final EnumC5725xG0 f0() {
        EnumC5725xG0 enumC5725xG0C = EnumC5725xG0.c(this.zzc);
        return enumC5725xG0C == null ? EnumC5725xG0.UNRECOGNIZED : enumC5725xG0C;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void k0(AbstractC5231tL0 abstractC5231tL0) {
        abstractC5231tL0.getClass();
        this.zzb = abstractC5231tL0;
    }

    final /* synthetic */ void l0(EnumC5725xG0 enumC5725xG0) {
        this.zzc = enumC5725xG0.zza();
    }
}
