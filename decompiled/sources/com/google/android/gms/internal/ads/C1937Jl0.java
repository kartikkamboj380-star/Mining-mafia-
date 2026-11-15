package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1937Jl0 extends UL0 implements InterfaceC5989zM0 {
    private static final C1937Jl0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private C4505na zzb;

    static {
        C1937Jl0 c1937Jl0 = new C1937Jl0();
        zzc = c1937Jl0;
        UL0.U(C1937Jl0.class, c1937Jl0);
    }

    private C1937Jl0() {
    }

    public static C1885Il0 d0() {
        return (C1885Il0) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new C1937Jl0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1885Il0(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzd;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C1937Jl0.class) {
            try {
                rl0 = zzd;
                if (rl0 == null) {
                    rl0 = new RL0(zzc);
                    zzd = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void e0(C4505na c4505na) {
        c4505na.getClass();
        this.zzb = c4505na;
        this.zza |= 1;
    }
}
