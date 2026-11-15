package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4519nh extends UL0 implements InterfaceC5989zM0 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final C4519nh zzf;
    private static volatile FM0 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        C4519nh c4519nh = new C4519nh();
        zzf = c4519nh;
        UL0.U(C4519nh.class, c4519nh);
    }

    private C4519nh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void h0(int i10) {
        this.zzc |= 2;
        this.zze = i10;
    }

    public static C4393mh f0() {
        return (C4393mh) zzf.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void g0(boolean z9) {
        this.zzc |= 1;
        this.zzd = z9;
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new C4519nh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C4393mh(bArr);
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
        synchronized (C4519nh.class) {
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

    public boolean e0() {
        return this.zzd;
    }
}
