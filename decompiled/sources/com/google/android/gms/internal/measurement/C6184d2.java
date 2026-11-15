package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6184d2 extends AbstractC6205f5 implements G5 {
    private static final C6184d2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C6184d2 c6184d2 = new C6184d2();
        zzf = c6184d2;
        AbstractC6205f5.s(C6184d2.class, c6184d2);
    }

    private C6184d2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C6184d2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6175c2(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }
}
