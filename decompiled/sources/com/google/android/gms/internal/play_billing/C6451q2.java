package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6451q2 extends AbstractC6445p0 implements W0 {
    private static final C6451q2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C6451q2 c6451q2 = new C6451q2();
        zzb = c6451q2;
        AbstractC6445p0.s(C6451q2.class, c6451q2);
    }

    private C6451q2() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C6451q2();
        }
        AbstractC6443o2 abstractC6443o2 = null;
        if (i11 == 4) {
            return new C6447p2(abstractC6443o2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
