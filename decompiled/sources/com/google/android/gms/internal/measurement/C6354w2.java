package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6354w2 extends AbstractC6205f5 implements G5 {
    private static final C6354w2 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C6354w2 c6354w2 = new C6354w2();
        zzi = c6354w2;
        AbstractC6205f5.s(C6354w2.class, c6354w2);
    }

    private C6354w2() {
    }

    public static C6354w2 G() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C6354w2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6345v2(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }

    public final String D() {
        return this.zze;
    }

    public final int E() {
        return this.zzg;
    }

    public final String F() {
        return this.zzh;
    }
}
