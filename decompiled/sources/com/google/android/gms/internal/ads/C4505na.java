package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4505na extends UL0 implements InterfaceC5989zM0 {
    private static final C4505na zzn;
    private static volatile FM0 zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private InterfaceC3221dM0 zzb = UL0.x();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C4505na c4505na = new C4505na();
        zzn = c4505na;
        UL0.U(C4505na.class, c4505na);
    }

    private C4505na() {
    }

    public static C4379ma d0() {
        return (C4379ma) zzn.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", C1758Ga.class, "zzc", "zzd", "zze", "zzf", "zzg", C1654Ea.f18525a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new C4505na();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4379ma(bArr);
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
        synchronized (C4505na.class) {
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

    final /* synthetic */ void e0(C1758Ga c1758Ga) {
        c1758Ga.getClass();
        InterfaceC3221dM0 interfaceC3221dM0 = this.zzb;
        if (!interfaceC3221dM0.zza()) {
            this.zzb = UL0.y(interfaceC3221dM0);
        }
        this.zzb.add(c1758Ga);
    }

    final /* synthetic */ void f0() {
        this.zzb = UL0.x();
    }

    final /* synthetic */ void g0(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void l0(long j10) {
        this.zza |= 64;
        this.zzi = j10;
    }

    final /* synthetic */ void m0(String str) {
        str.getClass();
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.zzj = str;
    }

    final /* synthetic */ void n0(String str) {
        str.getClass();
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        this.zzk = str;
    }

    final /* synthetic */ void o0(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        this.zzl = j10;
    }

    final /* synthetic */ void p0(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        this.zzm = j10;
    }

    final /* synthetic */ void r0(int i10) {
        this.zzg = i10 - 1;
        this.zza |= 16;
    }
}
