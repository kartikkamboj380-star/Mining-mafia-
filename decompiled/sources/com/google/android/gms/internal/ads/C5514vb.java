package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514vb extends UL0 implements InterfaceC5989zM0 {
    private static final C5514vb zzh;
    private static volatile FM0 zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        C5514vb c5514vb = new C5514vb();
        zzh = c5514vb;
        UL0.U(C5514vb.class, c5514vb);
    }

    private C5514vb() {
    }

    public static C5388ub d0() {
        return (C5388ub) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new C5514vb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5388ub(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzi;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5514vb.class) {
            try {
                rl0 = zzi;
                if (rl0 == null) {
                    rl0 = new RL0(zzh);
                    zzi = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void e0(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void g0(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void i0(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void j0(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
