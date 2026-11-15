package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3458fF0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3458fF0 zzd;
    private static volatile FM0 zze;
    private int zza;
    private C3710hF0 zzb;
    private int zzc;

    static {
        C3458fF0 c3458fF0 = new C3458fF0();
        zzd = c3458fF0;
        UL0.U(C3458fF0.class, c3458fF0);
    }

    private C3458fF0() {
    }

    public static C3332eF0 f0() {
        return (C3332eF0) zzd.P();
    }

    public static C3458fF0 g0() {
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
            return UL0.V(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new C3458fF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3332eF0(bArr);
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
        synchronized (C3458fF0.class) {
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

    public final C3710hF0 d0() {
        C3710hF0 c3710hF0 = this.zzb;
        return c3710hF0 == null ? C3710hF0.f0() : c3710hF0;
    }

    public final int e0() {
        return this.zzc;
    }

    final /* synthetic */ void h0(C3710hF0 c3710hF0) {
        c3710hF0.getClass();
        this.zzb = c3710hF0;
        this.zza |= 1;
    }

    final /* synthetic */ void i0(int i10) {
        this.zzc = i10;
    }
}
