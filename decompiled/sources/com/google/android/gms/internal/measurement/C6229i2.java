package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6229i2 extends AbstractC6205f5 implements G5 {
    private static final C6229i2 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC6259l5 zze = AbstractC6205f5.y();
    private boolean zzf;

    static {
        C6229i2 c6229i2 = new C6229i2();
        zzg = c6229i2;
        AbstractC6205f5.s(C6229i2.class, c6229i2);
    }

    private C6229i2() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6205f5
    protected final Object B(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6205f5.t(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C6318s2.class, "zzf"});
        }
        if (i11 == 3) {
            return new C6229i2();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C6220h2(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String C() {
        return this.zzd;
    }
}
