package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3710hF0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3710hF0 zzb;
    private static volatile FM0 zzc;
    private int zza;

    static {
        C3710hF0 c3710hF0 = new C3710hF0();
        zzb = c3710hF0;
        UL0.U(C3710hF0.class, c3710hF0);
    }

    private C3710hF0() {
    }

    public static C3584gF0 e0() {
        return (C3584gF0) zzb.P();
    }

    public static C3710hF0 f0() {
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
            return UL0.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new C3710hF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3584gF0(bArr);
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
        synchronized (C3710hF0.class) {
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

    public final int d0() {
        return this.zza;
    }

    final /* synthetic */ void g0(int i10) {
        this.zza = i10;
    }
}
