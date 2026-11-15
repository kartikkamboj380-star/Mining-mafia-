package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1758Ga extends UL0 implements InterfaceC5989zM0 {
    private static final C1758Ga zzi;
    private static volatile FM0 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C1758Ga c1758Ga = new C1758Ga();
        zzi = c1758Ga;
        UL0.U(C1758Ga.class, c1758Ga);
    }

    private C1758Ga() {
    }

    public static C1706Fa d0() {
        return (C1706Fa) zzi.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", C1810Ha.f19313a, "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new C1758Ga();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1706Fa(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzj;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C1758Ga.class) {
            try {
                rl0 = zzj;
                if (rl0 == null) {
                    rl0 = new RL0(zzi);
                    zzj = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void e0(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    final /* synthetic */ void f0(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    final /* synthetic */ void g0(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void i0(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    final /* synthetic */ void j0(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    final /* synthetic */ void l0(int i10) {
        this.zzd = i10 - 1;
        this.zza |= 4;
    }
}
