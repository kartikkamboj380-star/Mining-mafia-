package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class E2 extends AbstractC6205f5 implements G5 {
    private static final E2 zzk;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        E2 e10 = new E2();
        zzk = e10;
        AbstractC6205f5.s(E2.class, e10);
    }

    private E2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new E2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new D2(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }
}
