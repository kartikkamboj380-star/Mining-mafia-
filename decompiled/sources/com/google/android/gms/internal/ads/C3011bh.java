package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3011bh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    private static final C3011bh zzc;
    private static volatile FM0 zzd;
    private InterfaceC3221dM0 zzb = UL0.x();

    static {
        C3011bh c3011bh = new C3011bh();
        zzc = c3011bh;
        UL0.U(C3011bh.class, c3011bh);
    }

    private C3011bh() {
    }

    private void e0() {
        InterfaceC3221dM0 interfaceC3221dM0 = this.zzb;
        if (interfaceC3221dM0.zza()) {
            return;
        }
        this.zzb = UL0.y(interfaceC3221dM0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void h0(C2445Tg c2445Tg) {
        c2445Tg.getClass();
        e0();
        this.zzb.add(c2445Tg);
    }

    public static C2497Ug g0() {
        return (C2497Ug) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C2445Tg.class});
        }
        if (iOrdinal == 3) {
            return new C3011bh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2497Ug(bArr);
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
        synchronized (C3011bh.class) {
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
}
