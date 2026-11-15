package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5991zN0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5991zN0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private String zzb = "";
    private ZL0 zzc = UL0.t();

    static {
        C5991zN0 c5991zN0 = new C5991zN0();
        zzd = c5991zN0;
        UL0.U(C5991zN0.class, c5991zN0);
    }

    private C5991zN0() {
    }

    public static C5865yN0 d0() {
        return (C5865yN0) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C5991zN0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5865yN0(bArr);
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
        synchronized (C5991zN0.class) {
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

    final /* synthetic */ void f0(int i10) {
        this.zza = 15;
    }
}
