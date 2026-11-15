package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6482y2 extends AbstractC6445p0 implements W0 {
    private static final C6482y2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C6439n2 zzg;
    private C6451q2 zzh;

    static {
        C6482y2 c6482y2 = new C6482y2();
        zzb = c6482y2;
        AbstractC6445p0.s(C6482y2.class, c6482y2);
    }

    private C6482y2() {
    }

    static /* synthetic */ void A(C6482y2 c6482y2, C6439n2 c6439n2) {
        c6439n2.getClass();
        c6482y2.zzg = c6439n2;
        c6482y2.zzd |= 1;
    }

    static /* synthetic */ void C(C6482y2 c6482y2, T1 t10) {
        c6482y2.zzf = t10;
        c6482y2.zze = 2;
    }

    static /* synthetic */ void D(C6482y2 c6482y2, X1 x10) {
        c6482y2.zzf = x10;
        c6482y2.zze = 3;
    }

    public static C6478x2 E() {
        return (C6478x2) zzb.g();
    }

    static /* synthetic */ void z(C6482y2 c6482y2, F2 f10) {
        c6482y2.zzf = f10;
        c6482y2.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6445p0
    protected final Object w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC6445p0.p(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", T1.class, X1.class, F2.class, C6427k2.class, "zzh"});
        }
        if (i11 == 3) {
            return new C6482y2();
        }
        AbstractC6474w2 abstractC6474w2 = null;
        if (i11 == 4) {
            return new C6478x2(abstractC6474w2);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
