package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2610Wk0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2610Wk0 zzl;
    private static volatile FM0 zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = TTAdConstant.AD_MAX_EVENT_TIME;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        C2610Wk0 c2610Wk0 = new C2610Wk0();
        zzl = c2610Wk0;
        UL0.U(C2610Wk0.class, c2610Wk0);
    }

    private C2610Wk0() {
    }

    public static C2558Vk0 k0() {
        return (C2558Vk0) zzl.P();
    }

    public static C2610Wk0 l0() {
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new C2610Wk0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2558Vk0(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzm;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C2610Wk0.class) {
            try {
                rl0 = zzm;
                if (rl0 == null) {
                    rl0 = new RL0(zzl);
                    zzm = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final boolean d0() {
        return this.zzd;
    }

    public final long e0() {
        return this.zzf;
    }

    public final String f0() {
        return this.zzg;
    }

    public final long g0() {
        return this.zzh;
    }

    public final boolean h0() {
        return this.zzi;
    }

    public final long i0() {
        return this.zzj;
    }

    public final long j0() {
        return this.zzk;
    }

    final /* synthetic */ void m0(boolean z9) {
        this.zza |= 4;
        this.zzd = z9;
    }

    final /* synthetic */ void n0(long j10) {
        this.zza |= 64;
        this.zzh = j10;
    }
}
