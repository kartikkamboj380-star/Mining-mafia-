package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class X1 extends AbstractC6445p0 implements W0 {
    private static final X1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        X1 x10 = new X1();
        zzb = x10;
        AbstractC6445p0.s(X1.class, x10);
    }

    private X1() {
    }

    static /* synthetic */ void A(X1 x10, int i10) {
        x10.zzg = i10 - 1;
        x10.zzd |= 1;
    }

    public static W1 C() {
        return (W1) zzb.g();
    }

    static /* synthetic */ void z(X1 x10, C6470v2 c6470v2) {
        c6470v2.getClass();
        x10.zzf = c6470v2;
        x10.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", U1.f37143a, C6470v2.class, I2.class});
        }
        if (i11 == 3) {
            return new X1();
        }
        V1 v10 = null;
        if (i11 == 4) {
            return new W1(v10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
