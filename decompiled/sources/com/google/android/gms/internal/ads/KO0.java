package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class KO0 extends UL0 implements InterfaceC5989zM0 {
    private static final KO0 zzj;
    private static volatile FM0 zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        KO0 ko0 = new KO0();
        zzj = ko0;
        UL0.U(KO0.class, ko0);
    }

    private KO0() {
    }

    public static JO0 d0() {
        return (JO0) zzj.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", LO0.f20444a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new KO0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new JO0(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzk;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (KO0.class) {
            try {
                rl0 = zzk;
                if (rl0 == null) {
                    rl0 = new RL0(zzj);
                    zzk = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void e0(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void f0(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    final /* synthetic */ void g0(boolean z9) {
        this.zza |= 4;
        this.zzd = z9;
    }
}
