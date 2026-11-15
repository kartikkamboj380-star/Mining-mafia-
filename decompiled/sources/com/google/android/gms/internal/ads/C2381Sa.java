package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2381Sa extends UL0 implements InterfaceC5989zM0 {
    private static final C2381Sa zzf;
    private static volatile FM0 zzg;
    private int zza;
    private int zzb = 1000;
    private int zzc = 1000;
    private int zzd = 1000;
    private int zze = 1000;

    static {
        C2381Sa c2381Sa = new C2381Sa();
        zzf = c2381Sa;
        UL0.U(C2381Sa.class, c2381Sa);
    }

    private C2381Sa() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            YL0 yl0 = C5262tb.f33428a;
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", yl0, "zzc", yl0, "zzd", yl0, "zze", yl0});
        }
        if (iOrdinal == 3) {
            return new C2381Sa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2329Ra(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzg;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C2381Sa.class) {
            try {
                rl0 = zzg;
                if (rl0 == null) {
                    rl0 = new RL0(zzf);
                    zzg = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
