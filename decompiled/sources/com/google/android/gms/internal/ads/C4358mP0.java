package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4358mP0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4358mP0 zzb;
    private static volatile FM0 zzc;
    private InterfaceC3221dM0 zza = UL0.x();

    static {
        C4358mP0 c4358mP0 = new C4358mP0();
        zzb = c4358mP0;
        UL0.U(C4358mP0.class, c4358mP0);
    }

    private C4358mP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C4106kP0.class});
        }
        if (iOrdinal == 3) {
            return new C4358mP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4232lP0(bArr);
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
        synchronized (C4358mP0.class) {
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
}
