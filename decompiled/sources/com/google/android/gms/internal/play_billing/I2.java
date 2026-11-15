package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class I2 extends AbstractC6445p0 implements W0 {
    private static final I2 zzb;
    private int zzd;
    private int zze;

    static {
        I2 i10 = new I2();
        zzb = i10;
        AbstractC6445p0.s(I2.class, i10);
    }

    private I2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new I2();
        }
        G2 g10 = null;
        if (i11 == 4) {
            return new H2(g10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
