package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6158a3 extends AbstractC6205f5 implements G5 {
    private static final C6158a3 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private E2 zzf;

    static {
        C6158a3 c6158a3 = new C6158a3();
        zzg = c6158a3;
        AbstractC6205f5.s(C6158a3.class, c6158a3);
    }

    private C6158a3() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C6158a3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new Z2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
