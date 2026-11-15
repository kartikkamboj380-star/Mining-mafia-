package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5095sG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5095sG0 zzb;
    private static volatile FM0 zzc;
    private String zza = "";

    static {
        C5095sG0 c5095sG0 = new C5095sG0();
        zzb = c5095sG0;
        UL0.U(C5095sG0.class, c5095sG0);
    }

    private C5095sG0() {
    }

    public static C5095sG0 e0(AbstractC5231tL0 abstractC5231tL0, HL0 hl0) {
        return (C5095sG0) UL0.B(zzb, abstractC5231tL0, hl0);
    }

    public static C4969rG0 f0() {
        return (C4969rG0) zzb.P();
    }

    public static C5095sG0 g0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new C5095sG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4969rG0(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzc;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5095sG0.class) {
            try {
                rl0 = zzc;
                if (rl0 == null) {
                    rl0 = new RL0(zzb);
                    zzc = rl0;
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

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza = str;
    }
}
