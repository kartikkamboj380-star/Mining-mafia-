package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3879ib extends UL0 implements InterfaceC5989zM0 {
    private static final C3879ib zzA;
    private static volatile FM0 zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        C3879ib c3879ib = new C3879ib();
        zzA = c3879ib;
        UL0.U(C3879ib.class, c3879ib);
    }

    private C3879ib() {
    }

    public static C3753hb d0() {
        return (C3753hb) zzA.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            YL0 yl0 = C5262tb.f33428a;
            return UL0.V(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", yl0, "zzi", "zzj", "zzk", "zzl", yl0, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iOrdinal == 3) {
            return new C3879ib();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C3753hb(bArr);
        }
        if (iOrdinal == 5) {
            return zzA;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzB;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C3879ib.class) {
            try {
                rl0 = zzB;
                if (rl0 == null) {
                    rl0 = new RL0(zzA);
                    zzB = rl0;
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

    final /* synthetic */ void g0(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    final /* synthetic */ void h0(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    final /* synthetic */ void i0() {
        this.zza &= -9;
        this.zze = -1L;
    }

    final /* synthetic */ void j0(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    final /* synthetic */ void k0(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    final /* synthetic */ void l0(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        this.zzi = j10;
    }

    final /* synthetic */ void m0(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        this.zzj = j10;
    }

    final /* synthetic */ void n0(long j10) {
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        this.zzk = j10;
    }

    final /* synthetic */ void o0(long j10) {
        this.zza |= 2048;
        this.zzm = j10;
    }

    final /* synthetic */ void p0(long j10) {
        this.zza |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.zzn = j10;
    }

    final /* synthetic */ void q0(long j10) {
        this.zza |= 8192;
        this.zzo = j10;
    }

    final /* synthetic */ void r0(long j10) {
        this.zza |= 16384;
        this.zzp = j10;
    }

    final /* synthetic */ void s0(long j10) {
        this.zza |= 32768;
        this.zzu = j10;
    }

    final /* synthetic */ void t0(long j10) {
        this.zza |= 65536;
        this.zzv = j10;
    }

    final /* synthetic */ void u0(long j10) {
        this.zza |= 131072;
        this.zzw = j10;
    }

    final /* synthetic */ void v0(long j10) {
        this.zza |= 262144;
        this.zzx = j10;
    }

    final /* synthetic */ void x0(int i10) {
        this.zzh = i10 - 1;
        this.zza |= 64;
    }

    final /* synthetic */ void y0(int i10) {
        this.zzl = i10 - 1;
        this.zza |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
    }
}
