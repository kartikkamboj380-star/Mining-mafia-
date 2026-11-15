package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ge0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1767Ge0 extends UL0 implements InterfaceC5989zM0 {
    private static final C1767Ge0 zzc;
    private static volatile FM0 zzd;
    private InterfaceC3221dM0 zza = UL0.x();
    private long zzb;

    static {
        C1767Ge0 c1767Ge0 = new C1767Ge0();
        zzc = c1767Ge0;
        UL0.U(C1767Ge0.class, c1767Ge0);
    }

    private C1767Ge0() {
    }

    public static C1715Fe0 d0() {
        return (C1715Fe0) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", C2648Xd0.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new C1767Ge0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1715Fe0(bArr);
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
        synchronized (C1767Ge0.class) {
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

    final /* synthetic */ void e0(C2648Xd0 c2648Xd0) {
        c2648Xd0.getClass();
        InterfaceC3221dM0 interfaceC3221dM0 = this.zza;
        if (!interfaceC3221dM0.zza()) {
            this.zza = UL0.y(interfaceC3221dM0);
        }
        this.zza.add(c2648Xd0);
    }

    final /* synthetic */ void f0(long j10) {
        this.zzb = j10;
    }
}
