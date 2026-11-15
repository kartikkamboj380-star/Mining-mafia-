package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4466nG0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4466nG0 zze;
    private static volatile FM0 zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        C4466nG0 c4466nG0 = new C4466nG0();
        zze = c4466nG0;
        UL0.U(C4466nG0.class, c4466nG0);
    }

    private C4466nG0() {
    }

    public static C4340mG0 d0() {
        return (C4340mG0) zze.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new C4466nG0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4340mG0(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzf;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C4466nG0.class) {
            try {
                rl0 = zzf;
                if (rl0 == null) {
                    rl0 = new RL0(zze);
                    zzf = rl0;
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

    final /* synthetic */ void f0(int i10) {
        this.zzc = i10;
    }

    final /* synthetic */ void g0(EnumC5725xG0 enumC5725xG0) {
        this.zzd = enumC5725xG0.zza();
    }

    final /* synthetic */ void i0(int i10) {
        this.zzb = AbstractC3083cG0.a(i10);
    }
}
