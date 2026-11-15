package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2760Zh0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2760Zh0 zzf;
    private static volatile FM0 zzg;
    private int zza;
    private ZL0 zzb = UL0.t();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        C2760Zh0 c2760Zh0 = new C2760Zh0();
        zzf = c2760Zh0;
        UL0.U(C2760Zh0.class, c2760Zh0);
    }

    private C2760Zh0() {
    }

    public static C2656Xh0 d0() {
        return (C2656Xh0) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", C2604Wh0.f24858a, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C2760Zh0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2656Xh0(bArr);
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
        synchronized (C2760Zh0.class) {
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

    final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void g0(int i10) {
        ZL0 zl0 = this.zzb;
        if (!zl0.zza()) {
            this.zzb = UL0.u(zl0);
        }
        this.zzb.zzi(2);
    }
}
