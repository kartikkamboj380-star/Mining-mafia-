package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2439Td extends UL0 implements InterfaceC5989zM0 {
    private static final C2439Td zzh;
    private static volatile FM0 zzi;
    private int zza;
    private long zzc;
    private long zzf;
    private AbstractC5231tL0 zzb = AbstractC5231tL0.f33386b;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        C2439Td c2439Td = new C2439Td();
        zzh = c2439Td;
        UL0.U(C2439Td.class, c2439Td);
    }

    private C2439Td() {
    }

    public static C2387Sd d0() {
        return (C2387Sd) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new C2439Td();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2387Sd(bArr);
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
        synchronized (C2439Td.class) {
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

    final /* synthetic */ void e0(AbstractC5231tL0 abstractC5231tL0) {
        this.zza |= 1;
        this.zzb = abstractC5231tL0;
    }

    final /* synthetic */ void f0(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    final /* synthetic */ void g0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
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

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }
}
