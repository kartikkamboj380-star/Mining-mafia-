package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2648Xd0 extends UL0 implements InterfaceC5989zM0 {
    private static final C2648Xd0 zzc;
    private static volatile FM0 zzd;
    private int zza;
    private long zzb;

    static {
        C2648Xd0 c2648Xd0 = new C2648Xd0();
        zzc = c2648Xd0;
        UL0.U(C2648Xd0.class, c2648Xd0);
    }

    private C2648Xd0() {
    }

    public static C2596Wd0 d0() {
        return (C2596Wd0) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new C2648Xd0();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C2596Wd0(bArr);
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
        synchronized (C2648Xd0.class) {
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

    final /* synthetic */ void e0(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ void g0(int i10) {
        this.zza = i10 - 2;
    }
}
