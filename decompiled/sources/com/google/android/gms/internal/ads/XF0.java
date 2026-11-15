package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class XF0 extends UL0 implements InterfaceC5989zM0 {
    private static final XF0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private int zzb;

    static {
        XF0 xf0 = new XF0();
        zzc = xf0;
        UL0.U(XF0.class, xf0);
    }

    private XF0() {
    }

    public static WF0 f0() {
        return (WF0) zzc.P();
    }

    public static XF0 g0() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new XF0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new WF0(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzd;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (XF0.class) {
            try {
                rl0 = zzd;
                if (rl0 == null) {
                    rl0 = new RL0(zzc);
                    zzd = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final RF0 d0() {
        RF0 rf0C = RF0.c(this.zza);
        return rf0C == null ? RF0.UNRECOGNIZED : rf0C;
    }

    public final int e0() {
        return this.zzb;
    }

    final /* synthetic */ void h0(RF0 rf0) {
        this.zza = rf0.zza();
    }

    final /* synthetic */ void i0(int i10) {
        this.zzb = i10;
    }
}
