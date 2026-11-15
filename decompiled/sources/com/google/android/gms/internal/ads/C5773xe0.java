package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5773xe0 extends UL0 implements InterfaceC5989zM0 {
    private static final C5773xe0 zzi;
    private static volatile FM0 zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        C5773xe0 c5773xe0 = new C5773xe0();
        zzi = c5773xe0;
        UL0.U(C5773xe0.class, c5773xe0);
    }

    private C5773xe0() {
    }

    public static C5647we0 d0() {
        return (C5647we0) zzi.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new C5773xe0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5647we0(bArr);
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
        synchronized (C5773xe0.class) {
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

    final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void f0(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void g0(long j10) {
        this.zzc = j10;
    }

    final /* synthetic */ void h0(boolean z9) {
        this.zzd = z9;
    }

    final /* synthetic */ void i0(long j10) {
        this.zze = j10;
    }

    final /* synthetic */ void j0(long j10) {
        this.zzf = j10;
    }

    final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void m0(int i10) {
        this.zzh = i10 - 2;
    }
}
