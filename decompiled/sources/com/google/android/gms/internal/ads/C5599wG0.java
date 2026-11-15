package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5599wG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5599wG0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private String zzb = "";
    private C3334eG0 zzc;

    static {
        C5599wG0 c5599wG0 = new C5599wG0();
        zzd = c5599wG0;
        UL0.U(C5599wG0.class, c5599wG0);
    }

    private C5599wG0() {
    }

    public static C5599wG0 f0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (C5599wG0) UL0.B(zzd, abstractC5231tL0, hl0);
    }

    public static C5473vG0 g0() {
        return (C5473vG0) zzd.P();
    }

    public static C5599wG0 h0() {
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
            return UL0.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C5599wG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5473vG0(bArr);
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
        synchronized (C5599wG0.class) {
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
        return this.zzb;
    }

    public final C3334eG0 e0() {
        C3334eG0 c3334eG0 = this.zzc;
        return c3334eG0 == null ? C3334eG0.i0() : c3334eG0;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void j0(C3334eG0 c3334eG0) {
        c3334eG0.getClass();
        this.zzc = c3334eG0;
        this.zza |= 1;
    }
}
