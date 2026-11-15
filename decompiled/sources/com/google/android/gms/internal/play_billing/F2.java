package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class F2 extends AbstractC6445p0 implements W0 {
    private static final F2 zzb;
    private int zzd;
    private int zze;

    static {
        F2 f10 = new F2();
        zzb = f10;
        AbstractC6445p0.s(F2.class, f10);
    }

    private F2() {
    }

    public static F2 A() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", E2.f37077a});
        }
        if (i11 == 3) {
            return new F2();
        }
        C2 c10 = null;
        if (i11 == 4) {
            return new D2(c10);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
