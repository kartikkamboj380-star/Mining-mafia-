package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3856iP0 extends UL0 implements InterfaceC5989zM0 {
    private static final C3856iP0 zzp;
    private static volatile FM0 zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private InterfaceC3221dM0 zze = UL0.x();
    private String zzf = "";
    private String zzg = "";
    private InterfaceC3221dM0 zzj = UL0.x();

    static {
        C3856iP0 c3856iP0 = new C3856iP0();
        zzp = c3856iP0;
        UL0.U(C3856iP0.class, c3856iP0);
    }

    private C3856iP0() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", C3730hP0.f28972a, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C3604gP0.class, "zzc", "zzk", C3352eP0.f27777a, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new C3856iP0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3227dP0(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzu;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3856iP0.class) {
            try {
                rl0 = zzu;
                if (rl0 == null) {
                    rl0 = new RL0(zzp);
                    zzu = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
