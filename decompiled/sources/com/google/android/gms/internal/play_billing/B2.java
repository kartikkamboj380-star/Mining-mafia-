package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 extends AbstractC6445p0 implements W0 {
    private static final B2 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC6472w0 zze = AbstractC6445p0.n();
    private String zzg = "";

    static {
        B2 b10 = new B2();
        zzb = b10;
        AbstractC6445p0.s(B2.class, b10);
    }

    private B2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new B2();
        }
        AbstractC6486z2 abstractC6486z2 = null;
        if (i11 == 4) {
            return new A2(abstractC6486z2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
