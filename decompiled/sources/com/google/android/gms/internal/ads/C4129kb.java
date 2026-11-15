package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4129kb extends UL0 implements InterfaceC5989zM0 {
    private static final C4129kb zzj;
    private static volatile FM0 zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        C4129kb c4129kb = new C4129kb();
        zzj = c4129kb;
        UL0.U(C4129kb.class, c4129kb);
    }

    private C4129kb() {
    }

    public static C4003jb d0() {
        return (C4003jb) zzj.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new C4129kb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4003jb(bArr);
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
        synchronized (C4129kb.class) {
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

    final /* synthetic */ void e0(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    final /* synthetic */ void f0(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    final /* synthetic */ void g0(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    final /* synthetic */ void h0(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void i0(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }
}
