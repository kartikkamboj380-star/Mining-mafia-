package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5776xg extends UL0 implements InterfaceC5989zM0 {
    private static final C5776xg zzB;
    private static volatile FM0 zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private C6028zg zzA;
    private int zzl;
    private int zzm = 1000;
    private int zzn = 1000;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        C5776xg c5776xg = new C5776xg();
        zzB = c5776xg;
        UL0.U(C5776xg.class, c5776xg);
    }

    private C5776xg() {
    }

    @Override // com.google.android.gms.internal.ads.UL0
    protected final Object Y(TL0 tl0, Object obj, Object obj2) {
        FM0 rl0;
        int iOrdinal = tl0.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return UL0.V(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", EnumC1668Eh.d(), "zzn", EnumC1668Eh.d(), "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        if (iOrdinal == 3) {
            return new C5776xg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new C5650wg(bArr);
        }
        if (iOrdinal == 5) {
            return zzB;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        FM0 fm0 = zzC;
        if (fm0 != null) {
            return fm0;
        }
        synchronized (C5776xg.class) {
            try {
                rl0 = zzC;
                if (rl0 == null) {
                    rl0 = new RL0(zzB);
                    zzC = rl0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rl0;
    }
}
