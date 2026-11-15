package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ck0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1571Ck0 extends UL0 implements InterfaceC5989zM0 {
    private static volatile FM0 zzA;
    private static final C1571Ck0 zzz;
    private int zza;
    private int zzb;
    private C2506Uk0 zzf;
    private boolean zzg;
    private C2610Wk0 zzj;
    private boolean zzy;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zze = true;
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 10;
    private long zzl = 100;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;
    private boolean zzv = true;
    private boolean zzw = true;
    private boolean zzx = true;

    static {
        C1571Ck0 c1571Ck0 = new C1571Ck0();
        zzz = c1571Ck0;
        UL0.U(C1571Ck0.class, c1571Ck0);
    }

    private C1571Ck0() {
    }

    public static C1519Bk0 C0() {
        return (C1519Bk0) zzz.P();
    }

    public final boolean A0() {
        return this.zzx;
    }

    public final boolean B0() {
        return this.zzy;
    }

    final /* synthetic */ void D0(boolean z9) {
        this.zza |= 2;
        this.zzc = z9;
    }

    final /* synthetic */ void E0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void F0(C2506Uk0 c2506Uk0) {
        c2506Uk0.getClass();
        this.zzf = c2506Uk0;
        this.zza |= 16;
    }

    final /* synthetic */ void G0(long j10) {
        this.zza |= 64;
        this.zzh = j10;
    }

    final /* synthetic */ void H0(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzz, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013", new Object[]{"zza", "zzb", C1623Dk0.f18278a, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw", "zzx", "zzy"});
        }
        if (iOrdinal == 3) {
            return new C1571Ck0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C1519Bk0(bArr);
        }
        if (iOrdinal == 5) {
            return zzz;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzA;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C1571Ck0.class) {
            try {
                rl0 = zzA;
                if (rl0 == null) {
                    rl0 = new RL0(zzz);
                    zzA = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    final /* synthetic */ void d0(C2610Wk0 c2610Wk0) {
        c2610Wk0.getClass();
        this.zzj = c2610Wk0;
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
    }

    final /* synthetic */ void e0(long j10) {
        this.zza |= 32768;
        this.zzu = j10;
    }

    final /* synthetic */ void f0(boolean z9) {
        this.zza |= 65536;
        this.zzv = z9;
    }

    public final int h0() {
        int iA = AbstractC1675Ek0.a(this.zzb);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    final /* synthetic */ void i0(int i10) {
        this.zzb = i10 - 1;
        this.zza |= 1;
    }

    public final boolean j0() {
        return this.zzc;
    }

    public final String k0() {
        return this.zzd;
    }

    public final boolean l0() {
        return this.zze;
    }

    public final C2506Uk0 m0() {
        C2506Uk0 c2506Uk0 = this.zzf;
        return c2506Uk0 == null ? C2506Uk0.i0() : c2506Uk0;
    }

    public final boolean n0() {
        return this.zzg;
    }

    public final long o0() {
        return this.zzh;
    }

    public final long p0() {
        return this.zzi;
    }

    public final C2610Wk0 q0() {
        C2610Wk0 c2610Wk0 = this.zzj;
        return c2610Wk0 == null ? C2610Wk0.l0() : c2610Wk0;
    }

    public final long r0() {
        return this.zzk;
    }

    public final long s0() {
        return this.zzl;
    }

    public final long t0() {
        return this.zzm;
    }

    public final String u0() {
        return this.zzn;
    }

    public final String v0() {
        return this.zzo;
    }

    public final long w0() {
        return this.zzp;
    }

    public final long x0() {
        return this.zzu;
    }

    public final boolean y0() {
        return this.zzv;
    }

    public final boolean z0() {
        return this.zzw;
    }
}
