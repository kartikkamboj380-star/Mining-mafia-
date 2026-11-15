package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class XE0 extends UL0 implements InterfaceC5989zM0 {
    private static final XE0 zzb;
    private static volatile FM0 zzc;
    private int zza;

    static {
        XE0 xe0 = new XE0();
        zzb = xe0;
        UL0.U(XE0.class, xe0);
    }

    private XE0() {
    }

    public static VE0 e0() {
        return (VE0) zzb.P();
    }

    public static XE0 f0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new XE0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new VE0(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzc;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (XE0.class) {
            try {
                rl0 = zzc;
                if (rl0 == null) {
                    rl0 = new RL0(zzb);
                    zzc = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }

    public final int d0() {
        return this.zza;
    }

    final /* synthetic */ void g0(int i10) {
        this.zza = i10;
    }
}
