package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4524nj0 extends UL0 implements InterfaceC5989zM0 {
    private static final C4524nj0 zzn;
    private static volatile FM0 zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private InterfaceC3095cM0 zzk = UL0.v();
    private InterfaceC3095cM0 zzl = UL0.v();
    private InterfaceC3095cM0 zzm = UL0.v();

    static {
        C4524nj0 c4524nj0 = new C4524nj0();
        zzn = c4524nj0;
        UL0.U(C4524nj0.class, c4524nj0);
    }

    private C4524nj0() {
    }

    public static C4524nj0 v0() {
        return zzn;
    }

    final /* synthetic */ void A0(boolean z9) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void B0(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    final /* synthetic */ void C0(long j10) {
        this.zzh = j10;
    }

    final /* synthetic */ void D0(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    final /* synthetic */ void E0(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    final /* synthetic */ void F0(long j10) {
        InterfaceC3095cM0 interfaceC3095cM0 = this.zzk;
        if (!interfaceC3095cM0.zza()) {
            this.zzk = UL0.w(interfaceC3095cM0);
        }
        this.zzk.f(j10);
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new C4524nj0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4398mj0(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzo;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C4524nj0.class) {
            try {
                rl0 = zzo;
                if (rl0 == null) {
                    rl0 = new RL0(zzn);
                    zzo = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void d0(long j10) {
        InterfaceC3095cM0 interfaceC3095cM0 = this.zzl;
        if (!interfaceC3095cM0.zza()) {
            this.zzl = UL0.w(interfaceC3095cM0);
        }
        this.zzl.f(j10);
    }

    final /* synthetic */ void e0(long j10) {
        InterfaceC3095cM0 interfaceC3095cM0 = this.zzm;
        if (!interfaceC3095cM0.zza()) {
            this.zzm = UL0.w(interfaceC3095cM0);
        }
        this.zzm.f(j10);
    }

    final /* synthetic */ void f0() {
        this.zzm = UL0.v();
    }

    public final String h0() {
        return this.zzb;
    }

    public final long i0() {
        return this.zzc;
    }

    public final int j0() {
        return this.zzd;
    }

    public final boolean k0() {
        return this.zze;
    }

    public final boolean l0() {
        return this.zzf;
    }

    public final long m0() {
        return this.zzg;
    }

    public final long n0() {
        return this.zzh;
    }

    public final long o0() {
        return this.zzi;
    }

    public final boolean p0() {
        return (this.zza & 64) != 0;
    }

    public final List q0() {
        return this.zzk;
    }

    public final int r0() {
        return this.zzk.size();
    }

    public final int s0() {
        return this.zzl.size();
    }

    public final List t0() {
        return this.zzm;
    }

    public final int u0() {
        return this.zzm.size();
    }

    final /* synthetic */ void w0(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void x0(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    final /* synthetic */ void y0(int i10) {
        this.zza |= 2;
        this.zzd = i10;
    }

    final /* synthetic */ void z0(boolean z9) {
        this.zza |= 4;
        this.zze = true;
    }
}
