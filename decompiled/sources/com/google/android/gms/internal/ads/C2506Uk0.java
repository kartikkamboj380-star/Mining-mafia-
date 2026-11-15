package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2506Uk0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2506Uk0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        C2506Uk0 c2506Uk0 = new C2506Uk0();
        zzf = c2506Uk0;
        UL0.U(C2506Uk0.class, c2506Uk0);
    }

    private C2506Uk0() {
    }

    public static C2454Tk0 h0() {
        return (C2454Tk0) zzf.P();
    }

    public static C2506Uk0 i0() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C2506Uk0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2454Tk0(bArr);
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
        synchronized (C2506Uk0.class) {
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

    public final String d0() {
        return this.zzb;
    }

    public final float e0() {
        return this.zzc;
    }

    public final long f0() {
        return this.zzd;
    }

    public final long g0() {
        return this.zze;
    }

    final /* synthetic */ void j0(float f10) {
        this.zza |= 2;
        this.zzc = f10;
    }
}
